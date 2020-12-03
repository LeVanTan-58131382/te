/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.CreationalPatternsAbstract.Builder.BaiTap_2;

/**
 *
 * @author TANLE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyStringBuilder myStringBuilder = new MyStringBuilder.Builder()
                .addString("tan")
                .addFloat(22)
                .addBool(true)
                .build();
        System.out.println(myStringBuilder.toString());
    }
}
