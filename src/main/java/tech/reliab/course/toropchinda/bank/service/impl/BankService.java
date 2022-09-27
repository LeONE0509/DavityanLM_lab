package tech.reliab.course.toropchinda.bank.service.impl;

import tech.reliab.course.toropchinda.bank.entity.BankAtm;
import tech.reliab.course.toropchinda.bank.entity.BankOffice;
import tech.reliab.course.toropchinda.bank.entity.Employee;
import tech.reliab.course.toropchinda.bank.entity.User;

public interface BankService {
    void print();

    void addAtm();
    void addOffice();
    void addEmployee();
    void addClient();

    void delete();


}
