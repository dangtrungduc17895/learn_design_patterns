package com.design_patterns.demo.state_pattern;

public class MyMain {

    Automat automat;

    public static void main(String args[])
    {
        MyMain t = new MyMain();
    }

    public MyMain() {
        automat = new Automat(9);
        automat.gotApplication();
        automat.checkApplication();
        automat.rentApartment();
    }
}
