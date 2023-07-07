package com.eazybytes.loans;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "accounts")
public interface AccountService {

    @GetMapping(value = "account/properties")
    String getAccountProperties();

}
