package com.design_patterns.demo.composite_pattern;

import java.util.Iterator;

/**
 * @author DucDT
 */
public class DivisionIterator implements Iterator {

    private Corporate[] corporates;
    private int location = 0;

    public DivisionIterator(Corporate[] c) {
        corporates = c;
    }

    @Override
    public boolean hasNext() {
        if(location < corporates.length && corporates[location] != null){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Corporate next() {
        return corporates[location++];
    }
}
