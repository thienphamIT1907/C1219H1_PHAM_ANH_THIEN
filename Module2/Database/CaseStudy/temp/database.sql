DROP DATABASE IF EXISTS furama_resort;
CREATE DATABASE furama_resort;
USE furama_resort;

-- table nhan vien
CREATE TABLE nhan_vien (
	id_nhan_vien INT NOT NULL,
    ho_ten VARCHAR(45) NOT NULL,
    id_vi_tri INT NOT NULL,
    id_trinh_do INT NOT NULL,
    id_bo_phan INT NOT NULL,
    ngay_sinh DATE,
    cmnd_nhanvien VARCHAR(45),
    luong VARCHAR(45),
    sdt VARCHAR(45),
    email VARCHAR(45),
    diachi VARCHAR(45),
    
    CONSTRAINT pk_id_nhanvien PRIMARY KEY(id_nhanvien)
);

CREATE TABLE vitri (
	id_vitri INT NOT NULL,
    tenvitri VARCHAR(45),
    
    CONSTRAINT pk_id_vitri PRIMARY KEY(id_vitri)
);

CREATE TABLE trinhdo (
	id_trinhdo INT NOT NULL,
    trinhdo VARCHAR(45),
    
    CONSTRAINT pk_id_trinhdo PRIMARY KEY(id_trinhdo)
);

CREATE TABLE bophan (
	id_bophan INT NOT NULL,
    tenbophan VARCHAR(45),
    
    CONSTRAINT pk_id_bophan PRIMARY KEY(id_bophan)
);

-- table khach hang
CREATE TABLE khachhang (
	id_khachhang INT NOT NULL,
    id_loaikhachhang INT NOT NULL,
    hoten_khachhang VARCHAR(45),
    ngaysinh DATE,
    cmnd_khachhang VARCHAR(45),
    sdt VARCHAR(45),
	email VARCHAR(45),
    diachi VARCHAR(45),
    
    CONSTRAINT pk_id_khachhang PRIMARY KEY(id_khachhang)
);

CREATE TABLE loaikhachhang (
	id_loaikhachhang INT NOT NULL,
    tenloaikhachhang VARCHAR(45),
    
    CONSTRAINT pk_id_loaikhachhang PRIMARY KEY(id_loaikhachhang)
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
    
    CONSTRAINT pk_id_hopdong PRIMARY KEY(id_hopdong)
);

CREATE TABLE hopdongchitiet (
	id_hopdongchitiet INT NOT NULL,
    id_hopdong INT NOT NULL,
    id_dichvudikem INT NOT NULL,
    soluong INT,
    
    CONSTRAINT pk_id_hopdongchitiet PRIMARY KEY(id_hopdongchitiet)
);

-- table dich vu
CREATE TABLE dichvu (
	id_dichvu INT NOT NULL,
    tendichvu VARCHAR(45),
    dientich INT,
    sotang INT,
    songuoimax INT,
    chiphithue INT,
    id_kieuthue INT NOT NULL,
    id_loaidichvu INT NOT NULL,
    trangthai VARCHAR(45),
    
    CONSTRAINT pk_id_dichvu PRIMARY KEY(id_dichvu)
);

CREATE TABLE kieuthue (
	id_kieuthue INT NOT NULL,
    tenkieuthue VARCHAR(45),
    gia INT,
    
    CONSTRAINT pk_id_kieuthue PRIMARY KEY(id_kieuthue)
);

CREATE TABLE loaidichvu (
	id_loaidichvu INT NOT NULL,
    tenloaidichvu VARCHAR(45),
    
    CONSTRAINT pk_id_loaidichvu PRIMARY KEY(id_loaidichvu)
);

CREATE TABLE dichvudikem (
	id_dichvudikem INT NOT NULL,
    tendichvudikem VARCHAR(45),
    gia INT,
    donvi INT,
    trangthaikhadung VARCHAR(45),
    
    CONSTRAINT pk_id_dichvudikem PRIMARY KEY(id_dichvudikem)
);

ALTER TABLE nhanvien
ADD CONSTRAINT fk_id_vitri FOREIGN KEY (id_vitri) REFERENCES vitri(id_vitri),
ADD	CONSTRAINT fk_id_trinhdo FOREIGN KEY (id_trinhdo) REFERENCES trinhdo(id_trinhdo),
ADD	CONSTRAINT fk_id_bophan FOREIGN KEY (id_bophan) REFERENCES bophan(id_bophan);
    
ALTER TABLE hopdong
ADD CONSTRAINT fk_id_nhanvien FOREIGN KEY (id_nhanvien) REFERENCES nhanvien(id_nhanvien),
ADD CONSTRAINT fk_id_khachhang FOREIGN KEY (id_khachhang) REFERENCES khachhang(id_khachhang),
ADD CONSTRAINT fk_id_dichvu FOREIGN KEY (id_dichvu) REFERENCES dichvu(id_dichvu);
	
ALTER TABLE khachhang
ADD CONSTRAINT fk_id_loaikhachhang FOREIGN KEY (id_loaikhachhang) REFERENCES loaikhachhang(id_loaikhachhang);

ALTER TABLE dichvu
ADD CONSTRAINT fk_id_kieuthue FOREIGN KEY (id_kieuthue) REFERENCES kieuthue(id_kieuthue),
ADD CONSTRAINT fk_id_loaidichvu FOREIGN KEY (id_loaidichvu) REFERENCES loaidichvu(id_loaidichvu);

ALTER TABLE hopdongchitiet
ADD CONSTRAINT fk_id_hopdong FOREIGN KEY (id_hopdong) REFERENCES hopdong(id_hopdong),
ADD CONSTRAINT fk_id_dichvudikem FOREIGN KEY (id_dichvudikem) REFERENCES dichvudikem(id_dichvudikem);