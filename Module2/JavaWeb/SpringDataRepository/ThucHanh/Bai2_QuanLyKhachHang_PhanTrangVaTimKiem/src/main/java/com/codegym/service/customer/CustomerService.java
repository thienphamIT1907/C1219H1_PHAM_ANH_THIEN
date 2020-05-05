package com.codegym.service.customer;

import com.codegym.models.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface CustomerService {

    Page<Customer> findAll(Pageable pageable);

    List<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
    Page<Customer> findAllByLastNameContaining(String lastname, Pageable pageable);


    void testShowNoti(String noti);
}
