package com.vaadin.fluent.ui;

import com.vaadin.fluent.api.FluentLabel;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.Label;

public class FLabel
        extends Label
        implements FluentLabel<FLabel> {

    private static final long serialVersionUID = 5410716597116812803L;

    public FLabel() {
        super();
    }

    public FLabel(String text) {
        super(text);
    }

    public FLabel(String text, ContentMode contentMode) {
        super(text, contentMode);
    }

}
