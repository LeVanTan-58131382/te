/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.CreationalPatternsAbstract.Builder.BaiTap_2;

/**
 *
 * @author TANLE
 */
public class MyStringBuilder {
    String str;
    
    protected MyStringBuilder(Builder builder)
    {
        this.str = builder.str;
    }

    @Override
    public String toString() {
        return "MyStringBuilder{" + "str=" + str + '}';
    }
    
    public static class Builder{
        String str;

        public Builder() {
        }

        public Builder addString(String s){
            this.str = str + s;
            return this;
        }
        
        public Builder addFloat(float f){
            this.str = str + f;
            return this;
        }
        
        public Builder addBool(boolean b){
            this.str = str + b;
            return this;
        }
        
        public MyStringBuilder build()
        {
            return new MyStringBuilder(this);
        }
    }
}
