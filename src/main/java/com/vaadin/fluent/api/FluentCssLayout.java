package com.vaadin.fluent.api;

import com.vaadin.ui.CssLayout;

/**
 * The base interface for fluent versions of {@link CssLayout}
 * 
 * @see CssLayout
 *
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentCssLayout<THIS extends FluentCssLayout<THIS>>
        extends FluentAbstractLayout<THIS> {

}
