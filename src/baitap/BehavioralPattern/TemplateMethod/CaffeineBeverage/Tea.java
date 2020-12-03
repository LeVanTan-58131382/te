/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.BehavioralPattern.TemplateMethod.CaffeineBeverage;

/**
 *
 * @author TANLE
 */
public class Tea extends CaffeineBeverage{

    @Override
    public void brew() {
        System.out.println("Ngâm trà với nước sôi");
    }

    @Override
    public void addCondiments() {
        System.out.println("Thêm chanh");
    }
    
}
