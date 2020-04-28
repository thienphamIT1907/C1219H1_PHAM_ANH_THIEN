package com.codegym.quanlykhachhang_quanlytinh.repository;

import com.codegym.quanlykhachhang_quanlytinh.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}