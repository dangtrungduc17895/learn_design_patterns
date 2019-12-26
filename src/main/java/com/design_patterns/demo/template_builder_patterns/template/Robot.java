package com.design_patterns.demo.template_builder_patterns.template;

/**
 * @author DucDT
 */
public class Robot {

    public Robot(){

    }

    public void go() {
        start();
        getParts();
        assemble();
        test();
        stop();
    }

    public void start() {
        System.out.println("Starting...");
    }

    public void getParts() {
        System.out.println("Getting a carburetor...");
    }

    public void assemble() {
        System.out.println("Installing the carburetor...");
    }

    public void test() {
        System.out.println("Revving the engine...");
    }

    public void stop() {
        System.out.println("Stopping...");
    }
}
