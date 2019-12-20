package com.design_patterns.demo.has_a;

import com.design_patterns.demo.has_a.algorithm.CarGoAlgorithm;

/**
 * @author DucDT
 */
public class Car extends Vehicle {

    public Car() {
        setGoAlgorithm(new CarGoAlgorithm());
    }
}
