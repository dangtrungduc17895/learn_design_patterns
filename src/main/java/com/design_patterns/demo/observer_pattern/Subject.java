package com.design_patterns.demo.observer_pattern;

/**
 * @author DucDT
 */
public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
