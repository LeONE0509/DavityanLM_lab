package tech.reliab.course.davityanlm.bank.utils;

/** Класс, в котором хранятся константы
 *  по количеству разных сущностей
 *  согласно заданию */
public class Constants {
    public static final int QUANTITY_BANKS = 5;
    public static final int QUANTITY_OFFICES_IN_ONE_BANK = 3;
    public static final int QUANTITY_EMPLOYEES_ON_ONE_OFFICE = 5;
    public static final int QUANTITY_ATMS_IN_ONE_OFFICE = 3;
    public static final int QUANTITY_USERS_IN_ONE_BANK= 5;
    public static final int QUANTITY_PAYS_AND_CREDITS_IN_ONE_USER= 2;

    /** Кол-во офисов всего = кол-во офисов в одном банке * кол-во банков */
    public static final int QUANTITY_OFFICE = QUANTITY_OFFICES_IN_ONE_BANK * QUANTITY_BANKS;

    /** Общее кол-во пользователей = кол-во пользователей в одном банке * все банки */
    public static final int QUANTITY_USERS = QUANTITY_USERS_IN_ONE_BANK * QUANTITY_BANKS;




}
