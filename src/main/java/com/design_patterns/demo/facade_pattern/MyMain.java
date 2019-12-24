package com.design_patterns.demo.facade_pattern;

/**
 * @author DucDT
 */
public class MyMain {

    public static void main(String[] args) {
        MyMain myMain = new MyMain();
    }

    public MyMain() {
        SimpleProductFacade simpleProductFacade = new SimpleProductFacade();
        simpleProductFacade.setName("ALCOlHO");
        System.out.println(simpleProductFacade.getName());
    }
}
