/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package donaimModel;

/**
 *
 * @author natsu
 */
public class SanPham {
    private String idSP, tenSP, theLoai;
    private Integer soLuong; 
    private Double giaNhap;
    private String mauSac, kichCo, trangThaiSP;
    private Double giaBan;

    public SanPham() {
    }

    public SanPham(String idSP, String tenSP, String theLoai, Integer soLuong, Double giaNhap, String mauSac, String kichCo, String trangThaiSP, Double giaBan) {
        this.idSP = idSP;
        this.tenSP = tenSP;
        this.theLoai = theLoai;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
        this.mauSac = mauSac;
        this.kichCo = kichCo;
        this.trangThaiSP = trangThaiSP;
        this.giaBan = giaBan;
    }

    public String getIdSP() {
        return idSP;
    }

    public void setIdSP(String idSP) {
        this.idSP = idSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(Double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getKichCo() {
        return kichCo;
    }

    public void setKichCo(String kichCo) {
        this.kichCo = kichCo;
    }

    public String getTrangThaiSP() {
        return trangThaiSP;
    }

    public void setTrangThaiSP(String trangThaiSP) {
        this.trangThaiSP = trangThaiSP;
    }

    public Double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Double giaBan) {
        this.giaBan = giaBan;
    }
    
}
