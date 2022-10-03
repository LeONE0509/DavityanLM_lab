package tech.reliab.course.davityanlm.bank.service.impl;

import tech.reliab.course.davityanlm.bank.entity.PaymentAccount;
import tech.reliab.course.davityanlm.bank.service.PaymentAccountService;

public class PaymentServiceOperations implements PaymentAccountService {

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

    public void delete(PaymentAccount paymentAccount) {
        paymentAccount.setId(null);
        paymentAccount.setUser(null);
        paymentAccount.setBank(null);
        paymentAccount.setCurrentSum(null);
        paymentAccount = null;
    }
}
