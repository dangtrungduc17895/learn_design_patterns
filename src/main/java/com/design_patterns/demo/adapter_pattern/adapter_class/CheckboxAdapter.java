package com.design_patterns.demo.adapter_pattern.adapter_class;

import java.awt.*;

/**
 * @author DucDT
 */
public class CheckboxAdapter extends Checkbox {

    public CheckboxAdapter(String n) {
        super(n);
    }

    public boolean isSelected() {
        return getState();
    }
}
