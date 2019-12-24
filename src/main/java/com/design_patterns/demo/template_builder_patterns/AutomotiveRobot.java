package com.design_patterns.demo.template_builder_patterns;

/**
 * @author DucDT
 */
public class AutomotiveRobot extends RobotTemplate{

    private String name;
    public AutomotiveRobot(String n) {
        name = n;
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

    public String getName()
    {
        return name;
    }
}
