package com.vaadin.fluent.api;

import com.vaadin.server.ClientConnector;

/**
 * The base interface for fluent versions of {@link ClientConnector}
 * 
 * @see ClientConnector
 *
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentClientConnector<THIS extends FluentClientConnector<THIS>>
        extends ClientConnector {

    /**
     * Adds an attach listener to this connector.
     * 
     * @param listener
     *            The attach listener
     * @return this (for method chaining)
     * @see #addAttachListener(com.vaadin.server.ClientConnector.AttachListener)
     */
    @SuppressWarnings("unchecked")
    public default THIS withAttachListener(AttachListener listener) {
        this.addAttachListener(listener);
        return (THIS) this;
    }

    /**
     * Adds a detach listener to this connector.
     * 
     * @param listener
     *            The detach listener
     * @return this (for method chaining)
     * @see #addDetachListener(com.vaadin.server.ClientConnector.DetachListener)
     */
    @SuppressWarnings("unchecked")
    public default THIS withDetachListener(DetachListener listener) {
        this.addDetachListener(listener);
        return (THIS) this;
    }
}
