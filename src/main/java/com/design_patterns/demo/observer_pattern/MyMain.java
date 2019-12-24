package com.design_patterns.demo.observer_pattern;

/**
 * @author DucDT
 */
public class MyMain {

    public static void main(String[] args) {
        Database database = new Database();
        Archiver archiver = new Archiver();
        Client client = new Client();
        database.registerObserver(archiver);
        database.registerObserver(client);
        database.editRecord("delete","record 1");
        database.removeObserver(archiver);
        database.editRecord("delete","record 2");
    }
}
