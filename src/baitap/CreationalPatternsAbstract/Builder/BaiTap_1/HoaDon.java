/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.CreationalPatternsAbstract.Builder.BaiTap_1;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author TANLE
 */
public class HoaDon {
    
    HoaDonHeader hoaDonHeader;
    CTHD cthd;

    public HoaDon(HoaDonHeader hoaDonHeader) {
        this.hoaDonHeader = hoaDonHeader;
    }

    public HoaDon(CTHD cthd) {
        this.cthd = cthd;
    }
    
    public void InHoaDonHeader(){
        System.out.println("Header của hóa đơn: " + "\n");
    
        System.out.println("Mã hóa đơn: " + hoaDonHeader.maHoaDon + "\n"
                           + "Tên khách hàng: " + hoaDonHeader.tenKhachHang + "\n"
                           + "Ngày bán:" + hoaDonHeader.ngayBan + "\n"
            );}
    public void InCTHD(){
        System.out.println("Chi tiết của hóa đơn: " + "\n");
        System.out.println("Tên sản phẩm, Số lượng, Đơn giá và Chiết khấu của Hóa đơn lần lượt là: ");
        for(int i = 0; i < cthd.myCTHD.size(); i++)
            {
               System.out.println(cthd.myCTHD.get(i));
            }
    }

    public static class HoaDonHeader{
        String maHoaDon, tenKhachHang;
        Date ngayBan;

        public HoaDonHeader() { 
        }
        
        
        
        public HoaDonHeader addMaHoaDon(String maHoaDon){
            this.maHoaDon = maHoaDon;
            return this;
        }
        public HoaDonHeader addtenKhachHang(String tenKhachHang){
            this.tenKhachHang = tenKhachHang;
            return this;
        }
        public HoaDonHeader addngayBan(Date ngayBan){
            this.ngayBan = ngayBan;
            return this;
        }
        
        public HoaDon buildHoaDonHeader()
        {
            return new HoaDon(this);
        }

    }
    
    public static class CTHD{
        String sanPham;
        int soLuong;
        float donGia, chietKhau;
        ArrayList myCTHD = new ArrayList();

        public CTHD() {
        }
        
        public CTHD addSanPham(String sanPham){
            myCTHD.add(sanPham);
            return this;
        }
        public CTHD addChietKhau(float chietKhau){
            myCTHD.add(chietKhau);
            return this;
        }
        public CTHD addSoLuong(int soLuong){
            myCTHD.add(soLuong);
            return this;
        }
        public CTHD addDonGia(float donGia){
            myCTHD.add(donGia);
            return this;
        }
        
        public HoaDon buildCTHD()
        {
            return new HoaDon(this);
        }
    }
}
