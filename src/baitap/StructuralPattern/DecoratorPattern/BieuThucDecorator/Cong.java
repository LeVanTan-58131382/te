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
public class Cong extends BieuThucDecorator {
    private int toanHang;

    public Cong(int toanHang, BieuThuc bieuthuc) {
        super(bieuthuc);
        this.toanHang = toanHang;
    }
    
    

    @Override
    public String bieuThuc() {
        return bieuthuc.bieuThuc() + "+";
    }

    @Override
    public float giaTri() {
        return bieuthuc.giaTri()+toanHang;
    }
    
}
