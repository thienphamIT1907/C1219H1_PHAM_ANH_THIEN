package com.codegym.quanlykhachhang_quanlytinh.repository;

import com.codegym.quanlykhachhang_quanlytinh.models.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepository extends JpaRepository<Province, Long> {
}