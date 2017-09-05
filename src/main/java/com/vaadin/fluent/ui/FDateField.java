package com.vaadin.fluent.ui;

import java.time.LocalDate;

import com.vaadin.fluent.api.FluentDateField;
import com.vaadin.ui.DateField;

public class FDateField
        extends DateField
        implements FluentDateField<FDateField> {

    private static final long serialVersionUID = -8235426367772678362L;

    public FDateField() {
        super();
    }

    public FDateField(String caption, LocalDate value, ValueChangeListener<LocalDate> valueChangeListener) {
        super(caption, value, valueChangeListener);
    }

    public FDateField(String caption, LocalDate value) {
        super(caption, value);
    }

    public FDateField(String caption, ValueChangeListener<LocalDate> valueChangeListener) {
        super(caption, valueChangeListener);
    }

    public FDateField(String caption) {
        super(caption);
    }

    public FDateField(ValueChangeListener<LocalDate> valueChangeListener) {
        super(valueChangeListener);
    }
}
