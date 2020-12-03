/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.BehavioralPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TANLE
 */
public class TiGia 
{
    float tigia;
    List<TiGiaThayDoiListener> listeners = new ArrayList<>();

    public TiGia(float tigia) {
        this.tigia = tigia;
    }
    
    
    public void dangKy(TiGiaThayDoiListener listener)
    {
        if(!listeners.contains(listener))
        {
            listeners.add(listener);
            listener.capNhatTiGia(tigia);
        }
    }
    
    public void huyDangKy(TiGiaThayDoiListener listener)
    {
        if(listeners.contains(listener))
        {
            listeners.remove(listener);
        }
    }
    
    public void thongBaoThayDoiTiGia(float delta)
    {
        tigia += delta;
        for(TiGiaThayDoiListener listener:listeners)
        {
            listener.capNhatTiGia(tigia);
        }
    }
    
    public static interface TiGiaThayDoiListener
    {
        public void capNhatTiGia(float tiGiaMoi);
    }
}