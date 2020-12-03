/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_1_templatemethod;

import java.util.ArrayList;

/**
 *
 * @author TANLE
 */
public class MonHocDB extends EntityDB<MonHoc>{
    
    public MonHocDB(ArrayList<MonHoc> list) {
        super(list);
    }

    @Override
    protected int getId(MonHoc t) {
        return t.getMaMH();
    }

    @Override
    protected MonHoc findById(int id) {
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).getMaMH() == id)
            {
               return list.get(i);
            }
        }
        return null;
    }
}
