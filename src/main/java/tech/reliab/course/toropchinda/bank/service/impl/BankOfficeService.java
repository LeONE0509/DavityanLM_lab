package tech.reliab.course.toropchinda.bank.service.impl;

public interface BankOfficeService {

    void print();

    void setActivityStatus(Boolean status);

    void setMayToLocateAtmStatus(Boolean status);

    void addAtm();

    void setMayToCreditStatus(Boolean status);

    void setCashingOutStatus(Boolean status);

    void setCashingInStatus(Boolean status);

    void setMoneyQty(Integer moneyQty);

    void setRent(Integer rentPrice);

    void delete();
}
