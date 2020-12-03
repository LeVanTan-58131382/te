/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.CreationalPatternsAbstract.Builder.BaiTap_1;

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
        Date ngayBan = new Date();
        
        HoaDon hoaDonHeader = new HoaDon.HoaDonHeader()
                .addMaHoaDon("HD01")
                .addtenKhachHang("Lê Văn Tân")
                .addngayBan(ngayBan)
                .buildHoaDonHeader();
        HoaDon hoaDonChiTiet = new HoaDon.CTHD()
                .addSanPham("Smart phone")
                .addSoLuong(3)
                .addDonGia(5000000)
                .addChietKhau(5)
                .buildCTHD();
        
        hoaDonHeader.InHoaDonHeader();
        hoaDonChiTiet.InCTHD();
    }
    
}
