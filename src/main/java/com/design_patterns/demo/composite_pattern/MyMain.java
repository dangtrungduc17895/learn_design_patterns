package com.design_patterns.demo.composite_pattern;

/**
 * @author DucDT
 */
public class MyMain {

    Corporation corporation;

    public static void main(String[] args) {
        MyMain myMain = new MyMain();
    }

    public MyMain() {
        corporation = new Corporation();
        Division rnd = new Division("R&D");
        rnd.add(new VP("Bill", "R&D"));
        rnd.add(new VP("Mike", "R&D"));

        Division sales = new Division("Sales");
        sales.add(new VP("Ted", "Sales"));
        sales.add(new VP("Bob", "Sales"));
        sales.add(new VP("Carol", "Sales"));
        sales.add(new VP("Alice", "Sales"));
        Division western = new Division("Western Sales");
        western.add(new VP("Wally", "Western Sales"));
        western.add(new VP("Andre", "Western Sales"));
        sales.add(western);

        VP vp = new VP("Cary", "At Large");
        corporation.add(rnd);
        corporation.add(sales);
        corporation.add(vp);
        corporation.print();
    }
    
    
}
