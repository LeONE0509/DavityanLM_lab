package tech.reliab.course.davityanlm.bank.service.impl.operations;

import tech.reliab.course.davityanlm.bank.entity.User;
import tech.reliab.course.davityanlm.bank.service.impl.UserService;

public interface UserServiceOperations extends UserService {
    public default void print(User user) {
        if (user.getId() == null) {
            System.out.println("Кажется это больше не наш клиент :((");
            System.out.println("ФИО: " + user.getFullName());
            System.out.println("Дата рождения: " + user.getBirthDate());
        }
        System.out.println("ФИО: " + user.getFullName());
        System.out.println("Дата рождения: " + user.getBirthDate());
        System.out.println("Место работы: " + user.getWorkPlace());
        System.out.println("Месячный доход: " + user.getMonthIncome());
        System.out.println("Кредитный рейтнг: " + user.getCreditRate());

        if (user.getPaymentAccount() == null) {System.out.println("Платежный счет: отсутствует" );}
        else{System.out.println("Платежный счет: " + user.getPaymentAccount().getId());}

        if (user.getCreditAccount() == null){System.out.println("Кредитный счет: отсутствует" );}
        else{System.out.println("Кредитный счет: " + user.getCreditAccount().getId());}
    }

    public default void delete(User user) {
        user.setId(null);
        user.setWorkPlace(null);
        user.setMonthIncome(null);
        user.setPaymentAccount(null);
        user.setCreditAccount(null);
        user.setCreditRate(null);
    }
}
