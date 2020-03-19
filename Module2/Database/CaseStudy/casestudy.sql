CREATE DATABASE furama_casestudy;
USE furama_casestudy;

-- table nhan vien
CREATE TABLE nhanvien (
	id_nhanvien INT,
    hoten_nhanvien NVARCHAR(45),
    id_vitri INT,
    id_trinhdo INT,
    id_bophan INT,
    ngaysinh DATE,
    cmnd_nhanvien NVARCHAR(45),
    luong NVARCHAR(45),
    sdt NVARCHAR(45),
    email NVARCHAR(45),
    diachi NVARCHAR(45),
    
    CONSTRAINT PRIMARY KEY(id_nhanvien)
);

CREATE TABLE vitri (
	id_vitri INT,
    tenvitri NVARCHAR(45),
    
    CONSTRAINT PRIMARY KEY(id_vitri)
);

CREATE TABLE trinhdo (
	id_trinhdo INT,
    trinhdo NVARCHAR(45),
    
    CONSTRAINT PRIMARY KEY(id_trinhdo)
);

CREATE TABLE bophan (
	id_bophan INT,
    tenbophan NVARCHAR(45),
    
    CONSTRAINT PRIMARY KEY(id_bophan)
);

-- table khach hang
CREATE TABLE khachhang (
	id_khachhang INT,
    id_loaikhach INT,
    hoten NVARCHAR(45),
    ngaysinh DATE,
    cmnd_khachhang NVARCHAR(45),
    sdt NVARCHAR(45),
	email NVARCHAR(45),
    diachi NVARCHAR(45),
    
    CONSTRAINT PRIMARY KEY(id_khachhang)
);

CREATE TABLE loaikhach (
	id_loaikhach INT,
    tenloaikhach NVARCHAR(45),
    
    CONSTRAINT PRIMARY KEY(id_loaikhach)
);

-- table hop dong
CREATE TABLE hopdong (
	id_hopdong INT,
    id_nhanvien INT,
    id_khachhang INT,
    id_dichvu INT,
    ngaylamhopdong DATE,
    ngaykethuc DATE,
    tiendatcoc INT,
    tongtien INT,
    
    CONSTRAINT PRIMARY KEY(id_hopdong)
);

CREATE TABLE hopdongchitiet (
	id_hopdingchitiet INT,
    id_hopdong INT,
    id_dichvudikem INT,
    soluong INT,
    
    CONSTRAINT PRIMARY KEY(id_hopdingchitiet)
);

-- table dich vu
CREATE TABLE dichvu (
	id_dichvu INT,
    tendichvu NVARCHAR(45),
    dientich INT,
    sotang INT,
    songuoimax INT,
    chiphithue INT,
    id_kieuthue INT,
    id_loaidichvu INT,
    trangthai NVARCHAR(45),
    
    CONSTRAINT PRIMARY KEY(id_dichvu)
);

CREATE TABLE kieuthue (
	id_kieuthue INT,
    tenkieuthue NVARCHAR(45),
    gia INT,
    
    CONSTRAINT PRIMARY KEY(id_kieuthue)
);

CREATE TABLE loaidichvu (
	id_loaidichvu INT,
    tenloaidichvu NVARCHAR(45),
    
    CONSTRAINT PRIMARY KEY(id_loaidichvu)
);

CREATE TABLE dichvudikem (
	id_dichvudikem INT,
    tendichvudikem NVARCHAR(45),
    gia INT,
    donvi INT,
    trangthaikhadung NVARCHAR(45),
    
    CONSTRAINT PRIMARY KEY(id_dichvudikem)
);















