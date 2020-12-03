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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Tin> tinkm = new ArrayList<>();
        tinkm.add(new Tin("001", "khuyến mãi 1", 100000, "01/08/2020","03/08/2020"));
        tinkm.add(new Tin("002", "khuyến mãi 2", 200000, "01/08/2020","03/08/2020"));
        tinkm.add(new Tin("003", "khuyến mãi 3", 300000, "01/08/2020","03/08/2020"));
        KhuyenMai km = new KhuyenMai();
        
        KhachHang kh = new KhachHang();
        
        kh.dangky(km);
        
        km.taotinkhuyenmai(tinkm);
        
        System.out.println("Thông tin khuyến mãi sau khi cập nhật: \n");
        
        km.capnhattin(new Tin("004", "khuyến mãi 4", 400000, "01/08/2020","03/08/2020"));
    }
    
}
