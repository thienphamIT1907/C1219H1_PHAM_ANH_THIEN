CREATE DATABASE furama_casestudy;
USE furama_casestudy;

-- table nhan vien
CREATE TABLE nhanvien (
	id_nhanvien INT NOT NULL,
    hoten_nhanvien NVARCHAR(45) NOT NULL,
    id_vitri INT NOT NULL,
    id_trinhdo INT NOT NULL,
    id_bophan INT NOT NULL,
    ngaysinh DATE,
    cmnd_nhanvien NVARCHAR(45),
    luong NVARCHAR(45),
    sdt NVARCHAR(45),
    email NVARCHAR(45),
    diachi NVARCHAR(45),
    
    CONSTRAINT PRIMARY KEY(id_nhanvien)
);

CREATE TABLE vitri (
	id_vitri INT NOT NULL,
    tenvitri NVARCHAR(45),
    
    CONSTRAINT PRIMARY KEY(id_vitri)
);

CREATE TABLE trinhdo (
	id_trinhdo INT NOT NULL,
    trinhdo NVARCHAR(45),
    
    CONSTRAINT PRIMARY KEY(id_trinhdo)
);

CREATE TABLE bophan (
	id_bophan INT NOT NULL,
    tenbophan NVARCHAR(45),
    
    CONSTRAINT PRIMARY KEY(id_bophan)
);

-- table khach hang
CREATE TABLE khachhang (
	id_khachhang INT NOT NULL,
    id_loaikhach INT NOT NULL,
    hoten NVARCHAR(45),
    ngaysinh DATE,
    cmnd_khachhang NVARCHAR(45),
    sdt NVARCHAR(45),
	email NVARCHAR(45),
    diachi NVARCHAR(45),
    
    CONSTRAINT PRIMARY KEY(id_khachhang)
);

CREATE TABLE loaikhach (
	id_loaikhach INT NOT NULL,
    tenloaikhach NVARCHAR(45),
    
    CONSTRAINT PRIMARY KEY(id_loaikhach)
);

-- table hop dong
CREATE TABLE hopdong (
	id_hopdong INT NOT NULL,
    id_nhanvien INT NOT NULL,
    id_khachhang INT NOT NULL,
    id_dichvu INT NOT NULL,
    ngaylamhopdong DATE,
    ngaykethuc DATE,
    tiendatcoc INT,
    tongtien INT,
    
    CONSTRAINT PRIMARY KEY(id_hopdong)
);

CREATE TABLE hopdongchitiet (
	id_hopdingchitiet INT NOT NULL,
    id_hopdong INT NOT NULL,
    id_dichvudikem INT NOT NULL,
    soluong INT,
    
    CONSTRAINT PRIMARY KEY(id_hopdingchitiet)
);

-- table dich vu
CREATE TABLE dichvu (
	id_dichvu INT NOT NULL,
    tendichvu NVARCHAR(45),
    dientich INT,
    sotang INT,
    songuoimax INT,
    chiphithue INT,
    id_kieuthue INT NOT NULL,
    id_loaidichvu INT NOT NULL,
    trangthai NVARCHAR(45),
    
    CONSTRAINT PRIMARY KEY(id_dichvu)
);

CREATE TABLE kieuthue (
	id_kieuthue INT NOT NULL,
    tenkieuthue NVARCHAR(45),
    gia INT,
    
    CONSTRAINT PRIMARY KEY(id_kieuthue)
);

CREATE TABLE loaidichvu (
	id_loaidichvu INT NOT NULL,
    tenloaidichvu NVARCHAR(45),
    
    CONSTRAINT PRIMARY KEY(id_loaidichvu)
);

CREATE TABLE dichvudikem (
	id_dichvudikem INT NOT NULL,
    tendichvudikem NVARCHAR(45),
    gia INT,
    donvi INT,
    trangthaikhadung NVARCHAR(45),
    
    CONSTRAINT PRIMARY KEY(id_dichvudikem)
);















