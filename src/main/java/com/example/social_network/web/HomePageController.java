//package com.example.social_network.web;
//
//import com.example.social_network.data.AccountRepository;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.support.SessionStatus;
//
//@Controller
//public class HomePageController {
//    private AccountRepository accountRepository;
//
//    public HomePageController(AccountRepository accountRepository){
//        this.accountRepository = accountRepository;
//    }
//
//    @PostMapping("/editFirstName")
//    public String editFirstName(@RequestParam String newFirstName,
//                                @RequestParam String email,
//                                SessionStatus sessionStatus) {
//        if (newFirstName == null || newFirstName.isEmpty()) {
//            throw new IllegalArgumentException("Имя не может быть пустым");
//        }
//
//        accountRepository.editFirstName(newFirstName, email);
//        sessionStatus.setComplete();
//        return "home";
//    }
//
//    public String editLastName(String newLastName, String email,
//                                SessionStatus sessionStatus){
//        accountRepository.editLastName(newLastName, email);
//        sessionStatus.setComplete();
//        return "home";
//    }
//
//    public String editPassword(String password, String email,
//                               SessionStatus sessionStatus){
//        accountRepository.editPassword(password, email);
//        sessionStatus.setComplete();
//        return "home";
//    }
//}
