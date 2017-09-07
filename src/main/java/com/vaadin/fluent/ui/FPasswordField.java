package com.vaadin.fluent.ui;

import com.vaadin.fluent.api.FluentTextField;
import com.vaadin.ui.PasswordField;

public class FPasswordField
        extends PasswordField
        implements FluentTextField<FPasswordField> {

    private static final long serialVersionUID = -6000016286702373878L;

    public FPasswordField() {
        super();
    }

    public FPasswordField(String caption) {
        super(caption);
    }

    public FPasswordField(com.vaadin.data.HasValue.ValueChangeListener<String> valueChangeListener) {
        super(valueChangeListener);
    }

    public FPasswordField(String caption, String value) {
        super(caption, value);
    }

    public FPasswordField(String caption, com.vaadin.data.HasValue.ValueChangeListener<String> valueChangeListener) {
        super(caption, valueChangeListener);
    }

    public FPasswordField(String caption, String value, com.vaadin.data.HasValue.ValueChangeListener<String> valueChangeListener) {
        super(caption, value, valueChangeListener);
    }

}
