/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_1_templatemethod;

import java.util.Date;

/**
 *
 * @author TANLE
 */
public class Bai_1_TemplateMethod {
    public Date date = new Date();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EntityDB sv = new SinhVienDB(); 
        SinhVien sv_1 = new SinhVien(58131382, "Le Van Tan", date, "Nha Trang");
    }
    
}
