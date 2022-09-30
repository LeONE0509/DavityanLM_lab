package tech.reliab.course.davityanlm.bank.entity;

import tech.reliab.course.davityanlm.bank.service.impl.PaymentAccountService;
import tech.reliab.course.davityanlm.bank.service.impl.operations.PaymentServiceOperations;

public class PaymentAccount implements PaymentServiceOperations {
    private Integer id;
    private User user;
    private Bank bank;
    private Integer currentSum;

    public PaymentAccount(User user, Bank bank){
        setId(user.getId());
        setUser(user);
        setBank(bank);
        setCurrentSum(0);
    }

    public Integer getId() {
        return this.id;
    }

    public User getUser() {
        return this.user;
    }

    public Bank getBank() {
        return this.bank;
    }

    public Integer getCurrentSum() {
        return this.currentSum;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void setCurrentSum(Integer currentSum) {
        this.currentSum = currentSum;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
