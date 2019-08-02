package com.example.voizreg.controller;

import com.example.voizreg.repository.RegisterRepository;
import com.example.voizreg.domain.Login;
import com.example.voizreg.domain.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/signup")
public class SigninController {
    private RegisterRepository registerrepo;
@Autowired
private SigninController(RegisterRepository registerrepo)
{
    this.registerrepo=registerrepo;
}
    @GetMapping
    public String signup(Model model) {
        model.addAttribute("signup", new Login());
        return "signup";
    }

    @PostMapping
    public String user1(@Valid Login login, Errors errors,Model model) {
        if (errors.hasErrors()) {
            return "redirect:/signup";
        } else {
            List<Register> register = registerrepo.findByEmailAndAndPassword(login.getEmail(), login.getPassword());
            if (register.isEmpty()) {
                return "redirect:/signup";
            } else {
                model.addAttribute("register", register);
                return "redirect:/dashboard";
            }
        }
    }}