package com.vaadin.fluent.api;

import com.vaadin.ui.AbstractLayout;

/**
 * The base interface for fluent versions of {@link AbstractLayout}
 * 
 * @see AbstractLayout
 *
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentAbstractLayout<THIS extends FluentAbstractLayout<THIS>>
        extends FluentLayout<THIS>, FluentAbstractComponentContainer<THIS> {

}
