package com.design_patterns.demo.facade_pattern;

/**
 * @author DucDT
 */
public class DifficultProduct {
    char [] chars = new char[3];

    public void setFirstNameChar(char c){
        chars[0] = c;
    }
    public void setSecNameChar(char c){
        chars[1] = c;
    }
    public void setThrdtNameChar(char c){
        chars[2] = c;
    }

    public String getName(){
        String s = "";
        for(int i = 0; i < chars.length;i++) {
            s+=chars[i];
        }
        return s;
    }
}
