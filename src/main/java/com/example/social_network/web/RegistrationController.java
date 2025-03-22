package com.example.social_network.web;

import com.example.social_network.Account;
import com.example.social_network.data.AccountRepository;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;

@Slf4j
@Controller
@RequestMapping("/register")
public class RegistrationController {
    private AccountRepository accountRepository;

    public RegistrationController(Model model, AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    @PostMapping("/register")
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
