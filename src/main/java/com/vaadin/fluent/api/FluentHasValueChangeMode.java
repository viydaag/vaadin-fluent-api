package com.vaadin.fluent.api;

import com.vaadin.data.HasValue.ValueChangeEvent;
import com.vaadin.shared.ui.ValueChangeMode;
import com.vaadin.ui.HasValueChangeMode;

/**
 * The base interface for fluent versions of {@link HasValueChangeMode}
 * 
 * @see HasValueChangeMode
 * 
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentHasValueChangeMode<THIS extends FluentHasValueChangeMode<THIS>>
        extends HasValueChangeMode, FluentComponent<THIS> {

    /**
     * Sets the mode how the TextField triggers {@link ValueChangeEvent}THIS.
     *
     * @param valueChangeMode
     *            the new mode
     *
     * @see HasValueChangeMode#setValueChangeMode(ValueChangeMode)
     * @return this (for method chaining)
     */
    @SuppressWarnings("unchecked")
    public default THIS withValueChangeMode(ValueChangeMode valueChangeMode) {
        this.setValueChangeMode(valueChangeMode);
        return (THIS) this;
    }

    /**
     * Sets how often {@link ValueChangeEvent}THIS are triggered when the
     * {@link ValueChangeMode} is set to either {@link ValueChangeMode#LAZY} or
     * {@link ValueChangeMode#TIMEOUT}.
     *
     * @param valueChangeTimeout
     *            timeout in milliseconds, must be greater or equal to 0
     * @throws IllegalArgumentException
     *             if given timeout is smaller than 0
     *
     * @see HasValueChangeMode#setValueChangeTimeout(int)
     * @return this (for method chaining)
     */
    @SuppressWarnings("unchecked")
    public default THIS withValueChangeTimeout(int valueChangeTimeout) {
        this.setValueChangeTimeout(valueChangeTimeout);
        return (THIS) this;
    }
}
