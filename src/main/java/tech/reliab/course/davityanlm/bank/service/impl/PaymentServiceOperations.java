package tech.reliab.course.davityanlm.bank.service.impl;

import tech.reliab.course.davityanlm.bank.entity.Bank;
import tech.reliab.course.davityanlm.bank.entity.PaymentAccount;
import tech.reliab.course.davityanlm.bank.entity.User;
import tech.reliab.course.davityanlm.bank.service.BankService;
import tech.reliab.course.davityanlm.bank.service.PaymentAccountService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Класс-реализация операций платежного счета, реализует интерфейс платежного счета {@link PaymentAccountService} <br>
 * Реализуется бизнес-логика. <br> Singleton*/
public class PaymentServiceOperations implements PaymentAccountService {
    private final Map<Integer, PaymentAccount> paymentAccounts = new HashMap<>();

    BankService bankService = BankServiceOperations.BANK_SERVICE;

    private PaymentServiceOperations(){}

    public static final PaymentAccountService PAYMENT_ACCOUNT_SERVICE = new PaymentServiceOperations();

    @Override
    public void createPaymentAccount(Bank bank, User user, Integer id, Integer currentSum) {
        boolean isUserAlreadyExist = false;
        for (int i = 1; i <= paymentAccounts.size(); i++){
            if (Objects.equals(paymentAccounts.get(i).getUser().getId(), user.getId())){
                isUserAlreadyExist = true;
            }
        }

        if(!isUserAlreadyExist){
            bank.setClientQty(bank.getClientQty() + 1);
        }

        PaymentAccount paymentAccount = new PaymentAccount(bank, user, id, 0);
        user.setPaymentAccount(paymentAccount);
        paymentAccounts.put(id, paymentAccount);

    }

    @Override
    public PaymentAccount getPaymentAccount(Integer id) {
        return paymentAccounts.get(id);
    }

    public void addMoney(PaymentAccount paymentAccount, Integer moneyQty) {
        paymentAccount.setCurrentSum(paymentAccount.getCurrentSum() + moneyQty);
    }

    public void subMoney(PaymentAccount paymentAccount, Integer moneyQty) {
        if(moneyQty > paymentAccount.getCurrentSum()){
            System.out.println("Недостаточно средств");
            return;
        }
        paymentAccount.setCurrentSum(paymentAccount.getCurrentSum() - moneyQty);
    }


    public void transitAcc() {
        try (BufferedReader reader = new BufferedReader(new FileReader("transit.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                Pattern integerPattern = Pattern.compile("\\d+");
                Matcher matcher = integerPattern.matcher(line);
                List<Integer> integerList = new ArrayList<>();
                while (matcher.find()) {
                    integerList.add(Integer.parseInt(matcher.group()));
                }
                PaymentAccount payAcc = this.getPaymentAccount(integerList.get(0));
                Bank bank = bankService.getBank(integerList.get(1));

                System.out.println("До: \n");
                System.out.println(payAcc);
                payAcc.setBank(bank);
                System.out.println("После: \n");
                System.out.println(payAcc);
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
