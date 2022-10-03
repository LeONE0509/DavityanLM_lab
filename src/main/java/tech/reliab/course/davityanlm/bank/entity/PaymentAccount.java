package tech.reliab.course.davityanlm.bank.entity;

import tech.reliab.course.davityanlm.bank.service.impl.PaymentServiceOperations;

public class PaymentAccount extends PaymentServiceOperations {
    private Integer id;
    private User user;
    private Bank bank;
    private Integer currentSum;

    public PaymentAccount(Integer id, User user, Bank bank){
        setId(id);
        setUser(user);
        setBank(bank);
        setCurrentSum(0);
    }

    @Override
    public String toString(){
        if(getId() == null){
            return "\nТакого счета больше не существует, скорее всего пользователь больше не клиент банка";
        }
        return "\nПлатежный счет{" +
                "\nID счета: " + getId() +
                ",\nПользователь счета: " + getUser().getFullName() +
                ",\nБанк счета: " + getBank().getName() +
                ",\nТекущая сумма: " + getCurrentSum() +
                "\n}";
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
