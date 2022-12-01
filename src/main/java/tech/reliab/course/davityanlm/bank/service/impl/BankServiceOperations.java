package tech.reliab.course.davityanlm.bank.service.impl;

import tech.reliab.course.davityanlm.bank.entity.Bank;
import tech.reliab.course.davityanlm.bank.service.*;

import static tech.reliab.course.davityanlm.bank.utils.Constants.*;

import java.util.HashMap;
import java.util.Map;

/** Класс-реализация операций банка, реализует интерфейс банковского сервиса {@link BankService}. <br>
 * Реализуется бизнес-логика. <br> Singleton*/
public class BankServiceOperations implements BankService {

    private final Map<Integer, Bank> banks = new HashMap<>();

    private BankServiceOperations(){}

    public static final BankService BANK_SERVICE = new BankServiceOperations();

    @Override
    public void getAllInformation(Integer id) {
        BankOfficeService bankOfficeService = BankOfficeServiceOperations.BANK_OFFICE_SERVICE;
        AtmService atmService = AtmServiceOperations.ATM_SERVICE;
        EmployeeService employeeService = EmployeeServiceOperations.EMPLOYEE_SERVICE;
        UserService userService = UserServiceOperations.USER_SERVICE;

        System.out.println("Информация о банке: " + getBank(id).getName());
        for (int i = 1; i <= QUANTITY_OFFICE; i++){
            if(id == bankOfficeService.getBankOffice(i).getBankId()){
                System.out.println("\n");
                System.out.println(bankOfficeService.getBankOffice(i));

                System.out.println("\n");
                for (int j = 1; j <= QUANTITY_ATMS; j++){
                    if (id == atmService.getAtm(j).getBank().getId()){
                        System.out.println("\n");
                        System.out.println(atmService.getAtm(j));
                    }
                }

                System.out.println("\n");
                for (int j = 1; j <= QUANTITY_EMPLOYEES; j++){
                    if (id == employeeService.getEmployee(j).getBank().getId()){
                        System.out.println("\n");
                        System.out.println(employeeService.getEmployee(j));
                    }
                }

                System.out.println("\n");
                for (int j = 1; j < QUANTITY_USERS; j++){
                    if (id == userService.getUser(j).getCreditAccount().getBank().getId()){
                        System.out.println("\n");
                        System.out.println(userService.getUser(j));
                    }
                }

            }
        }
    }

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
