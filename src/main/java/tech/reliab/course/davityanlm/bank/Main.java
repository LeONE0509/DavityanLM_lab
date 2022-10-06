package tech.reliab.course.davityanlm.bank;

import tech.reliab.course.davityanlm.bank.entity.*;
import tech.reliab.course.davityanlm.bank.service.*;
import tech.reliab.course.davityanlm.bank.service.impl.*;

import java.time.LocalDate;

/** @author Лев Давитян */
public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank(1, "myBank");
        BankService bankService = BankServiceOperations.BANK_SERVICE;

        bankService.addOffice(bank);
        bankService.addClient(bank);
        bankService.addEmployee(bank);
        bankService.addAtm(bank);
        System.out.println(bank);

        BankOffice bankOffice = new BankOffice(1, "Отделение №1", "улица Пушкина дом Колотушкина");
        BankOfficeService bankOfficeService = BankOfficeServiceOperations.BANK_OFFICE_SERVICE;
        bankOfficeService.addAtm(bankOffice);
        System.out.println(bankOffice);

        Employee employee = new Employee(1, "Вечность Лев", LocalDate.of(2000, 9, 5), bank, bankOffice, "Генеральный");
        EmployeeService employeeService = EmployeeServiceOperations.EMPLOYEE_SERVICE;
        employeeService.addSalary(employee, 228322);
        System.out.println(employee);

        AtmService atmService = AtmServiceOperations.ATM_SERVICE;
        BankAtm bankAtm = new BankAtm(1, "Samsung", bank, bankOffice, employee);
        atmService.addMoney(bankAtm, 228322);
        System.out.println(bankAtm);

        User user = new User(1, "Вечность Лев", LocalDate.of(2000,9,5), "LevBank228", bank);

        PaymentAccount paymentAccount = new PaymentAccount(1, user, bank);
        PaymentAccountService paymentService = PaymentServiceOperations.PAYMENT_ACCOUNT_SERVICE;
        paymentService.addMoney(paymentAccount, 228322);
        System.out.println(paymentAccount);

        CreditAccount creditAccount = new CreditAccount(1, user, bank, employee, paymentAccount);
        CreditAccountService creditAccountService = CreditAccountServiceOperations.CREDIT_ACCOUNT_SERVICE;
        creditAccountService.subCreditSum(creditAccount, 0);
        System.out.println(creditAccount);

        UserService userService = UserServiceOperations.USER_SERVICE;
        userService.changeWorkPlace(user, "БГТУ");
        System.out.println(user);


        System.out.print("\nУдаление:");
        /* Из-за особенностей ЯП Java удаление реализованно посредством
        * присвоения объекту значения null.
        * 1 - Как такого деструктора в языке нет, но если на объект
        * никто не ссылается, то сборщик мусора сам удаляет объект.
        * 2 - Удаление происходит НЕ через функцию, потому что Java
        * передает объект в функцию, как копию значения ссылки. Грубо говоря,
        * теперь у нас два объекта: оригинальный(до вызова функции) и
        * копия(внутри функции, после её вызова). Оба этих объекта(ссылки) ссылаются
        * на одну и ту же область памяти. И когда мы внутри функции
        * присваиваем объекту(копии) значение null, то обнуляем его(копии) ссылку
        * получается теперь объект(копия) никуда не ссылается, а
        * объект-оригинал всё также ссылается на область памяти. И после выхода
        * из функции ничего не изменилось. Оригинальный объект как ссылался
        * на область памяти, так и ссылается.
        * 3 - Вариант с возвратом изменённой ссылки.
        * Такой вариант не имеет смысла, так как просто будет возвращать null
        * Пример:
        * public Bank delete(bank){
        *   return null;
        * }
        * В такой функции нет смысла, так как можно указать null напрямую.
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
