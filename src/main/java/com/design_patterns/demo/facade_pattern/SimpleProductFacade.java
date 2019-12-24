package com.design_patterns.demo.facade_pattern;

/**
 * @author DucDT
 */
public class SimpleProductFacade {
    DifficultProduct difficultProduct;

    public SimpleProductFacade() {
        difficultProduct = new DifficultProduct();
    }

    public void setName(String n) {
        char[] chars = n.toCharArray();
        if(chars.length > 0){
            difficultProduct.setFirstNameChar(chars[0]);
        }
        if(chars.length > 1){
            difficultProduct.setSecNameChar(chars[1]);
        }
        if(chars.length > 2){
            difficultProduct.setThrdtNameChar(chars[2]);
        }
    }

    public String getName() {
        return difficultProduct.getName();
    }

}
