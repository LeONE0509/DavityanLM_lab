package tech.reliab.course.toropchinda.bank.entity;

import tech.reliab.course.toropchinda.bank.service.impl.CreditAccountService;
import tech.reliab.course.toropchinda.bank.service.impl.PaymentAccountService;

import java.util.Date;

public class CreditAccount implements CreditAccountService {
    protected Long id;
    private User user;
    private Bank bank;
    private Date startCreditDate;
    private Date finishCreditDate;
    private Integer creditMonthQty;
    private Integer creditSum;
    private Integer creditMonthPayment;
    private Float percent;
    private Employee employee;
    private PaymentAccount paymentAccount;

    public CreditAccount(User user, Bank bank, Employee employee, PaymentAccount paymentAccount){
        this.id = user.id;
        this.bank = bank;
        this.employee = employee;
        this.paymentAccount = paymentAccount;

        this.startCreditDate = new Date(2022, 9, 28);
        this.finishCreditDate = new Date(2022, 9, 28);
        this.creditMonthQty = 0;
        this.creditSum = 0;
        this.percent = bank.percent;
    }

    @Override
    public void print() {
        if (this.id == null){
            System.out.println("Кажется данный кредитный счет закрыт");
            return;
        }
        System.out.println("\nID кредитного счета: " + this.id);
        System.out.println("Банк счета: " + this.bank.name);
        System.out.println("Кредит выдал: " + this.employee.fullName);
        System.out.println("ID платежного счета: " + this.id);
        System.out.println("Дата начала кредита: " + this.startCreditDate);
        System.out.println("Дата конца кредита: " + this.finishCreditDate);
        System.out.println("Сумма кредита: " + this.finishCreditDate);
        System.out.println("Процент: " + this.percent);
    }

    @Override
    public void delete() {
        this.id = null;
    }
}
