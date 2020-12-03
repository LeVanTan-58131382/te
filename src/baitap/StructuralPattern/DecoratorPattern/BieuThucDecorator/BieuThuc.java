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
public abstract class BieuThuc {
    
    StringBuilder stringBuilder = new StringBuilder();
    
    public abstract float giaTri();
    public String bieuThuc(){
        return stringBuilder.toString();
    }
}
