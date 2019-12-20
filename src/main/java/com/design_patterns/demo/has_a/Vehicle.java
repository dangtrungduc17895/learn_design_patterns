package com.design_patterns.demo.has_a;

import com.design_patterns.demo.has_a.algorithm.GoAlgorithm;

/**
 * @author DucDT
 */
public abstract class Vehicle {

    GoAlgorithm goAlgorithm;

    public void setGoAlgorithm(GoAlgorithm algorithm) {
        goAlgorithm = algorithm;
    }

    public void go() {
        goAlgorithm.go();
    }
}
