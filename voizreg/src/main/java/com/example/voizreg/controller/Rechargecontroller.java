package com.example.voizreg.controller;

import com.example.voizreg.domain.Plan;
import com.example.voizreg.repository.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller

public class Rechargecontroller {
    @Autowired
    private PlanRepository planRepository;

    @GetMapping("/prepaid")
    public String showPrepaid(Model model)
    {
        List<Plan> listy=planRepository.findByPlanType("prepaid");

        model.addAttribute("planlist", listy);
        return "prepaid";
    }
    @GetMapping("/postpaid")
    public String showPostpaid()
    {
        return "postpaid";
    }
    @GetMapping("/dongle")
    public String showDongle()
    {
        return "dongle";
    }


}
