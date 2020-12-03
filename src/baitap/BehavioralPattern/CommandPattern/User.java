/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.BehavioralPattern.CommandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TANLE
 */
public class User {
    Calculator cal = new Calculator();
    int current = -1;
    List<Command> listCommands = new ArrayList<>(); 
    public void compute(char operrator, float operrand)
    {
        Command command = new CalculatorCommand(operrator, operrand, cal);
        command.execute();
        addCommand(command);
    }
    
    private void addCommand( Command command)
    {
//       current++;
//        for(int i = current; i<listCommands.size(); i++)
//        {
//            listCommands.remove(i);
//            listCommands.add(command);
//            current = listCommands.size()-1;
//        }
        int i = listCommands.size()-1;
        while(i>current) // xóa phép tính trên đỉnh
        {
            listCommands.remove(i--); // remove(i) xong giam i;
        }
            listCommands.add(command);
            current = listCommands.size()-1;
    }
    public void undo()
    {
        if(current >= 0) // nếu có phép tính đầu tiên ( dưới đáy của cây tính toán)
        {
            System.out.println("Undo: ");
            listCommands.get(current).unExecute();
            current--;
        }
        else System.out.println("Can not Undo");
    }
    public void redo()
    {
        if(current < listCommands.size()-1) // nếu có phép tính cuối cùng ( trên đỉnh của cây tính toán)
        {
            System.out.println("Redo: ");
            current++;
            listCommands.get(current).execute(); 
        }
        else
            System.out.println("Can not Redo");
    }
}
