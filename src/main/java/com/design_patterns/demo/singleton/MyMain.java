package com.design_patterns.demo.singleton;

public class MyMain implements Runnable {

    Thread thread;

    public static void main(String[] args) {
        MyMain m = new MyMain();
    }

    public MyMain() {
        Database database;
        database = Database.getInstance("Student");
        thread = new Thread(this, "second" );
        thread.start();

        System.out.println("this is ther " +
                database.getName() + " database");
    }

    public void run() {
        Database database = Database.getInstance("Teacher");
        System.out.println("this is ther " +
                database.getName() + " database");
    }
}
