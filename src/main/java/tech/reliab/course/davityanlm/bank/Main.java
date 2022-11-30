package tech.reliab.course.davityanlm.bank;

import tech.reliab.course.davityanlm.bank.service.*;
import tech.reliab.course.davityanlm.bank.service.impl.*;
import static tech.reliab.course.davityanlm.bank.utils.Constants.*;


/** @author Лев Вечность */
public class Main {
    public static void main(String[] args) {

        BankService bankService = BankServiceOperations.BANK_SERVICE;
        for (int i = 0; i <= QUANTITY_BANKS; i++){
            bankService.createBank(i, "bank N" + i);
        }

        BankOfficeService bankOfficeService = BankOfficeServiceOperations.BANK_OFFICE_SERVICE;
        Integer counter = 0;
        for (int i = 0; i <= QUANTITY_BANKS; i++){
            for (int j = 1; j <= QUANTITY_OFFICES_IN_ONE_BANK; j++){
                counter++;
                bankOfficeService.createOffice(
                        bankService.getBank(i),
                        counter,
                        "office N" + counter,
                        "address N" + counter,
                        true,
                        true,
                        0, true,
                        true, true,
                        0, 0
                );
            }
        }
    }
}
