package com.design_patterns.demo.chain_responsibility_pattern;

public class Application implements HelpInterface {
    @Override
    public void getHelp(int helpConstant) {
        System.out.println("In Application");
    }
}
