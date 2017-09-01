package com.vaadin.fluent.api;

import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.Label;

/**
 * The base interface for fluent versions of {@link Label}
 * 
 * @see Label
 *
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentLabel<THIS extends FluentLabel<THIS>>
        extends FluentAbstractComponent<THIS> {

    /**
     * Sets the text to be shown in the label.
     *
     * @param value
     *            the text to show in the label, null is converted to an empty
     *            string
     * @return this for method chaining
     * @see Label#setValue(String)
     */
    @SuppressWarnings("unchecked")
    public default THIS withValue(String value) {
        ((Label) this).setValue(value);
        return (THIS) this;
    }

    /**
     * Sets the content mode of the label.
     *
     * @param contentMode
     *            the content mode to set
     *
     * @return this for method chaining
     * @see ContentMode
     * @see Label#setContentMode(ContentMode)
     */
    @SuppressWarnings("unchecked")
    public default THIS withContentMode(ContentMode contentMode) {
        ((Label) this).setContentMode(contentMode);
        return (THIS) this;
    }

}
