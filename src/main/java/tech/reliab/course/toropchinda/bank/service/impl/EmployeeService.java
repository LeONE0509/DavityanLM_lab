package tech.reliab.course.toropchinda.bank.service.impl;

import tech.reliab.course.toropchinda.bank.entity.Bank;
import tech.reliab.course.toropchinda.bank.entity.BankOffice;

public interface EmployeeService {

    void print();

    void setBankOffice(BankOffice bankOffice);

    void setPost(String post);

    void setSalary(Integer salary);

    void setFullName(String fullName);

    void setOnlineOrNot(Boolean onlineOrNot);

    void setMayToGiveCredit(Boolean mayToGiveCredit);

    void delete();

}
