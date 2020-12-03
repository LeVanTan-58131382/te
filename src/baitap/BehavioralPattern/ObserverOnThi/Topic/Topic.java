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
public class Topic {
    observer lop;
    ArrayList<String> listtin = new ArrayList<>();

    public ArrayList<String> getListtin() {
        return listtin;
    }
    
    public void nhandangky(observer lop)
    {
        this.lop = lop;
    }
    
    public void taotinmoi(String tin)
    {
        this.listtin.add(tin);
        lop.nhantin(listtin.get(listtin.size() - 1), listtin);
    }
    
    public void capnhattin(String tin, int i)
    {
        this.listtin.set(i-1 , tin);
        lop.nhantin(tin, listtin);
    }
    
    public static interface observer
    {
        public void nhantin(String tin, ArrayList<String> listtin);
    }
}
