/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import donaimModel.KhachHang;

import java.util.ArrayList;
import java.util.List;
import reponsitory.KhachHangRep;

/**
 *
 * @author natsu
 */
public class KhachHangSer {
    KhachHangRep khachHangRep;
    public KhachHangSer(){
        khachHangRep = new KhachHangRep();
    }
    
    public ArrayList<KhachHang> getAll(){
        return khachHangRep.getAll();
    }
    
    public KhachHang login(String taiKhoan, String matKhau){
        List<KhachHang> list = this.khachHangRep.getAll();
        for(KhachHang kh : list){
            if(kh.getTaiKhoan().equals(taiKhoan)){
                if(kh.getMatKhau().equals(matKhau)){
                    return kh;
                }
            }
        }
        return null;
    }
}
