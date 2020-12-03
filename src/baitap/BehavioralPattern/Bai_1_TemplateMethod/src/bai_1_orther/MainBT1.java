/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

import java.util.ArrayList;
import static java.util.Collections.list;

/**
 *
 * @author admin
 */
public class MainBT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(123, "Nguyen Van Dong", "15-06-1994", "Nha Trang");
        SinhVien sv2 = new SinhVien(456, "Le Thi Hong", "30-05-1994", "Thanh Hoa");
        SinhVien sv3 = new SinhVien(789, "Le Thi Tham", "25-12-1996", "Nghe An");
        MonHoc mh1 = new MonHoc(455, "Co So Du Lieu", 3);
        MonHoc mh2 = new MonHoc(889, "Lap Trinh C++", 3);
        ArrayList<SinhVien> list1 ;
        EntityDB sinhvien = new SinhVienDB(list1);
        sinhvien.add(sv1);
        sinhvien.update(sv2);
        sinhvien.delete(sv1);
        sinhvien.add(sv3);
        sinhvien.deleteByKey(789);
        for(int i  = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i).tenSV);
        }
        // TODO code application logic here
    }
    
}
