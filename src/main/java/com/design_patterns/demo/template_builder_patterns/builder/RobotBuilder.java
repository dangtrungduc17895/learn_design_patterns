package com.design_patterns.demo.template_builder_patterns.builder;

/**
 * @author DucDT
 */
public interface RobotBuilder {

    void addStart();
    void addGetParts();
    void addAssemble();
    void addTest();
    void addStop();
    RobotBuildable getRobot();
}
