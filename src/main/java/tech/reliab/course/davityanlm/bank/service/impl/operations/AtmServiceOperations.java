package tech.reliab.course.davityanlm.bank.service.impl.operations;

import tech.reliab.course.davityanlm.bank.entity.BankAtm;
import tech.reliab.course.davityanlm.bank.service.impl.AtmService;

public class AtmServiceOperations implements AtmService {

    @Override
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

    @Override
    public void delete(BankAtm bankAtm) {
        bankAtm.setId(null);
        bankAtm.setStatus(BankAtm.Status.OUTOFSERVICE);
        bankAtm.setBank(null);
        bankAtm.setMoneyQtyInAtm(null);
        bankAtm.setCashOutStatus(null);
        bankAtm.setCashIntStatus(null);
        bankAtm = null;

    }
}
