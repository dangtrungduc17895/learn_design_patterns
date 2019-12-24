package com.design_patterns.demo.factory;

/**
 * @author DucDT
 */
public class PostgeSQLConnection extends Connection {
    public String description() {
        return "PostgeSQL";
    }
}
