package com.vaadin.fluent.ui;

import com.vaadin.fluent.api.FluentTextField;
import com.vaadin.ui.TextField;

public class FTextField
        extends TextField
        implements FluentTextField<FTextField> {

    private static final long serialVersionUID = 1723760851801574581L;

    public FTextField() {
        super();
    }

    public FTextField(String caption) {
        super(caption);
    }

    public FTextField(com.vaadin.data.HasValue.ValueChangeListener<String> valueChangeListener) {
        super(valueChangeListener);
    }

    public FTextField(String caption, String value) {
        super(caption, value);
    }

    public FTextField(String caption, com.vaadin.data.HasValue.ValueChangeListener<String> valueChangeListener) {
        super(caption, valueChangeListener);
    }

    public FTextField(String caption, String value, com.vaadin.data.HasValue.ValueChangeListener<String> valueChangeListener) {
        super(caption, value, valueChangeListener);
    }

}
