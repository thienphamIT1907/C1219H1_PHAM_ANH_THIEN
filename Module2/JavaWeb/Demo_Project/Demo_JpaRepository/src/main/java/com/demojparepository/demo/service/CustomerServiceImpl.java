package com.demojparepository.demo.service;

import com.demojparepository.demo.models.Customer;
import com.demojparepository.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public List<Customer> findById() {
        return null;
    }

    @Override
    public List<Customer> findAllByFirstName(String firstName) {
        return customerRepository.findAllByFirstName(firstName);
    }

    @Override
    public List<Customer> findByLastName(String lastName) {
        return null;
    }
}
