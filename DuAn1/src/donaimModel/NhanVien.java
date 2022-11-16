/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package donaimModel;

import java.util.Date;

/**
 *
 * @author natsu
 */
public class NhanVien {
    private String idNV,idTrangThai,tenNV;
    private Date ngaySinh;
    private String email,SDT,diaChi,chucVu,gioiTinh,taiKhoan,matKhau;

    public NhanVien() {
    }

    public NhanVien(String idNV, String idTrangThai, String tenNV, Date ngaySinh, String email, String SDT, String diaChi, String chucVu, String gioiTinh, String taiKhoan, String matKhau) {
        this.idNV = idNV;
        this.idTrangThai = idTrangThai;
        this.tenNV = tenNV;
        this.ngaySinh = ngaySinh;
        this.email = email;
        this.SDT = SDT;
        this.diaChi = diaChi;
        this.chucVu = chucVu;
        this.gioiTinh = gioiTinh;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
    }

    public NhanVien(String chucVu, String taiKhoan, String matKhau) {
        this.chucVu = chucVu;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
    }
    public String getIdNV() {
        return idNV;
    }

    public void setIdNV(String idNV) {
        this.idNV = idNV;
    }

    public String getIdTrangThai() {
        return idTrangThai;
    }

    public void setIdTrangThai(String idTrangThai) {
        this.idTrangThai = idTrangThai;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    
}
