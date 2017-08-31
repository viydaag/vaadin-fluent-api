package com.vaadin.fluent.api;

import com.vaadin.ui.AbstractTextField;

/**
 * The base interface for fluent versions of {@link AbstractTextField}
 * 
 * @see AbstractTextField
 *
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentAbstractTextField<THIS extends FluentAbstractTextField<THIS>>
        extends FluentAbstractField<THIS, String>, FluentHasValueChangeMode<THIS> {

    /**
     * Sets the placeholder text for the field.
     *
     * @see AbstractTextField#setPlaceholder(java.lang.String) 
     * @param placeholder the placeholder text to be used
     * @return this for method chaining
     */
    @SuppressWarnings("unchecked")
    public default THIS withPlaceholder(String placeholder) {
        ((AbstractTextField) this).setPlaceholder(placeholder);
        return (THIS) this;
    }
}
