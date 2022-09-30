package tech.reliab.course.davityanlm.bank.service.impl;

import tech.reliab.course.davityanlm.bank.entity.BankOffice;

public interface BankOfficeService {

    void print(BankOffice bankOffice);

    void addAtm(BankOffice bankOffice);

    void delete(BankOffice bankOffice);
}
