package com.vaadin.fluent.ui;

import com.vaadin.fluent.api.FluentVerticalLayout;
import com.vaadin.ui.Component;
import com.vaadin.ui.VerticalLayout;

public class FVerticalLayout
        extends VerticalLayout
        implements FluentVerticalLayout<FVerticalLayout> {

    private static final long serialVersionUID = 8724151111768356379L;

    public FVerticalLayout() {
        super();
    }

    public FVerticalLayout(Component... children) {
        super(children);
    }

}
