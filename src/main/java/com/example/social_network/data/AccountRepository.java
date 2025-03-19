package com.example.social_network.data;

import com.example.social_network.Account;

import java.util.HashMap;

public class AccountRepository {
    private HashMap<String, Account> db = new HashMap<>();

    public void save(Account account){
        db.put(account.getEmail(), account);
    }

    public void check(String password, String email){
        if(!password.equals(db.get(email).getPassword())){
            throw new RuntimeException("Account not found");
        }
    }
}
