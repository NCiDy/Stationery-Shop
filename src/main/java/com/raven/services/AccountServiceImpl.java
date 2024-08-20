package com.raven.services;

import com.raven.model.Account;
import com.raven.utils.Repo;

import java.sql.ResultSet;
import java.util.Optional;

public class AccountServiceImpl implements IAccountService {
    private final Repo repo = Repo.getInstance();
    private String accountId;

    private Optional<Account> getAccountByUsernameNV(String username) {
        String query = String.format("SELECT * FROM taikhoannv WHERE manv = '%s'", username);
        ResultSet rs = repo.executeQuery(query);
        try {
            if (rs.next()) {
                return Optional.of(new Account(rs.getString("maNV"), rs.getString("passNV")));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return Optional.empty();
    }
    @Override
    public boolean checkAccountNV(Account account) {
        Optional<Account> accountFromDb = getAccountByUsernameNV(account.getUsername());
        if (accountFromDb.isPresent()) {
            Account dbAccount = accountFromDb.get();
            if (dbAccount.getPassword().equals(account.getPassword())) {
                accountId = dbAccount.getUsername();
                System.out.println("manv: " + accountId);
                System.out.println(accountIdHolder());
                return true;
            }
        }
        return false;
    }
    
    private Optional<Account> getAccountByUsernameKH(String username) {
        String query = String.format("SELECT * FROM taikhoankh WHERE SDT = '%s'", username);
        ResultSet rs = repo.executeQuery(query);
        try {
            if (rs.next()) {
                return Optional.of(new Account(rs.getString("SDT"), rs.getString("passKH")));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return Optional.empty();
    }
    
    @Override
    public boolean checkAccountKH(Account account) {
        Optional<Account> accountFromDb = getAccountByUsernameKH(account.getUsername());
        if (accountFromDb.isPresent()) {
            Account dbAccount = accountFromDb.get();
            if (dbAccount.getPassword().equals(account.getPassword())) {
                accountId = dbAccount.getUsername();
                System.out.println("SDT: " + accountId);
                System.out.println(accountIdHolder());
                return true;
            }
        }
    return false;
    }
    
    @Override
    public boolean registerAccount(Account account) {
        if (getAccountByUsernameKH(account.getUsername()).isPresent()) {
            return false;
        }
        String query1 = String.format("INSERT INTO khachhang (SDT, tenKH, diachi, email, maLKH) VALUES ('%s', NULL, NULL, NULL, 'LKH001' )", account.getUsername());
        repo.executeUpdate(query1);
        String query = String.format("INSERT INTO taikhoankh (SDT, passKH) VALUES ('%s', '%s')", account.getUsername(), account.getPassword());
        repo.executeUpdate(query);
        return true;
    }

    @Override
    public String accountIdHolder() {
        return accountId;
    }
}
