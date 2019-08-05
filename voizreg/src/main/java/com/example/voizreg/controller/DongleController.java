package com.example.demo.controller;

import com.example.demo.domain.DonglePlan;
import com.example.demo.repository.DongleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class DongleController {
@Autowired
private DongleRepo dongleRepository;
@GetMapping("/dongle")
    public String showDongle(Model model)
{
    List<DonglePlan> dongl= dongleRepository.findAll();
    model.addAttribute("planlist",dongl);
    return "dongle";
}
}
