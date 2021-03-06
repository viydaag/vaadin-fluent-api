package com.vaadin.fluent.api;

import com.vaadin.ui.VerticalLayout;

/**
 * The base interface for fluent versions of {@link VerticalLayout}
 * 
 * @see VerticalLayout
 * 
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentVerticalLayout<THIS extends FluentVerticalLayout<THIS>>
        extends FluentLayout<THIS>, FluentAbstractOrderedLayout<THIS> {
}
