package com.example.social_network.web;

import com.example.social_network.data.AccountRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.support.SessionStatus;

@Controller
public class AuthenticationController {
    private AccountRepository accountRepository;

    public AuthenticationController(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    public String authentication(String password, String email,
                               SessionStatus sessionStatus){
        accountRepository.check(password, email);
        sessionStatus.setComplete();
        return "Enter View";
    }

}
