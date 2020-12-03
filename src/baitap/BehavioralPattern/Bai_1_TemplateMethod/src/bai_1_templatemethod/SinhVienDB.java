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
public class SinhVienDB extends EntityDB<SinhVien>{
    

    public SinhVienDB(ArrayList<SinhVien> list) {
        super(list);
    }

    @Override
    protected int getId(SinhVien t) {
        return t.getMaSV();
    }

    @Override
    protected SinhVien findById(int id) {
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).getMaSV() == id)
            {
                return list.get(i);
            }
        }
        return null;
    }
    
}