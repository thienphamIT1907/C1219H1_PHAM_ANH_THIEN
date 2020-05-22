package com.finalexam.models;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Component
@Table(name = "discount_event")
public class DiscountEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tieu_De")
    @NotBlank(message = "Không được để trống trường này")
    private String tieuDe;

    @Column(name = "thoi_gian_bd")
    @NotBlank(message = "Không được để trống trường này")
    private String thoiGianBd;

    @Column(name = "thoi_gian_kt")
    @NotBlank(message = "Không được để trống trường này")
    private String thoiGianKt;

    @Column(name = "muc_giam_gia")
//    @NotBlank(message = "Không được để trống trường này")
    private Double mucGiamGia;

    @Column(name = "chi_tiet")
    @NotBlank(message = "Không được để trống trường này")
    private String chiTiet;

    public DiscountEvent() {
    }

    public DiscountEvent(Long id, String tieuDe, @NotBlank(message = "Name invalid") String thoiGianBd, String thoiGianKt, Double mucGiamGia, String chiTiet) {
        this.id = id;
        this.tieuDe = tieuDe;
        this.thoiGianBd = thoiGianBd;
        this.thoiGianKt = thoiGianKt;
        this.mucGiamGia = mucGiamGia;
        this.chiTiet = chiTiet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getThoiGianBd() {
        return thoiGianBd;
    }

    public void setThoiGianBd(String thoiGianBd) {
        this.thoiGianBd = thoiGianBd;
    }

    public String getThoiGianKt() {
        return thoiGianKt;
    }

    public void setThoiGianKt(String thoiGianKt) {
        this.thoiGianKt = thoiGianKt;
    }

    public Double getMucGiamGia() {
        return mucGiamGia;
    }

    public void setMucGiamGia(Double mucGiamGia) {
        this.mucGiamGia = mucGiamGia;
    }

    public String getChiTiet() {
        return chiTiet;
    }

    public void setChiTiet(String chiTiet) {
        this.chiTiet = chiTiet;
    }
}
