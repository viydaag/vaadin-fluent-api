package com.vaadin.fluent.api;

import com.vaadin.fluent.api.FluentComponent.FluentFocusable;
import com.vaadin.ui.AbstractListing;

/**
 * The base interface for fluent versions of {@link AbstractListing}
 * 
 * @see AbstractListing
 *
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentAbstractListing<THIS extends FluentAbstractListing<THIS, ITEM>, ITEM>
        extends FluentAbstractComponent<THIS>, FluentHasItems<THIS, ITEM>, FluentFocusable<THIS> {

}
