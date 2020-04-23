package com.codegym.demo.service;

import com.codegym.demo.entity.Person;

import java.util.List;

public interface PersonService {
    List<Person> findAll();

    void add(Person person);
}
