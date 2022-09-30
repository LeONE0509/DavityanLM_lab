package tech.reliab.course.davityanlm.bank.service.impl.operations;

import tech.reliab.course.davityanlm.bank.entity.BankAtm;
import tech.reliab.course.davityanlm.bank.entity.Employee;
import tech.reliab.course.davityanlm.bank.service.impl.AtmService;

public interface AtmServiceOperations extends AtmService {

    @Override
    public default void print(BankAtm bankAtm) {

        if (bankAtm.getId() == null){
            System.out.println("Данный банкомат сейчас не используется");
            System.out.println("Название: " + bankAtm.getName());
            System.out.println("Последний адрес: " + bankAtm.getAddress());
            System.out.println("Последний обслуживающий: " + bankAtm.getEmployee().getFullName());
            System.out.println("Стоимость обслуживания: " + bankAtm.getServiceCost());
            return;
        }
        System.out.println("\nID Банкомата: " + bankAtm.getId());
        System.out.println("Название банкомата: " + bankAtm.getName());
        System.out.println("Адрес: " + bankAtm.getAddress());
        System.out.println(bankAtm.getStatus().toString());
        System.out.println("Банк владелец: " + bankAtm.getBank().getName());
        System.out.println("Обслуживает: " + bankAtm.getEmployee().getFullName());
        System.out.println("Выдача денег: " + bankAtm.getCashOutStatus());
        System.out.println("Внесение денег: " + bankAtm.getCashInStatus());
        System.out.println("Кол-во денег внутри: " + bankAtm.getMoneyQtyInAtm());
        System.out.println("Стоимость обслуживания: " + bankAtm.getServiceCost());
    }

    @Override
    public default void addMoney(BankAtm bankAtm, Integer moneyQty){
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

    @Override
    public default void delete(BankAtm bankAtm) {
        bankAtm.setId(null);
        bankAtm.setStatus(BankAtm.Status.OUTOFSERVICE);
        bankAtm.setBank(null);
        bankAtm.setMoneyQtyInAtm(null);
        bankAtm.setCashOutStatus(null);
        bankAtm.setCashIntStatus(null);

    }
}
