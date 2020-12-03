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
public class SortProductByName extends SortCollection<Product>{

    @Override
    protected int compare(Product t1, Product t2) {
        int sosanh = (t1.getName()).compareTo(t2.getName());
        if(sosanh > 0){
            // tên product 1 lớn hơn tên product 2
            return 1;
        }
        else if(sosanh < 0){
            // tên product 1 nhỏ hơn tên product 2
            return -1;
        }
        else return 0; // tên product 1 bằng tên product 2
    }
}

