package tech.reliab.course.davityanlm.bank.service.impl.operations;

import tech.reliab.course.davityanlm.bank.entity.CreditAccount;
import tech.reliab.course.davityanlm.bank.service.impl.CreditAccountService;

public interface CreditAccountServiceOperations extends CreditAccountService {

    public default void print(CreditAccount creditAccount) {
        if (creditAccount.getId() == null){
            System.out.println("Кажется данный кредитный счет закрыт");
            return;
        }
        System.out.println("\nID кредитного счета: " + creditAccount.getId());
        System.out.println("Банк счета: " + creditAccount.getBank().getName());
        System.out.println("Кредит выдал: " + creditAccount.getEmployee().getFullName());
        System.out.println("ID платежного счета: " + creditAccount.getId());
        System.out.println("Дата начала кредита: " + creditAccount.getStartCreditDate());
        System.out.println("Дата конца кредита: " + creditAccount.getFinishCreditDate());
        System.out.println("Сумма кредита: " + creditAccount.getCreditSum());
        System.out.println("Процент: " + creditAccount.getPercent());
    }

    public default void subCreditSum(CreditAccount creditAccount, Integer sum){
        creditAccount.setCreditSum(creditAccount.getCreditSum() - sum);
    }

    public default void delete(CreditAccount creditAccount) {
        creditAccount.setId(null);
        creditAccount.setUser(null);
        creditAccount.setBank(null);
        creditAccount.setStartCreditDate(null);
        creditAccount.setFinishCreditDate(null);
        creditAccount.setCreditMonthQty(null);
        creditAccount.setCreditSum(null);
        creditAccount.setCreditMonthPayment(null);
        creditAccount.setPercent(null);
        creditAccount.setEmployee(null);
        creditAccount.setPaymentAccount(null);
    }

}
