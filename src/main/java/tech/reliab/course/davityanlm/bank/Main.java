package tech.reliab.course.davityanlm.bank;

import tech.reliab.course.davityanlm.bank.entity.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank(1, "myBank");
        bank.addOffice(bank);
        bank.addAtm(bank);
        bank.addClient(bank);
        bank.addEmployee(bank);
        System.out.println(bank);

        BankOffice bankOffice = new BankOffice(1, "Отделение №1", "улица Пушкина дом Колотушкина");
        bankOffice.addAtm(bankOffice);
        System.out.println(bankOffice);

        Employee employee = new Employee(1, "Вечность Лев", LocalDate.of(2000, 9, 5), bank, bankOffice, "Генеральный");
        employee.setSalary(228322);
        System.out.println(employee);

        BankAtm bankAtm = new BankAtm(1, "Samsung", bank, bankOffice, employee);
        bankAtm.addMoney(bankAtm, 228322);
        System.out.println(bankAtm);

        User user = new User(1, "Вечность Лев", LocalDate.of(2000,9,5), "LevBank228", bank);

        PaymentAccount paymentAccount = new PaymentAccount(1, user, bank);
        paymentAccount.addMoney(paymentAccount, 228322);
        System.out.println(paymentAccount);

        CreditAccount creditAccount = new CreditAccount(1, user, bank, employee, paymentAccount);
        creditAccount.setCreditSum(1337);
        System.out.println(creditAccount);

        user.setPaymentAccount(paymentAccount);
        user.setCreditAccount(creditAccount);
        System.out.println(user);

        System.out.print("\nУдаление:");

        System.out.print("\nБанк: ");
        bank = bank.delete();
        System.out.print(bank);

        System.out.print("\nБанковский офис: ");
        bankOffice = bankOffice.delete();
        System.out.print(bankOffice);

        System.out.print("\nАТМ: ");
        bankAtm = bankAtm.delete();
        System.out.print(bankAtm);

        System.out.print("\nСотрудник: ");
        employee = employee.delete();
        System.out.print(employee);

        System.out.print("\nКредитный аккаунт: ");
        creditAccount = creditAccount.delete();
        System.out.print(creditAccount);

        System.out.print("\nПлатежный аккаунт: ");
        paymentAccount = paymentAccount.delete();
        System.out.print(paymentAccount);

        System.out.print("\nПользователь: ");
        user = user.delete();
        System.out.print(user);

    }
}



















