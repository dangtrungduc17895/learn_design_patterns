package com.design_patterns.demo.adapter_pattern.adapter_obj;

/**
 * @author DucDT
 */
public class MyMain {

    public static void main(String[] args) {
        AceInterface ace = new AceClass();
        ace.setName("Trung Duc");
        AcmeInterface acme = new AceToAcmeAdapter(ace);
        System.out.println(acme.getFirstName() + acme.getLastName());
    }
}
