package tech.reliab.course.davityanlm.bank.service.impl.operations;

import tech.reliab.course.davityanlm.bank.entity.PaymentAccount;
import tech.reliab.course.davityanlm.bank.service.impl.PaymentAccountService;

public interface PaymentServiceOperations extends PaymentAccountService {

    public default void print(PaymentAccount paymentAccount) {
        if(paymentAccount.getId() == null){
            System.out.println("Такого счета больше не существует, скорее всего " +
                    "пользователь больше не клиент банка");
            return;
        }
        System.out.println("ID Счета: " + paymentAccount.getId());
        System.out.println("Пользователь счета: " + paymentAccount.getUser().getFullName());
        System.out.println("Банк счета: " + paymentAccount.getBank().getName());
        System.out.println("Текущая сумма: " + paymentAccount.getCurrentSum());
    }

    public default void addMoney(PaymentAccount paymentAccount, Integer moneyQty) {
        paymentAccount.setCurrentSum(paymentAccount.getCurrentSum() + moneyQty);
    }

    public default void subMoney(PaymentAccount paymentAccount, Integer moneyQty) {
        if(moneyQty > paymentAccount.getCurrentSum()){
            System.out.println("Недостаточно средств");
            return;
        }
        paymentAccount.setCurrentSum(paymentAccount.getCurrentSum() - moneyQty);
    }

    public default void delete(PaymentAccount paymentAccount) {
        paymentAccount.setId(null);
        paymentAccount.setUser(null);
        paymentAccount.setBank(null);
        paymentAccount.setCurrentSum(null);
    }
}
