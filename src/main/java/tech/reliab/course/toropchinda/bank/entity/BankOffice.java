package tech.reliab.course.toropchinda.bank.entity;

import tech.reliab.course.toropchinda.bank.service.impl.BankOfficeService;

public class BankOffice implements BankOfficeService {
    private Short id;
    protected String name;
    protected String address;
    private Boolean activityStatus;
    private Boolean mayToLocateAtmStatus;
    private Byte atmQty;
    private Boolean mayToCreditStatus;
    private Boolean cashingOutStatus;
    private Boolean cashingInStatus;
    private Integer moneyQtyInOffice;
    private Integer rent;


    public BankOffice(Bank bank, String name, String address) {

        if(bank.id == null){
            System.out.println("ID банка (наследник офис) не может равняться нулю, проверь код");
            return;
        }

        /* Office ID is variable Bank.officeQty + 1 */
        /* ID офиса - это количество уже существующих офисов + 1 */
        bank.addOffice();
        this.id = bank.officeQty;

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
        /* Обработка исключительных ситуаций */
        if(this.id == null){
            System.out.println("Кажется нет связи с офисом, возможно вы его удалили\n" +
                    "Проверьте корзину :))");
            return;
        }

        System.out.println("ID Офиса " + this.id);
        System.out.println("Название: " + this.name);
        System.out.println("Адрес: " + this.address);
        System.out.println("Активность: " + this.activityStatus);
        System.out.println("Возможность разместить банкомат: " + this.mayToLocateAtmStatus);
        System.out.println("Кол-во банкоматов в офисе: " + this.atmQty);
        System.out.println("Возможность взять кредит: " + this.mayToCreditStatus);
        System.out.println("Возможность снять деньги: " + this.cashingOutStatus);
        System.out.println("Возможность внести деньги: " + this.cashingInStatus);
        System.out.println("Кол-во денег в офисе: " + this.moneyQtyInOffice);
        System.out.println("Стоимость аренды: " + this.rent);

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
    public void addAtm() {
        this.atmQty++;
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
