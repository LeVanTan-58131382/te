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
public class LopA implements Topic.observer{

    public void dangky(Topic t)
    {
        t.nhandangky(this);
    }
    
    @Override
    public void nhantin(String tin, ArrayList<String> listtin) {
        System.out.println("\nTin vừa nhận: " + tin);
    }
}
