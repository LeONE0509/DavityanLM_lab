package tech.reliab.course.toropchinda.bank.entity;

import tech.reliab.course.toropchinda.bank.service.impl.PaymentAccountService;

public class PaymentAccount implements PaymentAccountService {
    protected Long id;
    private User user;
    private Bank bank;
    private Integer currentSum;

    public PaymentAccount(User user, Bank bank){
        this.id = user.id;
        this.user = user;
        this.bank = bank;
        this.currentSum = 0;
    }


    @Override
    public void print() {
        if(this.id == null){
            System.out.println("Такого счета больше не существует, скорее всего " +
                    "пользователь больше не клиент банка");
            return;
        }
        System.out.println("ID Счета: " + this.id);
        System.out.println("Пользователь счета: " + this.id);
        System.out.println("Банк счета: " + this.bank.name);
        System.out.println("Текущая сумма: " + this.currentSum);
    }

    @Override
    public void addMoney(Integer moneyQty) {
        this.currentSum += moneyQty;
    }

    @Override
    public void subMoney(Integer moneyQty) {
        if(moneyQty > this.currentSum){
            System.out.println("Недостаточно средств");
            return;
        }
        this.currentSum -= moneyQty;

    }

    @Override
    public void delete() {
        this.id = null;
        this.user = null;
        this.bank = null;
        this.currentSum = null;
    }
}
