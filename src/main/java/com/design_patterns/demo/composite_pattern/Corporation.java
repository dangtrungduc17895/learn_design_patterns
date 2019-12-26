package com.design_patterns.demo.composite_pattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author DucDT
 */
public class Corporation extends Corporate {

    private ArrayList<Corporate> corporates = new ArrayList<>();

    public void add(Corporate c) {
        corporates.add(c);
    }

    public void print() {
        Iterator iterator = corporates.iterator();
        while (iterator.hasNext()) {
            Corporate c = (Corporate) iterator.next();
            c.print();
        }
    }
}
