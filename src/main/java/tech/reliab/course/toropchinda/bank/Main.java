package tech.reliab.course.toropchinda.bank;

import tech.reliab.course.toropchinda.bank.entity.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank((short)1, "LevaBank228");

        BankOffice bankOffice = new BankOffice(bank, "Office 1", " Pushkina Street, Kolotushkina 322");
        //bankOffice.print();

        Employee employee = new Employee("Лев Михалыч", new Date(2000, 9, 5), bank, bankOffice, "Генеральный директор");
        //employee.print();

        BankAtm bankAtm = new BankAtm("Samsung", bank, bankOffice, employee);
        //bankAtm.print();

        User user = new User("Иванов Иван", new Date(2000, 3, 7), "БГТУ", bank);
        //user.print();


efefsfs

        bank.print();
    }
}