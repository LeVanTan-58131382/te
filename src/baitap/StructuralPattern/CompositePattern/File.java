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
public class File extends AbstractFile {
    //ArrayList<AbstractFile> files;
    
    // ,hàm khởi tạo
    public File(String name) {
        super(name);
    }
    
    @Override
    public void add(AbstractFile f) {
        
    }

    @Override
    public void remove(AbstractFile f) {
        
    }

    @Override
    public String getTressFolder() {
        return name;
    }
}
