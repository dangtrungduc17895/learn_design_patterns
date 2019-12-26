package com.design_patterns.demo.template_builder_patterns.builder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author DucDT
 */
public class MyMain {

    public static void main(String[] args) {
        RobotBuilder builder;
        RobotBuildable robot;
        String rp = "a";

        System.out.println("Do you want a cookie robot [c] or an automotive one [a]? ");
        BufferedReader reader = new
                BufferedReader(new InputStreamReader(System.in));

        try{
            rp = reader.readLine();
        } catch (IOException e){
            System.err.println("Error");
        }

        if (rp.equals("c")){
            builder = new CookieRobotbuilder();
        } else {
            builder = null;
        }

        //Start the construction process.
        builder.addStart();
        builder.addTest();
        builder.addAssemble();
        builder.addStop();

        robot = builder.getRobot();
        robot.go();
    }
}
