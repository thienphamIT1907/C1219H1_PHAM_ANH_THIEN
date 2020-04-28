package com.codegym.quanlykhachhang_quanlytinh.service.customer;

import com.codegym.quanlykhachhang_quanlytinh.models.Customer;
import com.codegym.quanlykhachhang_quanlytinh.models.Province;

public interface CustomerService {

    Iterable<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    Iterable<Customer> findAllByProvince(Province province);
}
