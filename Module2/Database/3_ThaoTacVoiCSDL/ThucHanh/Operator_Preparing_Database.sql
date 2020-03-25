USE furama_resort;
SELECT * FROM khachhang;
SELECT * FROM nhanvien;
SELECT * FROM nhanvien WHERE id_nhanvien = 5;
SELECT * FROM nhanvien WHERE id_bophan <> 1;
SELECT hoten_nhanvien, diachi FROM nhanvien WHERE diachi LIKE "Da Nang";
SELECT hoten_nhanvien, luong FROM nhanvien WHERE luong = "8.000.000";
SELECT hoten_nhanvien FROM nhanvien WHERE id_trinhdo = 1;

SELECT diachi, COUNT(hoten_nhanvien) AS soluong 
FROM nhanvien 
GROUP BY diachi ORDER BY soluong DESC;

SELECT UCASE(hoten_nhanvien) FROM nhanvien; 

SELECT length(diachi) FROM nhanvien;
