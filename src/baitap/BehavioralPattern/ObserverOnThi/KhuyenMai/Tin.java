/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.BehavioralPattern.ObserverOnThi.KhuyenMai;

/**
 *
 * @author TANLE
 */
public class Tin {
    String matin;
    String tenmh;
    int giaban;
    String ngaybdkm, ngayktkm;

    public Tin(String matin, String tenmh, int giaban, String ngaybdkm, String ngayktkm) {
        this.matin = matin;
        this.tenmh = tenmh;
        this.giaban = giaban;
        this.ngaybdkm = ngaybdkm;
        this.ngayktkm = ngayktkm;
    }

    public String getMatin() {
        return matin;
    }

    public void setMatin(String matin) {
        this.matin = matin;
    }

    public String getTenmh() {
        return tenmh;
    }

    public void setTenmh(String tenmh) {
        this.tenmh = tenmh;
    }

    public int getGiaban() {
        return giaban;
    }

    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }

    public String getNgaybdkm() {
        return ngaybdkm;
    }

    public void setNgaybdkm(String ngaybdkm) {
        this.ngaybdkm = ngaybdkm;
    }

    public String getNgayktkm() {
        return ngayktkm;
    }

    public void setNgayktkm(String ngayktkm) {
        this.ngayktkm = ngayktkm;
    }
}
