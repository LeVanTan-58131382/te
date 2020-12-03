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
public class TemplateMethodCaffeineBeverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CaffeineBeverage coffee = new Coffee();
       CaffeineBeverage tea = new Tea();
       
       System.out.println("Cách pha cà phê: \n");
       coffee.prepareRecipe();
       
       System.out.println("\nCách pha trà: \n");
       tea.prepareRecipe();
       
    }
    
}
