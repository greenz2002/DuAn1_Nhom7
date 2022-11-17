/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import donaimModel.NhanVien;
import java.util.ArrayList;
import java.util.List;
import reponsitory.NhanVienRep;

/**
 *
 * @author natsu
 */
public class NhanVienSer {
    NhanVienRep nhanVienRep;
     
    public NhanVienSer(){
        nhanVienRep = new NhanVienRep();
    }
   
    public ArrayList<NhanVien> getAll(){
        return nhanVienRep.getAll();
    }
    
    public NhanVien login(String taiKhoan, String matKhau){
        List<NhanVien> list = this.nhanVienRep.getAll();
        for(NhanVien nv : list){
            if(nv.getTaiKhoan().equals(taiKhoan)){
                if(nv.getMatKhau().equals(matKhau)){
                    return nv;
                }
            }
        }
        return null;
    }
}
