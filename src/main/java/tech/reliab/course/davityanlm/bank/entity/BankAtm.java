package tech.reliab.course.davityanlm.bank.entity;

import tech.reliab.course.davityanlm.bank.service.impl.operations.AtmServiceOperations;

public class BankAtm extends AtmServiceOperations{
    private Integer id;
    private String name;
    private String address;
    private Bank bank;
    private Employee employee;
    private Boolean cashOutStatus;
    private Boolean cashInStatus;
    private Integer moneyQtyInAtm;
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

    public BankAtm(Integer id, String name, Bank bank, BankOffice bankOffice, Employee employee){
        setId(id);
        setName(name);
        setAddress(bankOffice.address);
        setBank(bank);
        setEmployee(employee);
        setCashOutStatus(false);
        setCashIntStatus(false);
        setMoneyQtyInAtm(0);
        setServiceCost(0);
        setStatus(Status.OUTOFSERVICE);
    }

    @Override
    public String toString(){
        if(getId() == null){
            return "Банкомат{" +
                    ",\nДанный банкомат сейчас не используется" +
                    ",\nНазвание: " + getName() +
                    ",\nПоследний адрес: " + getAddress() +
                    ",\nПоследний обслуживающий: " + getEmployee() +
                    ",\nСтоимость обслуживания: " + getServiceCost() +
                    "\n}";
        }
        return "\nБанкомат{" +
                "\nID Банкомата: " + getId() +
                ",\nНазвание: " + getName() +
                ",\nАдрес: " + getAddress() +
                ",\nСтатус: " + getStatus().toString() +
                ",\nБанк владелец: " + getBank().getName() +
                ",\nОбслуживает: " + getEmployee().getFullName() +
                ",\nВыдача денег: " + getCashOutStatus() +
                ",\nВнесение денег: " + getCashInStatus() +
                ",\nКол-во денег внутри: " + getMoneyQtyInAtm() +
                ",\nСтоимость обслуживания: " + getServiceCost() +
                "\n}";
    }

    public Integer getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public Bank getBank(){
        return this.bank;
    }

    public Employee getEmployee(){
        return this.employee;
    }

    public Boolean getCashOutStatus(){
        return this.cashOutStatus;
    }

    public Boolean getCashInStatus(){
        return this.cashInStatus;
    }

    public Integer getMoneyQtyInAtm(){
        return this.moneyQtyInAtm;
    }

    public Integer getServiceCost(){
        return this.serviceCost;
    }

    public Status getStatus(){
        return this.status;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setBank(Bank bank){
        this.bank = bank;
    }

    public void setEmployee(Employee employee){
        this.employee = employee;
    }

    public void setCashOutStatus(Boolean status) {
        this.cashOutStatus = status;
    }

    public void setCashIntStatus(Boolean status) {
        this.cashInStatus = status;
    }

    public void setMoneyQtyInAtm(Integer money) {
        this.moneyQtyInAtm = money;
    }

    public void setServiceCost(Integer price) {
        this.serviceCost = price;
    }

    public void setStatus(BankAtm.Status status) {
        this.status = status;
    }

}
