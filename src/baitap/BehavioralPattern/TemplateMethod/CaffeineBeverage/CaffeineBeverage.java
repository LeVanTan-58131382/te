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
public abstract class CaffeineBeverage {
    public void prepareRecipe(){
        boilWater();
        pourInCup();
        brew();
        addCondiments();
    }
    
    public void boilWater(){
        System.out.println("Đun sôi nước lên");
    }
    
    public void pourInCup(){
        System.out.println("Đổ vào cốc");
    }
    
    public abstract void brew();
    public abstract void addCondiments();
    
}
