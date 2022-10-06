package tech.reliab.course.davityanlm.bank.service.impl;

import tech.reliab.course.davityanlm.bank.entity.BankAtm;
import tech.reliab.course.davityanlm.bank.service.AtmService;

/** Класс-реализация операция с банкоматом, реализует интерфейс сервиса банкомата {@link AtmService}. <br>
 * Реализуется бизнес-логика */
public class AtmServiceOperations implements AtmService {

    public void addMoney(BankAtm bankAtm, Integer moneyQty){

        if (moneyQty > bankAtm.getBank().getMoneyQty()){
            System.out.println("Невозможно поместить в банкомат сумму превышающую кол-во всех денег в банке");
            return;
        }
        if (moneyQty < 0){
            System.out.println("Невозможно поместить в банкомат отрицательную сумму");
            return;
        }
        bankAtm.setMoneyQtyInAtm(bankAtm.getMoneyQtyInAtm() + moneyQty);
    }
}
