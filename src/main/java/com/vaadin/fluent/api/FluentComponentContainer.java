package com.vaadin.fluent.api;

import com.vaadin.ui.Component;
import com.vaadin.ui.ComponentContainer;

/**
 * The base interface for fluent versions of {@link ComponentContainer}
 * 
 * @see ComponentContainer
 *
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentComponentContainer<THIS extends FluentComponentContainer<THIS>>
        extends ComponentContainer, FluentHasComponents<THIS>, FluentHasComponents.FluentComponentAttachDetachNotifier<THIS> {

    /**
     * Adds the component into this container.
     *
     * @param c
     *            the component to be added.
     * @return this (for method chaining)
     * @see #addComponent(com.vaadin.ui.Component)
     */
    @SuppressWarnings("unchecked")
    public default THIS withComponent(Component c) {
        ((ComponentContainer) this).addComponent(c);
        return (THIS) this;
    }

    /**
     * Adds the components in the given order to this component container.
     *
     * @param components
     *            The components to add.
     * @return this (for method chaining)
     * @see #addComponents(com.vaadin.ui.Component...)
     */
    @SuppressWarnings("unchecked")
    public default THIS withComponents(Component... components) {
        ((ComponentContainer) this).addComponents(components);
        return (THIS) this;
    }

}
