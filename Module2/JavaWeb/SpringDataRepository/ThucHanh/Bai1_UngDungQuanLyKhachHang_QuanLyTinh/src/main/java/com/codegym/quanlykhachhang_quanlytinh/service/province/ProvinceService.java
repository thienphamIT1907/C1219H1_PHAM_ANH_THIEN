package com.codegym.quanlykhachhang_quanlytinh.service.province;

import com.codegym.quanlykhachhang_quanlytinh.models.Province;

public interface ProvinceService {

    Iterable<Province> findAll();

    Province findById(Long id);

    void save(Province province);

    void remove(Long id);
}
