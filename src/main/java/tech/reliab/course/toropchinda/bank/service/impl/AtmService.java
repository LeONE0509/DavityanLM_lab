package tech.reliab.course.toropchinda.bank.service.impl;

import tech.reliab.course.toropchinda.bank.entity.Employee;

public interface AtmService {

    void print();

    void setStatus(String status);

    void setCashOutStatus(Boolean status);
    void setCashIntStatus(Boolean status);

    void setEmployee(Employee employee);

    void setMoneyQty(Long money);

    void setServiceCost(Integer price);

    void delete();

}
