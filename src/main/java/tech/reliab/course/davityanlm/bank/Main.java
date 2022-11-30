package tech.reliab.course.davityanlm.bank;

import tech.reliab.course.davityanlm.bank.service.*;
import tech.reliab.course.davityanlm.bank.service.impl.*;
import static tech.reliab.course.davityanlm.bank.utils.Constants.*;


/** @author Лев Вечность */
public class Main {
    public static void main(String[] args) {

        BankService bankService = BankServiceOperations.BANK_SERVICE;
        for (int i = 0; i < QUANTITY_BANKS; i++){
            bankService.createBank(i, "bank N" + i);
        }



    }
}
