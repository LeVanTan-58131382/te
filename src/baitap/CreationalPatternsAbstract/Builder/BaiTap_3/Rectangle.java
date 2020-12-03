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
public class Rectangle extends Shape{

    private static Rectangle instance;
    
    protected Rectangle(){
        
    }
    
    public static Rectangle Instance(){
        if(instance == null)
            instance = new Rectangle();
        return instance;
    }
    @Override
    public String draw() {
        return "Vẽ Hình Chữ Nhật";
    }
    
}
