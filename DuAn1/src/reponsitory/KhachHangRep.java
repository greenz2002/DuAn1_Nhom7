/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reponsitory;

import donaimModel.KhachHang;
import donaimModel.NhanVien;
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
public class KhachHangRep {
    public ArrayList<KhachHang> getAll() {
        ArrayList<KhachHang> list = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sSQL = "select * from NGUOIDUNG";
            PreparedStatement sttm = conn.prepareStatement(sSQL);
            sttm.execute();
            ResultSet rs = sttm.getResultSet();
            while (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setIdKH(rs.getString("IdNguoiDung"));
                kh.setTenKH(rs.getString("TenND"));
                kh.setNgaySinh(rs.getDate("NgaySinh"));
                kh.setEmail(rs.getString("Email"));
                kh.setSDT(rs.getString("SDT"));
                kh.setDiaChi(rs.getString("DiaChi"));
                kh.setGioiTinh(rs.getString("GioiTinh"));
                kh.setTaiKhoan(rs.getString("TK"));
                kh.setMatKhau(rs.getString("MK"));
                list.add(kh);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
    public KhachHang login(String taiKhoan, String matKhau){
        KhachHang kh = new KhachHang();
        Connection c = DBContext.getConnection();
        String sql = "select * from NGUOIDUNG where TK=? and MK = ?";
        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, taiKhoan);
            ps.setString(2, matKhau);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                kh = new KhachHang(rs.getString("TK"),rs.getString("MK"));
            }
        } catch (Exception e) {
        }
        return kh;
    }
}
