package com.design_patterns.demo.observer_pattern.use_observable;

import java.util.Observable;
import java.util.Observer;

/**
 * @author DucDT
 */
public class Boss implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("The boss: " + ((Database)o).getOpration() + " on " + ((Database)o).getRecord());
    }
}
