package tech.reliab.course.davityanlm.bank.service.impl;

import tech.reliab.course.davityanlm.bank.entity.*;
import tech.reliab.course.davityanlm.bank.service.*;
import tech.reliab.course.davityanlm.bank.utils.UserException;

import static tech.reliab.course.davityanlm.bank.utils.Constants.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/** Класс-реализация операций клиента, реализует интерфейс клиента {@link User} <br>
 * Реализуется бизнес-логика. Singleton*/
public class UserServiceOperations implements UserService {

    private final Map<Integer, User> users = new HashMap<>();

    private UserServiceOperations(){}

    public static final UserService USER_SERVICE = new UserServiceOperations();

    @Override
    public int[] searchPlaceForGiveCredit(Integer money) throws UserException {

        /* Сразу инициализируем массив, который мы будем возвращать */
        int[] idArray = new int[4];

        /* Все подходящие элементы мы будем сохранять в массивы */
        Map<Integer, Bank> banks = new HashMap<>(); /* Все банки, которые подходят клиенту */
        Map<Integer, BankOffice> offices = new HashMap<>(); /* Все офисы, которые подходят клиенту */
        Map<Integer, Employee> employees = new HashMap<>(); /* Все сотрудники, которые подходят клиенту */
        Map<Integer, BankAtm> atms = new HashMap<>(); /* Все банкоматы, которые подходят клиенту */

        /* Сервисы нам нужны, чтобы получать интересующую нас информацию о сущностях  */
        BankService bankService = BankServiceOperations.BANK_SERVICE;
        BankOfficeService bankOfficeService = BankOfficeServiceOperations.BANK_OFFICE_SERVICE;
        EmployeeService employeeService = EmployeeServiceOperations.EMPLOYEE_SERVICE;
        AtmService atmService = AtmServiceOperations.ATM_SERVICE;

        /* Перебираем все банки, которые существуют */
        for (int bankIndex = 1; bankIndex <= QUANTITY_BANKS; bankIndex++) {
            /* Перебираем все офисы и проверяем: принадлежит ли офис этому банку? */
            for (int officeIndex = 1; officeIndex <= QUANTITY_OFFICE; officeIndex++) {
                BankOffice office = bankOfficeService.getBankOffice(officeIndex);
                if(office.getBankId() == bankIndex && /* Если офис принадлежит банку и */
                    office.getActivityStatus() && /* Если офис работает и */
                    office.getMayToCreditStatus() && /* Если офис может выдавать кредиты и */
                    office.getMoneyQtyInOffice() > money) { /* Кол-во денег в офисе больше, чем сумма кредита */
                    /* Значит, нам нужно найти сотрудника в этом офисе, который может выдавать кредиты */
                    for (int employeeIndex = 1; employeeIndex <= QUANTITY_EMPLOYEES; employeeIndex++) {
                        Employee employee = employeeService.getEmployee(employeeIndex);
                        if (employee.getBankOffice().getId() == officeIndex && /* Если сотрудник работает в офисе */
                                employee.getMayToGiveCredit()) { /* и имеет выдавать кредиты */
                            for (int atmIndex = 1; atmIndex <= QUANTITY_ATMS; atmIndex++) { /* Значит ищем банкомат */
                                BankAtm atm = atmService.getAtm(atmIndex);
                                if (atm.getBankOfficeId() == officeIndex && /* Если банкомат принадлежит офису */
                                    atm.getStatus() == BankAtm.Status.WORKING /*Если банкомата статус "Работает"*/
                                    && atm.getCashOutStatus() && /* Если с банкомата можно снимать деньги */
                                    atm.getMoneyQtyInAtm() >= money /* Если в банкомате есть нужное кол-во денег */
                                ) {
                                    /* Мы нашли что искали, теперь надо занести в список возможных мест для кредита
                                    * Если такую сущность мы ещё не сохраняли, тогда сохраним */
                                    if (!banks.containsValue(bankService.getBank(bankIndex))) {
                                         banks.put(banks.size() + 1, bankService.getBank(bankIndex));
                                    }

                                    if (!offices.containsValue(bankOfficeService.getBankOffice(officeIndex))) {
                                        offices.put(offices.size() + 1, office);
                                    }

                                    if(!employees.containsValue(employeeService.getEmployee(employeeIndex))) {
                                        employees.put(employees.size() + 1, employee);
                                    }

                                    if(!atms.containsValue(atmService.getAtm(atmIndex))) {
                                        atms.put(atms.size() + 1, atm);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return idArray;
    }

    @Override
    public Boolean getCredit(Integer id, Integer money) throws UserException {
        return false;
    }

    @Override
    public void getAllInformation(Integer id) {
        PaymentAccountService paymentAccountService = PaymentServiceOperations.PAYMENT_ACCOUNT_SERVICE;
        CreditAccountService creditAccountService = CreditAccountServiceOperations.CREDIT_ACCOUNT_SERVICE;

        System.out.println("Информация о пользователе: " + getUser(id).getFullName());


        for (int i = 1; i <= QUANTITY_PAYS_AND_CREDITS; i++){
            if(id == paymentAccountService.getPaymentAccount(i).getUser().getId()){
                System.out.println(paymentAccountService.getPaymentAccount(i));
            }
        }

        for (int i = 1; i <= QUANTITY_PAYS_AND_CREDITS; i++){
            if (id == creditAccountService.getCreditAccount(i).getUser().getId()){
                System.out.println(creditAccountService.getCreditAccount(i));
            }
        }
    }

    @Override
    public void createUser(Integer id, String fullName, LocalDate birthDate, String workPlace) {
        users.put(id, new User(id, fullName, birthDate, workPlace));
    }

    @Override
    public User getUser(Integer id) {
        return users.get(id);
    }

    public void changeWorkPlace(User user, String workPlace){
        user.setWorkPlace(workPlace);
    }

}
