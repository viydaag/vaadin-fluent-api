package com.vaadin.fluent.api;

import com.vaadin.ui.HorizontalLayout;

/**
 * The base interface for fluent versions of {@link HorizontalLayout}
 * 
 * @see HorizontalLayout
 * 
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentHorizontalLayout<THIS extends FluentHorizontalLayout<THIS>>
        extends FluentAbstractOrderedLayout<THIS> {
}
