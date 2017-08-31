package com.vaadin.fluent.api;

import com.vaadin.ui.AbstractSingleComponentContainer;

/**
 * The base interface for fluent versions of {@link AbstractSingleComponentContainer}
 * 
 * @see AbstractSingleComponentContainer
 *
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentAbstractSingleComponentContainer<THIS extends FluentAbstractSingleComponentContainer<THIS>>
        extends FluentAbstractComponent<THIS>, FluentSingleComponentContainer<THIS> {

}
