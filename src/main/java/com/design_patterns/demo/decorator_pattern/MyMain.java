package com.design_patterns.demo.decorator_pattern;

public class MyMain {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer = new Disk(computer);
        computer = new Monitor(computer);
        System.out.println(computer.description());

    }
}
