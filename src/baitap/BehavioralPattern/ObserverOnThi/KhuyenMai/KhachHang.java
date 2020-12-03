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
public class KhachHang implements KhuyenMai.observer{
    
    ArrayList<Tin> listinfo = new ArrayList<>();
    
    public void dangky(KhuyenMai k)
    {
        k.nhandangky(this);
    }

    @Override
    public void nhanthongtin(ArrayList<Tin> nhan) {
        this.listinfo = nhan;
        System.out.println("Danh sách tin khuyến mãi: \n");
        for(Tin t: listinfo)
        {
            System.out.println("Mã tin: " + t.getMatin() + ", tên: " + t.getTenmh() + ", giá:  " +t.getGiaban()
            + "\n từ ngày:  " + t.getNgaybdkm() + ", đến ngày: " + t.getNgayktkm() + "\n");
        }
    }

    @Override
    public void capnhatthongtin() {
        nhanthongtin(listinfo);
    }
}
