/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.BehavioralPattern.ObserverPattern;

import java.util.Scanner;

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
        TiGia t = new TiGia(100);
        NhaDauTuA a = new NhaDauTuA();
        NhaDauTuB b = new  NhaDauTuB();
        a.dangKy(t);
        b.dangKy(t);
        while(true)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập khoảng thay đổi tỉ giá: ");
            float delta = 0;
            delta = scanner.nextFloat();
            t.thongBaoThayDoiTiGia(delta);
            System.out.print("Tiếp tục (y/n): ");
            String xacNhan = scanner.next();
            if(xacNhan.equalsIgnoreCase("n"))
                break;
        }
    }
    
}
