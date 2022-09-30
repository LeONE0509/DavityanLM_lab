package tech.reliab.course.davityanlm.bank.service.impl;

import tech.reliab.course.davityanlm.bank.entity.Bank;

public interface BankService {

    void addAtm(Bank bank);
    void addOffice(Bank bank);
    void addEmployee(Bank bank);
    void addClient(Bank bank);
    void delete(Bank bank);


}
