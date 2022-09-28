package tech.reliab.course.toropchinda.bank.entity;

import tech.reliab.course.toropchinda.bank.service.impl.UserService;

import java.util.Date;
import java.util.Random;
import java.util.StringTokenizer;

public class User implements UserService {
    protected Long id;
    private String fullName;
    private Date birthDate;
    private String workPlace;
    private Short monthIncome; /*Short, потому что по условию лабы не более 10к*/
    private Bank bank;
    private CreditAccount creditAccount;
    private PaymentAccount paymentAccount;
    private Short creditRate;

    public User(String fullName, Date birthDate, String workPlace ,Bank bank){
        /* К общему кол-ву клиентов в банке мы добавляем + 1
        * ID клиента - кол-во клиентов в банке */
        bank.addClient();
        this.id = bank.clientQty;

        /* Переменные, которые заполняются параметрами */
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.workPlace = workPlace;
        this.bank = bank;
        this.creditAccount = null;
        this.paymentAccount = null;

        /*Работа с рандомом*/
        Random random = new Random();
        int i = random.nextInt(10001);
        i += 500;
        this.monthIncome = (short)i;

        setCreditRate(this.monthIncome);


    }

    private void setCreditRate(Short monthIncome){
        if (monthIncome < 1000) {this.creditRate = 100;}
        if (monthIncome >= 1000 && monthIncome < 2000) {this.creditRate = 200;}
        if (monthIncome >= 2000 && monthIncome < 3000) {this.creditRate = 300;}
        if (monthIncome >= 3000 && monthIncome < 4000) {this.creditRate = 400;}
        if (monthIncome >= 4000 && monthIncome < 5000) {this.creditRate = 500;}
        if (monthIncome >= 5000 && monthIncome < 6000) {this.creditRate = 600;}
        if (monthIncome >= 6000 && monthIncome < 7000) {this.creditRate = 700;}
        if (monthIncome >= 7000 && monthIncome < 8000) {this.creditRate = 800;}
        if (monthIncome >= 8000 && monthIncome < 9000) {this.creditRate = 900;}
        if (monthIncome >= 9000 && monthIncome < 10000) {this.creditRate = 1000;}
    }

    @Override
    public void print() {
        if (this.id == null) {
            System.out.println("Кажется это больше не наш клиент :((");
            System.out.println("ФИО: " + this.fullName);
            System.out.println("Дата рождения" + this.birthDate);
        }
        System.out.println("ФИО: " + this.fullName);
        System.out.println("Дата рождения: " + this.birthDate);
        System.out.println("Место работы: " + this.workPlace);
        System.out.println("Месячный доход: " + this.monthIncome);
        System.out.println("Кредитный рейтнг: " + this.creditRate);

        if (this.paymentAccount == null){System.out.println("Платежный счет: отсутствует" );}
        else{System.out.println("Платежный счет: " + this.paymentAccount.id);}

        if (this.creditAccount == null){System.out.println("Кредитный счет: отсутствует" );}
        else{System.out.println("Кредитный счет: " + this.creditAccount.id);}
    }

    @Override
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public void setBirthDate(Date date) {
        this.birthDate = birthDate;
    }

    @Override
    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    @Override
    public void setCreditAccount(CreditAccount creditAccount) {
        this.creditAccount = creditAccount;
    }

    @Override
    public void setPaymentAccount(PaymentAccount paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

    @Override
    public void setMonthIncome(Short monthIncome) {
        this.monthIncome = monthIncome;
        setCreditRate(monthIncome);
    }

    @Override
    public void delete() {
        this.id = null;
        this.workPlace = null;
        this.monthIncome = null;
        this.paymentAccount.delete();
        this.creditAccount = null;
        this.creditRate = null;
    }
}
