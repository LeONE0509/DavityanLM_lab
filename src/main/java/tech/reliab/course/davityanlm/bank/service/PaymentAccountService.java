package tech.reliab.course.davityanlm.bank.service;

import tech.reliab.course.davityanlm.bank.entity.PaymentAccount;

public interface PaymentAccountService {

    void addMoney(PaymentAccount paymentAccount, Integer moneyQty);

    void subMoney(PaymentAccount paymentAccount,Integer moneyQty);

    PaymentAccount delete();
}
