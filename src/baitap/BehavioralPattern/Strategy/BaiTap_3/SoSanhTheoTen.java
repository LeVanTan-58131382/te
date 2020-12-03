/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.BehavioralPattern.Strategy.BaiTap_3;

/**
 *
 * @author TANLE
 */
public class SoSanhTheoTen implements ISoSanh<SinhVien>{

    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        int sosanh = (o1.getHoTen()).compareTo(o2.getHoTen());
        if(sosanh > 0){
            // họ tên sinh viên 1 lớn hơn tên sinh viên 2
            return 1;
        }
        else if(sosanh < 0){
            // họ tên sinh viên 1 bé hơn tên sinh viên 2
            return -1;
        }
        else return 0; // tên sinh viên 1 bằng tên sinh viên 2
    }
    
}
