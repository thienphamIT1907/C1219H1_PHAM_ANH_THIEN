package com.codegym.demo.controllers;

import com.codegym.demo.model.Customer;
import com.codegym.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/")
    public String testPage() {
        return "/customer/test";
    }

    @GetMapping("/list")
    public ModelAndView showCustomerList() {
        return new ModelAndView("/customer/list","customerList", customerService.findAll());
    }

    @GetMapping("/create")
    public ModelAndView showCreatePage() {
//        modelAndView.setViewName("/customer/create");
//        modelAndView.addObject("newCustomer", new Customer());
        return new ModelAndView("/customer/create", "newCustomer", new Customer());
    }

    @PostMapping("/create")
    public ModelAndView createNewCustomer(@ModelAttribute("newCustomer") Customer customer) {
        customerService.save(customer);
        return new ModelAndView("/customer/list", "message", "Create new customer success");
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditPage(@PathVariable int id) {
        Customer editCustomer = customerService.findById(id);
        if(editCustomer != null) {
            return new ModelAndView("/customer/edit", "editCustomer", editCustomer);
        } else {
            return new ModelAndView("/customer/list", "message", "Customer already exist !");
        }
    }

    @RequestMapping("/delete/{id}")
    public ModelAndView showDeletePage(@PathVariable int id) {
        Customer deleteCustomer = customerService.findById(id);
        if(deleteCustomer != null) {
            return new ModelAndView("/customer/delete", "deleteCustomer", deleteCustomer);
        } else {
            return new ModelAndView("/customer/list", "message", "Customer invalid to delete !");
        }
    }
}
