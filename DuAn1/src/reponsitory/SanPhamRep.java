/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reponsitory;

import donaimModel.SanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import ulivity.DBContext;

/**
 *
 * @author natsu
 */
public class SanPhamRep {

    public ArrayList<SanPham> getAll() {
        ArrayList<SanPham> list = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sSQL = "select IdChiTietSanPham, SANPHAM.IdSp,CHITIETSANPHAM.TenSp,THELOAI.TenTheLoai,MauSac,KichCo,SoLuong,TRANGTHAISANPHAM.TenTrangThai,CHITIETSANPHAM.GiaBan, CHITIETSANPHAM.GiaNhap from CHITIETSANPHAM \n"
                    + "		join SANPHAM on CHITIETSANPHAM.IdSp = SANPHAM.IdSp\n"
                    + "		join TRANGTHAISANPHAM on CHITIETSANPHAM.IdTrangThai = TRANGTHAISANPHAM.IdTrangThai\n"
                    + "		join THELOAI on CHITIETSANPHAM.IdTheLoai = THELOAI.IdTheLoai";
            PreparedStatement sttm = conn.prepareStatement(sSQL);
            sttm.execute();
            ResultSet rs = sttm.getResultSet();
            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setIdSP(rs.getString("IdChiTietSanPham"));
                sp.setTenSP(rs.getString("TenSp"));
                sp.setTheLoai(rs.getString("TenTheLoai"));
                sp.setKichCo(rs.getString("KichCo"));
                sp.setMauSac(rs.getString("MauSac"));
                sp.setSoLuong(rs.getInt("SoLuong"));
                sp.setTrangThaiSP(rs.getString("TenTrangThai"));
                sp.setGiaBan(rs.getDouble("GiaBan"));
                sp.setGiaNhap(rs.getDouble("GiaNhap"));
                list.add(sp);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
}
