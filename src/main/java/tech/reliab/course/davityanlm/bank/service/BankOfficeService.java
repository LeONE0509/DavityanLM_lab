package tech.reliab.course.davityanlm.bank.service;

import tech.reliab.course.davityanlm.bank.entity.BankOffice;

/** Интерфейс операций, связанных с классом {@link BankOffice}
 * @version 0.1*/
public interface BankOfficeService {

    /** Процедура добавления банкомата. <br>
     * Добавляет плюс один к полю <b>atmQty</b>.
     * @param bankOffice банковский офис, к которому следует добавить банкомат*/
    void addAtm(BankOffice bankOffice);

    /** Процедура удаления банковского офиса. <br>
     * Объекту присваивается значение <b>null</b>
     * @param bankOffice банковский офис, который следует удалить. */
    void delete(BankOffice bankOffice);
}
