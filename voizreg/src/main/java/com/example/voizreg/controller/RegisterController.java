package com.example.voizreg.controller;
/*import com.example.voizreg.data.RegisterRepository;*/
import com.example.voizreg.repository.RegisterRepository;
import com.example.voizreg.domain.Register;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Slf4j
@Controller
@RequestMapping("/register")
public class RegisterController {

   /*public Str0ing show_register(Model model){
        List<Register> mylist= Arrays.asList(
                new Register("Varnika",999,"varnika@gmail.com","****")
        );
        model.addAttribute("account",mylist);

        return "register";

    }*/

    private RegisterRepository registerrepo;
@Autowired
    private RegisterController(RegisterRepository registerrepo){
        this.registerrepo=registerrepo;
    }


/*@ModelAttribute(name="register")
public Register register(){
    return  new Register();
}
*/
@ModelAttribute(name="reg")
public Register reg(){return new Register(); }
@ModelAttribute
@GetMapping
public String show_register(Model model){
    model.addAttribute("register",new Register());
    return "register";
    }

/*
@GetMapping("/register")
public String showRegister(){
    return "register";
}
*/

    @PostMapping
    public String processRegister(@Valid Register register, Errors errors,Model model) {
        if (errors.hasErrors()) {
            return "register";
        }
        else
        {
        registerrepo.save(register);
        model.addAttribute("register",register);
        return "redirect:/signup";
    }

}}
