package tech.reliab.course.davityanlm.bank.service.impl;

import tech.reliab.course.davityanlm.bank.entity.CreditAccount;

public interface CreditAccountService {

    void subCreditSum(CreditAccount creditAccount, Integer sum);
    void delete(CreditAccount creditAccount);
}
