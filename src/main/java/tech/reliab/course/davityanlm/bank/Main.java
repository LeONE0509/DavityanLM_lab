package tech.reliab.course.davityanlm.bank;

import tech.reliab.course.davityanlm.bank.entity.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Bank myBank = new Bank(1, "LevaBank228");
        myBank.addClient(myBank);
        myBank.print(myBank);

        BankOffice myBankOffice = new BankOffice(myBank, "Отделение №1", "улица Пушкина дом Колотушкина");
        myBankOffice.addAtm(myBankOffice);
        myBankOffice.print(myBankOffice);

        Employee Vechost = new Employee("Вечность Лев", new Date(), myBank, myBankOffice, "Генеральный");
        Vechost.setSalary(228322);
        Vechost.print(Vechost);

        BankAtm myBankAtm = new BankAtm("Samsung", myBank, myBankOffice, Vechost);
        myBankAtm.addMoney(myBankAtm, 228322);

        User Leva = new User("Вечность Лев", new Date(), "LevaBank228", myBank);

        PaymentAccount pa = new PaymentAccount(Leva, myBank);
        pa.addMoney(pa, 228322);
        pa.print(pa);

        CreditAccount ca = new CreditAccount(Leva, myBank, Vechost, pa);
        ca.setCreditSum(1337);
        ca.print(ca);

        Leva.setPaymentAccount(pa);
        Leva.setCreditAccount(ca);
        Leva.print(Leva);

    }
}