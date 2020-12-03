/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class MonHocDB extends EntityDB<MonHoc>{

    public MonHocDB(ArrayList<MonHoc> list) {
        super(list);
    }

    
    
    @Override
    protected int getKey(MonHoc t) {
        return t.maMH;
                
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected MonHoc findByID(int id) {
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).maMH == id)
            {
               return list.get(i);
            }
        }
        return null;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
