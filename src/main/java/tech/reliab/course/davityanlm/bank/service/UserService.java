package tech.reliab.course.davityanlm.bank.service;


import tech.reliab.course.davityanlm.bank.entity.User;

public interface UserService {

    void changeWorkPlace(User user, String workPlace);

    void delete(User user);
}
