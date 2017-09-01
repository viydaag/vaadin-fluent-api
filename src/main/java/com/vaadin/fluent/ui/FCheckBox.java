package com.vaadin.fluent.ui;

import com.vaadin.fluent.api.FluentCheckBox;
import com.vaadin.ui.CheckBox;

public class FCheckBox
        extends CheckBox
        implements FluentCheckBox<FCheckBox> {

    private static final long serialVersionUID = 7364476008039602644L;

    public FCheckBox() {
        super();
    }

    public FCheckBox(String caption) {
        super(caption);
    }

    public FCheckBox(String caption, boolean initialState) {
        super(caption, initialState);
    }

}
