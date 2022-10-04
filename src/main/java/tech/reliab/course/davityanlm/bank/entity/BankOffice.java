package tech.reliab.course.davityanlm.bank.entity;

public class BankOffice{
    private Integer id;
    private String name;
    private String address;
    private Boolean activityStatus;
    private Boolean mayToLocateAtmStatus;
    private Integer atmQty;
    private Boolean mayToCreditStatus;
    private Boolean cashingOutStatus;
    private Boolean cashingInStatus;
    private Integer moneyQtyInOffice;
    private Integer rent;


    public BankOffice(Integer id, String name, String address) {
        setId(id);
        setName(name);
        setAddress(address);
        setActivityStatus(false);
        setMayToLocateAtmStatus(false);
        setAtmQty(0);
        setMayToCreditStatus(false);
        setCashingOutStatus(false);
        setCashingInStatus(false);
        setMoneyQtyInOffice(0);
        setRent(0);
    }
    @Override
    public String toString(){
        if (getId() == null){
            return "Кажется нет связи с офисом, возможно вы его удалили. Проверьте корзину :))";
        }
        return "\nБанковский офис{" +
                "\nID Офиса: " + getId() +
                ",\nНазвание: " + getName() +
                ",\nАдрес: " + getAddress() +
                ",\nАктивность: " + getActivityStatus() +
                ",\nВозможность разместить банкомат: " + getMayToLocateAtmStatus() +
                ",\nКол-во банкоматов в офисе: " + getAtmQty() +
                ",\nВозможность взять кредит: " + getMayToCreditStatus() +
                ",\nВозможность снять деньги: " + getCashingOutStatus() +
                ",\nВозможность внести деньги: " + getCashingInStatus() +
                ",\nКол-во денег в офисе: " + getMoneyQtyInOffice() +
                ",\nСтоимость аренды: " + getRent() +
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

    public Boolean getActivityStatus(){
        return this.activityStatus;
    }

    public Boolean getMayToLocateAtmStatus(){
        return this.mayToLocateAtmStatus;
    }

    public Integer getAtmQty(){
        return this.atmQty;
    }

    public Boolean getMayToCreditStatus(){
        return this.mayToCreditStatus;
    }

    public Boolean getCashingOutStatus(){
        return this.cashingOutStatus;
    }

    public Boolean getCashingInStatus(){
        return this.cashingInStatus;
    }

    public Integer getMoneyQtyInOffice(){
        return this.moneyQtyInOffice;
    }

    public Integer getRent(){
        return this.rent;
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

    public void setActivityStatus(Boolean status) {
        this.activityStatus = status;
    }

    public void setMayToLocateAtmStatus(Boolean status) {
        this.mayToLocateAtmStatus = status;
    }

    public void setAtmQty(Integer atmQty){
        this.atmQty = atmQty;
    }

    public void setMayToCreditStatus(Boolean status) {
        this.mayToCreditStatus = status;
    }

    public void setCashingOutStatus(Boolean status) {
        this.cashingOutStatus = status;
    }

    public void setCashingInStatus(Boolean status) {
        this.cashingInStatus = status;
    }

    public void setMoneyQtyInOffice(Integer moneyQty) {
        this.moneyQtyInOffice = moneyQty;
    }

    public void setRent(Integer rentPrice) {
        this.rent = rentPrice;
    }
}
