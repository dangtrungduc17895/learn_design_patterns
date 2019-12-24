package com.design_patterns.demo.observer_pattern.use_observable;

/**
 * @author DucDT
 */
public class MyMain {
    public static void main(String[] args) {
        Database database = new Database();
        Archiver archiver = new Archiver();
        Boss boss = new Boss();
        database.addObserver(archiver);
        database.addObserver(boss);
        database.editRecord("Boss", "record 1");
    }
}
