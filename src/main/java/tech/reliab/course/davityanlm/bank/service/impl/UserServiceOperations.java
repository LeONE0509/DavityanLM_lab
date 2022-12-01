package tech.reliab.course.davityanlm.bank.service.impl;

import tech.reliab.course.davityanlm.bank.entity.Bank;
import tech.reliab.course.davityanlm.bank.entity.CreditAccount;
import tech.reliab.course.davityanlm.bank.entity.PaymentAccount;
import tech.reliab.course.davityanlm.bank.entity.User;
import tech.reliab.course.davityanlm.bank.service.CreditAccountService;
import tech.reliab.course.davityanlm.bank.service.PaymentAccountService;
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
    public void createUser(Bank bank, Integer id, String fullName, LocalDate birthDate, String workPlace,
                           CreditAccount creditAccount, PaymentAccount paymentAccount) {
        bank.setClientQty(bank.getClientQty() + 1);
        users.put(id, new User(bank, id, fullName, birthDate, workPlace, creditAccount, paymentAccount));
    }

    @Override
    public User getUser(Integer id) {
        return users.get(id);
    }

    public void changeWorkPlace(User user, String workPlace){
        user.setWorkPlace(workPlace);
    }

}
