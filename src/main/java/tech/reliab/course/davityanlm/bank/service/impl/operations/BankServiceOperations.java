package tech.reliab.course.davityanlm.bank.service.impl.operations;

import tech.reliab.course.davityanlm.bank.entity.Bank;
import tech.reliab.course.davityanlm.bank.service.impl.BankService;

public interface BankServiceOperations extends BankService {

    @Override
    public default void print(Bank bank) {
        if (bank.getId() == null){
            System.out.println("Кажется нет связи с банком, возможно вы его удалили\n" +
                    "Проверьте корзину :))");
            return;
        }
        System.out.println("\nID Банка: " + bank.getId());
        System.out.println("Название: " + bank.getName());
        System.out.println("Кол-во офисов: " + bank.getOfficeQty());
        System.out.println("Кол-во банкоматов: " + bank.getAtmQty());
        System.out.println("Кол-во сотрудников: " + bank.getEmployeeQty());
        System.out.println("Кол-во клиентов: " + bank.getClientQty());
        System.out.println("Рейтинг: " + bank.getRate() + " из 100");
        System.out.println("Капитал: " + bank.getMoneyQty() + " рублей");
        System.out.format("Процентная ставка: %.2f %%", bank.getPercent());
    }

    @Override
    public default void addAtm(Bank bank) {
        bank.setAtmQty(bank.getAtmQty() + 1);
    }

    @Override
    public default void addOffice(Bank bank) {
        bank.setOfficeQty(bank.getOfficeQty() + 1);
    }

    @Override
    public default void addEmployee(Bank bank) {
        bank.setEmployeeQty(bank.getEmployeeQty() + 1);
    }

    @Override
    public default void addClient(Bank bank) {
        bank.setClientQty(bank.getClientQty() + 1);
    }

    @Override
    public default void delete(Bank bank) {
        bank.setId(null);
        bank.setName(null);
        bank.setOfficeQty(null);
        bank.setAtmQty(null);
        bank.setEmployeeQty(null);
        bank.setClientQty(null);
        bank.setRate(null);
        bank.setMoneyQty(null);
        bank.setPercent(null);
    }
}
