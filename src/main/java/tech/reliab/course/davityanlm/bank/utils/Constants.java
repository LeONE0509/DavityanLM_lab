package tech.reliab.course.davityanlm.bank.utils;

/** Класс, в котором хранятся константы
 *  по количеству разных сущностей
 *  согласно заданию */
public class Constants {
    public static final int QUANTITY_BANKS = 5;
    public static final int QUANTITY_EMPLOYEES_ON_ONE_OFFICE = 5;
    public static final int QUANTITY_OFFICES_IN_ONE_BANK = 3;
    public static final int QUANTITY_ATMS_IN_ONE_BANK = 3;
    public static final int QUANTITY_USERS_IN_ONE_BANK= 5;
    public static final int QUANTITY_PAYS_AND_CREDITS_IN_ONE_USER= 2;

    /** Кол-во сотрудников в банке = кол-во офисов * кол-во сотрудников в одном офисе */
    public static final int QUANTITY_EMPLOYEES_IN_ONE_BANK = QUANTITY_OFFICES_IN_ONE_BANK * QUANTITY_EMPLOYEES_ON_ONE_OFFICE;




}
