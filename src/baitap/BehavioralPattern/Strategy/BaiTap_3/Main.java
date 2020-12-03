/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.BehavioralPattern.Strategy.BaiTap_3;

import java.util.Date;

/**
 *
 * @author TANLE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date ngaysinh = new Date();
        SinhVien sv_1 = new SinhVien("Nguyễn Thị Hiền",ngaysinh , 7);
        SinhVien sv_2 = new SinhVien("Lê Văn Tiến",ngaysinh , 6);
        SinhVien sv_3 = new SinhVien("Nguyễn Khắc Cường",ngaysinh , 5);
        SinhVien sv_4 = new SinhVien("Trần Hoài Nam",ngaysinh , 9);
        SinhVien sv_5 = new SinhVien("Bùi Văn Nguyên",ngaysinh , 8);
        
        QLSV quanlysinhvien = new QLSV();
        quanlysinhvien.themSV(sv_1);
        quanlysinhvien.themSV(sv_2);
        quanlysinhvien.themSV(sv_3);
        quanlysinhvien.themSV(sv_4);
        quanlysinhvien.themSV(sv_5);
      
        
        System.out.println("Danh sách sinh viên sắp xếp theo Họ sinh viên: ");
        quanlysinhvien.setSoSanh(new SoSanhTheoTen());
        quanlysinhvien.sapXep();
        quanlysinhvien.inDS();
        
        System.out.println("-------------------------------------");
        
        
        System.out.println("Danh sách sinh viên sắp xếp theo điểm: ");
        quanlysinhvien.setSoSanh(new SoSanhTheoDiem());
        quanlysinhvien.sapXep();
        quanlysinhvien.inDS();
        
    }
    
}
