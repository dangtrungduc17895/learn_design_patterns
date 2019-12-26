package com.design_patterns.demo.template_builder_patterns.template;

/**
 * @author DucDT
 */
public abstract class RobotTemplate {

    public final void go() {
        start();
        getParts();
        assemble();
        if (testOk()) {
            test();
        }
        stop();
    }

    public void start() {
        System.out.println("Starting...");
    }

    public void getParts() {
        System.out.println("Gettingr...");
    }

    public void assemble() {
        System.out.println("Installing...");
    }

    public void test() {
        System.out.println("Revving ...");
    }

    public void stop() {
        System.out.println("Stopping...");
    }

    public boolean testOk() {
        return true;
    }
}
