package com.design_patterns.demo.observer_pattern;

/**
 * @author DucDT
 */
public class Archiver implements Observer {
    @Override
    public void update(String operation, String recored) {
        System.out.println("The archiver : " + operation + " on " + recored);
    }
}
