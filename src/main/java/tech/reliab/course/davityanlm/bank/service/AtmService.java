package tech.reliab.course.davityanlm.bank.service;

import tech.reliab.course.davityanlm.bank.entity.BankAtm;

/** Интерфейс операций, связанных с классом {@link BankAtm}
 * @version 0.1*/
public interface AtmService {

    /** Процедура добавления денег в банкомат. <br>
     * @param bankAtm банкомат, к которому следует добавить деньги
     * @param moneyQty количество денег, которое следует добавить*/
    void addMoney(BankAtm bankAtm, Integer moneyQty);

    /** Процедура удаления банкомата. <br>
     * Объекту присваивается значение <b>null</b>
     * @param bankAtm банкомат, который следует удалить */
    void delete(BankAtm bankAtm);

}
