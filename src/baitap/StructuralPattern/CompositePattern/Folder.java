/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.StructuralPattern.CompositePattern;

import java.util.ArrayList;

/**
 *
 * @author TANLE
 */
public class Folder extends AbstractFile {
    ArrayList<AbstractFile> files = new ArrayList<>();
    
    public Folder(String name) {
        super(name);
    }
    
    @Override
    public void add(AbstractFile f) {
        // nếu file đã có thì không thêm nữa
        if(files.contains(f)){
            return;
        }
        else {
            files.add(f);
            f.path = getPath() + "\\" + f.path;
            f.prefix = this.prefix + "  ";
        }
    }

    @Override
    public void remove(AbstractFile f) {
        if(files.contains(f)){
             files.remove(f);
             return;
        }
       for(AbstractFile folder: files){
           folder.remove(f);
       }
    }

    @Override
    public String getTressFolder() {
        StringBuilder builder = new StringBuilder();
        builder.append(name);// name là tên thư mục
        for(AbstractFile f: files){
            builder.append("\n")
                    .append(f.prefix)
                    .append(f.getTressFolder()); // getTreeFolder của thư mục con
        }
        return builder.toString();
    }
    
    public String getPath(){
        return path;
    }
}
