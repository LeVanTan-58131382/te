/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Observer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ATM atm = new ATM();
        Taikhoan Thai = new Taikhoan(500);
        Thai.dangnhap(atm);
        
        System.out.println("Số dư trong tài khoản: " + Thai.getSodu());
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n Nhập số tiền cần rút: ");
        int tien= 0;
        tien = scanner.nextInt();
        atm.ruttien(tien);
    }
    
}
