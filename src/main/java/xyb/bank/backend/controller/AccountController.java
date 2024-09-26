package xyb.bank.backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyb.bank.backend.model.Account;

@CrossOrigin(origins = "http://localhost:3000") 
@RestController
@RequestMapping("/account")
public class AccountController {

    @GetMapping("/info")
    public Account getAccountInfo() {
        return new Account("Amit Raut", "Dallas, Texas, USA", "amit.raut@xyzbank.com", "Checking", 9876.54);
    }
}
