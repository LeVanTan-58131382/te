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
public abstract class EntityDB<T> {
    ArrayList<T> list;

    public EntityDB(ArrayList<T> list) {
        this.list = list;
    }
    protected abstract int getKey(T t);
    protected abstract T findByID(int id);
    public boolean add(T t)
    {
        int id = getKey(t);
        if(findByID(id)==null)
        {
            list.add(t);
            return true;
        }else
            return false;
    }
    public int update(T t)
    {
        int count = 0;
        for(T o:list)
        {
            if(getKey(t)==getKey(o))
            {
                list.set(count, t);
                return 1;
            }
            count++;
        }
        return 0;
    }
    public int delete(T t)
    {
        int count = 0;
        for(T o:list)
        {
            if(getKey(t)==getKey(o))
            {
                list.remove(count);
                return 1;
            }
            count++;
        }
        return 0;
    }
    public int deleteByKey(int id)
    {
        T index = findByID(id);
        if(index != null)
        {
            list.remove(index);
            return 1;
        }
        return 0;
    }
}
