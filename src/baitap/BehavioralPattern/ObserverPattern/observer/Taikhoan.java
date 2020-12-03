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
public class Taikhoan implements ATM.observer{
    int sodu;

    public Taikhoan(int sodu) {
        this.sodu = sodu;
    }

    public int getSodu() {
        return sodu;
    }

    public void setSodu(int sodu) {
        this.sodu = sodu;
    }
    
    
    
    public void dangnhap(ATM t)
    {
        t.nhandangnhap(this);
    }
    
    @Override
    public boolean kiemtrasodu(int tien) {
        return tien < this.sodu;
    }

    @Override
    public void nhanthongbao(int tien) {
        if(kiemtrasodu(tien))
        {
            System.out.println("Được phép rút tiền");
            this.sodu -= tien;
            System.out.println("Số tiền còn lại: " + this.sodu);
        }
        else
            System.out.println("Số tiền còn lại không đủ!");
        
    }
    
}
