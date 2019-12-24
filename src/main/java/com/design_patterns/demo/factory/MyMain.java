package com.design_patterns.demo.factory;

/**
 * @author DucDT
 */
public class MyMain {

    public static void main(String[] args) {
        SecureFactory factory = new SecureFactory();
        Connection connection = factory.createConnection("Oracle");
        System.out.println(connection.description());
        connection = factory.createConnection("MySQL");
        System.out.println(connection.description());
        connection = factory.createConnection("PostgeSQL");
        System.out.println(connection.description());
    }
}
