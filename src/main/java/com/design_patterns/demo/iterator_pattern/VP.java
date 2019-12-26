package com.design_patterns.demo.iterator_pattern;

/**
 * @author DucDT
 */
public class VP {
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
        System.out.println("Name: " + name + " Divions: " + division);
    }
}
