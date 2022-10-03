package tech.reliab.course.davityanlm.bank.service;

import tech.reliab.course.davityanlm.bank.entity.CreditAccount;
import tech.reliab.course.davityanlm.bank.service.impl.CreditAccountService;

public class CreditAccountServiceOperations implements CreditAccountService {

    public void subCreditSum(CreditAccount creditAccount, Integer sum){
        creditAccount.setCreditSum(creditAccount.getCreditSum() - sum);
    }

    public void delete(CreditAccount creditAccount) {
        creditAccount.setId(null);
        creditAccount.setUser(null);
        creditAccount.setBank(null);
        creditAccount.setStartCreditDate(null);
        creditAccount.setFinishCreditDate(null);
        creditAccount.setCreditMonthQty(null);
        creditAccount.setCreditSum(null);
        creditAccount.setCreditMonthPayment(null);
        creditAccount.setPercent(null);
        creditAccount.setEmployee(null);
        creditAccount.setPaymentAccount(null);
        creditAccount = null;
    }

}
