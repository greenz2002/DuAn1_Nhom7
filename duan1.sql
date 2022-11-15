create database DUAN1

go

use DUAN1

go




create table THELOAI
(
	IdTheLoai varchar(10) primary key,
	TenTheLoai nvarchar(100) not null
);
create table SANPHAM
(
	IdSp varchar(10) primary key,
	TenSp nvarchar(100) not null,
	NgayNhap date,
	TenTrangThai nvarchar(100) not null,
	IdNhanHieu varchar(10) not null,
	GiaNhap float not null,
	GiaBan float not null,
	NgaySanXuat date
);
create table NHANHIEU
(
	IdNhanHieu varchar(10) primary key,
	TenNhanHieu nvarchar(100) not null,
	NguonGoc nvarchar(100),
	IdSp varchar(10) not null ,
	constraint fk_nh foreign key ( IdSp ) references SANPHAM ( IdSp)
);
create table TRANGTHAISANPHAM 
(
	IdSp varchar(10) primary key,
	TenTrangThai nvarchar(100) not null,
	
);

create table CHITIETSANPHAM
(
	IdChiTietSanPham varchar(10) primary key,
	IdSp varchar(10) not null,
	IdTheLoai varchar(10) not null,
	TenSp nvarchar(100) not null,
	SoLuong int not null,
	GiaNhap float not null,
	GiaBan float not null,
	MauSac nvarchar(100),
	KichCo nvarchar(100),
	constraint fk_sp foreign key ( IdSp ) references SANPHAM ( IdSp ),
	constraint fk_tl foreign key ( IdTheLoai ) references THELOAI ( IdTheLoai ),
	constraint fk_ttsp foreign key ( IdSp ) references TRANGTHAISANPHAM ( IdSp )
);


create table TRANGTHAI
(
	IdTrangThai varchar(10) primary key,
	TenTrangThai nvarchar(100) not null,
	-- constraint fk_tt foreign key (IdTrangThai) references NHANVIEN( IdTrangThai)
);
create table NHANVIEN 
(
	IdNhanVien varchar(10) primary key,
	MaNV varchar(10) not null unique,
	TenNV nvarchar(100),
	NgaySinh date,
	Email varchar(100) not null,
	SDT varchar(100) not null,
	DiaChi nvarchar(100),
	IdTrangThai varchar(10) not null ,
	ChucVu nvarchar(100),
	GioiTinh nvarchar(10),
	TK varchar(100) not null,
	MK varchar(100) not null,
	constraint fk_tt foreign key (IdTrangThai) references TRANGTHAI( IdTrangThai)
);

create table NGUOIDUNG
(
	IdNguoiDung varchar(10) primary key,
	TenND nvarchar(100),
	NgaySinh date,
	Email varchar(100) not null,
	SDT varchar(100) not null,
	DiaChi nvarchar(100),
	GioiTinh nvarchar(10),
	TK varchar(100),
	MK varchar(100)
);
create table HOADON 
(
	IDHD varchar(10) primary key,
	IdSp varchar(10) not null,
	TenSp nvarchar(100),
	IdNhanVien varchar(10),
	IdNguoiDung varchar(10),
	NgayTao date,
	DiaChi nvarchar(100),
	ThanhToan nvarchar(100),
	constraint fk_nv foreign key ( IdNhanVien ) references NHANVIEN ( IdNhanVien),
	constraint fk_nd foreign key (IdNguoiDung ) references NGUOIDUNG ( IdNguoiDung),
	constraint fk_hdsp foreign key ( IdSp ) references SANPHAM ( IdSp )
);

create table CHITIETHOADON 
(
	IDHDCT varchar(10) primary key,
	IDHD varchar(10),
	TenSP nvarchar(100),
	DonGia float,
	SoLuong int,
	constraint fk_hd foreign key ( IDHD ) references HOADON ( IDHD )
);

