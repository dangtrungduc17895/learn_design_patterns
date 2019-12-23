package com.design_patterns.demo.decorator_pattern;

public class Disk extends ComponentDecorator {

    Computer computer;

    public Disk(Computer c) {
        computer = c;
    }

    @Override
    public String description() {
        return computer.description() + " and Disk";
    }
}
