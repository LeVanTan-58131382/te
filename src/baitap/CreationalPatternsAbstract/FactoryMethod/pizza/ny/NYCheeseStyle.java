/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.CreationalPatternsAbstract.FactoryMethod.pizza.ny;

import baitap.CreationalPatternsAbstract.FactoryMethod.pizza.Pizza;

/**
 *
 * @author TANLE
 */
public class NYCheeseStyle extends Pizza
{
    public NYCheeseStyle()
    {
        pizzaStr ="Chào các bạn! Đây là bánh pizza Cheese kiểu New York\n";
    }

    @Override
    public void prepare()
    {
        pizzaStr += "Chuẩn bị bột và Cheesse và Muối\n";
    }

    @Override
    public void bake()
    {
        pizzaStr += "Nướng ở 210 độ C trong 15 phút\n";
    }
}
