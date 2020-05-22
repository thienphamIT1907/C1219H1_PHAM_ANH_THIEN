package com.finalexam.services;

import com.finalexam.models.DiscountEvent;

import java.util.Optional;

public interface DiscountEventService {

    Iterable<DiscountEvent> findAll();

    DiscountEvent findById(Long id);

    void save(DiscountEvent discountEvent);

    void remove(Long id);

    Iterable<DiscountEvent> findAllByMucGiamGiaContainingAndThoiGianBdContainingAndThoiGianKtContaining (
            String mucGiamGia,
            String tgbd,
            String tgkt
    );

    Iterable<DiscountEvent> findAllByMucGiamGiaContaining(Double mucGiamGia);

    Iterable<DiscountEvent> findAllByThoiGianBdContaining(String tgbd);

    Iterable<DiscountEvent> findAllByTieuDeContaining(String tieuDe);

}
