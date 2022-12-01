package tech.reliab.course.davityanlm.bank.service.impl;

import tech.reliab.course.davityanlm.bank.entity.User;
import tech.reliab.course.davityanlm.bank.service.UserService;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/** Класс-реализация операций клиента, реализует интерфейс клиента {@link User} <br>
 * Реализуется бизнес-логика. Singleton*/
public class UserServiceOperations implements UserService {

    private final Map<Integer, User> users = new HashMap<>();

    private UserServiceOperations(){}

    public static final UserService USER_SERVICE = new UserServiceOperations();

    @Override
    public void createUser(Integer id, String fullName, LocalDate birthDate, String workPlace) {
        users.put(id, new User(id, fullName, birthDate, workPlace));
    }

    @Override
    public User getUser(Integer id) {
        return users.get(id);
    }

    public void changeWorkPlace(User user, String workPlace){
        user.setWorkPlace(workPlace);
    }

}
