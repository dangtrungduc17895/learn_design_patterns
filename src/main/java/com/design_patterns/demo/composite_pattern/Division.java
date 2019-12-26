package com.design_patterns.demo.composite_pattern;

import java.util.Iterator;

/**
 * @author DucDT
 */
public class Division extends Corporate {

    private Corporate[] corporates = new Corporate[100];
    private int number = 0;
    private String name;

    public Division(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void add(Corporate c) {
        corporates[number++] = c;
    }

    public Iterator iterator() {
        return new DivisionIterator(corporates);
    }

    public void print() {
        Iterator iterator = iterator();
        while (iterator.hasNext()) {
            Corporate c = (Corporate) iterator.next();
            c.print();
        }
    }
}
