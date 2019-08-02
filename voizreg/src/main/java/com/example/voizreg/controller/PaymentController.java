package com.example.voizreg.controller;

import com.example.voizreg.domain.Payment;
import com.example.voizreg.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Controller
@RequestMapping("/payment")
public class PaymentController {


    private PaymentRepository paymentRepo;

    @Autowired
    public PaymentController(PaymentRepository paymentRepo) {
        this.paymentRepo = paymentRepo;
    }

    @ModelAttribute(name = "pay")
    public Payment pay() {
        return new Payment();
    }

    @GetMapping
    public String showPaymentForm(Model model) {
        Payment payment = new Payment();
        model.addAttribute("payment", payment);
        return "payment";
    }

    @PostMapping
    public String processPaymentFrom(@Valid Payment payment, Errors errors, Model model) {
        if (errors.hasErrors()) {
            return "payment";
        } else {
            paymentRepo.save(payment);
            model.addAttribute("hello", payment);
            return "successpage";
        }
    }
}


