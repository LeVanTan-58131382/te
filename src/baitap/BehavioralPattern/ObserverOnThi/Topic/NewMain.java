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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> tin = new ArrayList<>();
        Topic t = new Topic();
        
        LopA A = new LopA();
        LopB B = new LopB();
        System.out.println("Lớp A: ");
        A.dangky(t);
        t.taotinmoi("Tin 1");
        t.taotinmoi("Tin 2");
        t.taotinmoi("Tin 3");
        t.capnhattin("tin 2 cập nhật", 2);
        
        
        System.out.println("\nLớp B: \nTest tạo tin mới: ");
        B.dangky(t);
        t.taotinmoi("Tin 4");
        
        System.out.println("\nTest cập nhật tin: ");
        t.capnhattin("Tin 3 cập nhật", 3);
    }
    
}
