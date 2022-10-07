package tech.reliab.course.davityanlm.bank.service.impl;

import tech.reliab.course.davityanlm.bank.entity.User;
import tech.reliab.course.davityanlm.bank.service.UserService;

/** Класс-реализация операций клиента, реализует интерфейс клиента {@link User} <br>
 * Реализуется бизнес-логика. Singleton*/
public class UserServiceOperations implements UserService {

    private UserServiceOperations(){}

    public static final UserService USER_SERVICE = new UserServiceOperations();

    public void changeWorkPlace(User user, String workPlace){
        user.setWorkPlace(workPlace);
    }

}
