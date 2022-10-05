package tech.reliab.course.davityanlm.bank.service;

import tech.reliab.course.davityanlm.bank.entity.PaymentAccount;

/** Интерфейс операций, связанных с классом {@link PaymentAccount}
 * @version 0.1 */
public interface PaymentAccountService {

    /** Процедура добавления денег на платежный счет
     * @param paymentAccount платежный счет, куда добавляются деньги
     * @param moneyQty количество денег, которое необходимо добавить */
    void addMoney(PaymentAccount paymentAccount, Integer moneyQty);

    /** Процедура вычитания денег из платежного счета
     * @param paymentAccount платежный счет, откуда вычитаются деньги
     * @param moneyQty сумма, которую необходимо вычесть */
    void subMoney(PaymentAccount paymentAccount,Integer moneyQty);

    /** Процедура удаления платежного счета. <br>
     * Объекту присваивается значение <b>null</b>
     * @param paymentAccount платежный счет, который следует удалить */
    void delete(PaymentAccount paymentAccount);
}
