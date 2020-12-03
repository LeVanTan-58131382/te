/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.CreationalPatternsAbstract.Builder.BaiTap_3;

/**
 *
 * @author TANLE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShapeFactory recangle = new ShapeFactory();
        recangle.createShape(ShapeType.recangle);
        System.out.println(recangle.createShape(ShapeType.recangle).draw());
        
        ShapeFactory triangle = new ShapeFactory();
        triangle.createShape(ShapeType.triangle);
        System.out.println(triangle.createShape(ShapeType.triangle).draw());
        
        ShapeFactory circle = new ShapeFactory();
        circle.createShape(ShapeType.circle);
        System.out.println(circle.createShape(ShapeType.circle).draw());
    }
    
}
