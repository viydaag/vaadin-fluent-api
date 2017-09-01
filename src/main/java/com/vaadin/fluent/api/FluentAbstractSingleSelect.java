package com.vaadin.fluent.api;

import com.vaadin.data.HasValue;
import com.vaadin.event.selection.SingleSelectionListener;
import com.vaadin.ui.AbstractSingleSelect;

/**
 * The base interface for fluent versions of {@link AbstractSingleSelect}
 * 
 * @see AbstractSingleSelect
 *
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentAbstractSingleSelect<THIS extends FluentAbstractSingleSelect<THIS, VALUE>, VALUE>
        extends FluentAbstractListing<THIS, VALUE>, FluentHasValue<THIS, VALUE> {

    /**
     * Sets the current selection to the given item or clears selection if given
     * {@code null}.
     *
     * @param item
     *            the item to select or {@code null} to clear selection
     * @return this for method chaining
     * @see AbstractSingleSelect#setSelectedItem(Object)
     */
    @SuppressWarnings("unchecked")
    public default THIS withSelectedItem(VALUE item) {
        ((AbstractSingleSelect<VALUE>) this).setSelectedItem(item);
        return (THIS) this;
    }

    /**
     * Adds a selection listener to this select. The listener is called when the
     * selection is changed either by the user or programmatically.
     *
     * @param listener
     *            the selection listener, not null
     * @return this for method chaining
     * @see AbstractSingleSelect#addSelectionListener(SingleSelectionListener)
     */
    @SuppressWarnings("unchecked")
    public default THIS withSelectionListener(SingleSelectionListener<VALUE> listener) {
        ((AbstractSingleSelect<VALUE>) this).addSelectionListener(listener);
        return (THIS) this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public default THIS withValueChangeListener(HasValue.ValueChangeListener<VALUE> listener) {
        ((AbstractSingleSelect<VALUE>) this).addValueChangeListener(listener);
        return (THIS) this;
    }

}
