package tech.reliab.course.toropchinda.bank.entity;

import tech.reliab.course.toropchinda.bank.service.impl.AtmService;

public class BankAtm implements AtmService {
    private Integer id;
    private String name;
    private String address;
    private Bank bank;
    private Employee employee;
    private Boolean cashOutStatus;
    private Boolean cashInStatus;
    private Long moneyQtyInAtm;
    private Integer serviceCost;
    private Status status;
    public enum Status{
        WORKING("Работает"),
        OUTOFSERVICE("Не работает"),
        OUTOFMONEY("Нет денег");

        private String title;

        Status(String title){
            this.title = title;
        }

        public String getTitle(){
            return title;
        }

        @Override
        public String toString(){
            return "Статус: " + title;
        }

    }



    public BankAtm(String name, Bank bank, BankOffice bankOffice, Employee employee){
        /* Добавляет к количеству банкоматов в банке всего + 1
        * ID текущего банкомата равняется количеству банкоматов*/
        bank.addAtm();
        this.id = bank.atmQty;
        this.name = name;
        this.address = bankOffice.address;
        this.status = Status.OUTOFSERVICE;
        this.bank = bank;
        this.employee = employee;
        this.cashOutStatus = false;
        this.cashInStatus = false;
        this.moneyQtyInAtm = (long)0;
        this.serviceCost = 0;

    }


    @Override
    public void print() {
        if (this.id == null){
            System.out.println("Данный банкомат сейчас не используется");
            System.out.println("Название: " + this.name);
            System.out.println("Последний адрес: " + this.address);
            System.out.println("Последний обслуживающий: " + this.employee.fullName);
            System.out.println("Стоимость обслуживания: " + this.serviceCost);
            return;
        }
        System.out.println("\nID Банкомата: " + this.id);
        System.out.println("Название банкомата: " + this.name);
        System.out.println("Адрес: " + this.address);
        System.out.println(this.status.toString());
        System.out.println("Банк владелец: " + this.bank.name);
        System.out.println("Обслуживает: " + this.employee.fullName);
        System.out.println("Выдача денег: " + this.cashOutStatus);
        System.out.println("Внесение денег: " + this.cashInStatus);
        System.out.println("Кол-во денег внутри: " + this.moneyQtyInAtm);
        System.out.println("Стоимость обслуживания: " + this.serviceCost);
    }

    @Override
    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public void setCashOutStatus(Boolean status) {
        this.cashOutStatus = status;
    }

    @Override
    public void setCashIntStatus(Boolean status) {
        this.cashInStatus = status;
    }

    @Override
    public void setEmployee(Employee employee){
        this.employee = employee;
    }

    @Override
    public void setMoneyQty(Long money) {
        if (money > this.bank.moneyQty){
            System.out.println("Невозможно поместить в банкомат сумму превышающую кол-во всех денег в банке");
            return;
        }
        if (money < 0){System.out.println("Невозможно поместить в банкомат отрицательную сумму");}
        this.moneyQtyInAtm = money;
    }

    @Override
    public void setServiceCost(Integer price) {
        if (price < 0) {System.out.println("Нельзя указать отрицательную стоимость обслуживания банкомата");}
        this.serviceCost = price;
    }

    @Override
    public void delete() {
        this.id = null;
        this.status = Status.OUTOFSERVICE;
        this.bank = null;
        this.moneyQtyInAtm = null;
        this.cashOutStatus = null;
        this.cashInStatus = null;

    }
}
