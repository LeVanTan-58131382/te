/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.StructuralPattern.DecoratorPattern.BieuThucDecorator;

/**
 *
 * @author TANLE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BieuThuc bieuThuc = new BieuThucDonGian(50);
        bieuThuc = new Chia(2, bieuThuc);
        System.out.println(bieuThuc.bieuThuc()+ " 2 = " + bieuThuc.giaTri());
    }
    
}
