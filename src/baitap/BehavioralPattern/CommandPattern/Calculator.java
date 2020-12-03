/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.BehavioralPattern.CommandPattern;

/**
 *
 * @author TANLE
 */
public class Calculator {
    public float total;

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Calculator(float total) {
        this.total = total;
    }

    public Calculator() {
    }
    
    
    
    public String operration(char operrator, float operrand){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(total)
                .append(" ")
                .append(operrator)
                .append(" ")
                .append(operrand)
                .append(" = ");
        switch(operrator)
        {
            case '+': total += operrand; break;
            case '-': total -= operrand; break;
            case '*': total *= operrand; break;
            case '/': total /= operrand; break;
        }
        
        stringBuilder.append(total)
                .append("\n");
        
        return stringBuilder.toString();
        }
}
