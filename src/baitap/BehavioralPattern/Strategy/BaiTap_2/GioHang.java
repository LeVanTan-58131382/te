/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.BehavioralPattern.Strategy.BaiTap_2;

import java.util.ArrayList;

/**
 *
 * @author TANLE
 */
public class GioHang {
    ArrayList<HangHoa> hangHoas;

    public GioHang() {
        this.hangHoas = new ArrayList<HangHoa>();
    }
    
    public void themHangHoa(HangHoa hangHoa){
        this.hangHoas.add(hangHoa);
    }
    
    // hàm in thông tin danh sách hàng hóa
    public void inThongTinDSHH(){
    for(int i = 0; i < hangHoas.size(); i++){
        hangHoas.get(i).inThongTinHH();
        }
    }
    
     //hàm tính tổng tiền các hàng hóa trong giỏ hàng
    public int tongTienHang(){
        int tongtienHang = 0;
        for(int i = 0; i < hangHoas.size(); i++){
            tongtienHang += hangHoas.get(i).getGia();
        }
        return tongtienHang;
    }
    
    
    public double thanhToan(IThanhToan hinhThucTT, int tongTienHang){
        return hinhThucTT.thanhToan(tongTienHang);
    } 
    
    
}

