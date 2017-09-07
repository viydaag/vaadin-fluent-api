package com.vaadin.fluent.api;

import com.vaadin.data.provider.SortOrder;
import com.vaadin.event.SortEvent;
import com.vaadin.event.SortEvent.SortListener;
import com.vaadin.event.SortEvent.SortNotifier;

/**
 * The base interface for fluent versions of {@link SortNotifier}
 * 
 * @see SortNotifier
 *
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentSortNotifier<THIS extends FluentSortNotifier<THIS, SORT>, SORT extends SortOrder<?>>
        extends SortNotifier<SORT> {

    /**
     * Adds a sort order change listener that gets notified when the sort
     * order changes.
     *
     * @param listener
     *            the sort order change listener to add
     * @return this for method chaining
     * @see SortEvent.SortNotifier#addSortListener(SortListener)
     */
    @SuppressWarnings("unchecked")
    public default THIS withSortListener(SortListener<SORT> listener) {
        this.addSortListener(listener);
        return (THIS) this;
    }
}
