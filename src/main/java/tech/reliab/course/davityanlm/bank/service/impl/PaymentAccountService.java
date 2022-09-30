package tech.reliab.course.davityanlm.bank.service.impl;

import tech.reliab.course.davityanlm.bank.entity.PaymentAccount;

public interface PaymentAccountService {
    void print(PaymentAccount paymentAccount);

    void addMoney(PaymentAccount paymentAccount, Integer moneyQty);

    void subMoney(PaymentAccount paymentAccount,Integer moneyQty);

    void delete(PaymentAccount paymentAccount);
}
