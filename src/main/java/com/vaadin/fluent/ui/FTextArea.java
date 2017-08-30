package com.vaadin.fluent.ui;

import com.vaadin.fluent.api.FluentTextArea;
import com.vaadin.ui.TextArea;

public class FTextArea
        extends TextArea
        implements FluentTextArea<FTextArea> {

    private static final long serialVersionUID = 388136787454348184L;

    public FTextArea() {
        super();
    }

    public FTextArea(String caption) {
        super(caption);
    }

    public FTextArea(com.vaadin.data.HasValue.ValueChangeListener<String> valueChangeListener) {
        super(valueChangeListener);
    }

    public FTextArea(String caption, String value) {
        super(caption, value);
    }

    public FTextArea(String caption, com.vaadin.data.HasValue.ValueChangeListener<String> valueChangeListener) {
        super(caption, valueChangeListener);
    }

    public FTextArea(String caption, String value, com.vaadin.data.HasValue.ValueChangeListener<String> valueChangeListener) {
        super(caption, value, valueChangeListener);
    }

}
