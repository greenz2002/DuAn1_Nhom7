/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reponsitory;

import donaimModel.NhanVien;
import java.sql.Connection;
import ulivity.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author natsu
 */
public class NhanVienRep {
    
    public ArrayList<NhanVien> getAll() {
        ArrayList<NhanVien> listNV = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sSQL = "select * from NhanVien";
            PreparedStatement sttm = conn.prepareStatement(sSQL);
            sttm.execute();
            ResultSet rs = sttm.getResultSet();
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setIdNV(rs.getString("IdNhanVien"));
                nv.setIdTrangThai(rs.getString("IdTrangThai"));
                nv.setTenNV(rs.getString("TenNV"));
                nv.setNgaySinh(rs.getDate("NgaySinh"));
                nv.setEmail(rs.getString("Email"));
                nv.setSDT(rs.getString("SDT"));
                nv.setDiaChi(rs.getString("DiaChi"));
                nv.setChucVu(rs.getString("ChucVu"));
                nv.setGioiTinh(rs.getString("GioiTinh"));
                nv.setTaiKhoan(rs.getString("TK"));
                nv.setMatKhau(rs.getString("MK"));
                listNV.add(nv);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listNV;
    }
    
    
    
    public NhanVien login(String taiKhoan, String matKhau, String chucVu){
        NhanVien nv = new NhanVien();
        Connection c = DBContext.getConnection();
        String sql = "select * from NHANVIEN where TK=? and MK = ?";
        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, taiKhoan);
            ps.setString(2, matKhau);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                nv = new NhanVien(rs.getString("TK"), rs.getString("MK"), rs.getString("ChucVu"));
            }
        } catch (Exception e) {
        }
        return nv;
    }
}    


      