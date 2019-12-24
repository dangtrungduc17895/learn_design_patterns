package com.design_patterns.demo.adapter_pattern.adapter_obj;

/**
 * @author DucDT
 */
public class AceClass implements AceInterface {
    String name;
    @Override
    public void setName(String n) {
        name = n;
    }

    @Override
    public String getName() {
        return name;
    }
}
