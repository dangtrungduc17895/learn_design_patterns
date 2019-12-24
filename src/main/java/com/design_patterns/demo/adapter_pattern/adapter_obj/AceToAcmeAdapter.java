package com.design_patterns.demo.adapter_pattern.adapter_obj;

/**
 * @author DucDT
 */
public class AceToAcmeAdapter implements AcmeInterface {

    AceInterface aceObj;
    String firstName;
    String lastName;

    public AceToAcmeAdapter(AceInterface a) {
        aceObj = a;
        firstName = aceObj.getName().split(" ")[0];
        lastName = aceObj.getName().split(" ")[1];
    }

    @Override
    public void setFirstName(String f) {
        firstName = f;
    }

    @Override
    public void setLastName(String l) {
        lastName = l;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }
}
