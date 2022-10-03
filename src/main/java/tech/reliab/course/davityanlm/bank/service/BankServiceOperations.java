package tech.reliab.course.davityanlm.bank.service;

import tech.reliab.course.davityanlm.bank.entity.Bank;
import tech.reliab.course.davityanlm.bank.service.impl.BankService;

public class BankServiceOperations implements BankService {

    @Override
    public void addAtm(Bank bank) {
        bank.setAtmQty(bank.getAtmQty() + 1);
    }

    @Override
    public void addOffice(Bank bank) {
        bank.setOfficeQty(bank.getOfficeQty() + 1);
    }

    @Override
    public void addEmployee(Bank bank) {
        bank.setEmployeeQty(bank.getEmployeeQty() + 1);
    }

    @Override
    public void addClient(Bank bank) {
        bank.setClientQty(bank.getClientQty() + 1);
    }

    @Override
    public void delete(Bank bank) {
        bank.setId(null);
        bank.setName(null);
        bank.setOfficeQty(null);
        bank.setAtmQty(null);
        bank.setEmployeeQty(null);
        bank.setClientQty(null);
        bank.setRate(null);
        bank.setMoneyQty(null);
        bank.setPercent(null);
        bank = null;
    }
}
