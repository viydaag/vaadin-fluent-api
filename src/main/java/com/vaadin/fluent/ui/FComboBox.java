package com.vaadin.fluent.ui;

import java.util.Collection;

import com.vaadin.fluent.api.FluentComboBox;
import com.vaadin.ui.ComboBox;

public class FComboBox<T>
        extends ComboBox<T>
        implements FluentComboBox<FComboBox<T>, T> {

    private static final long serialVersionUID = 8036204211256191175L;

    public FComboBox() {
        super();
    }

    public FComboBox(String caption) {
        super(caption);
    }

    public FComboBox(String caption, Collection<T> options) {
        super(caption, options);
    }

}
