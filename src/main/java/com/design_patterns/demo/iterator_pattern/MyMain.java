package com.design_patterns.demo.iterator_pattern;

/**
 * @author DucDT
 */
public class MyMain {

    DivisionIterator iterator;
    Division division;
    public static void main(String[] args) {
        MyMain myMain = new MyMain();
    }

    public MyMain() {
        division = new Division("Trees");

        division.add("Orange");
        division.add("Lemon");
        division.add("Durian");

        iterator = division.iterator();
        while (iterator.hasNext()) {
            VP vp = iterator.next();
            vp.print();
        }
    }
}
