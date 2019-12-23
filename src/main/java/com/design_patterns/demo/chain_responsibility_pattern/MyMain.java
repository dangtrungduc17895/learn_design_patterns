package com.design_patterns.demo.chain_responsibility_pattern;

public class MyMain {
    public static void main(String[] args) {

        final int FRONT_END_HELP = 1;
        final int INTERMEDIATE_LAYER_HELP = 2;
        final int GENERAL_HELP = 3;
        Application application = new Application();
        IntermediateLayer intermediateLayer = new IntermediateLayer(application);
        FrontEnd frontEnd = new FrontEnd(intermediateLayer);
        frontEnd.getHelp(GENERAL_HELP);
    }
}
