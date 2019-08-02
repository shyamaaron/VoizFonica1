package com.example.voizreg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SuccessController {
    @GetMapping("/successpage")
    public String showSuccess()
    {
        return "successpage";
    }

}
