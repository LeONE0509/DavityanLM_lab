package tech.reliab.course.davityanlm.bank;

import tech.reliab.course.davityanlm.bank.entity.*;
import tech.reliab.course.davityanlm.bank.service.*;
import tech.reliab.course.davityanlm.bank.service.impl.*;

import java.time.LocalDate;

/** @author Лев Давитян */
public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank(1, "myBank");
        BankService bankService = BankServiceOperations.getObj();
        BankService bankService1 = BankServiceOperations.getObj();
        bankService1.addOffice(bank);
        System.out.println(bank);

//        bankService.addOffice(bank);
//        bankService.addClient(bank);
//        bankService.addEmployee(bank);
//        bankService.addAtm(bank);
//        System.out.println(bank);
//
//        BankOffice bankOffice = new BankOffice(1, "Отделение №1", "улица Пушкина дом Колотушкина");
//        BankOfficeService bankOfficeService = new BankOfficeServiceOperations();
//        bankOfficeService.addAtm(bankOffice);
//        System.out.println(bankOffice);
//
//        Employee employee = new Employee(1, "Вечность Лев", LocalDate.of(2000, 9, 5), bank, bankOffice, "Генеральный");
//        EmployeeService employeeService = new EmployeeServiceOperations();
//        employeeService.addSalary(employee, 228322);
//        System.out.println(employee);
//
//        AtmService atmService = new AtmServiceOperations();
//        BankAtm bankAtm = new BankAtm(1, "Samsung", bank, bankOffice, employee);
//        atmService.addMoney(bankAtm, 228322);
//        System.out.println(bankAtm);
//
//        User user = new User(1, "Вечность Лев", LocalDate.of(2000,9,5), "LevBank228", bank);
//
//        PaymentAccount paymentAccount = new PaymentAccount(1, user, bank);
//        PaymentAccountService paymentService = new PaymentServiceOperations();
//        paymentService.addMoney(paymentAccount, 228322);
//        System.out.println(paymentAccount);
//
//        CreditAccount creditAccount = new CreditAccount(1, user, bank, employee, paymentAccount);
//        CreditAccountService creditAccountService = new CreditAccountServiceOperations();
//        creditAccountService.subCreditSum(creditAccount, 0);
//        System.out.println(creditAccount);
//
//        UserService userService = new UserServiceOperations();
//        userService.changeWorkPlace(user, "БГТУ");
//        System.out.println(user);
//
//        System.out.print("\nУдаление:");
//
//        System.out.print("\nБанк: ");
//        bankService.delete(bank);
//        System.out.print(bank);
//
//        System.out.print("\nБанковский офис: ");
//        bankOfficeService.delete(bankOffice);
//        System.out.print(bankOffice);
//
//        System.out.print("\nАТМ: ");
//        atmService.delete(bankAtm);
//        System.out.print(bankAtm);
//
//        System.out.print("\nСотрудник: ");
//        employeeService.delete(employee);
//        System.out.print(employee);
//
//        System.out.print("\nКредитный аккаунт: ");
//        creditAccountService.delete(creditAccount);
//        System.out.print(creditAccount);
//
//        System.out.print("\nПлатежный аккаунт: ");
//        paymentService.delete(paymentAccount);
//        System.out.print(paymentAccount);
//
//        System.out.print("\nПользователь: ");
//        userService.delete(user);
//        System.out.print(user);

    }
}



















