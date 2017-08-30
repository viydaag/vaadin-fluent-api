package com.vaadin.fluent.api;

import com.vaadin.ui.CustomField;

public interface FluentCustomField<THIS extends FluentCustomField<THIS, T>, T>
        extends FluentAbstractField<THIS, T>, FluentHasComponents<THIS> {
    /**
     * Sets the component to which all methods from the {@link Focusable}
     * interface should be delegated.
     * <p>
     * Set this to a wrapped field to include that field in the tabbing order,
     * to make it receive focus when {@link #focus()} is called and to make it
     * be correctly focused when used as a Grid editor component.
     * <p>
     * By default, {@link Focusable} events are handled by the super class and
     * ultimately ignored.
     *
     * @param focusDelegate
     *            the focusable component to which focus events are redirected
     * @return the configured component
     */
    @SuppressWarnings("unchecked")
    public default THIS withFocusDelegate(Focusable focusDelegate) {
        ((CustomField<T>) this).setFocusDelegate(focusDelegate);
        return (THIS) this;
    }
}
