USE furama_resort;

/*
	TASK1: 
    Insert thong tin
 */ 
INSERT INTO vitri 
VALUES
(1, "Tong giam doc"),
(2, "Pho giam doc"),
(3, "Thu ki"),
(4, "Truong phong"),
(5, "Nhan vien"),
(6, "Bao ve"),
(7, "Lao cong"),
(8, "Thuc tap sinh");

INSERT INTO bophan 
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

INSERT INTO trinhdo 
VALUES
(1, "Dai hoc"),
(2, "Cao dang"),
(3, "Trung cap"),
(4, "Trung hoc pho thong"),
(5, "Khong co trinh do");

-- id_loaikhachhang, tenloaikhachhang
INSERT INTO loaikhachhang 
VALUES
(1, "Diamond"),
(2, "Platinum"),
(3, "Gold"),
(4, "Silver"),
(5, "Member");

-- id_kieuthue, tenkieuthue, gia
INSERT INTO kieuthue 
VALUES
(1, "Thang", 12000000),
(2, "Tuan", 8000000),
(3, "Ngay", 6000000),
(4, "Gio", 400000);

INSERT INTO loaidichvu
VALUES
(1, "Villa"),
(2, "House"),
(3, "Room");

-- id_dichvu, tendichvu, dientich, sotang, songuoimax, chiphithue, id_kieuthue, id_loaidichvu, trangthai
INSERT INTO dichvu 
VALUES
(1, "Vip Villa", 700, 5, 30, 12000000, 2, 1, "Kha dung"),
(2, "Normal Villa", 300, 3, 15, 10000000, 2, 1, "Kha dung"),
(3, "Vip House", 300, 3, 15, 8000000, 3, 2, "Kha dung"),
(4, "Normal House", 150, 2, 4, 5000000, 3, 2, "Kha dung"),
(5, "Vip Room", 100, 1, 2, 3000000, 2, 3, "Kha dung"),
(6, "Normal Room", 100, 1, 2, 1500000, 4, 3, "Kha dung");

-- id_dichvudikem, tendichvudikem, gia, donvi, trangthaikhadung
INSERT INTO dichvudikem
VALUES
(1, "Massage", 1200000, 1, "Kha dung"),
(2, "Karaoke", 500000, 1, "Kha dung"),
(3, "Thuc an", 300000, 1, "Kha dung" ),
(4, "Nuoc uong", 50000, 1, "Kha dung" ),
(5, "Thue xe tham quan resort", 420000, 1, "Kha dung");

-- id_nhanvien, hoten_nhanvien, id_vitri, id_trinhdo, id_bophan, ngaysinh, cmnd_nhanvien, luong, sdt, email, diachi
INSERT INTO nhanvien
VALUES
(1, "Pham Anh Thien", 1, 1, 1, "1995/07/19", 2017444302, "20.000.000", "0913 412 421", "thien@gmail.com", "Da nang"),
(2, "Khada Jhin", 1, 1, 1, "1980/02/03", 668005001, "15.000.000", "0913 981 892", "jhin@gmail.com", "Canada"),
(3, "Ha Xuan Nguyen", 3, 2, 2, "1990/12/28", 217791093, "6.000.000", "0905 361 421", "nguyen@gmail.com", "Hue"),
(4, "Trinh Xuan Quyet", 2, 3, 6, "1996/12/15", 165591551, "9.000.000", "0165 837 184", "quyet@gmail.com", "Quang Tri"),
(5, "Doan Sy Khuong", 7, 1, 5, "1995/04/05", 131309750, "16.000.000", "0121 574 104", "khuong@gmail.com", "Da nang"),
(6, "Nguyen Phu Khoa", 6, 3, 3, "1997/08/28", 121931597, "8.000.000", "0913 796 219", "khoa@gmail.com", "Da nang"),
(7, "Nguyen Xuan Khoat", 5, 5, 6, "1995/01/12", 320781617, "10.000.000", "0122 927 184", "khoat@gmail.com", "Quang Tri"),
(8, "Tran Thi Mong Nhu", 8, 2, 7, "2001/11/20", 488964520, "5.000.000", "0913 283 408", "nhu@gmail.com", "Ha Noi"),
(10, "Truong Dinh Tuan", 3, 3, 2, "1999/03/04", 363175234, "8.000.000", "0163 715 583", "tuan@gmail.com", "Lao Cai"),
(16, "Pham Thi Thu Trang", 1, 2, 4, "1980/07/05", 201701763, "7.000.000", "0913 425 383", "trang@gmail.com", "Nha Trang"),
(15, "Doan Huy Hoang", 6, 5, 5, "1995/06/30", 396950312, "8.000.000", "0913 412 874", "hoang@gmail.com", "Da nang"),
(12, "Pham Thi Ngoc Thu", 1, 4, 5, "1995/02/12", 942199693, "7.000.000", "0793 180 500", "thu@gmail.com", "Ha Noi"),
(9, "Truong Ngoc Khanh", 2, 2, 3, "1989/06/06", 784193285, "12.000.000", "0122 672 182", "khanh@gmail.com", "Quang Nam"),
(14, "Trinh Yen Nhi", 8, 4, 2, "2000/09/18", 710578936, "5.000.000", "0166 945 194", "nhi@gmail.com", "Da nang"),
(20, "Do Thi Nhu Ngoc", 5, 3, 3, "1999/06/01", 707012970, "10.000.000", "0902 381 608", "ngoc@gmail.com", "Nghe An"),
(13, "Nguyen Hai Hung", 7, 1, 5, "1992/12/20", 315707301, "6.000.000", "0907 178 107", "hung@gmail.com", "Thanh Hoa"),
(11, "Phan Ha Nguyen Hai", 8, 2, 1, "1995/05/19", 673789501, "5.000.000", "0713 822 392", "hai@gmail.com", "Da Lat"),
(19, "Do Thi Hanh Nguyen", 2, 4, 2, "1988/08/09", 395839105, "8.000.000", "0827 802 122", "nguyen@gmail.com", "Hai Phong"),
(17, "Tran Nhan Tam", 4, 5, 3, "1991/02/11", 698284010, "7.000.000", "0713 822 572", "tam@gmail.com", "Bac Giang");

-- id_khachhang, id_loaikhachhang, hoten_khachhang, ngaysinh, cmnd_khachhang, sdt, email, diachi
INSERT INTO khachhang 
VALUES
(1, 1, "Tran Huu Minh", "1980/12/05", 315472363, "0991 981 939", "minh@yahoo.com", "Lam Dong"),
(2, 4, "Doan Thuy Trang", "1988/11/07", 151636777, "0173 919 166", "trang@yahoo.com", "Ha Noi"),
(3, 1, "Phan Van Duc", "1985/3/19", 151847672, "0184 458 563", "duc@yahoo.com", "Bac Kan"),
(4, 2, "Ngo Thi Van", "1997/12/05", 105885174, "0683 234 461", "van@yahoo.com", "Quang Binh"),
(5, 1, "Nguyen Phuc Kien", "1999/12/05", 593781049, "0157 472 853", "kien@yahoo.com", "Nha Trang"),
(6, 3, "Dang Thi Thu Thao", "1990/12/05", 315423577, "0666 136 737", "thao@yahoo.com", "Dak Lak"),
(7, 5, "Trinh Yen Nhi", "1980/12/05", 398164817, "0768 116 697", "nhi@yahoo.com", "Quang Nam"),
(8, 1, "Le Thanh Liem", "1993/12/05", 598737910, "01884 252 123", "liem@yahoo.com", "Tam Ki"),
(9, 4, "Ngo Thanh Tung", "1994/12/05", 103859277, "0737 153 863", "tung@yahoo.com", "Da Nang"),
(10, 1, "Hoang Dieu My", "1991/12/05", 948209385, "091 514 546", "my@yahoo.com", "Ho Chi Minh");

-- id_hopdong, id_nhanvien, id_khachhang, id_dichvu, ngaylamhopdong, ngaykethuc, tiendatcoc
INSERT INTO hopdong 
VALUES
(1, 14, 7, 5, "2019/12/25", "2020/12/29", 5000000), 
(2, 5, 9, 3, "2020/03/12", "2020/03/14", 2000000), --
(3, 7, 3, 4, "2019/09/11", "2019/10/20", 10000000),
(4, 3, 6, 2, "2019/09/29", "2019/09/30", 1500000),
(5, 10, 3, 5, "2020-05-19", "2020/03/25", 6000000),
(6, 6, 5, 3, "2020/03/23", "2020/03/26", 5000000),
(7, 3, 3, 1, "2019/12/31", "2020/01/05", 3400000),
(8, 4, 7, 4, "2020/02/14","2020/02/19", 5000000),
(9, 7, 10, 2, "2020/02/19", "2020/02/24", 9800000),
(10, 8, 10, 1, "2020-04-23", "2020/03/01", 1300000);

-- id_hopdongchitiet, id_hopdong, id_dichvudikem, soluong
INSERT INTO hopdongchitiet
VALUES
(1, 2, 2, 1),
(2, 3, 5, 1),
(3, 4, 3, 1),
(4, 6, 1, 1),
(5, 7, 3, 2),
(6, 8, 5, 1),
(7, 9, 4, 1),
(8, 10, 2, 1);

/*
	TASK2:
    Hien thi thong tin cua tat ca nhan vien co trong he thong
    co ten bat dau la 1 trong cac ki tu "H", "T", hoac "K" 
    va co toi da 15 ki tu
*/
SELECT * 
FROM nhanvien 
WHERE (
	(hoten_nhanvien LIKE "% % H%" OR hoten_nhanvien LIKE "% % % H%") OR
	(hoten_nhanvien LIKE "% % T%" OR hoten_nhanvien LIKE "% % % T%") OR
	(hoten_nhanvien LIKE "% % K%" OR hoten_nhanvien LIKE "% % % K%")
) AND length(hoten_nhanvien) <= 15;

/*
	TASK3: 
    Hien thi thong tin cua tat ca khach hang co do tuoi tu 18 den 50,
    co dia chi o Da Nang hoac Quang Tri
*/    
SELECT hoten_khachhang, timestampdiff(YEAR, ngaysinh, curdate()) AS tuoi, diachi
FROM khachhang
WHERE (timestampdiff(YEAR, ngaysinh, CURDATE()) BETWEEN 18 and 50) 
AND diachi IN ("Da Nang", "Quang Tri");

/*
	TASK4: 
    Dem xem moi khach hang da tung dat phong bao nhieu lan. 
    Ket qua hien thi duoc sap xep tang dan theo so lan dat phong. 
    Chi dem nhung khach hang nao co tenloaikhachhang la Diamond
*/
SELECT
	khachhang.id_khachhang, 
	khachhang.hoten_khachhang, 
	loaikhachhang.tenloaikhachhang, 
	count(hopdong.id_hopdong) AS solan_datphong
FROM khachhang
INNER JOIN hopdong ON khachhang.id_khachhang = hopdong.id_khachhang
INNER JOIN loaikhachhang ON loaikhachhang.id_loaikhachhang = khachhang.id_loaikhachhang
WHERE loaikhachhang.tenloaikhachhang = "Diamond"
GROUP BY khachhang.hoten_khachhang
ORDER BY solan_datphong DESC;

/* 
	TASK5: 
    Hien thi id_khachhang, hoten, tenloaikhachhang, id_hopdong, tendichvu, 
    ngaylamhopdong, ngayketthuc, tongtien = chiphithue + donvi * gia, 
	(don vi va gia la tu bang dichvudikem) 
	cho tat ca khach hang da tung dat phong (Hien thi luon nhung khach hang chua tung dat phong) 
*/
SELECT
	khachhang.id_khachhang, 
    khachhang.hoten_khachhang, 
	loaikhachhang.tenloaikhachhang,
	hopdong.id_hopdong,
	dichvu.tendichvu,
 	hopdong.ngaylamhopdong,
 	hopdong.ngayketthuc,
    dichvu.chiphithue + (dichvudikem.donvi * dichvudikem.gia) AS tong_tien
FROM khachhang
lEFT JOIN loaikhachhang ON khachhang.id_loaikhachhang = loaikhachhang.id_loaikhachhang
LEFT JOIN hopdong ON khachhang.id_khachhang = hopdong.id_khachhang
LEFT JOIN dichvu ON hopdong.id_dichvu = dichvu.id_dichvu
LEFT JOIN hopdongchitiet ON  hopdong.id_hopdong = hopdongchitiet.id_hopdong
LEFT JOIN dichvudikem ON hopdongchitiet.id_dichvudikem = dichvudikem.id_dichvudikem
ORDER BY khachhang.id_khachhang;

/*
	TASK6: 
    Hien thi id_dichvu, tendichvu, dientich, chiphithue, tenloaidichvu 
    cua tat ca cac loai dich vu chua tung duoc khach hang thuc hien dat tu quy 1 cua nam 2019 (Quy 1 gom t1, t2, t3)
*/
SELECT
	dichvu.id_dichvu,
    dichvu.tendichvu,
    dichvu.dientich,
    dichvu.chiphithue,
    loaidichvu.tenloaidichvu
FROM dichvu
INNER JOIN loaidichvu ON dichvu.id_loaidichvu = loaidichvu.id_loaidichvu
WHERE NOT EXISTS (
	SELECT dichvu.id_dichvu
    FROM dichvu
    INNER JOIN hopdong ON dichvu.id_dichvu = hopdong.id_hopdong
    WHERE hopdong.ngaylamhopdong BETWEEN "2019/01/01" AND "2019/03/31"
)


/*
	TASK7: 
    Hien thi thong tin id_dichvu, tendichvu, dientich, songuoitoida, 
    chiphithue, tenloaidichvu cua tat ca cac loai dich vu da tung duoc khach hang dat phong trong nam 2018 chua tung duoc
*/













