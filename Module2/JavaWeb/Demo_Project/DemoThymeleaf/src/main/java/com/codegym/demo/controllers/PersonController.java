package com.codegym.demo.controllers;

import com.codegym.demo.entity.Person;
import com.codegym.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/")
    public ModelAndView getAll() {
        return new ModelAndView("list","personList", personService.findAll());
    }

    @GetMapping("/addPerson")
    public ModelAndView addPersonView() {
        return new ModelAndView("create", "personInfo", new Person());
    }

    @PostMapping("/addPerson")
    public String addNewPerson(Person person, RedirectAttributes redirect) {
        personService.add(person);
        redirect.addFlashAttribute("message","Create new person success !");
        return "redirect:/";
    }
}
