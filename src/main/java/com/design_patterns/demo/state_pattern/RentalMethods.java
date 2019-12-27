package com.design_patterns.demo.state_pattern;

/**
 * @author DucDT
 */
public class RentalMethods {

    final static int FULLY_RENTED = 0;
    final static int WAITING = 1;
    final static int GOT_APPLICATION = 2;
    final static int APARTMENT_RENTED = 3;
    int state = WAITING;
}
