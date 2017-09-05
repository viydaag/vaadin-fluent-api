package com.vaadin.fluent.api;

import com.vaadin.ui.DateField;

/**
 * The base interface for fluent versions of {@link DateField}
 * 
 * @see DateField
 * 
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentDateField<THIS extends FluentDateField<THIS>>
        extends FluentAbstractLocalDateField<THIS> {

    /**
     * Set a description that explains the usage of the Widget for users of
     * assistive devices.
     *
     * @param description
     *            String with the description
     * @return this for method chaining
     * @see DateField#setAssistiveText(String)
     */
    @SuppressWarnings("unchecked")
    public default THIS withAssistiveText(String description) {
        ((DateField) this).setAssistiveText(description);
        return (THIS) this;
    }

    /**
     * Sets the placeholder text. The placeholder is text that is displayed when
     * the field would otherwise be empty, to prompt the user for input.
     *
     * @param placeholder
     *            the placeholder text to set
     * @return this for method chaining
     * @see DateField#setPlaceholder(String)
     */
    @SuppressWarnings("unchecked")
    public default THIS withPlaceholder(String placeholder) {
        ((DateField) this).setPlaceholder(placeholder);
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
     * @see DateField#setTextFieldEnabled(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withTextFieldEnabled(boolean state) {
        ((DateField) this).setTextFieldEnabled(state);
        return (THIS) this;
    }

}
