/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.BehavioralPattern.ObserverPattern;

/**
 *
 * @author TANLE
 */
public class NhaDauTuA implements TiGia.TiGiaThayDoiListener
{
    float tigia;
    boolean dangKy = false;
    
    public void dangKy(TiGia t)
    {
        t.dangKy(this);
    }
    
    public void huyDangKy(TiGia t)
    {
        t.huyDangKy(this);
        dangKy = false;
    }
    
    @Override
    public void capNhatTiGia(float tiGiaMoi) 
    {
        if(dangKy)
        {
            if(tiGiaMoi > tigia)
            {
                System.out.println("Nhà A: bán ra");
            }
            else
                if(tiGiaMoi == tigia)
                    System.out.println("Nhà đầu tư A: bán ra ít");
                    else
                    System.out.println("Nhà đầu tư A: mua vào");
        }
        else
        {
            tigia = tiGiaMoi;
            dangKy = true;
        }
    }
    
}
