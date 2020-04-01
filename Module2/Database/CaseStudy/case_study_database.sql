
-- CREATE AND DESIGN DATABASE

DROP DATABASE IF EXISTS furama_resort;
CREATE DATABASE furama_resort;
USE furama_resort;

CREATE TABLE nhan_vien (
	id_nhan_vien INT NOT NULL,
    ho_ten VARCHAR(45) NOT NULL,
	id_vi_tri INT NOT NULL,
    id_trinh_do INT NOT NULL,
    id_bo_phan INT NOT NULL,
    ngay_sinh DATE,
    so_cmnd VARCHAR(45),
    luong INT,
    sdt VARCHAR(45),
    email VARCHAR(45),
    dia_chi VARCHAR(45),
 
    CONSTRAINT pk_id_nhan_vien PRIMARY KEY(id_nhan_vien)
);

CREATE TABLE vi_tri (
	id_vi_tri INT NOT NULL,
    ten_vi_tri VARCHAR(45),
    
    CONSTRAINT pk_id_vi_tri PRIMARY KEY(id_vi_tri)
);

CREATE TABLE trinh_do (
	id_trinh_do INT NOT NULL,
    trinh_do VARCHAR(45),
    
    CONSTRAINT pk_id_trinh_do PRIMARY KEY(id_trinh_do)
);

CREATE TABLE bo_phan (
	id_bo_phan INT NOT NULL,
    ten_bo_phan VARCHAR(45),
    
    CONSTRAINT pk_id_bo_phan PRIMARY KEY(id_bo_phan)
);

CREATE TABLE khach_hang (
	id_khach_hang INT NOT NULL,
    id_loai_khach INT NOT NULL,
    ho_ten VARCHAR(45),
    ngay_sinh DATE,
    so_cmnd VARCHAR(45),
    sdt VARCHAR(45),
	email VARCHAR(45),
    dia_chi VARCHAR(45),
    
    CONSTRAINT pk_id_khach_hang PRIMARY KEY(id_khach_hang)
);

CREATE TABLE loai_khach (
	id_loai_khach INT NOT NULL,
    ten_loai_khach VARCHAR(45),
    
    CONSTRAINT pk_id_loai_khach PRIMARY KEY(id_loai_khach)
);

CREATE TABLE hop_dong (
	id_hop_dong INT NOT NULL,
    id_nhan_vien INT NOT NULL,
    id_khach_hang INT NOT NULL,
    id_dich_vu INT NOT NULL,
    ngay_lam_hop_dong DATE,
    ngay_ket_thuc DATE,
    tien_dat_coc INT,
    
    CONSTRAINT pk_id_hop_dong PRIMARY KEY(id_hop_dong)
);

CREATE TABLE hop_dong_chi_tiet (
	id_hop_dong_chi_tiet INT NOT NULL,
    id_hop_dong INT NOT NULL,
    id_dich_vu_di_kem INT NOT NULL,
    so_luong INT,
    
    CONSTRAINT pk_id_hop_dong_chi_tiet PRIMARY KEY(id_hop_dong_chi_tiet)
);

CREATE TABLE dich_vu (
	id_dich_vu INT NOT NULL,
    ten_dich_vu VARCHAR(45),
    dien_tich INT,
    so_tang INT,
    so_nguoi_toi_da INT,
    chi_phi_thue INT,
    id_kieu_thue INT NOT NULL,
    id_loai_dich_vu INT NOT NULL,
    trang_thai VARCHAR(45),
    
    CONSTRAINT pk_id_dich_vu PRIMARY KEY(id_dich_vu)
);

CREATE TABLE kieu_thue (
	id_kieu_thue INT NOT NULL,
    ten_kieu_thue VARCHAR(45),
    gia INT,
    
    CONSTRAINT pk_id_kieu_thue PRIMARY KEY(id_kieu_thue)
);

CREATE TABLE loai_dich_vu (
	id_loai_dich_vu INT NOT NULL,
    ten_loai_dich_vu VARCHAR(45),
    
    CONSTRAINT pk_id_loai_dich_vu PRIMARY KEY(id_loai_dich_vu)
);

CREATE TABLE dich_vu_di_kem (
	id_dich_vu_di_kem INT NOT NULL,
    ten_dich_vu_di_kem VARCHAR(45),
    gia INT,
    don_vi INT,
    trang_thai VARCHAR(45),
    
    CONSTRAINT pk_id_dich_vu_di_kem PRIMARY KEY(id_dich_vu_di_kem)
);

ALTER TABLE nhan_vien
ADD CONSTRAINT fk_id_vi_tri FOREIGN KEY (id_vi_tri) REFERENCES vi_tri(id_vi_tri),
ADD	CONSTRAINT fk_id_trinh_do FOREIGN KEY (id_trinh_do) REFERENCES trinh_do(id_trinh_do),
ADD	CONSTRAINT fk_id_bo_phan FOREIGN KEY (id_bo_phan) REFERENCES bo_phan(id_bo_phan);
    
ALTER TABLE hop_dong
ADD CONSTRAINT fk_id_nhan_vien FOREIGN KEY (id_nhan_vien) REFERENCES nhan_vien(id_nhan_vien),
ADD CONSTRAINT fk_id_khach_hang FOREIGN KEY (id_khach_hang) REFERENCES khach_hang(id_khach_hang),
ADD CONSTRAINT fk_id_dich_vu FOREIGN KEY (id_dich_vu) REFERENCES dich_vu(id_dich_vu);
	
ALTER TABLE khach_hang
ADD CONSTRAINT fk_id_loai_khach FOREIGN KEY (id_loai_khach) REFERENCES loai_khach(id_loai_khach);

ALTER TABLE dich_vu
ADD CONSTRAINT fk_id_kieu_thue FOREIGN KEY (id_kieu_thue) REFERENCES kieu_thue(id_kieu_thue),
ADD CONSTRAINT fk_id_loai_dich_vu FOREIGN KEY (id_loai_dich_vu) REFERENCES loai_dich_vu(id_loai_dich_vu);

ALTER TABLE hop_dong_chi_tiet
ADD CONSTRAINT fk_id_hop_dong FOREIGN KEY (id_hop_dong) REFERENCES hop_dong(id_hop_dong),
ADD CONSTRAINT fk_id_dich_vu_di_kem FOREIGN KEY (id_dich_vu_di_kem) REFERENCES dich_vu_di_kem(id_dich_vu_di_kem);

-- QUERY DATABASE

/*
	TASK 1: 
    Insert thong tin
 */ 
INSERT INTO vi_tri 
VALUES
(1, "Tong giam doc"),
(2, "Pho giam doc"),
(3, "Thu ki"),
(4, "Truong phong"),
(5, "Nhan vien"),
(6, "Bao ve"),
(7, "Lao cong"),
(8, "Thuc tap sinh");

INSERT INTO bo_phan 
VALUES
(1, "Tong quan ly"),
(2, "Nhan su"),
(3, "Buong phong"),
(4, "Nha hang"),
(5, "Spa"),
(6, "Marketing"),
(7, "Ve sinh moi truong"),
(8, "Tai chinh"),
(9, "Co so ha tang");

INSERT INTO trinh_do 
VALUES
(1, "Dai hoc"),
(2, "Cao dang"),
(3, "Trung cap"),
(4, "Trung hoc pho thong"),
(5, "Khong co trinh do");

-- id_loai_khach, ten_loai_khach
INSERT INTO loai_khach 
VALUES
(1, "Diamond"),
(2, "Platinum"),
(3, "Gold"),
(4, "Silver"),
(5, "Member");

-- id_kieu_thue, ten_kieu_thue, gia
INSERT INTO kieu_thue 
VALUES
(1, "Thang", 12000000),
(2, "Tuan", 8000000),
(3, "Ngay", 6000000),
(4, "Gio", 400000);

INSERT INTO loai_dich_vu
VALUES
(1, "Villa"),
(2, "House"),
(3, "Room");

-- id_dich_vu, ten_dich_vu, dien_tich, so_tang, so_nguoi_toi_da, chi_phi_thue, id_kieu_thue, id_loai_dich_vu, trang_thai
INSERT INTO dich_vu 
VALUES
(1, "Vip Villa", 700, 5, 30, 12000000, 2, 1, "Kha dung"),
(2, "Normal Villa", 300, 3, 15, 10000000, 2, 1, "Kha dung"),
(3, "Vip House", 300, 3, 15, 8000000, 3, 2, "Kha dung"),
(4, "Normal House", 150, 2, 4, 5000000, 3, 2, "Kha dung"),
(5, "Vip Room", 100, 1, 2, 3000000, 2, 3, "Kha dung"),
(6, "Normal Room", 100, 1, 2, 1500000, 4, 3, "Kha dung");

-- id_dich_vudikem, ten_dich_vudikem, gia, donvi, trangthaikhadung
INSERT INTO dich_vu_di_kem
VALUES
(1, "Massage", 1200000, 1, "Kha dung"),
(2, "Karaoke", 500000, 1, "Kha dung"),
(3, "Thuc an", 300000, 1, "Kha dung" ),
(4, "Nuoc uong", 50000, 1, "Kha dung" ),
(5, "Thue xe tham quan resort", 420000, 1, "Kha dung");

-- id_nhan_vien, ho_ten, id_vi_tri, id_trinh_do, id_bo_phan, ngay_sinh, so_cmnd, luong, sdt, email, dia_chi
INSERT INTO nhan_vien
VALUES
(1, "Pham Anh Thien", 1, 1, 1, "1995/07/19", 2017444302, 20000000, "0913 412 421", "thien@gmail.com", "Da nang"),
(2, "Khada Jhin", 1, 1, 1, "1980/02/03", 668005001, 15000000, "0913 981 892", "jhin@gmail.com", "Canada"),
(3, "Ha Xuan Nguyen", 3, 2, 2, "1990/12/28", 217791093, 6000000, "0905 361 421", "nguyen@gmail.com", "Hue"),
(4, "Trinh Xuan Quyet", 2, 3, 6, "1996/12/15", 165591551, 9000000, "0165 837 184", "quyet@gmail.com", "Quang Tri"),
(5, "Doan Sy Khuong", 7, 1, 5, "1995/04/05", 131309750, 16000000, "0121 574 104", "khuong@gmail.com", "Da nang"),
(6, "Nguyen Phu Khoa", 6, 3, 3, "1997/08/28", 121931597, 8000000, "0913 796 219", "khoa@gmail.com", "Da nang"),
(7, "Nguyen Xuan Khoat", 5, 5, 6, "1995/01/12", 320781617, 10000000, "0122 927 184", "khoat@gmail.com", "Quang Tri"),
(8, "Tran Thi Mong Nhu", 8, 2, 7, "2001/11/20", 488964520, 5000000, "0913 283 408", "nhu@gmail.com", "Ha Noi"),
(9, "Truong Dinh Tuan", 3, 3, 2, "1999/03/04", 363175234, 8000000, "0163 715 583", "tuan@gmail.com", "Vinh"),
(10, "Pham Thi Thu Trang", 1, 2, 4, "1980/07/05", 201701763, 7000000, "0913 425 383", "trang@gmail.com", "Nha Trang"),
(11, "Doan Huy Hoang", 6, 5, 5, "1995/06/30", 396950312, 8000000, "0913 412 874", "hoang@gmail.com", "Da nang"),
(12, "Pham Thi Ngoc Thu", 1, 4, 5, "1995/02/12", 942199693, 7000000, "0793 180 500", "thu@gmail.com", "Ha Noi"),
(13, "Truong Ngoc Khanh", 2, 2, 3, "1989/06/06", 784193285, 12000000, "0122 672 182", "khanh@gmail.com", "Quang Nam"),
(14, "Trinh Yen Nhi", 8, 4, 2, "2000/09/18", 710578936, 5000000, "0166 945 194", "nhi@gmail.com", "Da nang"),
(15, "Do Thi Nhu Ngoc", 5, 3, 3, "1999/06/01", 707012970, 10000000, "0902 381 608", "ngoc@gmail.com", "Nghe An"),
(16, "Nguyen Hai Hung", 7, 1, 5, "1992/12/20", 315707301, 6000000, "0907 178 107", "hung@gmail.com", "Thanh Hoa"),
(17, "Phan Ha Nguyen Hai", 8, 2, 1, "1995/05/19", 673789501, 5000000, "0713 822 392", "hai@gmail.com", "Da Lat"),
(18, "Do Thi Hanh Nguyen", 2, 4, 2, "1988/08/09", 395839105, 8000000, "0827 802 122", "nguyen@gmail.com", "Hai Phong"),
(19, "Tran Nhan Tam", 4, 5, 3, "1991/02/11", 698284010, 7000000, "0713 822 572", "tam@gmail.com", "Bac Giang"),
(20, "Tran Huu Nhat", 2, 2, 5, "1995/11/14", 321661298, 8500000, "0528 147 325 822 572", "nhat@gmail.com", "Vung Tau"),
(21, "Ha Di An", 1, 4, 3, "1996/05/23", 936648952, 12000000, "0391 348 351", "an@gmail.com", "Gia Lai");

-- id_khach_hang, id_loai_khach, ho_ten, ngaysinh, cmnd_khach_hang, sdt, email, dia_chi
INSERT INTO khach_hang 
VALUES
(1, 1, "Tran Huu Minh", "1980/12/05", 315472363, "0991 981 939", "minh@yahoo.com", "Quang Ngai"),
(2, 4, "Doan Thuy Trang", "1988/11/07", 151636777, "0173 919 166", "trang@yahoo.com", "Ha Noi"),
(3, 2, "Phan Van Duc", "1985/3/19", 151847672, "0184 458 563", "duc@yahoo.com", "Quang Tri"),
(4, 2, "Ngo Thi Van", "1997/12/05", 105885174, "0683 234 461", "van@yahoo.com", "Quang Binh"),
(5, 1, "Nguyen Phuc Kien", "1999/12/05", 593781049, "0157 472 853", "kien@yahoo.com", "Vinh"),
(6, 2, "Dang Thi Thu Thao", "1990/12/05", 315423577, "0666 136 737", "thao@yahoo.com", "Dak Lak"),
(7, 5, "Trinh Yen Nhi", "1980/12/05", 398164817, "0768 116 697", "nhi@yahoo.com", "Quang Nam"),
(8, 1, "Le Thanh Liem", "1993/12/05", 598737910, "01884 252 123", "liem@yahoo.com", "Tam Ki"),
(9, 4, "Ngo Thanh Tung", "1994/12/05", 103859277, "0737 153 863", "tung@yahoo.com", "Da Nang"),
(10, 2, "Hoang Dieu My", "1991/12/05", 948209385, "091 514 546", "my@yahoo.com", "Quang Tri"),
(11, 2, "Trinh Yen Nhi", "1992/02/14", 874394813, "012 684 3613", "nhitrinh@gmail.com", "Da Nang");

-- id_hop_dong, id_nhan_vien, id_khach_hang, id_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc
INSERT INTO hop_dong 
VALUES
(1, 14, 7, 5, "2019/02/25", "2020/12/29", 5000000),
(2, 5, 9, 3, "2019/10/12", "2020/03/14", 2000000),
(3, 7, 3, 4, "2018/09/11", "2019/10/20", 10000000),
(4, 3, 6, 2, "2019/12/29", "2019/3/30", 1500000),
(5, 10, 3, 5, "2019/01/19", "2020/03/25", 6000000),
(6, 6, 5, 3, "2018/11/29", "2020/02/26", 5000000),
(7, 3, 3, 1, "2018/12/31", "2020/01/05", 3400000),
(8, 4, 7, 4, "2019/02/06","2020/02/19", 5000000),
(9, 7, 10, 2, "2018/02/19", "2020/02/24", 9800000),
(10, 8, 10, 1, "2019/12/12", "2020/03/01", 1300000),
(11, 9, 1, 3, "2018/05/06", "2018/05/20", 8000000),
(12, 7, 1, 3, "2018/02/24", "2016/03/28", 8000000),
(13, 3, 5, 1, "2018/06/13", "2016/05/17", 3500000),
(14, 21, 5, 1, "2016/06/13", "2016/05/17", 4200000),
(15, 16, 5, 1, "2020/06/13", "2020/06/17", 2700000),
(16, 19, 5, 1, "2016/05/21", "2016/04/28", 5300000),
(17, 18, 5, 1, "2016/01/13", "2016/02/13", 8900000);


-- id_hop_dong_chi_tiet, id_hop_dong, id_dich_vu_di_kem, so_luong
INSERT INTO hop_dong_chi_tiet
VALUES
(1, 2, 2, 1),
(2, 3, 5, 1),
(3, 4, 3, 1),
(4, 6, 1, 1),
(5, 7, 3, 2),
(6, 8, 5, 1),
(7, 9, 4, 1),
(8, 10, 2, 1),
(9, 11, 3, 1);

/*
	TASK 2:
    Hien thi thong tin cua tat ca nhan vien co trong he thong
    co ten bat dau la 1 trong cac ki tu "H", "T", hoac "K" 
    va co toi da 15 ki tu
*/
SELECT * 
FROM nhan_vien 
WHERE ho_ten REGEXP "^([A-Z][a-z]+ ){2,}(T|H|K)+"
AND length(ho_ten) <= 15;

/*
	TASK 3: 
    Hien thi thong tin cua tat ca khach hang co do tuoi tu 18 den 50,
    co dia chi o Da Nang hoac Quang Tri
*/    
SELECT ho_ten, timestampdiff(YEAR, ngay_sinh, curdate()) AS tuoi, dia_chi
FROM khach_hang
WHERE (timestampdiff(YEAR, ngay_sinh, CURDATE()) BETWEEN 18 and 50) 
AND dia_chi IN ("Da Nang", "Quang Tri");

/*
	TASK 4: 
    Dem xem moi khach hang da tung dat phong bao nhieu lan. 
    Ket qua hien thi duoc sap xep tang dan theo so lan dat phong. 
    Chi dem nhung khach hang nao co ten_loai_khach la Diamond
*/
SELECT
	khach_hang.id_khach_hang, 
	khach_hang.ho_ten, 
	loai_khach.ten_loai_khach, 
	count(hop_dong.id_hop_dong) AS so_lan_dat_phong
FROM khach_hang
INNER JOIN hop_dong ON khach_hang.id_khach_hang = hop_dong.id_khach_hang
INNER JOIN loai_khach ON loai_khach.id_loai_khach = khach_hang.id_loai_khach
WHERE loai_khach.ten_loai_khach = "Diamond"
GROUP BY khach_hang.id_khach_hang
ORDER BY so_lan_dat_phong DESC;

/* 
	TASK 5: 
    Hien thi id_khach_hang, hoten, tenloai_khach, id_hop_dong, ten_dich_vu, 
    ngay_lam_hop_dong, ngayketthuc, tongtien = chi_phi_thue + donvi * gia, 
	(don vi va gia la tu bang dich_vu_di_kem) 
	cho tat ca khach hang da tung dat phong (Hien thi luon nhung khach hang chua tung dat phong) 
*/
SELECT
	khach_hang.id_khach_hang, 
    khach_hang.ho_ten, 
	loai_khach.ten_loai_khach,
	hop_dong.id_hop_dong,
	dich_vu.ten_dich_vu,
 	hop_dong.ngay_lam_hop_dong,
 	hop_dong.ngay_ket_thuc,
    sum(dich_vu.chi_phi_thue + (dich_vu_di_kem.don_vi * dich_vu_di_kem.gia)) AS tong_tien
FROM khach_hang
lEFT JOIN loai_khach ON khach_hang.id_loai_khach = loai_khach.id_loai_khach
LEFT JOIN hop_dong ON khach_hang.id_khach_hang = hop_dong.id_khach_hang
LEFT JOIN dich_vu ON hop_dong.id_dich_vu = dich_vu.id_dich_vu
LEFT JOIN hop_dong_chi_tiet ON  hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
LEFT JOIN dich_vu_di_kem ON hop_dong_chi_tiet.id_dich_vu_di_kem = dich_vu_di_kem.id_dich_vu_di_kem
GROUP BY khach_hang.id_khach_hang
ORDER BY khach_hang.id_khach_hang;

/*
	TASK 6: 
    Hien thi id_dich_vu, ten_dich_vu, dientich, chi_phi_thue, ten_loai_dich_vu 
    cua tat ca cac loai dich vu chua tung duoc khach hang thuc hien dat tu quy 1 cua nam 2019 (Quy 1 gom t1, t2, t3)
*/
SELECT
	dich_vu.id_dich_vu,
    dich_vu.ten_dich_vu,
    dich_vu.dien_tich,
    dich_vu.chi_phi_thue,
    loai_dich_vu.ten_loai_dich_vu
FROM dich_vu
INNER JOIN loai_dich_vu ON dich_vu.id_loai_dich_vu = loai_dich_vu.id_loai_dich_vu
WHERE dich_vu.id_dich_vu NOT IN (
-- Hien thi id_dich_vu cua khach hang thuc hien dat tu quy 1 nam 2019
	SELECT dich_vu.id_dich_vu
    FROM dich_vu 
    INNER JOIN hop_dong ON dich_vu.id_dich_vu = hop_dong.id_dich_vu
	WHERE ngay_lam_hop_dong BETWEEN "2019/01/01" AND "2019/03/31"
);

/*
	TASK 7: 
    Hien thi thong tin id_dich_vu, ten_dich_vu, dien_tich, so_nguoi_toi_da, 
    chi_phi_thue, ten_loai_dich_vu cua tat ca cac loai dich vu da tung duoc khach hang dat phong trong nam 2018 
	nhung chua tung duoc khach hang dat phong trong nam 2019
*/
SELECT DISTINCT
	dich_vu.id_dich_vu,
    dich_vu.ten_dich_vu,
    dich_vu.dien_tich,
    dich_vu.so_nguoi_toi_da,
    dich_vu.chi_phi_thue,
    loai_dich_vu.ten_loai_dich_vu
FROM dich_vu
INNER JOIN loai_dich_vu ON dich_vu.id_loai_dich_vu = loai_dich_vu.id_loai_dich_vu
INNER JOIN hop_dong ON dich_vu.id_dich_vu = hop_dong.id_dich_vu
WHERE YEAR(hop_dong.ngay_lam_hop_dong) = 2018
AND (
	dich_vu.id_dich_vu NOT IN (
		SELECT dich_vu.id_dich_vu
        FROM dich_vu
        INNER JOIN hop_dong ON dich_vu.id_dich_vu = hop_dong.id_dich_vu
		WHERE YEAR(hop_dong.ngay_lam_hop_dong) = 2019
    )
);

/*
	TASK 8:
    Hien thi thong tin ho_ten cua khach hang co trong he thong khong trung nhau
    Su dung 3 cach
*/
-- Cach 1:
SELECT ho_ten
FROM khach_hang
GROUP BY ho_ten;

-- Cach 2:
SELECT khach_hang.ho_ten
FROM khach_hang
UNION DISTINCT SELECT khach_hang.ho_ten
FROM khach_hang;

-- Cach 3:
SELECT DISTINCT ho_ten
FROM khach_hang;

/*
	TASK 9:
    Thuc hien thong ke doanh thu theo thang
    Ung voi moi thang trong nam 2019 thi co bao nhieu thuc hien dat phong
*/
SELECT
	month(hop_dong.ngay_lam_hop_dong) AS thang, count(hop_dong.id_khach_hang) AS so_lan_dat_phong
FROM hop_dong
WHERE YEAR(hop_dong.ngay_lam_hop_dong) = 2019
GROUP BY thang
ORDER BY thang;

/*
	TASK 10:
    Hien thi thong tin tuong ung voi tung hop dong thi da su dung bao nhieu dich vu di kem
    Ket qua hien thi gom id_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, 
    so_luong_dich_vu_di_kem dua vao count cac id_hop_dong_chi_tiet
*/
SELECT
	hop_dong.id_hop_dong,
    hop_dong.ngay_lam_hop_dong,
    hop_dong.ngay_ket_thuc,
    hop_dong.tien_dat_coc,
    count(hop_dong_chi_tiet.id_hop_dong_chi_tiet) AS so_luong_dich_vu_di_kem
FROM hop_dong
INNER JOIN hop_dong_chi_tiet ON hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
GROUP BY hop_dong.id_hop_dong;

/*
	TASK 11:
    Hien thi thong tin cac dich vu di kem da duoc su dung boi nhung khach hang
    co ten_loai_khach_hang la "Diamond" va co dia chi o "Vinh" hoac "Quang Ngai"
*/
SELECT 
	khach_hang.ho_ten,
    khach_hang.dia_chi,
	dich_vu_di_kem.id_dich_vu_di_kem,
	dich_vu_di_kem.ten_dich_vu_di_kem,
	dich_vu_di_kem.gia,
	dich_vu_di_kem.don_vi, 
    dich_vu_di_kem.trang_thai
FROM dich_vu_di_kem 
INNER JOIN hop_dong_chi_tiet ON dich_vu_di_kem.id_dich_vu_di_kem = hop_dong_chi_tiet.id_dich_vu_di_kem
INNER JOIN hop_dong ON hop_dong_chi_tiet.id_hop_dong = hop_dong.id_hop_dong
INNER JOIN khach_hang ON khach_hang.id_khach_hang = hop_dong.id_khach_hang
INNER JOIN loai_khach ON khach_hang.id_loai_khach = loai_khach.id_loai_khach 
WHERE (
	loai_khach.ten_loai_khach = "Diamond"
	AND khach_hang.dia_chi IN ("Vinh", "Quang Ngai")
);

/*
	TASK 12:
    Hien thi id_hop_dong, ten nhan vien, ten khach hang, sdt khach hang, ten dich vu, 
    so luong dich vu di kem (tinh bang tong hop dong chi tiet),
    tien dat coc cua tat ca cac dich vu da tung duoc khach hang dat vao 3 thang cuoi 2019 nhung chua tung duoc dat vao 6 thang dau nam 2019
*/
SELECT 
	hop_dong.id_hop_dong,
    nhan_vien.ho_ten AS nhan_vien,
    khach_hang.ho_ten AS khach_hang,
    khach_hang.sdt,
    dich_vu.ten_dich_vu,
    hop_dong.tien_dat_coc,
    sum(hop_dong_chi_tiet.so_luong) AS so_luong_dich_vu_di_kem
FROM hop_dong
INNER JOIN nhan_vien ON hop_dong.id_nhan_vien = nhan_vien.id_nhan_vien
INNER JOIN khach_hang ON hop_dong.id_khach_hang = khach_hang.id_khach_hang
INNER JOIN dich_vu ON hop_dong.id_dich_vu = dich_vu.id_dich_vu
INNER JOIN hop_dong_chi_tiet ON hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
WHERE (
	(hop_dong.ngay_lam_hop_dong BETWEEN "2019/10/01" AND "2019/12/31")
    AND hop_dong.ngay_lam_hop_dong NOT IN (
		SELECT dich_vu.id_dich_vu 
        FROM dich_vu
        INNER JOIN hop_dong ON dich_vu.id_dich_vu = hop_dong.id_dich_vu
        WHERE hop_dong.ngay_lam_hop_dong BETWEEN "2019/01/01" AND "2019/06/30"
    )
)
GROUP BY id_hop_dong;

/*
	TASK 13:
    Hien thi thong tin cac dich vu di kem duoc su dung nhieu nhat boi cac khach hang da dat phong
    Luu y co the co nhieu dich vu co so lan su dung nhieu nhu nhau
*/
SELECT 
	dich_vu_di_kem.id_dich_vu_di_kem,
	dich_vu_di_kem.ten_dich_vu_di_kem,
    dich_vu_di_kem.gia,
    dich_vu_di_kem.don_vi,
    dich_vu_di_kem.trang_thai,
    max(dich_vu_di_kem.id_dich_vu_di_kem) AS so_lan_dat
FROM dich_vu_di_kem
INNER JOIN hop_dong_chi_tiet ON dich_vu_di_kem.id_dich_vu_di_kem = hop_dong_chi_tiet.id_dich_vu_di_kem
ORDER BY so_lan_dat DESC;

/*
	TASK 14:
    Hien thi thong tin tat ca cac dich vu di kem chi moi duoc su dung 1 lan duy nhat
    Thong tin hien thi gom id_hop_dong, ten_loai_dich_vu, ten_dich_vu_di_kem, so_lan_su_dung
*/
SELECT 
	hop_dong.id_hop_dong,
    loai_dich_vu.ten_loai_dich_vu,
    dich_vu_di_kem.ten_dich_vu_di_kem,
    count(dich_vu_di_kem.id_dich_vu_di_kem) AS so_lan_su_dung
FROM hop_dong
INNER JOIN dich_vu ON hop_dong.id_dich_vu = dich_vu.id_dich_vu
INNER JOIN loai_dich_vu ON dich_vu.id_loai_dich_vu = loai_dich_vu.id_loai_dich_vu
INNER JOIN hop_dong_chi_tiet ON hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
INNER JOIN dich_vu_di_kem ON hop_dong_chi_tiet.id_dich_vu_di_kem = dich_vu_di_kem.id_dich_vu_di_kem
GROUP BY dich_vu_di_kem.ten_dich_vu_di_kem
HAVING so_lan_su_dung = 1;

/*
	TASK 15:
    Hien thi thong tin cua tat ca nhan vien bao gom id_nhan_vien, ho_ten, 
    trinh_do, ten_bo_phan, so_dien_thoai, dia_chi moi chi lap duoc toi da 3 hop dong tu nam 2018 den nam 2019
*/
SELECT
	nhan_vien.id_nhan_vien,
    nhan_vien.ho_ten,
    trinh_do.trinh_do,
    bo_phan.ten_bo_phan,
    nhan_vien.sdt,
    nhan_vien.dia_chi,
    count(hop_dong.id_hop_dong) AS so_hop_dong_lap_duoc
FROM nhan_vien
INNER JOIN trinh_do ON nhan_vien.id_trinh_do = trinh_do.id_trinh_do
INNER JOIN bo_phan ON nhan_vien.id_bo_phan = bo_phan.id_bo_phan
INNER JOIN hop_dong ON nhan_vien.id_nhan_vien = hop_dong.id_nhan_vien
WHERE YEAR(hop_dong.ngay_lam_hop_dong) BETWEEN 2018 AND 2019
GROUP BY nhan_vien.id_nhan_vien
HAVING so_hop_dong_lap_duoc = 3;

/*
	TASK 16:
    Xoa nhung nhan vien chua tung lap duoc hop dong nao tu nam 2017 den nam 2019
*/
-- query chuan
SELECT hop_dong.id_nhan_vien
FROM hop_dong
WHERE hop_dong.id_nhan_vien NOT IN (
	SELECT hop_dong.id_nhan_vien
	FROM hop_dong
	WHERE YEAR(hop_dong.ngay_lam_hop_dong) BETWEEN 2017 AND 2019 order by id_nhan_vien
);

SET FOREIGN_KEY_CHECKS = 0;
delete from nhan_vien where nhan_vien.id_nhan_vien in (
	SELECT hop_dong.id_nhan_vien
	FROM hop_dong
	WHERE hop_dong.id_nhan_vien not IN (
		SELECT hop_dong.id_nhan_vien
		FROM hop_dong
		WHERE YEAR(hop_dong.ngay_lam_hop_dong) BETWEEN 2017 AND 2019 order by id_nhan_vien
	)
);
SET FOREIGN_KEY_CHECKS = 1;

/*
	TASK 17:
    Cap nhat thong tin nhung khach hang co ten_loai_khach_hang la Platinum len Diamond,
    voi dieu kien da tung dat phong voi tong tien thanh toan trong nam 2019 > 10tr
*/
UPDATE khach_hang
SET khach_hang.id_loai_khach = 1
WHERE khach_hang.id_loai_khach = 2
AND EXISTS (
	SELECT hop_dong.id_khach_hang,
    sum(dich_vu.chi_phi_thue + (dich_vu_di_kem.don_vi * dich_vu_di_kem.gia)) AS tong_tien_thanh_toan
	FROM hop_dong
	INNER JOIN dich_vu ON hop_dong.id_dich_vu = dich_vu.id_dich_vu 
	INNER JOIN hop_dong_chi_tiet ON hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
	INNER JOIN dich_vu_di_kem ON hop_dong_chi_tiet.id_dich_vu_di_kem = dich_vu_di_kem.id_dich_vu_di_kem
    WHERE YEAR(hop_dong.ngay_lam_hop_dong) = 2019
	GROUP BY hop_dong.id_khach_hang
	HAVING tong_tien_thanh_toan > 10000000
);

/*
	TASK 18:
    Xoa nhung khach hang co hop dong truoc nam 2016
    (Chu y constraint giua cac bang)
*/
SET FOREIGN_KEY_CHECKS = 0;
DELETE FROM khach_hang
WHERE EXISTS (
	SELECT hop_dong.id_hop_dong, hop_dong.id_khach_hang
    FROM hop_dong
    WHERE YEAR(hop_dong.ngay_lam_hop_dong) <= 2016
);
SET FOREIGN_KEY_CHECKS = 1;


SET FOREIGN_KEY_CHECKS = 0;
DELETE FROM khach_hang;
SET FOREIGN_KEY_CHECKS = 1;

/*
	TASK 19:
    Cap nhat gia cho cac dich vu di kem duoc su dung tren 10 lan trong nam 2019 len gap doi
*/
UPDATE dich_vu_di_kem
SET dich_vu_di_kem.gia = dich_vu_di_kem.gia * 2
WHERE (
	SELECT 
		dich_vu_di_kem.id_dich_vu_di_kem,
        count(hop_dong_chi_tiet.id_hop_dong_chi_tiet) AS so_lan_su_dung
    FROM hop_dong_chi_tiet
	GROUP BY dich_vu_di_kem.id_dich_vu_di_kem
    HAVING so_lan_su_dung > 10
);

/*
	TASK 20:
    Hien thi thong tin tat ca cac Nhan vien va Khach hang co trong he thong
    Bao gom id, ho ten, email, sdt, ngay sinh, dia chi
*/
SELECT 
	id_nhan_vien, 
	ho_ten, 
    email, 
	sdt, 
    ngay_sinh, 
	dia_chi
FROM nhan_vien
UNION ALL SELECT 
	id_khach_hang, 
	ho_ten, 
    email, 
    sdt, 
    ngay_sinh, 
    dia_chi
FROM khach_hang;
