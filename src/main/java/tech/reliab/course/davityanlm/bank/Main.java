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
        if (bankService != null) {
            bankService.addOffice(bank);
            bankService.addClient(bank);
            bankService.addEmployee(bank);
            bankService.addAtm(bank);
        }
        System.out.println(bank);

        BankOffice bankOffice = new BankOffice(1, "Отделение №1", "улица Пушкина дом Колотушкина");
        BankOfficeService bankOfficeService = new BankOfficeServiceOperations();
        bankOfficeService.addAtm(bankOffice);
        System.out.println(bankOffice);

        Employee employee = new Employee(1, "Вечность Лев", LocalDate.of(2000, 9, 5), bank, bankOffice, "Генеральный");
        EmployeeService employeeService = new EmployeeServiceOperations();
        employeeService.addSalary(employee, 228322);
        System.out.println(employee);

        AtmService atmService = new AtmServiceOperations();
        BankAtm bankAtm = new BankAtm(1, "Samsung", bank, bankOffice, employee);
        atmService.addMoney(bankAtm, 228322);
        System.out.println(bankAtm);

        User user = new User(1, "Вечность Лев", LocalDate.of(2000,9,5), "LevBank228", bank);

        PaymentAccount paymentAccount = new PaymentAccount(1, user, bank);
        PaymentAccountService paymentService = new PaymentServiceOperations();
        paymentService.addMoney(paymentAccount, 228322);
        System.out.println(paymentAccount);

        CreditAccount creditAccount = new CreditAccount(1, user, bank, employee, paymentAccount);
        CreditAccountService creditAccountService = new CreditAccountServiceOperations();
        creditAccountService.subCreditSum(creditAccount, 0);
        System.out.println(creditAccount);

        UserService userService = new UserServiceOperations();
        userService.changeWorkPlace(user, "БГТУ");
        System.out.println(user);


        System.out.print("\nУдаление:");
        /* Из-за особенностей ЯП Java удаление реализованно посредством
        * присвоения объекту значения null.
        * 1 - Как такого деструктора в языке нет, но если на объект
        * никто не ссылается, то сборщик мусора сам удаляет объект.
        * 2 - Удаление происходит НЕ через функцию, потому что в Java
        * передает ссылочные объекты по значению, а не по ссылке. Это
        * влияет напрямую на удаление, т.к. объекту надо присвоить null.
        * Получается, внутри метода создается копия объекта, ему присваивается null,
        * а по окончании работы функции эта копия объекта стирается. А изначальный объект,
        * которому и следовало присвоить null, так и остался без изменений.
        * Поэтому как-то так. Вот. Да. Такие дела.  */

        bank = null;
        System.out.print("\nБанк: " + bank);

        bankOffice = null;
        System.out.print("\nБанковский офис: " + bankOffice);

        bankAtm = null;
        System.out.print("\nАТМ: " + bankAtm);

        employee = null;
        System.out.print("\nСотрудник: " + employee);

        creditAccount = null;
        System.out.print("\nКредитный аккаунт: " + creditAccount);

        paymentAccount = null;
        System.out.print("\nПлатежный аккаунт: " + paymentAccount);

        user = null;
        System.out.print("\nПользователь: " + user);

    }
}



















