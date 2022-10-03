package tech.reliab.course.davityanlm.bank;

import tech.reliab.course.davityanlm.bank.entity.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Bank myBank = new Bank(1, "LevaBank228");
        myBank.addOffice(myBank);
        myBank.addClient(myBank);
        System.out.println(myBank);


       BankOffice myBankOffice = new BankOffice(1, "Отделение №1", "улица Пушкина дом Колотушкина");
        myBankOffice.addAtm(myBankOffice);
        System.out.println(myBankOffice);

        Employee Vechost = new Employee(1, "Вечность Лев", new Date(), myBank, myBankOffice, "Генеральный");
        Vechost.setSalary(228322);
        System.out.println(Vechost);

        BankAtm myBankAtm = new BankAtm(1, "Samsung", myBank, myBankOffice, Vechost);
        myBankAtm.addMoney(myBankAtm, 228322);
        System.out.println(myBankAtm);

        User Leva = new User(1, "Вечность Лев", new Date(), "LevaBank228", myBank);

        PaymentAccount pa = new PaymentAccount(1, Leva, myBank);
        pa.addMoney(pa, 228322);
        System.out.println(pa);

        CreditAccount ca = new CreditAccount(1, Leva, myBank, Vechost, pa);
        ca.setCreditSum(1337);
        System.out.println(ca);


        Leva.setPaymentAccount(pa);
        Leva.setCreditAccount(ca);
        System.out.println(Leva);

        Leva.delete(Leva);
    }
}