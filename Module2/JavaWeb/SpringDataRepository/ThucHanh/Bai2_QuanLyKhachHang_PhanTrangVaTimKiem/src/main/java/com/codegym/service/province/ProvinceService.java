package com.codegym.service.province;

import com.codegym.models.Province;

public interface ProvinceService {

    Iterable<Province> findAll();

    Province findById(Long id);

    void save(Province province);

    void remove(Long id);
}
