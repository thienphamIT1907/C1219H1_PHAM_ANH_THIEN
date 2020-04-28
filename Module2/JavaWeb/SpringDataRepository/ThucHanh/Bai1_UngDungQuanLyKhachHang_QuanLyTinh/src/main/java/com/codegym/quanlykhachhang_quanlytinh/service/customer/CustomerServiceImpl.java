package com.codegym.quanlykhachhang_quanlytinh.service.customer;

import com.codegym.quanlykhachhang_quanlytinh.models.Customer;
import com.codegym.quanlykhachhang_quanlytinh.models.Province;
import com.codegym.quanlykhachhang_quanlytinh.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.getOne(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        Customer customer = customerRepository.getOne(id);
        customerRepository.delete(customer);
    }

    @Override
    public Iterable<Customer> findAllByProvince(Province province) {
        return null;
    }
}
