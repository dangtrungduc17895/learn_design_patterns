package com.design_patterns.demo.state_pattern;

public class FullyRentedState implements State {
    AutomatInterface automat;
    public FullyRentedState(AutomatInterface a)
    {
        automat = a;
    }

    @Override
    public String gotApplication() {
        return "Sorry, we’re fully rented.";
    }

    @Override
    public String checkApplication() {
        return "Sorry, we’re fully rented.";
    }

    @Override
    public String rentApartment() {
        return "Sorry, we’re fully rented.";
    }

    @Override
    public String dispenseKeys() {
        return "Sorry, we’re fully rented.";
    }
}
