/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.BehavioralPattern.TemplateMethod.SortCollection;

import java.util.ArrayList;

/**
 *
 * @author TANLE
 */
public class TemplateMethodSortCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product product_1 = new Product("Dien thoai", 2000000, 2000);
        Product product_2 = new Product("Ti Vi", 6000000, 3000);
        Product product_3 = new Product("May Dieu Hoa", 1000000, 1000);
        
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(product_1);
        products.add(product_2);
        products.add(product_3);
        
        SortCollection sortByName = new SortProductByName();
        SortCollection sortByPrice = new SortProductByPrice();
        
        sortByName.sort(products);
        System.out.println("So sánh theo tên: " + products.toString());
        
        sortByPrice.sort(products);
        System.out.println("\n So sánh theo giá: " + products.toString());
    }
}
