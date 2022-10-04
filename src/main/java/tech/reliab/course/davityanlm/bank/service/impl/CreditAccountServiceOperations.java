package tech.reliab.course.davityanlm.bank.service.impl;

import tech.reliab.course.davityanlm.bank.entity.CreditAccount;
import tech.reliab.course.davityanlm.bank.service.CreditAccountService;

public class CreditAccountServiceOperations implements CreditAccountService {

    public void subCreditSum(CreditAccount creditAccount, Integer sum){
        creditAccount.setCreditSum(creditAccount.getCreditSum() - sum);
    }

    public CreditAccount delete() {
        return null;
    }

}
