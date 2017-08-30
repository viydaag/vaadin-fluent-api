package com.vaadin.fluent.api;

import com.vaadin.event.ContextClickEvent;

/**
 * A {@link ContextClickEvent.ContextClickNotifier} complemented by fluent
 * setters.
 *
 * @param <THIS> Self-referential generic THIS
 * @see ContextClickEvent.ContextClickNotifier
 */
public interface FluentContextClickNotifier<THIS extends FluentContextClickNotifier<THIS>>
        extends ContextClickEvent.ContextClickNotifier {

    /**
     * Adds a context click listener that gets notified when a context click
     * happens.
     *
     * @param listener the context click listener to add
     * @return this (for method chaining)
     * @see
     * #addContextClickListener(com.vaadin.event.ContextClickEvent.ContextClickListener)
     */
    @SuppressWarnings("unchecked")
    public default THIS withContextClickListener(ContextClickEvent.ContextClickListener listener) {
        this.addContextClickListener(listener);
        return (THIS) this;
    }

}
