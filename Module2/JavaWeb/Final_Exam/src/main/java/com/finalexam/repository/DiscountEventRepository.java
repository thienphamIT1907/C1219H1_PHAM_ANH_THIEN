package com.finalexam.repository;

import com.finalexam.models.DiscountEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DiscountEventRepository extends JpaRepository<DiscountEvent, Long> {
    Iterable<DiscountEvent> findAllByMucGiamGiaContainingAndThoiGianBdContainingAndThoiGianKtContaining(
            String mucGiamGia,
            String tgbd,
            String tgkt
    );




}
