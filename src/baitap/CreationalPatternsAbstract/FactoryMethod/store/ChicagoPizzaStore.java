/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.CreationalPatternsAbstract.FactoryMethod.store;

import baitap.CreationalPatternsAbstract.FactoryMethod.pizza.Pizza;
import baitap.CreationalPatternsAbstract.FactoryMethod.pizza.PizzaType;
import baitap.CreationalPatternsAbstract.FactoryMethod.pizza.chicago.ChicagoCheeseStyle;
import baitap.CreationalPatternsAbstract.FactoryMethod.pizza.chicago.ChicagoClamStyle;
import baitap.CreationalPatternsAbstract.FactoryMethod.pizza.chicago.ChicagoPepperoniStyle;

/**
 *
 * @author TANLE
 */
public class ChicagoPizzaStore extends PizzaStore
{

    @Override
    protected Pizza createPizza(PizzaType type)
    {
        switch(type)
        {
            case cheese: return new ChicagoCheeseStyle();
            case clam: return new ChicagoClamStyle();
            case pepperoni: return new ChicagoPepperoniStyle();
        }  
        return null;
    }
    
}
