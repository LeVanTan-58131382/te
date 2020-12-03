/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_1_templatemethod;

import java.util.Date;

/**
 *
 * @author TANLE
 */
public class SinhVien{
    int maSV;
    String tenSV;
    Date ngaySinh;
    String queQuan;

    public SinhVien(int maSV, String tenSV, Date ngaySinh, String queQuan) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    public int getMaSV() {
        return maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", tenSV=" + tenSV + ", ngaySinh=" + ngaySinh + ", queQuan=" + queQuan + '}';
    }
    
    
}
