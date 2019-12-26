package com.design_patterns.demo.iterator_pattern;

import java.util.Iterator;

/**
 * @author DucDT
 */
public class DivisionIterator implements Iterator {

    private VP[] vps;
    private int location = 0;

    public DivisionIterator(VP[] vps) {
        this.vps = vps;
    }

    @Override
    public boolean hasNext() {
        if (location<vps.length && vps[location] != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public VP next() {
        return vps[location++];
    }

    @Override
    public void remove() {

    }
}
