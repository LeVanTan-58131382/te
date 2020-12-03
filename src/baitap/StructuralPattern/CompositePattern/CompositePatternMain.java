/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.StructuralPattern.CompositePattern;

/**
 *
 * @author TANLE
 */
public class CompositePatternMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractFile root = new Folder("Data");
        AbstractFile toan = new Folder("Toan");
        AbstractFile ly = new Folder("Ly");
        AbstractFile hoa = new Folder("Hoa");
        
        AbstractFile giaiTich = new Folder("Giai tich");
        AbstractFile toanA = new File("ToanA.pdf");
        
        root.add(toan);
        root.add(ly);
        root.add(hoa);
        
        toan.add(giaiTich);
        giaiTich.add(toanA);
        
        System.out.println(root.getTressFolder());
        System.out.println(toanA.getPath());
    }
    
}
