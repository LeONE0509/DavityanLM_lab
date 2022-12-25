package tech.reliab.course.davityanlm.bank.service;

import tech.reliab.course.davityanlm.bank.entity.User;
import tech.reliab.course.davityanlm.bank.utils.UserException;

import java.time.LocalDate;

/** Интерфейс операций, связанных с классом {@link User}
 * @version 0.1 */
public interface UserService {


    /** Функция для выявления банка, который выдаст кредит клиенту
     * @param money на какую сумму будет взят кредит
     * @return id - идентификатор банка, который выдаст кредит*/
    int[] searchPlaceForGiveCredit(Integer money) throws UserException;

    /** Функция получения кредита для клиента id на сумму money
     * @param id идентификатор пользователя {@link User}
     * @param money на какую сумму будет взят кредит
     * @return true - если кредит выдан успешно <br>
     *         false - если кредит выдать не удалось*/
    Boolean getCredit(Integer id, Integer money) throws UserException;

    /** Процедура получения полной информации о клиенте
     * @param id идентификатор клиента */
    void getAllInformation(Integer id);

    /** Процедура создания экземпляра {@link User} */
    void createUser (Integer id, String fullName, LocalDate birthDate, String workPlace);

    /** Функция получения экземпляра {@link User}
     * @param id идентификатор пользователя
     * @return объект класса {@link User}*/
    User getUser(Integer id);

    /**
     * Процедура смены места работы
     * @param user      клиент, которому необходимо сменить место работы
     * @param workPlace место работы клиента
     */
    void changeWorkPlace(User user, String workPlace);
}
