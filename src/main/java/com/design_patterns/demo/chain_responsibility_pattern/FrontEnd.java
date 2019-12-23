package com.design_patterns.demo.chain_responsibility_pattern;

public class FrontEnd implements HelpInterface {

    final int FRONT_END_HELP = 1;
    HelpInterface ss;

    public FrontEnd(HelpInterface helpInterface) {
        ss = helpInterface;
    }

    @Override
    public void getHelp(int helpConstant) {

        if (helpConstant !=FRONT_END_HELP) {
            ss.getHelp(helpConstant);
        } else {
            System.out.println("This is Front-end");
        }
    }
}
