package xyb.bank.backend.service.impl;

import org.springframework.stereotype.Service;
import xyb.bank.backend.model.Account;
import xyb.bank.backend.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

    @Override
    public Account getAccountInfo() {
        return new Account("Amit Raut", "Dallas, Texas, USA", "amit.raut@xyzbank.com", "Checking", 9876.54);
    }
}
