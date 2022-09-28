package tech.reliab.course.toropchinda.bank.service.impl;

import tech.reliab.course.toropchinda.bank.entity.CreditAccount;
import tech.reliab.course.toropchinda.bank.entity.PaymentAccount;

import java.util.Date;

public interface UserService {

    void print();

    void setFullName(String fullName);

    void setBirthDate(Date date);

    void setWorkPlace(String workPlace);

    void setCreditAccount(CreditAccount creditAccount);

    void setPaymentAccount(PaymentAccount paymentAccount);

    void setMonthIncome(Short monthIncome);


    void delete();
}
