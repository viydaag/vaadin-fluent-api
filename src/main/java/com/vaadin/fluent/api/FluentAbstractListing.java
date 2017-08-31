package com.vaadin.fluent.api;

import com.vaadin.fluent.api.FluentComponent.FluentFocusable;
import com.vaadin.ui.AbstractListing;
import com.vaadin.ui.ItemCaptionGenerator;

/**
 * The base interface for fluent versions of {@link AbstractListing}
 * 
 * @see AbstractListing
 *
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentAbstractListing<THIS extends FluentAbstractListing<THIS, ITEM>, ITEM>
        extends FluentAbstractComponent<THIS>, FluentHasItems<THIS, ITEM>, FluentFocusable<THIS> {

    /**
     * Sets the item caption generator that is used to produce the strings shown
     * in the combo box for each item. By default,
     * {@link String#valueOf(Object)} is used.
     *
     * @param itemCaptionGenerator
     *            the item caption provider to use, not null
     * @return this for method chaining
     */
    public THIS withItemCaptionGenerator(ItemCaptionGenerator<ITEM> itemCaptionGenerator);

}
