package tech.reliab.course.davityanlm.bank.entity;

import tech.reliab.course.davityanlm.bank.service.impl.CreditAccountServiceOperations;

import java.time.LocalDate;

public class CreditAccount extends CreditAccountServiceOperations {
    private Integer id;
    private User user;
    private Bank bank;
    private LocalDate startCreditDate;
    private LocalDate finishCreditDate;
    private Integer creditMonthQty;
    private Integer creditSum;
    private Integer creditMonthPayment;
    private Float percent;
    private Employee employee;
    private PaymentAccount paymentAccount;

    public CreditAccount(Integer id, User user, Bank bank, Employee employee, PaymentAccount paymentAccount){
        setId(id);
        setUser(user);
        setBank(bank);
        setStartCreditDate(LocalDate.of(1, 1, 1));
        setFinishCreditDate(LocalDate.of(1,1,1));
        setCreditMonthQty(0);
        setCreditSum(0);
        setCreditMonthPayment(0);
        setPercent(bank.getPercent());
        setEmployee(employee);
        setPaymentAccount(paymentAccount);
    }

    @Override
    public String toString(){
        if(getId() == null){
            return "Кажется данный кредитный счет закрыт";
        }
        return "\nКредитный счёт{ " +
                "\nID кредитного счета: " + getId() +
                ",\nБанк счета: " + getBank().getName() +
                ",\nКредит выдал: " + getEmployee().getFullName() +
                ",\nID платежного счета: " + getId() +
                ",\nДата начала кредита: " + getStartCreditDate() +
                ",\nДата окончания кредита: " + getFinishCreditDate() +
                ",\nСумма кредита: " + getCreditSum() +
                ",\nПроцент: " + getPercent() +
                "\n}";
    }

    public Integer getId(){
        return this.id;
    }

    public User getUser(){
        return this.user;
    }

    public Bank getBank(){
        return this.bank;
    }

    public LocalDate getStartCreditDate(){
        return this.startCreditDate;
    }

    public LocalDate getFinishCreditDate(){
        return this.finishCreditDate;
    }

    public Integer getCreditMonthQty(){
        return this.creditMonthQty;
    }

    public Integer getCreditSum(){
        return this.creditSum;
    }

    public Integer getCreditMonthPayment(){
        return this.creditMonthPayment;
    }

    public Float getPercent(){
        return this.percent;
    }

    public Employee getEmployee(){
        return this.employee;
    }

    public PaymentAccount getPaymentAccount(){
        return this.paymentAccount;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void setStartCreditDate(LocalDate startCreditDate) {
        this.startCreditDate = startCreditDate;
    }

    public void setFinishCreditDate(LocalDate finishCreditDate) {
        this.finishCreditDate = finishCreditDate;
    }

    public void setCreditMonthQty(Integer creditMonthQty) {
        this.creditMonthQty = creditMonthQty;
    }

    public void setCreditSum(Integer creditSum) {
        this.creditSum = creditSum;
    }

    public void setCreditMonthPayment(Integer creditMonthPayment) {
        this.creditMonthPayment = creditMonthPayment;
    }

    public void setPercent(Float percent) {
        this.percent = percent;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setPaymentAccount(PaymentAccount paymentAccount) {
        this.paymentAccount = paymentAccount;
    }
}
