/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import donaimModel.SanPham;
import java.util.ArrayList;
import java.util.List;
import reponsitory.SanPhamRep;

/**
 *
 * @author natsu
 */
public class SanPhamSer {
    SanPhamRep sanPhamRep;
    public SanPhamSer(){
        this.sanPhamRep = new SanPhamRep();
    }
    public ArrayList<SanPham> getAll(){
        return sanPhamRep.getAll();
    }
}
