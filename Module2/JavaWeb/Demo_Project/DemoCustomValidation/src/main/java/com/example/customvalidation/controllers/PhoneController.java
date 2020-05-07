package com.example.customvalidation.controllers;

import com.example.customvalidation.models.Phone;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class PhoneController {

    @GetMapping("/validatePhone")
    public String loadFormPage(Model m) {
        m.addAttribute("validatedPhone", new Phone());
        return "phoneHome";
    }

    @PostMapping("/addValidatePhone")
    public String submitForm(@Valid Phone phone,
                             BindingResult bindingResult, Model m) {
        if(bindingResult.hasErrors()) {
            return "phoneHome";
        }
        m.addAttribute("message", "Successfully saved phone: "
                + phone.toString());
        return "phoneHome";
    }
}
