package com.vaadin.fluent.ui;

import com.vaadin.fluent.api.FluentGridLayout;
import com.vaadin.ui.Component;
import com.vaadin.ui.GridLayout;

public class FGridLayout
        extends GridLayout
        implements FluentGridLayout<FGridLayout> {

    private static final long serialVersionUID = -5303493207031150277L;

    public FGridLayout() {
        super();
    }

    public FGridLayout(int columns, int rows) {
        super(columns, rows);
    }

    public FGridLayout(int columns, int rows, Component... children) {
        super(columns, rows, children);
    }

}
