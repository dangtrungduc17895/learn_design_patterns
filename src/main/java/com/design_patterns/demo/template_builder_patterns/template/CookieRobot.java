package com.design_patterns.demo.template_builder_patterns.template;

/**
 * @author DucDT
 */
public class CookieRobot extends RobotTemplate {

    private String name;
    public CookieRobot(String n){
        name = n;
    }

    public void getParts()
    {
        System.out.println("Getting flour and sugar....");
    }
    public void assemble()
    {
        System.out.println("Baking a cookie....");
    }
    public void test()
    {
        System.out.println("Crunching a cookie....");
    }
    public String getName()
    {
        return name;
    }
}
