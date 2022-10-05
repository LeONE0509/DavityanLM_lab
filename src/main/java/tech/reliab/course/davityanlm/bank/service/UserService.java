package tech.reliab.course.davityanlm.bank.service;

import tech.reliab.course.davityanlm.bank.entity.User;

/** Интерфейс операций, связанных с классом {@link User}
 * @version 0.1 */
public interface UserService {

    /** Процедура смены места работы
     * @param user клиент, которому необходимо сменить место работы
     * @param workPlace место работы клиента*/
    void changeWorkPlace(User user, String workPlace);

    /** Процедура удаления клиента. <br>
     * Объекту присваивается значение <b>null</b>
     * @param user клиент, которого следует удалить */
    void delete(User user);
}
