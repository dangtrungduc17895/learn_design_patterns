package com.design_patterns.demo.composite_pattern;

import java.util.Iterator;

/**
 * @author DucDT
 */
public class VP extends Corporate {

    private String name;
    private String division;

    public VP(String n, String d) {
        name = n;
        division = d;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println("Name: " + name + " Division: " + division);
    }

    public Iterator iterator() {
        return new VPIterator(this);
    }
}
