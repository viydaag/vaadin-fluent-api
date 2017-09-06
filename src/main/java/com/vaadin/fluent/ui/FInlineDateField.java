package com.vaadin.fluent.ui;

import java.time.LocalDate;

import com.vaadin.fluent.api.FluentInlineDateField;
import com.vaadin.ui.InlineDateField;

public class FInlineDateField
        extends InlineDateField
        implements FluentInlineDateField<FInlineDateField> {

    private static final long serialVersionUID = 7627750993355752680L;

    public FInlineDateField() {
        super();
    }

    public FInlineDateField(String caption) {
        super(caption);
    }

    public FInlineDateField(ValueChangeListener<LocalDate> valueChangeListener) {
        super(valueChangeListener);
    }

    public FInlineDateField(String caption, LocalDate value) {
        super(caption, value);
    }

    public FInlineDateField(String caption, ValueChangeListener<LocalDate> valueChangeListener) {
        super(caption, valueChangeListener);
    }

    public FInlineDateField(String caption, LocalDate value, ValueChangeListener<LocalDate> valueChangeListener) {
        super(caption, value, valueChangeListener);
    }

}
