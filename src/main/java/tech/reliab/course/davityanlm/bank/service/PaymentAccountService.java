package tech.reliab.course.davityanlm.bank.service;

import tech.reliab.course.davityanlm.bank.entity.Bank;
import tech.reliab.course.davityanlm.bank.entity.PaymentAccount;
import tech.reliab.course.davityanlm.bank.entity.User;

/**
 * Интерфейс операций, связанных с классом {@link PaymentAccount}
 *
 * @version 0.1
 */
public interface PaymentAccountService {

    /**
     * Процедура создания экземпляра {@link PaymentAccount}
     */
    void createPaymentAccount(Bank bank, User user, Integer id, Integer currentSum);

    /**
     * Функция получения экземпляра {@link PaymentAccount}
     *
     * @param id идентификатор платёжного счета
     * @return объект класса {@link PaymentAccount}
     */
    PaymentAccount getPaymentAccount(Integer id);

    /**
     * Процедура добавления денег на платежный счет
     *
     * @param paymentAccount платежный счет, куда добавляются деньги
     * @param moneyQty       количество денег, которое необходимо добавить
     */
    void addMoney(PaymentAccount paymentAccount, Integer moneyQty);

    /**
     * Процедура вычитания денег из платежного счета
     *
     * @param paymentAccount платежный счет, откуда вычитаются деньги
     * @param moneyQty       сумма, которую необходимо вычесть
     */
    void subMoney(PaymentAccount paymentAccount, Integer moneyQty);

    /**
     * Процедура для переноса платежного счета
     * @param userId у какого пользователя переносим
     * @param bankId куда будем переносить счет
     */
    void transitAcc(Integer userId, Integer bankId);
}
