package com.design_patterns.demo.decorator_pattern;

public class Monitor extends ComponentDecorator {

    Computer computer;

    public Monitor(Computer c) {
        computer = c;
    }

    @Override
    public String description() {
        return computer.description() + " and Monitor";
    }
}
