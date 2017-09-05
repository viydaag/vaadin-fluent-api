package com.vaadin.fluent.api;

import com.vaadin.ui.InlineDateField;

/**
 * The base interface for fluent versions of {@link InlineDateField}
 * 
 * @see InlineDateField
 * 
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentInlineDateField<THIS extends FluentInlineDateField<THIS>>
        extends FluentAbstractLocalDateField<THIS> {

}
