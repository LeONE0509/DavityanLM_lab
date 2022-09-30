package tech.reliab.course.davityanlm.bank.service.impl.operations;

import tech.reliab.course.davityanlm.bank.entity.BankOffice;
import tech.reliab.course.davityanlm.bank.service.impl.BankOfficeService;

public class BankOfficeServiceOperations implements BankOfficeService {

    public  void addAtm(BankOffice bankOffice) {
        bankOffice.setAtmQty(bankOffice.getAtmQty() + 1);
    }

    public  void delete(BankOffice bankOffice){
        bankOffice.setId(null);
        bankOffice.setName(null);
        bankOffice.setActivityStatus(null);
        bankOffice.setMayToLocateAtmStatus(null);
        bankOffice.setAtmQty(null);
        bankOffice.setMayToCreditStatus(null);
        bankOffice.setCashingOutStatus(null);
        bankOffice.setCashingInStatus(null);
        bankOffice.setMoneyQtyInOffice(null);
        bankOffice.setRent(null);
    }
}
