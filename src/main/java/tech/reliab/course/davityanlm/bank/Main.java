package tech.reliab.course.davityanlm.bank;

import tech.reliab.course.davityanlm.bank.entity.BankAtm;
import tech.reliab.course.davityanlm.bank.service.*;
import tech.reliab.course.davityanlm.bank.service.impl.*;

import java.time.LocalDate;

import static tech.reliab.course.davityanlm.bank.utils.Constants.*;

/** @author Лев Вечность */
public class Main {
    public static void main(String[] args) {

        BankService bankService = BankServiceOperations.BANK_SERVICE;
        for (int i = 1; i <= QUANTITY_BANKS; i++){
            bankService.createBank(i, "bank N" + i);
        }

        BankOfficeService bankOfficeService = BankOfficeServiceOperations.BANK_OFFICE_SERVICE;
        Integer counter = 0;
        for (int i = 1; i <= QUANTITY_BANKS; i++){
            for (int j = 1; j <= QUANTITY_OFFICES_IN_ONE_BANK; j++){
                counter++;
                bankOfficeService.createOffice(
                        bankService.getBank(i),
                        counter,
                        "office N" + counter,
                        "address N" + counter,
                        true,
                        true,
                        0, true,
                        true, true,
                        0, 0
                );
            }
        }

        AtmService atmService = AtmServiceOperations.ATM_SERVICE;
        counter = 0;
        for (int i = 1; i <= QUANTITY_OFFICE; i++){
            for (int j = 1; j <= QUANTITY_ATMS_IN_ONE_OFFICE; j++){
                counter++;
                atmService.createATM(
                        bankService.getBank(bankOfficeService.getBankOffice(i).getBankId()),
                        bankOfficeService.getBankOffice(i),
                        counter,
                        "ATM N" + counter,
                        counter,
                        true, true,
                        0, 0,
                        BankAtm.Status.WORKING
                );
            }
        }

        EmployeeService employeeService = EmployeeServiceOperations.EMPLOYEE_SERVICE;
        counter = 0;
        for (int i = 1; i <= QUANTITY_OFFICE; i++){
            for (int j = 1; j <= QUANTITY_EMPLOYEES_ON_ONE_OFFICE; j++){
                counter++;
                employeeService.createEmployee(
                        counter, "Employee N" + counter,
                        LocalDate.of(2000, 1, 1),
                        "post N" + counter,
                        bankService.getBank(bankOfficeService.getBankOffice(i).getBankId()),
                        true, bankOfficeService.getBankOffice(i),
                        true, 0
                );
            }
        }

        UserService userService = UserServiceOperations.USER_SERVICE;
        counter = 0;
        for (int i = 1; i <= QUANTITY_BANKS; i++){
            for (int j = 1; j <= QUANTITY_USERS_IN_ONE_BANK; j++){
                counter++;
                userService.createUser(counter, "User N" + counter,
                                        LocalDate.of(2000, 1, 1),
                                        "workPlace N" + counter);
            }
        }

        PaymentAccountService paymentAccountService = PaymentServiceOperations.PAYMENT_ACCOUNT_SERVICE;
        CreditAccountService creditAccountService = CreditAccountServiceOperations.CREDIT_ACCOUNT_SERVICE;
        counter = 0;
        Integer userCounter = 0;
        for (int i = 1; i <= QUANTITY_BANKS; i++){
            for (int j = 1; j <= QUANTITY_USERS_IN_ONE_BANK; j++){
                userCounter++;

                for (int z = 1; z <= QUANTITY_PAYS_AND_CREDITS_IN_ONE_USER; z++){
                    counter++;
                    paymentAccountService.createPaymentAccount(
                            bankService.getBank(i),
                            userService.getUser(userCounter),
                            counter, 0);

                    creditAccountService.createCreditAccount(
                            bankService.getBank(i),
                            userService.getUser(userCounter),
                            employeeService.getEmployee(i),
                            paymentAccountService.getPaymentAccount(z),
                            counter,
                            LocalDate.of(2000, 1, 1),
                            LocalDate.of(2000, 1, 1),
                            12, 228000, 2280
                    );
                }
            }
        }





    }
}























