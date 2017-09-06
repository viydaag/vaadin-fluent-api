package com.vaadin.fluent.ui;

import com.vaadin.fluent.api.FluentRichTextArea;
import com.vaadin.ui.RichTextArea;

public class FRichTextArea
        extends RichTextArea
        implements FluentRichTextArea<FRichTextArea> {

    private static final long serialVersionUID = -890865086015718409L;

    public FRichTextArea() {
        super();
    }

    public FRichTextArea(String caption) {
        super(caption);
    }

    public FRichTextArea(ValueChangeListener<String> valueChangeListener) {
        super(valueChangeListener);
    }

    public FRichTextArea(String caption, String value) {
        super(caption, value);
    }

    public FRichTextArea(String caption, ValueChangeListener<String> valueChangeListener) {
        super(caption, valueChangeListener);
    }

    public FRichTextArea(String caption, String value, ValueChangeListener<String> valueChangeListener) {
        super(caption, value, valueChangeListener);
    }

}
