package com.design_patterns.demo.has_a;

import com.design_patterns.demo.has_a.algorithm.HelicopterGoAlgorithm;

/**
 * @author DucDT
 */
public class Helicopter extends Vehicle {

    public Helicopter() {
        setGoAlgorithm(new HelicopterGoAlgorithm());
    }
}
