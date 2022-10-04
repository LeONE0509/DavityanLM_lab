package tech.reliab.course.davityanlm.bank.service;

import tech.reliab.course.davityanlm.bank.entity.BankAtm;

public interface AtmService {

    void addMoney(BankAtm bankAtm, Integer moneyQty);

    void delete(BankAtm bankAtm);

}
