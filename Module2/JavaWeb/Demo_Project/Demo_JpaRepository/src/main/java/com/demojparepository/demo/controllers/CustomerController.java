package com.demojparepository.demo.controllers;

import com.demojparepository.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/")
    public ModelAndView show() {
        return new ModelAndView("view", "customer", customerService.findAllByFirstName("Maria"));
    }

}
