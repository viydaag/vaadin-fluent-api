package com.vaadin.fluent.api;

import com.vaadin.ui.VerticalLayout;

/**
 * The base interface for fluent versions of {@link VerticalLayout}
 * 
 * @see VerticalLayout
 */
public interface FluentVerticalLayout<THIS extends FluentVerticalLayout<THIS>>
        extends FluentLayout<THIS>, FluentAbstractOrderedLayout<THIS> {
}
