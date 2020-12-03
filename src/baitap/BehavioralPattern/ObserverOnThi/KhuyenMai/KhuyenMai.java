/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.BehavioralPattern.ObserverOnThi.KhuyenMai;

import java.util.ArrayList;

/**
 *
 * @author TANLE
 */
public class KhuyenMai {
    observer khachhang;
    ArrayList<Tin> listinfo = new ArrayList<>();

    public ArrayList<Tin> getListinfo() {
        return listinfo;
    }
    
    public void nhandangky(observer khachhang)
    {
        this.khachhang = khachhang;
    }
    
    public void taotinkhuyenmai(ArrayList<Tin> listinfo) {
        this.listinfo = listinfo;
        khachhang.nhanthongtin(listinfo);
    }
    
    public void capnhattin(Tin capnhat)
    {
        this.listinfo.add(capnhat);
        khachhang.capnhatthongtin();
    }
    
    public static interface observer
    {
        public void nhanthongtin(ArrayList<Tin> nhan);
        public void capnhatthongtin();
    }
}
