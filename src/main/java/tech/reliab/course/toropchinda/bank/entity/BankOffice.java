package tech.reliab.course.toropchinda.bank.entity;

import tech.reliab.course.toropchinda.bank.service.impl.BankOfficeService;

public class BankOffice extends Bank implements BankOfficeService {
    private Short id;
    private String name;
    private String address;
    private Boolean activityStatus;
    private Boolean mayToLocateAtmStatus;
    private Byte atmQty;
    private Boolean mayToCreditStatus;
    private Boolean cashingOutStatus;
    private Boolean cashingInStatus;
    private Integer moneyQtyInOffice;
    private Integer rent;


    public BankOffice(short id, String name, String address) {
        super(id, name);

        /* Office ID is variable Bank.officeQty + 1 */
        super.officeQty++;
        this.id = super.officeQty;

        /* Так как в условиях лабы не сказаны значения по умолчанию
        * Ставлю по своему умотрению */
        this.name = name;
        this.address = address;
        this.activityStatus = false;
        this.mayToLocateAtmStatus = false;
        this.atmQty = 0;
        this.mayToCreditStatus = false;
        this.cashingOutStatus = false;
        this.cashingInStatus = false;
        this.moneyQtyInOffice = 0;
        this.rent = 0;
    }

    @Override
    public void print(){
        if(this.id == null){
            System.out.println("Кажется нет связи с офисом, возможно вы его удалили\n" +
                    "Проверьте корзину :))");
        }
        return;


    }

    @Override
    public void setActivityStatus(Boolean status) {
        this.activityStatus = status;
    }

    @Override
    public void setMayToLocateAtmStatus(Boolean status) {
        this.mayToLocateAtmStatus = status;
    }

    @Override
    public void setMayToCreditStatus(Boolean status) {
        this.mayToCreditStatus = status;
    }

    @Override
    public void setCashingOutStatus(Boolean status) {
        this.cashingOutStatus = status;
    }

    @Override
    public void setCashingInStatus(Boolean status) {
        this.cashingInStatus = status;
    }

    @Override
    public void setMoneyQty(Integer moneyQty) {
        this.moneyQtyInOffice = moneyQty;
    }

    @Override
    public void setRent(Integer rentPrice) {
        this.rent = rentPrice;
    }

    @Override
    public void delete(){

        super.officeQty--;
        this.id = null;
        this.name = null;
        this.activityStatus = null;
        this.mayToLocateAtmStatus = null;
        this.atmQty = null;
        this.mayToCreditStatus = null;
        this.cashingOutStatus = null;
        this.cashingInStatus = null;
        this.moneyQtyInOffice = null;
        this.rent = null;
    }
}
