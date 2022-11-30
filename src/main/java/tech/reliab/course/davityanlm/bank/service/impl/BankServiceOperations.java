package tech.reliab.course.davityanlm.bank.service.impl;

import tech.reliab.course.davityanlm.bank.entity.Bank;
import tech.reliab.course.davityanlm.bank.service.BankService;

import java.util.HashMap;
import java.util.Map;


/** Класс-реализация операций банка, реализует интерфейс банковского сервиса {@link BankService}. <br>
 * Реализуется бизнес-логика. <br> Singleton*/
public class BankServiceOperations implements BankService {

    private final Map<Integer, Bank> banks = new HashMap<>();

    private BankServiceOperations(){}

    public static final BankService BANK_SERVICE = new BankServiceOperations();

    @Override
    public Bank getBank(Integer id) {
        return banks.get(id);
    }

    @Override
    public void createBank(Integer id, String name){
        banks.put(id, new Bank(id, name));
    }

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

}
