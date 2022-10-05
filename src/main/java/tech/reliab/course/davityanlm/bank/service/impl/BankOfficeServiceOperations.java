package tech.reliab.course.davityanlm.bank.service.impl;

import tech.reliab.course.davityanlm.bank.entity.BankOffice;
import tech.reliab.course.davityanlm.bank.service.BankOfficeService;

/** Класс-реализация операций банковского офиса, реализует интерфейс сервиса банковского офиса {@link BankOfficeService}
 * <br> Реализуется бизнес-логика*/
public class BankOfficeServiceOperations implements BankOfficeService {

    public void addAtm(BankOffice bankOffice) {
        bankOffice.setAtmQty(bankOffice.getAtmQty() + 1);
    }

    public void delete(BankOffice bankOffice) {
        bankOffice = null;
    }
}
