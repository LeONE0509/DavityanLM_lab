package tech.reliab.course.davityanlm.bank.service.impl.operations;

import tech.reliab.course.davityanlm.bank.entity.BankOffice;
import tech.reliab.course.davityanlm.bank.service.impl.BankOfficeService;

public interface BankOfficeServiceOperations extends BankOfficeService {

    public default void print(BankOffice bankOffice){
        /* Обработка исключительных ситуаций */
        if(bankOffice.getId() == null){
            System.out.println("Кажется нет связи с офисом, возможно вы его удалили\n" +
                    "Проверьте корзину :))");
            return;
        }

        System.out.println("ID Офиса " + bankOffice.getId());
        System.out.println("Название: " + bankOffice.getName());
        System.out.println("Адрес: " + bankOffice.getAddress());
        System.out.println("Активность: " + bankOffice.getActivityStatus());
        System.out.println("Возможность разместить банкомат: " + bankOffice.getMayToLocateAtmStatus());
        System.out.println("Кол-во банкоматов в офисе: " + bankOffice.getAtmQty());
        System.out.println("Возможность взять кредит: " + bankOffice.getMayToCreditStatus());
        System.out.println("Возможность снять деньги: " + bankOffice.getCashingOutStatus());
        System.out.println("Возможность внести деньги: " + bankOffice.getCashingInStatus());
        System.out.println("Кол-во денег в офисе: " + bankOffice.getMoneyQtyInOffice());
        System.out.println("Стоимость аренды: " + bankOffice.getRent());

    }

    public default void addAtm(BankOffice bankOffice) {
        bankOffice.setAtmQty(bankOffice.getAtmQty() + 1);
    }

    public default void delete(BankOffice bankOffice){
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
