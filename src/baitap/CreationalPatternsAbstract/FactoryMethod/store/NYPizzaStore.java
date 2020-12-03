/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.CreationalPatternsAbstract.FactoryMethod.store;

import baitap.CreationalPatternsAbstract.FactoryMethod.pizza.Pizza;
import baitap.CreationalPatternsAbstract.FactoryMethod.pizza.PizzaType;
import baitap.CreationalPatternsAbstract.FactoryMethod.pizza.ny.NYCheeseStyle;
import baitap.CreationalPatternsAbstract.FactoryMethod.pizza.ny.NYClamStyle;
import baitap.CreationalPatternsAbstract.FactoryMethod.pizza.ny.NYPepperoniStyle;

/**
 *
 * @author TANLE
 */
public class NYPizzaStore extends PizzaStore
{

    @Override
    protected Pizza createPizza(PizzaType type)
    {
        switch(type)
        {
            case cheese: return new NYCheeseStyle();
            case clam: return new NYClamStyle();
            case pepperoni: return new NYPepperoniStyle();
        }  
        return null;
    }
    
}
