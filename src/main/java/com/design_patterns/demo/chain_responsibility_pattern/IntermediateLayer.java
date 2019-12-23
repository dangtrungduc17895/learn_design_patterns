package com.design_patterns.demo.chain_responsibility_pattern;

public class IntermediateLayer implements HelpInterface {

    final int INTERMEDIATE_LAYER_HELP = 2;
    HelpInterface ss;

    public IntermediateLayer(HelpInterface helpInterface){
        ss = helpInterface;
    }

    @Override
    public void getHelp(int helpConstant) {
        if(helpConstant != INTERMEDIATE_LAYER_HELP){
            ss.getHelp(helpConstant);
        } else {
            System.out.println("This is intermediateLayer");
        }
    }
}
