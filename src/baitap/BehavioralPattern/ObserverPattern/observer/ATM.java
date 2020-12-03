/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author DELL
 */
public class ATM {
    observer taikhoan;

    public ATM() {
    }

    void nhandangnhap(Taikhoan aThis) {
        this.taikhoan = aThis;
    }
    
    public boolean kiemtraruttien(Taikhoan taikhoan)
    {
        return taikhoan.getSodu()>200;
    }
    
    public void ruttien(int tien)
    {
        if(kiemtraruttien((Taikhoan) taikhoan))
            taikhoan.nhanthongbao(tien);
        else
            System.out.println("Tài khoản còn ít tiền quá!");
            
    }
    
    public static interface observer
    {
        public boolean kiemtrasodu(int tien);
        public void nhanthongbao(int tien);
    }
}
