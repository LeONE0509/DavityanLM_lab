package tech.reliab.course.davityanlm.bank.service.impl;

import tech.reliab.course.davityanlm.bank.entity.BankAtm;
import tech.reliab.course.davityanlm.bank.entity.Employee;

public interface AtmService {

    void print(BankAtm bankAtm);

    void addMoney(BankAtm bankAtm, Integer moneyQty);

    void delete(BankAtm bankAtm);

}
