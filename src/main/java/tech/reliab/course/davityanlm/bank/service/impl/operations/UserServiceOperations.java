package tech.reliab.course.davityanlm.bank.service.impl.operations;

import tech.reliab.course.davityanlm.bank.entity.User;
import tech.reliab.course.davityanlm.bank.service.impl.UserService;

public class UserServiceOperations implements UserService {

    public void delete(User user) {
        user.setId(null);
        user.setWorkPlace(null);
        user.setMonthIncome(null);
        user.setPaymentAccount(null);
        user.setCreditAccount(null);
        user.setCreditRate(null);
    }
}
