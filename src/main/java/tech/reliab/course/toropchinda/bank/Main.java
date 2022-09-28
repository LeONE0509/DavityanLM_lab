package tech.reliab.course.toropchinda.bank;

import tech.reliab.course.toropchinda.bank.entity.Bank;
import tech.reliab.course.toropchinda.bank.entity.BankOffice;
import tech.reliab.course.toropchinda.bank.entity.Employee;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank((short)1, "LevaBank228");
        bank.addOffice();
        bank.addOffice();
        bank.addEmployee();


        BankOffice bankOffice = new BankOffice(bank, "Office 1", " Pushkina Street, Kolotushkina 322");
        bankOffice.print();

        Employee employee = new Employee("Лев Михалыч", new Date(2000, 9, 5), bank, bankOffice, "Генеральный директор");
        employee.print();

        bank.print();
    }
}