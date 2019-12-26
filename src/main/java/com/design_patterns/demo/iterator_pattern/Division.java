package com.design_patterns.demo.iterator_pattern;

/**
 * @author DucDT
 */
public class Division {

    private VP[] VPs = new VP[100];
    private int number = 0;
    private String name;

    public Division(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void add(String n) {
        VP vp = new VP(n, name);
        VPs[number++] = vp;
    }

    public DivisionIterator iterator() {
        return new DivisionIterator(VPs);
    }
}
