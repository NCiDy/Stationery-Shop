create database QL_VanPhongPham
use QL_VanPhongPham
go

CREATE TABLE NhaCungCap
(
    maNCC CHAR(10) PRIMARY KEY,
    tenNCC VARCHAR(100),
    SDT CHAR(10),
    diachi VARCHAR(100)
);

CREATE TABLE LoaiSanPham
(
    maLSP CHAR(10) PRIMARY KEY,
    tenLSP VARCHAR(50)
);

CREATE TABLE SanPham
(
    maSP CHAR(10) PRIMARY KEY,
	maLSP CHAR(10) ,
    FOREIGN KEY (maLSP) REFERENCES LoaiSanPham(maLSP),
    tenSP VARCHAR(50),
    DVT VARCHAR(10),
    dongia INT NOT NULL CHECK (dongia > 0)
);

CREATE TABLE CTSanPham (
    maSP CHAR(10),
    FOREIGN KEY (maSP) REFERENCES SanPham(maSP),
    SLTon INT NOT NULL CHECK (SLTon >= 0),
    ngayNhap DATE NOT NULL DEFAULT CURRENT_DATE(),
    HSD DATE NOT NULL CHECK (HSD > ngayNhap),
    mota VARCHAR(255),
    maNCC CHAR(10),
    FOREIGN KEY (maNCC) REFERENCES NhaCungCap(maNCC),
    PRIMARY KEY (maSP)
);


CREATE TABLE NhanVien (
    maNV CHAR(10) PRIMARY KEY,
    tenNV VARCHAR(100),
    ngaySinh DATE ,
    SDT CHAR(10),
    diachi VARCHAR(100),
    email CHAR(50),
    ngayVL DATE,
    ChucVu VARCHAR(100)
);

CREATE TABLE LoaiKhachHang (
    maLKH CHAR(10) PRIMARY KEY,
    tenLKH VARCHAR(100)
);

CREATE TABLE KhachHang (
    SDT CHAR(10) PRIMARY KEY,
    tenKH VARCHAR(100),
    diachi VARCHAR(100),
    email CHAR(50) not null,
    maLKH CHAR(10) ,
    FOREIGN KEY (maLKH) REFERENCES LoaiKhachHang(maLKH)
);

CREATE TABLE TaiKhoanNV (
    maNV CHAR(10),
    FOREIGN KEY (maNV) REFERENCES NhanVien(maNV),
    passNV CHAR(10)
);

CREATE TABLE TaiKhoanKH (
	SDT CHAR(10) ,
    FOREIGN KEY (SDT)REFERENCES KhachHang(SDT),
    passKH CHAR(10)
);



CREATE TABLE HoaDon (
    maHD CHAR(10) PRIMARY KEY,
    NgayThanhToan DATE NOT NULL,
    TongTien DECIMAL(10,2) NOT NULL,
	SDT CHAR(10) ,
    FOREIGN KEY(SDT) REFERENCES KhachHang(SDT),
	maNV CHAR(10) ,
    FOREIGN KEY (maNV)REFERENCES NhanVien(maNV)
);



-- Bảng Chi Tiết Hóa Đơn
CREATE TABLE ChiTietHoaDon (
    maHD CHAR(10),
	FOREIGN KEY(MaHD) REFERENCES HoaDon(MaHD),
    maSP CHAR(10),
	FOREIGN KEY (MaSP)REFERENCES SanPham(MaSP),
    SoLuong INT NOT NULL,
    DonGia DECIMAL(10,2) NOT NULL,
    ThanhTien DECIMAL(10,2) NOT NULL,
    PRIMARY KEY (maHD, maSP)
);

-- Chèn dữ liệu vào bảng NhanVien
INSERT INTO NhanVien (maNV, tenNV, ngaySinh, SDT, diachi, email, ngayVL, ChucVu)
VALUES 
('NV001', N'Nguyễn Văn Anh','1990-05-15', '0123456789', N'123 Đường A, Hà Nội', 'nva@gmail.com','2022-03-01', N'Quản lý'),
('NV002', N'Lê Thị Bình','1985-09-22', '0987654321', N'456 Đường B, TP. Hồ Chí Minh', 'ltb@gmail.com','2021-07-10', N'Nhân viên bán hàng'),
('NV003', N'Phạm Văn Chung','1992-11-08', '0123344556', N'789 Đường C, Đà Nẵng', 'pvc@gmail.com','2023-01-15', N'Nhân viên bán hàng'),
('NV004', N'Trần Thị Dung','1988-04-30', '0988776655', N'101 Đường D, Cần Thơ', 'ttd@gmail.com','2022-09-01', N'Nhân viên bán hàng'),
('NV005', N'Hoàng Văn Em','1995-02-20', '0164556677', N'102 Đường E, Hải Phòng', 'hve@gmail.com','2023-04-01', N'Nhân viên trực tuyến'),
('AD001', 'Nguyễn Hoàng', '2003-09-14', '0961262347', 'TP.HCM', 'con@gmail.com', '2023-05-22', 'Admin');
-- Chèn dữ liệu vào bảng LoaiSanPham
INSERT INTO LoaiSanPham (maLSP, tenLSP)
VALUES
('LSP001', N'Bút viết'),
('LSP002', N'Văn phòng phẩm khác'),
('LSP003', N'Sách vở'),
('LSP004', N'Đồ dùng học sinh'),
('LSP005', N'Giấy và văn phòng phẩm'),
('LSP006', N'Máy tính và điện tử');

-- trước khi chạy hãy xóa hình ảnh trước nha 
-- Chèn dữ liệu vào bảng SanPham
INSERT INTO SanPham (maSP, maLSP, tenSP, DVT, dongia)
VALUES
('SP001', 'LSP001', N'Bút bi', N'Cái', 5000),
('SP002', 'LSP001', N'Bút chì', N'Cái', 3000),
('SP003', 'LSP004', N'Gôm', N'Cái', 2000),
('SP004', 'LSP003', N'Tập vở', N'Quyển', 15000),
('SP005', 'LSP004', N'Cặp', N'Cái', 7000),
('SP006', 'LSP004', N'Thước kẻ', N'Cái', 8000),
('SP007', 'LSP004', N'Kéo', N'Cái', 12000),
('SP008', 'LSP001', N'Bút dạ quang', N'Cái', 25000),
('SP009', 'LSP005', N'Giấy A4', N'Ream', 60000),
('SP010', 'LSP005', N'Giấy note', N'Tập', 10000),
('SP011', 'LSP004', N'Dập ghim', N'Cái', 20000),
('SP012', 'LSP004', N'Kẹp bướm', N'Cái', 5000),
('SP013', 'LSP002', N'Băng dính', N'Cái', 1000),
('SP014', 'LSP004', N'Hồ dán', N'Chai', 10000),
('SP015', 'LSP002', N'Khay đựng hồ sơ', N'Cái', 5000),
('SP016', 'LSP004', N'Mực', N'Lọ', 3000),
('SP017', 'LSP006', N'Máy tính Casio', N'Cái', 120000),
('SP018', 'LSP004', N'Gọt bút chì', N'Cái', 10000),
('SP019', 'LSP002', N'Phấn', N'Hộp', 8000),
('SP020', 'LSP001', N'Bút lông bảng', N'Cái', 15000);


INSERT INTO CTSanPham (maSP, SLTon, ngayNhap, HSD, mota, maNCC)
VALUES
('SP001', 100, '2024-01-31', '', N'Sản phẩm viết tay', 'NCC001'),
('SP002', 150, '2024-04-01', '', N'Sản phẩm viết tay', 'NCC002'),
('SP003', 200, '2024-03-02', '', N'Xóa mực viết mà không gây hại cho giấy', 'NCC003'),
('SP004', 80, '2024-03-03', '', N'Giấy là một vật liệu dùng để viết, in và bao bì.  ', 'NCC004'),
('SP005', 120, '2024-03-03', '', N'Balo đi học_ túi đựng sách vở', 'NCC005'),
('SP006', 180, '2024-06-05', '', N'Dụng cụ đo đạc và vẽ đồng thời.', 'NCC001'),
('SP007', 90, '2024-06-06', '', N'Dụng cụ được sử dụng để cắt giấy, vải...', 'NCC002'),
('SP008', 110, '2024-03-03', '2027-07-07', N'Sản phẩm viết tay', 'NCC003'),
('SP009', 70, '2024-01-31', '', N'Giấy là một vật liệu dùng để viết, in và bao bì. ', 'NCC004'),
('SP010', 50, '2024-04-09', '', N'Giấy là một vật liệu dùng để viết, in và bao bì. ', 'NCC005'),
('SP011', 100, '2024-03-03', '', N'Dập ghim là một dụng cụ được sử dụng để ghim chặt các tài liệu hoặc giấy lại với nhau bằng ghim kim.', 'NCC001'),
('SP012', 150, '2024-01-31', '', N'Dụng cụ được sử dụng để giữ chặt các tờ giấy lại với nhau mà không cần sử dụng ghim hoặc băng dính', 'NCC002'),
('SP013', 200, '2024-06-12', '', N'Băng dính là một dạng dính keo được gắn trên một cuộn hoặc trong một tấm dẻo', 'NCC003'),
('SP014', 80, '2024-06-13', '2026-07-13', N'Được sử dụng để dán giấy hoặc các vật liệu khác lại với nhau', 'NCC004'),
('SP015', 120, '2024-04-01', '', N'Dụng cụ hoặc bộ dụng cụ được sử dụng để sắp xếp và lưu trữ các tài liệu, hồ sơ ...', 'NCC005'),
('SP016', 180, '2024-06-15', '2028-07-15', N'Mực viết bút bi, bút chì, bút mực, hoặc mực in.', 'NCC001'),
('SP017', 90, '2024-01-31', '', N'Tính toán cơ bản, tính năng khoa học, đồng hồ, lịch, vv. ', 'NCC002'),
('SP018', 110, '2024-04-01', '', N'Gọt bút được sử dụng để làm sắc đầu bút và làm sạch các dấu vết trên bề mặt', 'NCC003'),
('SP019', 70, '2024-04-01', '2027-07-18', N'Phấn được sử dụng để xóa bỏ lỗi viết hoặc để tạo điểm nhấn trong các tác phẩm nghệ thuật và vẽ.', 'NCC004'),
('SP020', 50, '2024-03-03', '2028-07-19', N'Sản phẩm viết tay', 'NCC005');
-- Chèn dữ liệu vào bảng LoaiKhachHang
INSERT INTO LoaiKhachHang (maLKH, tenLKH)
VALUES
('LKH001', N'Khách hàng lẻ'),
('LKH002', N'Khách hàng tiềm năng'),
('LKH003', N'Khách hàng thân thiết');

INSERT INTO KhachHang (SDT, tenKH, diachi, email, maLKH)
VALUES
('0123456789', N'Nguyễn Thị Hằng', N'123 Đường G, Hà Nội', 'nth@gmail.com', 'LKH001'),
('0987654321', N'Phạm Văn Nam', N'456 Đường H, TP. Hồ Chí Minh', 'pvn@gmail.com', 'LKH001'),
('0123344556', N'Lê Thị An', N'789 Đường I, Đà Nẵng', 'lta@gmail.com', 'LKH003'),
('0988776655', N'Trần Văn Bình', N'101 Đường K, Cần Thơ', 'tvb@gmail.com', 'LKH001'),
('0164556677', N'Hoàng Thị Lan', N'102 Đường L, Hải Phòng', 'htl@gmail.com', 'LKH002');

-- Chèn dữ liệu vào bảng NhaCungCap
INSERT INTO NhaCungCap (maNCC, tenNCC, SDT, diachi) 
VALUES 
    ('NCC001', 'Công ty ABC', '0123456789', N'123 Đường ABC, Quận XYZ, Thành phố HCM'),
    ('NCC002', 'Công ty XYZ', '0987654321', N'456 Đường XYZ, Quận ABC, Thành phố HaNoi'),
    ('NCC003', 'Công ty DEF', '0123123456', N'789 Đường DEF, Quận GHI, Thành phố Da Nang'),
    ('NCC004', 'Công ty GHI', '0987987654', N'987 Đường GHI, Quận XYZ, Thành phố Hai Phong'),
    ('NCC005', 'Công ty KLM', '0123456789', N'654 Đường KLM, Quận PQR, Thành phố Can Tho');

--Chèn dữ liệu vào bảng Tài khoản Nhân Viên
INSERT INTO TaiKhoanNV (maNV, passNV)
VALUES
	('AD001', '111');
	('NV001', '123123'),
	('NV002', '111111'),
	('NV003', '123456'),
	('NV004', '222222'),
	('NV005', '456456');

INSERT INTO TaiKhoanKH (SDT, passKH)
VALUES
	('0123456789', 'asdfgh'),
	('0987654321', 'qwerty'),
	('0123344556', 'zxcvbn'),
	('0988776655', 'aaaaaa'),
	('0164556677', 'qqqqqq');

-- hóa đơn
INSERT INTO HoaDon (maHD, NgayThanhToan, TongTien, SDT, maNV)
VALUES
('HD36433', '2021-03-15', 10000.00, '0123456789', NULL),
('HD12346', '2022-06-30', 70000.00, NULL, 'NV001'),
('HD98766', '2023-01-01', 30000.00, '0987654321', NULL),
('HD54322', '2021-12-31', 45000.00, NULL, 'NV002'),
('HD67891', '2022-09-15', 50000.00, '0164556677', NULL),
('HD13580', '2023-05-01', 60000.00, NULL, 'NV003'),
('HD24681', '2021-04-20', 550000.00, '0123344556', NULL),
('HD86421', '2022-11-11', 80000.00, NULL, 'NV004'),
('HD75302', '2023-08-31', 90000.00, '0988776655', NULL),
('HD20407', '2021-07-01', 210000.00, NULL, 'NV005'),
('HD08163', '2022-02-14', 110000.00, NULL, 'NV006'),
('HD31416', '2023-10-31', 120000.00, NULL, 'NV001'),
('HD27183', '2021-09-30', 130000.00, NULL, 'NV002'),
('HD14143', '2022-05-15', 140000.00, NULL, 'NV003'),
('HD16181', '2023-03-31', 150000.00, NULL, 'NV004'),
('HD17322', '2021-11-30', 160000.00, NULL, 'NV005'),
('HD18433', '2022-08-01', 170000.00, NULL, 'NV006'),
('HD19544', '2023-06-30', 220000.00, NULL, 'NV001'),
('HD20655', '2021-02-28', 190000.00, NULL, 'NV002'),
('HD21766', '2022-12-15', 200000.00, NULL, 'NV003'),
('HD36434', '2021-03-15', 34000.00, '0123456789', NULL),
('HD12347', '2022-06-30', 20000.00, NULL, 'NV001'),
('HD98767', '2023-01-01', 30000.00, '0987654321', NULL),
('HD54323', '2021-12-31', 40000.00, NULL, 'NV002'),
('HD67892', '2022-09-15', 50000.00, '0164556677', NULL),
('HD13581', '2023-05-01', 60000.00, NULL, 'NV003'),
('HD24682', '2021-04-20', 70000.00, '0123344556', NULL),
('HD86422', '2022-11-11', 80000.00, NULL, 'NV004'),
('HD75303', '2023-08-31', 90000.00, '0988776655', NULL),
('HD20408', '2021-07-01', 100000.00, NULL, 'NV005'),
('HD08164', '2022-02-14', 110000.00, NULL, 'NV006'),
('HD31417', '2023-10-31', 120000.00, NULL, 'NV001'),
('HD27184', '2021-09-30', 130000.00, NULL, 'NV002'),
('HD14144', '2022-05-15', 420000.00, NULL, 'NV003'),
('HD16182', '2023-03-31', 150000.00, NULL, 'NV004'),
('HD17323', '2021-11-30', 160000.00, NULL, 'NV005'),
('HD18434', '2022-08-01', 170000.00, NULL, 'NV006'),
('HD19545', '2023-06-30', 320000.00, NULL, 'NV001'),
('HD20656', '2021-02-28', 190000.00, NULL, 'NV002'),
('HD21767', '2022-12-15', 200000.00, NULL, 'NV003'),
('HD22877', '2023-11-30', 210000.00, '0987654321', NULL),
('HD23988', '2021-05-01', 220000.00, NULL, 'NV004'),
('HD25099', '2022-03-15', 140000.00, '0123456789', NULL),
('HD26210', '2023-09-30', 240000.00, NULL, 'NV005'),
('HD27321', '2021-08-01', 130000.00, '0987654321', NULL),
('HD28432', '2022-10-15', 260000.00, NULL, 'NV006'),
('HD29543', '2023-04-30', 230000.00, '0123456789', NULL),
('HD30654', '2021-12-31', 310000.00, NULL, 'NV001'),
('HD31765', '2022-06-30', 290000.00, '0987654321', NULL),
('HD32876', '2023-08-15', 220000.00, NULL, 'NV002');

	Select* from NhanVien
	Select* from KhachHang
	Select* from LoaiKhachHang
	Select* from SanPham
	Select* from LoaiSanPham
	Select* from HoaDon
	Select* from ChiTietHoaDon
	Select* from NhaCungCap
	Select* from TaiKhoanNV
	Select* from TaiKhoanKH
	Select* from CTSanPham

