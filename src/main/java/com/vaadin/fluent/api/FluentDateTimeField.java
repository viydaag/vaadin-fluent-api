package com.vaadin.fluent.api;

import com.vaadin.ui.DateTimeField;

/**
 * The base interface for fluent versions of {@link DateTimeField}
 * 
 * @see DateTimeField
 * 
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentDateTimeField<THIS extends FluentDateTimeField<THIS>>
        extends FluentAbstractLocalDateTimeField<THIS> {

    /**
     * Set a description that explains the usage of the Widget for users of
     * assistive devices.
     *
     * @param description
     *            String with the description
     * @return this for method chaining
     * @see DateTimeField#setAssistiveText(String)
     */
    @SuppressWarnings("unchecked")
    public default THIS withAssistiveText(String description) {
        ((DateTimeField) this).setAssistiveText(description);
        return (THIS) this;
    }

    /**
     * Sets the placeholder text. The placeholder is text that is displayed when
     * the field would otherwise be empty, to prompt the user for input.
     *
     * @param placeholder
     *            the placeholder text to set
     * @return this for method chaining
     * @see DateTimeField#setPlaceholder(String)
     */
    @SuppressWarnings("unchecked")
    public default THIS withPlaceholder(String placeholder) {
        ((DateTimeField) this).setPlaceholder(placeholder);
        return (THIS) this;
    }

    /**
     * Enables or disables the text field. By default the text field is enabled.
     * Disabling it causes only the button for date selection to be active, thus
     * preventing the user from entering invalid dates.
     *
     * @param state
     *            <b>true</b> to enable text field, <b>false</b> to disable it.
     * @return this for method chaining
     * @see DateTimeField#setTextFieldEnabled(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withTextFieldEnabled(boolean state) {
        ((DateTimeField) this).setTextFieldEnabled(state);
        return (THIS) this;
    }

}
