package com.vaadin.fluent.api;

import com.vaadin.fluent.api.FluentComponent.FluentFocusable;
import com.vaadin.ui.AbstractField;

/**
 * The base interface for fluent versions of {@link AbstractField}
 * 
 * @see AbstractField
 *
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentAbstractField<THIS extends FluentAbstractField<THIS, FIELD>, FIELD>
        extends FluentAbstractComponent<THIS>, FluentHasValue<THIS, FIELD>, FluentFocusable<THIS> {

}
