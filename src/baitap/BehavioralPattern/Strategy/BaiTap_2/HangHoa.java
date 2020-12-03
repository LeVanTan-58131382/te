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
public class HangHoa {
    private String tenHH;
    private int gia;
    private String moTa;

    public HangHoa(String tenHH, int gia, String moTa) {
        this.tenHH = tenHH;
        this.gia = gia;
        this.moTa = moTa;
    }

    public HangHoa() {
    }

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    
    public void inThongTinHH(){
        System.out.println("Tên hàng hóa: " + this.getTenHH());
        System.out.println("Giá hàng hóa: " + this.getGia());
        System.out.println("Mô tả hàng hóa: " + this.getMoTa());
    }
}
