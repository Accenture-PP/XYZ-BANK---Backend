package xyb.bank.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyb.bank.backend.model.Portfolio;
import xyb.bank.backend.service.PortfolioService;

@CrossOrigin(origins = "http://localhost:3000") 
@RestController
@RequestMapping("/portfolio")
public class PortfolioController {

    @Autowired
    private PortfolioService portfolioService;

    @GetMapping("/details")
    public Portfolio getPortfolioDetails() {
        return portfolioService.getPortfolioDetails();
    }
}
