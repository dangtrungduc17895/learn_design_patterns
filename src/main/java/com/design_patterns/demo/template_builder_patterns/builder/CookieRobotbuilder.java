package com.design_patterns.demo.template_builder_patterns.builder;

import java.util.ArrayList;

/**
 * @author DucDT
 */
public class CookieRobotbuilder implements RobotBuilder {

    CookieRobotBuildable robot;
    ArrayList<Integer> actions;

    public CookieRobotbuilder() {
        robot = new CookieRobotBuildable();
        actions = new ArrayList<>();
    }

    @Override
    public void addStart() {
        actions.add(new Integer(1));
    }

    @Override
    public void addGetParts() {
        actions.add(new Integer(2));
    }

    @Override
    public void addAssemble() {
        actions.add(new Integer(3));
    }

    @Override
    public void addTest() {
        actions.add(new Integer(4));
    }

    @Override
    public void addStop() {
        actions.add(new Integer(5));
    }

    @Override
    public RobotBuildable getRobot() {
        robot.loadActions(actions);
        return robot;
    }
}
