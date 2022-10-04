package tech.reliab.course.davityanlm.bank.service;

import tech.reliab.course.davityanlm.bank.entity.BankOffice;

public interface BankOfficeService {

    void addAtm(BankOffice bankOffice);

    void delete(BankOffice bankOffice);
}
