package com.design_patterns.demo.composite_pattern;

import java.util.Iterator;

/**
 * @author DucDT
 */
public class VPIterator implements Iterator {

    private VP vp;

    public VPIterator(VP vp) {
        this.vp = vp;
    }

    public VP next()
    {
        return vp;
    }
    public boolean hasNext()
    {
        return false;
    }
    public void remove()
    { }
}
