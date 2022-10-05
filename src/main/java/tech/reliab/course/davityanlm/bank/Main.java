package tech.reliab.course.davityanlm.bank;

import tech.reliab.course.davityanlm.bank.entity.*;
import tech.reliab.course.davityanlm.bank.service.impl.*;

import java.time.LocalDate;

/** @author Лев Давитян */
public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank(1, "myBank");
        BankServiceOperations bankServiceOperations  = new BankServiceOperations();
        bankServiceOperations.addOffice(bank);

        bankServiceOperations.addClient(bank);
        bankServiceOperations.addEmployee(bank);
        bankServiceOperations.addAtm(bank);
        System.out.println(bank);

        BankOffice bankOffice = new BankOffice(1, "Отделение №1", "улица Пушкина дом Колотушкина");
        BankOfficeServiceOperations bankOfficeServiceOperations = new BankOfficeServiceOperations();
        bankOfficeServiceOperations.addAtm(bankOffice);
        System.out.println(bankOffice);

        Employee employee = new Employee(1, "Вечность Лев", LocalDate.of(2000, 9, 5), bank, bankOffice, "Генеральный");
        EmployeeServiceOperations employeeServiceOperations = new EmployeeServiceOperations();
        employeeServiceOperations.addSalary(employee, 228322);
        System.out.println(employee);

        AtmServiceOperations atmServiceOperations = new AtmServiceOperations();
        BankAtm bankAtm = new BankAtm(1, "Samsung", bank, bankOffice, employee);
        atmServiceOperations.addMoney(bankAtm, 228322);
        System.out.println(bankAtm);

        User user = new User(1, "Вечность Лев", LocalDate.of(2000,9,5), "LevBank228", bank);

        PaymentAccount paymentAccount = new PaymentAccount(1, user, bank);
        PaymentServiceOperations paymentServiceOperations = new PaymentServiceOperations();
        paymentServiceOperations.addMoney(paymentAccount, 228322);
        System.out.println(paymentAccount);

        CreditAccount creditAccount = new CreditAccount(1, user, bank, employee, paymentAccount);
        CreditAccountServiceOperations creditAccountServiceOperations = new CreditAccountServiceOperations();
        creditAccountServiceOperations.subCreditSum(creditAccount, 0);
        System.out.println(creditAccount);

        UserServiceOperations userServiceOperations = new UserServiceOperations();
        userServiceOperations.changeWorkPlace(user, "BSTU");
        System.out.println(user);

        System.out.print("\nУдаление:");

        System.out.print("\nБанк: ");
        bankServiceOperations.delete(bank);
        System.out.print(bank);

        System.out.print("\nБанковский офис: ");
        bankOfficeServiceOperations.delete(bankOffice);
        System.out.print(bankOffice);

        System.out.print("\nАТМ: ");
        atmServiceOperations.delete(bankAtm);
        System.out.print(bankAtm);

        System.out.print("\nСотрудник: ");
        employeeServiceOperations.delete(employee);
        System.out.print(employee);

        System.out.print("\nКредитный аккаунт: ");
        creditAccountServiceOperations.delete(creditAccount);
        System.out.print(creditAccount);

        System.out.print("\nПлатежный аккаунт: ");
        paymentServiceOperations.delete(paymentAccount);
        System.out.print(paymentAccount);

        System.out.print("\nПользователь: ");
        userServiceOperations.delete(user);
        System.out.print(user);

    }
}



















