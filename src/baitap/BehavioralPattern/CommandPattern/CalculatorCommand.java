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
public class CalculatorCommand extends Command{
    public char operrator;
    public float operrand;
    Calculator cal;

    public CalculatorCommand(char operrator, float operrand, Calculator cal) {
        this.operrator = operrator;
        this.operrand = operrand;
        this.cal = cal;
    }

    public char getOperrator() {
        return operrator;
    }

    public void setOperrator(char operrator) {
        this.operrator = operrator;
    }

    public float getOperrand() {
        return operrand;
    }

    public void setOperrand(float operrand) {
        this.operrand = operrand;
    }

    @Override
    public void execute() {
        System.out.println(cal.operration(operrator, operrand));
    }

    @Override
    public void unExecute() {
        cal.operration(undo(operrator), operrand);
    }
    
    public char undo(char operrator){
        switch(operrator)
        {
            case '+': return '-';
            case '-': return '+';
            case '*': return '/';
            case '/': return '*';
        }
        return ' ';
    }
    
    
}
