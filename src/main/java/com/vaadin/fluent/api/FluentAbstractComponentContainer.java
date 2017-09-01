package com.vaadin.fluent.api;

import com.vaadin.ui.AbstractComponentContainer;

/**
 * The base interface for fluent versions of {@link AbstractComponentContainer}
 * 
 * @see AbstractComponentContainer
 *
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentAbstractComponentContainer<THIS extends FluentAbstractComponentContainer<THIS>>
        extends FluentAbstractComponent<THIS>, FluentComponentContainer<THIS> {

}
