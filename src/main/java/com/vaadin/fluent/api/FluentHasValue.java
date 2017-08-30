package com.vaadin.fluent.api;

import com.vaadin.data.HasValue;

public interface FluentHasValue<THIS, VALUE>
        extends HasValue<VALUE> {

    /**
     * Sets the value of this object. If the new value is not equal to
     * {@code getValue()}, fires a value change event. May throw
     * {@code IllegalArgumentException} if the value is not acceptable.
     * <p>
     * <i>Implementation note:</i> the implementing class should document
     * whether null values are accepted or not.
     *
     * @param value
     *            the new value
     * @return this (for method chaining)
     * @throws IllegalArgumentException
     *             if the value is invalid
     */
    @SuppressWarnings("unchecked")
    public default THIS withValue(VALUE value) {
        this.setValue(value);
        return (THIS) this;
    }

    /**
     * Sets the read-only mode of this {@code HasValue} to given mode. The user
     * can't change the value when in read-only mode.
     * <p>
     * A {@code HasValue} with a visual component in read-only mode typically
     * looks visually different to signal to the user that the value cannot be
     * edited.
     *
     * @param readOnly
     *            a boolean value specifying whether the component is put
     *            read-only mode or not
     * @return this (for method chaining)
     */
    @SuppressWarnings("unchecked")
    public default THIS withReadOnly(boolean readOnly) {
        this.setReadOnly(readOnly);
        return (THIS) this;
    }

    /**
     * Sets the required indicator visible or not.
     * <p>
     * If set visible, it is visually indicated in the user interface.
     *
     * @param requiredIndicatorVisible
     *            <code>true</code> to make the required indicator visible,
     *            <code>false</code> if not
     * @return this (for method chaining)
     */
    @SuppressWarnings("unchecked")
    public default THIS withRequiredIndicatorVisible(boolean requiredIndicatorVisible) {
        this.setRequiredIndicatorVisible(requiredIndicatorVisible);
        return (THIS) this;
    }

    /**
     * Adds a value change listener. The listener is called when the value of
     * this {@code HasValue} is changed either by the user or programmatically.
     *
     * @param listener
     *            the value change listener, not null
     * @return a registration for the listener
     */
    @SuppressWarnings("unchecked")
    public default THIS withValueChangeListener(ValueChangeListener<VALUE> listener) {
        this.addValueChangeListener(listener);
        return (THIS) this;
    }
}
