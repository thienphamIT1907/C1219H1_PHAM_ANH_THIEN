package com.finalexam.services;

import com.finalexam.models.DiscountEvent;
import com.finalexam.repository.DiscountEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class DiscountEventServiceImpl implements DiscountEventService {

    @Autowired
    DiscountEventRepository discountEventRepository;


    @Override
    public Iterable<DiscountEvent> findAll() {
        return discountEventRepository.findAll();
    }

    @Override
    public DiscountEvent findById(Long id) {
        return discountEventRepository.getOne(id);
    }

    @Override
    public void save(DiscountEvent discountEvent) {
        discountEventRepository.save(discountEvent);
    }

    @Override
    public void remove(Long id) {
        discountEventRepository.deleteById(id);
    }

    @Override
    public Iterable<DiscountEvent> findAllByMucGiamGiaContainingAndThoiGianBdContainingAndThoiGianKtContaining(String mucGiamGia, String tgbd, String tgkt) {
        return discountEventRepository.findAllByMucGiamGiaContainingAndThoiGianBdContainingAndThoiGianKtContaining(mucGiamGia, tgbd, tgkt);
    }

    @Override
    public Iterable<DiscountEvent> findAllByMucGiamGiaContaining(Double mucGiamGia) {
        return null;
    }

    @Override
    public Iterable<DiscountEvent> findAllByThoiGianBdContaining(String tgbd) {
        return null;
    }

    @Override
    public Iterable<DiscountEvent> findAllByTieuDeContaining(String tieuDe) {
        return null;
    }


}
