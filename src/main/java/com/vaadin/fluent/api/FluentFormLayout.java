package com.vaadin.fluent.api;

import com.vaadin.ui.FormLayout;

/**
 * The base interface for fluent versions of {@link FormLayout}
 * 
 * @see FormLayout
 */
public interface FluentFormLayout<THIS extends FluentFormLayout<THIS>>
        extends FluentLayout<THIS>, FluentAbstractOrderedLayout<THIS> {
}
