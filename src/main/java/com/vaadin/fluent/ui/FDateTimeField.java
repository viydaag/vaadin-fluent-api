package com.vaadin.fluent.ui;

import java.time.LocalDateTime;

import com.vaadin.fluent.api.FluentDateTimeField;
import com.vaadin.ui.DateTimeField;

public class FDateTimeField
        extends DateTimeField
        implements FluentDateTimeField<FDateTimeField> {

    private static final long serialVersionUID = 3038395589257578398L;

    public FDateTimeField() {
        super();
    }

    public FDateTimeField(String caption) {
        super(caption);
    }

    public FDateTimeField(com.vaadin.data.HasValue.ValueChangeListener<LocalDateTime> valueChangeListener) {
        super(valueChangeListener);
    }

    public FDateTimeField(String caption, LocalDateTime value) {
        super(caption, value);
    }

    public FDateTimeField(String caption, com.vaadin.data.HasValue.ValueChangeListener<LocalDateTime> valueChangeListener) {
        super(caption, valueChangeListener);
    }

    public FDateTimeField(String caption, LocalDateTime value, com.vaadin.data.HasValue.ValueChangeListener<LocalDateTime> valueChangeListener) {
        super(caption, value, valueChangeListener);
    }

}
