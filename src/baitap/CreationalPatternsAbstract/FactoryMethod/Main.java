/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.CreationalPatternsAbstract.FactoryMethod;

import baitap.CreationalPatternsAbstract.FactoryMethod.pizza.Pizza;
import baitap.CreationalPatternsAbstract.FactoryMethod.pizza.PizzaType;
import baitap.CreationalPatternsAbstract.FactoryMethod.store.ChicagoPizzaStore;
import baitap.CreationalPatternsAbstract.FactoryMethod.store.NYPizzaStore;
import baitap.CreationalPatternsAbstract.FactoryMethod.store.PizzaStore;

/**
 *
 * @author TANLE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        PizzaStore store = new ChicagoPizzaStore();
        Pizza pizza = store.orderPizza(PizzaType.cheese);
        System.out.println(pizza.toString());
        
        PizzaStore nYStore = new NYPizzaStore();
        Pizza pizza1 = nYStore.orderPizza(PizzaType.clam);
        System.out.println(pizza1.toString());
    }
    
}
