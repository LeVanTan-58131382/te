/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.BehavioralPattern.TemplateMethod.SortCollection;

/**
 *
 * @author TANLE
 */
public class SortProductByPrice extends SortCollection<Product>{

    @Override
    protected int compare(Product t1, Product t2) {
        if( t1.getPrice() > t2.getPrice()){
            return 1;
        }
        if( t1.getPrice() < t2.getPrice()){
            return -1; 
        }
        else return 0;
    }
}
