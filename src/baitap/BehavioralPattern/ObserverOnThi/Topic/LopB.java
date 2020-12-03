/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.BehavioralPattern.ObserverOnThi.Topic;

import java.util.ArrayList;

/**
 *
 * @author TANLE
 */
public class LopB implements Topic.observer{

    ArrayList<String> listtin = new ArrayList<>();
    
    public void dangky(Topic t)
    {
        t.nhandangky(this);
    }
    
    @Override
    public void nhantin(String tin, ArrayList<String> listtin) {
        this.listtin = listtin;
        int i = 1;
        for(String t: listtin)
        {
            System.out.println("\n Tin thứ " + i + ": " + t);
            i++;
        }
    }
}
