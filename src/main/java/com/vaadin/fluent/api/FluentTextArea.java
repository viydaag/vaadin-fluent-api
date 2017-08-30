package com.vaadin.fluent.api;

import com.vaadin.ui.TextArea;

/**
 * The base interface for fluent versions of {@link TextArea}
 * 
 * @see TextArea
 *
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentTextArea<THIS extends FluentTextArea<THIS>>
        extends FluentAbstractTextField<THIS> {

    /**
     * Sets the text area'THIS word-wrap mode on or off.
     *
     * @param wordwrap
     *            the boolean value specifying if the text area should be in word-wrap mode.
     * @return this for method chaining
     * @see TextArea#setWordWrap(boolean)
     * 
     */
    @SuppressWarnings("unchecked")
    public default THIS withWordWrap(boolean wordwrap) {
        ((TextArea) this).setWordWrap(wordwrap);
        return (THIS) this;
    }

    /**
     * Sets the number of rows in the text area.
     *
     * @param rows
     *            the number of rows for this text area.
     * @see TextArea#setRows(int)
     * @return this for method chaining
     */
    @SuppressWarnings("unchecked")
    public default THIS withRows(int rows) {
        ((TextArea) this).setRows(rows);
        return (THIS) this;
    }
}
