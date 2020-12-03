/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.BehavioralPattern.Strategy.BaiTap_1;

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
        Context context = new Context();
        context.setTinhToan(new Cong());
        System.out.println("Kết quả của phép cộng 75 + 12 là: " + context.tinh(75,12));
  
        Context context2 = new Context();
        context2.setTinhToan(new Tru());
        System.out.println("Kết quả của phép trừ 54 - 78 là: " + context2.tinh(54, 78));
        
        
    }
    
}
