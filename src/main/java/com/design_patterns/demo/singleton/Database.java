package com.design_patterns.demo.singleton;

public class Database {
    private static Database singleObject = new Database("products");
    private int record;
    private String name;

    private Database(String n) {
        name = n;
        record = 0;
    }

    public void editRecord(String operation) {
        System.out.println("Performing a " + operation +
                "operation on record " + record +
                " in database " + name);
    }

    public String getName() {
        return name;
    }

    public static Database getInstance(String n) {
        return singleObject;
    }
}
