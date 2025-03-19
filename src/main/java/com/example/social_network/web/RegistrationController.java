package com.example.social_network.web;

import com.example.social_network.Account;
import com.example.social_network.data.AccountRepository;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.support.SessionStatus;


@Slf4j
@Controller
public class RegistrationController {
    private AccountRepository accountRepository;

    public RegistrationController(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    public String registration(@Valid Account account, Errors errors,
                               SessionStatus sessionStatus){
        if (errors.hasErrors()){
            return "Enter View";
        }
        accountRepository.save(account);
        sessionStatus.setComplete();
        return "Enter View";
    }



}
