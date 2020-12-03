/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_1_templatemethod;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TANLE
 */
public abstract class EntityDB<T> {
    public ArrayList<T> list;
    
    public EntityDB(ArrayList<T> list) {
        this.list = list;
    }
    
    public boolean add(T t){
        int id = getId(t);
        T t1 = findById(id);
        
        if(t1 == null)
        {
            list.add(t);
            return true;
        }    
        return false;
    }
    public int update(T t){
        int id = getId(t);
        T t1 = findById(id);
        if(t1 == null){
            return 0;
        }
        int index = list.indexOf(t1);
        list.set(index, t);
        return 1;
    }
    public int delete(T t){
        int id = getId(t);
        T canxoa = findById(id);
        if(canxoa != null)
        {
            list.remove(canxoa);
            return 1;
        }
        return 0;
    }
    
    public int deleteByKey(int id){
        T canxoa = findById(id);
        if(canxoa != null)
        {
            list.remove(canxoa);
            return 1;
        }
        return 0;
    }
    
    protected abstract T findById(int id);
    protected abstract int getId(T t);
}
