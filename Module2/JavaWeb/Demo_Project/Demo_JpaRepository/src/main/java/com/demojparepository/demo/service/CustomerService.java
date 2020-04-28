package com.demojparepository.demo.service;

import com.demojparepository.demo.models.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer>  findAll();

    List<Customer> findById();

    List<Customer> findAllByFirstName(String firstName);

    List<Customer> findByLastName(String lastName);

}
