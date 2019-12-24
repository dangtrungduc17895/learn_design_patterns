package com.design_patterns.demo.factory;

/**
 * @author DucDT
 */
public abstract class AbstractFactory {

    protected abstract Connection createConnection(String type);
}
