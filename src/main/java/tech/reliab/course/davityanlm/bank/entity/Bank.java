package tech.reliab.course.davityanlm.bank.entity;

import tech.reliab.course.davityanlm.bank.service.impl.BankServiceOperations;

import java.util.Random;

public class Bank extends BankServiceOperations  {
    private Integer id;
    private String name;
    private Integer officeQty;
    private Integer atmQty;
    private Integer employeeQty;
    private Integer clientQty;
    private Integer rate;
    private Integer moneyQty;
    private Float percent;

    public Bank(Integer id, String name){
        setId(id);
        setName(name);
        setOfficeQty(0);
        setAtmQty(0);
        setEmployeeQty(0);
        setClientQty(0);
        Random random = new Random();
        setRate(random.nextInt(101));
        setMoneyQty(random.nextInt(1000000));
        setPercent(random.nextFloat(20));
    }

    @Override
    public String toString(){
        if (getId() == null){
            return "Кажется нет связи с банком, возможно вы его удалили, проверьте корзину :))";
        }
        return "Банк {" +
                ",\nID Банка: " + getId() +
                ",\nНазвание: " + getName() +
                ",\nКол-во офисов: " + getOfficeQty() +
                ",\nКол-во банкоматов: " + getAtmQty() +
                ",\nКол-во сотрудников: " + getClientQty() +
                ",\nКол-во клиентов: " + getClientQty() +
                ",\nРейтинг: " + getRate() +
                ",\nКол-во денег: " + getMoneyQty() +
                ",\nПроцентная ставка: " + getPercent() +
                "\n}";
    }

    public Integer getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public Integer getOfficeQty(){
        return this.officeQty;
    }

    public Integer getAtmQty(){
        return this.atmQty;
    }

    public Integer getEmployeeQty(){
        return this.employeeQty;
    }

    public Integer getClientQty(){
        return this.clientQty;
    }

    public Integer getRate(){
        return this.rate;
    }

    public Integer getMoneyQty(){
        return this.moneyQty;
    }

    public Float getPercent(){
        return this.percent;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setOfficeQty(Integer officeQty){
        this.officeQty = officeQty;
    }

    public void setAtmQty(Integer atmQty){
        this.atmQty = atmQty;
    }

    public void setEmployeeQty(Integer employeeQty){
        this.employeeQty = employeeQty;
    }

    public void setClientQty(Integer clientQty){
        this.clientQty = clientQty;
    }

    public void setRate(Integer rate){
        this.rate = rate;
    }

    public void setMoneyQty(Integer moneyQty){
        this.moneyQty = moneyQty;
    }

    public void setPercent(Float percent){
        this.percent = percent;
    }

}
