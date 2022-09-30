package tech.reliab.course.davityanlm.bank.entity;

import tech.reliab.course.davityanlm.bank.service.impl.UserService;
import tech.reliab.course.davityanlm.bank.service.impl.operations.UserServiceOperations;

import java.util.Date;
import java.util.Random;

public class User implements UserServiceOperations {
    private Integer id;
    private String fullName;
    private Date birthDate;
    private String workPlace;
    private Integer monthIncome;
    private Bank bank;
    private CreditAccount creditAccount;
    private PaymentAccount paymentAccount;
    private Integer creditRate;

    public User(String fullName, Date birthDate, String workPlace ,Bank bank){
        setId(bank.getClientQty());
        setFullName(fullName);
        setBirthDate(birthDate);
        setWorkPlace(workPlace);

        /*Работа с рандомом*/
        Random random = new Random();
        int i = random.nextInt(10001);
        i += 500;
        setMonthIncome(i);

        setBank(bank);
        setCreditAccount(null);
        setPaymentAccount(null);
        setCreditRate(calculateCreditRate(i));
    }

    private Integer calculateCreditRate(Integer monthIncome){
        if (monthIncome < 1000) {return 100;}
        if (monthIncome >= 1000 && monthIncome < 2000) {return 200;}
        if (monthIncome >= 2000 && monthIncome < 3000) {return 300;}
        if (monthIncome >= 3000 && monthIncome < 4000) {return 400;}
        if (monthIncome >= 4000 && monthIncome < 5000) {return 500;}
        if (monthIncome >= 5000 && monthIncome < 6000) {return 600;}
        if (monthIncome >= 6000 && monthIncome < 7000) {return 700;}
        if (monthIncome >= 7000 && monthIncome < 8000) {return 800;}
        if (monthIncome >= 8000 && monthIncome < 9000) {return 900;}
        return 1000;
    }

    @Override
    public String toString(){
        if (getId() == null) {
            return "Клиент{" +
                    "\nКажется это больше не наш клиент :((" +
                    "\nФИО: " + getFullName() +
                    ",\nДата рождения: " + getBirthDate() +
                    "\n}";

        }
        String string = "\nПользователь{" +
                "\nФИО: " + getFullName() +
                ",\nДата рождения: " + getBirthDate() +
                ",\nМесто работы: " + getWorkPlace() +
                ",\nМесячный доход: " + getMonthIncome() +
                ",\nКредитный рейтинг: " + getCreditRate();

        if (getPaymentAccount() == null) {string += ",\nПлатежный счет: отсутствует";}
        else{string += ",\nПлатежный счет: " + getPaymentAccount().getId();}

        if (getCreditAccount() == null){string += ",\nКредитный счет: отсутствует";}
        else{string += ",\nКредитный счет: " + getCreditAccount().getId();}

        string += "\n}";
        return string;

    }

    public Integer getId() {
        return this.id;
    }

    public String getFullName() {
        return this.fullName;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    public String getWorkPlace() {
        return this.workPlace;
    }

    public Integer getMonthIncome() {
        return this.monthIncome;
    }

    public Bank getBank() {
        return this.bank;
    }

    public CreditAccount getCreditAccount() {
        return this.creditAccount;
    }

    public PaymentAccount getPaymentAccount() {
        return this.paymentAccount;
    }

    public Integer getCreditRate() {
        return this.creditRate;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public void setBirthDate(Date date) {
        this.birthDate = birthDate;
    }


    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public void setMonthIncome(Integer monthIncome) {
        this.monthIncome = monthIncome;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void setCreditAccount(CreditAccount creditAccount) {
        this.creditAccount = creditAccount;
    }


    public void setPaymentAccount(PaymentAccount paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

    public void setCreditRate(Integer creditRate) {
        this.creditRate = creditRate;
    }
}
