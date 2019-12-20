package com.design_patterns.demo.has_a;

/**
 * @author DucDT
 */
public class MyMain {

    public static void main(String[] args) {
        Car car = new Car();
        Helicopter helicopter = new Helicopter();
        car.go();
        helicopter.go();
    }
}
