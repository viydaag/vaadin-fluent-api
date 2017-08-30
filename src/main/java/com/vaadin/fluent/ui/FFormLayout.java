package com.vaadin.fluent.ui;

import com.vaadin.fluent.api.FluentFormLayout;
import com.vaadin.ui.Component;
import com.vaadin.ui.FormLayout;

public class FFormLayout
        extends FormLayout
        implements FluentFormLayout<FFormLayout> {

    private static final long serialVersionUID = -8340971967806498090L;

    public FFormLayout() {
        super();
    }

    public FFormLayout(Component... children) {
        super(children);
    }

}
