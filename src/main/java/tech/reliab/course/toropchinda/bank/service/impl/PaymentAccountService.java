package tech.reliab.course.toropchinda.bank.service.impl;

public interface PaymentAccountService {
    void print();

    void addMoney(Integer moneyQty);

    void subMoney(Integer moneyQty);

    void delete();
}
