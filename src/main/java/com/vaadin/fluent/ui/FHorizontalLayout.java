package com.vaadin.fluent.ui;

import com.vaadin.fluent.api.FluentHorizontalLayout;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;

public class FHorizontalLayout
        extends HorizontalLayout
        implements FluentHorizontalLayout<FHorizontalLayout> {

    private static final long serialVersionUID = 2738508593642686945L;

    public FHorizontalLayout() {
        super();
    }

    public FHorizontalLayout(Component... children) {
        super(children);
    }

}
