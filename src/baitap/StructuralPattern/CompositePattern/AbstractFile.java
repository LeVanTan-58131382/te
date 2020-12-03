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
public abstract class AbstractFile {
    String name;
    String path;
    String prefix = "";
    public abstract void add(AbstractFile f);
    public abstract void remove(AbstractFile f);
    public abstract String getTressFolder();

    public AbstractFile(String name) {
        this.name = name;
        this.path = name;
    }

    
    public String getPath() {
        return path;
    }
}
