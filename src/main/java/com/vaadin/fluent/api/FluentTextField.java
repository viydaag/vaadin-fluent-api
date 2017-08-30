package com.vaadin.fluent.api;

import com.vaadin.ui.TextField;

/**
 * The base interface for fluent versions of {@link TextField}
 * 
 * @see TextField
 *
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentTextField<THIS extends FluentTextField<THIS>>
        extends FluentAbstractTextField<THIS> {

}
