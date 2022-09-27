package tech.reliab.course.toropchinda.bank;

import tech.reliab.course.toropchinda.bank.entity.Bank;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank((short)1, "LevaBank228");
        bank.delete();
        bank.print();

    }
}