/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.BehavioralPattern.Strategy.BaiTap_2;

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
        GioHang giohang_1 = new GioHang();
        GioHang giohang_2 = new GioHang();
        
        HangHoa hanghoa_1 = new HangHoa("Sách lập trình", 200000, "Đây là sách lập trình mới nhất.");
        HangHoa hanghoa_2 = new HangHoa("Quần áo thể thao", 1000000, "Đây là những bộ quần áo style mới nhất.");
        HangHoa hanghoa_3 = new HangHoa("IPhone 10", 1000000, "Mẫu điện thoại iphone đắt tiền nhất.");
        
        HangHoa hanghoa_4 = new HangHoa("Đồ chơi trẻ em", 100000, "Đồ chơi an toàn cho trẻ em");
        HangHoa hanghoa_5 = new HangHoa("Bộ công cụ microsoft office 2016", 300000, "Bộ công cụ mạnh mẽ cho người làm văn phòng");
        HangHoa hanghoa_6 = new HangHoa("Ti vi SamSung", 500000, "Thiết kế hiện đại, thông minh");
        
        giohang_1.themHangHoa(hanghoa_1);
        giohang_1.themHangHoa(hanghoa_2);
        giohang_1.themHangHoa(hanghoa_3);
        
        giohang_2.themHangHoa(hanghoa_4);
        giohang_2.themHangHoa(hanghoa_5);
        giohang_2.themHangHoa(hanghoa_6);
        
        // in thông tin của giỏ hàng 1
        System.out.println("Thông tin của danh sách các hàng hóa có trong giỏ hàng 1 là");
        giohang_1.inThongTinDSHH();
        
        System.out.println("Tổng tiền hàng của giỏ hàng 1 1à: " + giohang_1.tongTienHang());
        System.out.println("Tổng tiền người mua phải trả cho giỏ hàng 1 nếu thanh toán COD là: " + giohang_1.thanhToan(new ThanhToanCOD(), giohang_1.tongTienHang()));
        System.out.println("Tổng tiền người mua phải trả cho giỏ hàng 1 nếu thanh toán online là: " + giohang_1.thanhToan(new ThanhToanOnline(), giohang_1.tongTienHang()));
        System.out.println("----------------------------------------------------");
        // in thông tin của giỏ hàng 2
        System.out.println("Thông tin của danh sách các hàng hóa có trong giỏ hàng 2 là");
        giohang_2.inThongTinDSHH();
        
        System.out.println("Tổng tiền hàng của giỏ hàng 2 1à: " + giohang_2.tongTienHang());
        System.out.println("Tổng tiền người mua phải trả cho giỏ hàng 2 nếu thanh toán COD là: " + giohang_2.thanhToan(new ThanhToanCOD(), giohang_2.tongTienHang()));
        System.out.println("Tổng tiền người mua phải trả cho giỏ hàng 2 nếu thanh toán online là: " + giohang_2.thanhToan(new ThanhToanOnline(), giohang_2.tongTienHang()));
    }
    
}
