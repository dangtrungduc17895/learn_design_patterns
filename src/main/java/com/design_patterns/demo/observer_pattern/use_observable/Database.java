package com.design_patterns.demo.observer_pattern.use_observable;

import java.util.Observable;

/**
 * @author DucDT
 */
public class Database extends Observable {

    private String opration;
    private String record;

    public Database(){}

    public void editRecord(String opration, String record) {
        this.opration = opration;
        this.record = record;
        setChanged();
        notifyObservers();
    }

    public String getOpration() {
        return opration;
    }

    public String getRecord() {
        return record;
    }
}
