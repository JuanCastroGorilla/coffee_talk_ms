package com.eazybytes.loans.controller;

import com.eazybytes.loans.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {


    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping(value = "accounts")
    public String getAccountsProperties(){
        return accountService.getAccountProperties();
    }

}
