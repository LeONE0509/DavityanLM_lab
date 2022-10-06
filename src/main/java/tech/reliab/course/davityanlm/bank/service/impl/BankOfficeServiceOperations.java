package tech.reliab.course.davityanlm.bank.service.impl;

import tech.reliab.course.davityanlm.bank.entity.BankOffice;
import tech.reliab.course.davityanlm.bank.service.BankOfficeService;

/** Класс-реализация операций банковского офиса, реализует интерфейс сервиса банковского офиса {@link BankOfficeService}
 * <br> Реализуется бизнес-логика*/
public class BankOfficeServiceOperations implements BankOfficeService {

    private BankOfficeServiceOperations(){}

    public static final BankOfficeService BANK_OFFICE_SERVICE= new BankOfficeServiceOperations();

    public void addAtm(BankOffice bankOffice) {
        bankOffice.setAtmQty(bankOffice.getAtmQty() + 1);
    }
}
