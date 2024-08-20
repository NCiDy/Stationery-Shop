package com.raven.services;

import com.raven.model.Account;

public interface IAccountService {
    boolean checkAccountNV(Account account);
    boolean checkAccountKH(Account account);
    boolean registerAccount(Account account);

    String accountIdHolder();
}
