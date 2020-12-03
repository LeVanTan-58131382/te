/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.BehavioralPattern.Strategy.BaiTap_3;

import java.util.ArrayList;

/**
 *
 * @author TANLE
 */
public class QLSV {
    ArrayList<SinhVien> sinhviens;
    ISoSanh<SinhVien> iSoSanh;

    public void setSoSanh(ISoSanh<SinhVien> iSoSanh) {
        this.iSoSanh = iSoSanh;
    }
    
    public QLSV() {
        this.sinhviens = new ArrayList<SinhVien>();
    }
    
    public void themSV(SinhVien sv){
        sinhviens.add(sv);
    }
    
    public void sapXep(){
        for(int i = 0; i < sinhviens.size() - 1; i++)
            for(int j = i+1; j < sinhviens.size(); j++)
                if((this.iSoSanh.soSanh(sinhviens.get(i), sinhviens.get(j))) == 1)
                     doiViTri(sinhviens.get(i), sinhviens.get(j));
      
    }
    
    public void doiViTri(SinhVien sv1, SinhVien sv2){
        SinhVien temp = new SinhVien();
        temp.setHoTen(sv1.getHoTen());
        temp.setNgaySinh(sv1.getNgaySinh());
        temp.setDiemTB(sv1.getDiemTB());
        
        sv1.setHoTen(sv2.getHoTen());
        sv1.setNgaySinh(sv2.getNgaySinh());
        sv1.setDiemTB(sv2.getDiemTB());

        // thay thông tin của sinh viên thứ i+1 bằng temp
        sv2.setHoTen(temp.getHoTen());
        sv2.setNgaySinh(temp.getNgaySinh());
        sv2.setDiemTB(temp.getDiemTB());
    }
    
    public void inDS(){
      for(int i = 0; i < sinhviens.size(); i++){
          sinhviens.get(i).inThongTinSV();
      }  
    }
}