package tech.reliab.course.davityanlm.bank.service.impl;

import tech.reliab.course.davityanlm.bank.entity.User;
import tech.reliab.course.davityanlm.bank.service.UserService;

/** Класс-реализация операций клиента, реализует интерфейс клиента {@link User} <br>
 * Реализуется бизнес-логика*/
public class UserServiceOperations implements UserService {

    public void changeWorkPlace(User user, String workPlace){
        user.setWorkPlace(workPlace);
    }

    public void delete(User user) {
        user = null;
    }
}
