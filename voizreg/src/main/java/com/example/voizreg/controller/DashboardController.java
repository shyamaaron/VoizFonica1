package com.example.voizreg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class DashboardController {
    @GetMapping("/dashboard")
        public String showDash()
        {
            return "dashboard";
        }
        @GetMapping("/aboutus")
    public String showAboutUs()
        {
            return "aboutus";
        }
    @GetMapping("/faq")
    public String showFaq()
    {
        return "faq";
    }
    @GetMapping("/recharge")
    public String showRecharge()
    {
        return "recharge";
    }

}
