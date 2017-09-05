package com.vaadin.fluent.api;

import java.util.Set;

import com.vaadin.event.selection.MultiSelectionListener;
import com.vaadin.ui.MultiSelect;

/**
 * The base interface for fluent versions of {@link MultiSelect}
 * 
 * @see MultiSelect
 * 
 * @param <THIS> Self-referential generic THIS
 * @param <VALUE> Value object type in the listing
 */
public interface FluentMultiSelect<THIS, VALUE>
        extends MultiSelect<VALUE>, FluentHasValue<THIS, Set<VALUE>> {

    /**
     * Adds a selection listener that will be called when the selection is
     * changed either by the user or programmatically.
     *
     * @param listener
     *            the value change listener, not {@code null}
     * @return this (for method chaining)
     * @see MultiSelect#addSelectionListener(MultiSelectionListener)
     */
    @SuppressWarnings("unchecked")
    public default THIS withSelectionListener(MultiSelectionListener<VALUE> listener) {
        this.addSelectionListener(listener);
        return (THIS) this;
    }

}
