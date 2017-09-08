package com.vaadin.fluent.api;

import com.vaadin.fluent.api.FluentFieldEvents.FluentBlurNotifier;
import com.vaadin.fluent.api.FluentFieldEvents.FluentFocusNotifier;
import com.vaadin.server.SerializablePredicate;
import com.vaadin.ui.IconGenerator;
import com.vaadin.ui.ItemCaptionGenerator;
import com.vaadin.ui.RadioButtonGroup;

/**
 * The base interface for fluent versions of {@link RadioButtonGroup}
 * 
 * @see RadioButtonGroup
 *
 * @param <THIS> Self-referential generic THIS
 * @param <ITEM> the item object type in the listing
 */
public interface FluentRadioButtonGroup<THIS extends FluentRadioButtonGroup<THIS, ITEM>, ITEM>
        extends FluentAbstractSingleSelect<THIS, ITEM>, FluentFocusNotifier<THIS>, FluentBlurNotifier<THIS>, FluentHasDataProvider<THIS, ITEM> {

    /**
     * Sets whether html is allowed in the item captions. If set to true, the
     * captions are passed to the browser as html and the developer is
     * responsible for ensuring no harmful html is used. If set to false, the
     * content is passed to the browser as plain text.
     *
     * @param htmlContentAllowed
     *            true if the captions are used as html, false if used as plain text
     * @return this for method chaining
     * @see RadioButtonGroup#setHtmlContentAllowed(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withHtmlContentAllowed(boolean htmlContentAllowed) {
        ((RadioButtonGroup<ITEM>) this).setHtmlContentAllowed(htmlContentAllowed);
        return (THIS) this;
    }

    /**
     * Sets the item caption generator that is used to produce the strings shown
     * in the radio button group for each item. By default,
     * {@link String#valueOf(Object)} is used.
     *
     * @param itemCaptionGenerator
     *            the item caption provider to use, not null
     * @return this for method chaining
     * @see RadioButtonGroup#setItemCaptionGenerator(ItemCaptionGenerator)
     */
    @SuppressWarnings("unchecked")
    public default THIS withItemCaptionGenerator(ItemCaptionGenerator<ITEM> itemCaptionGenerator) {
        ((RadioButtonGroup<ITEM>) this).setItemCaptionGenerator(itemCaptionGenerator);
        return (THIS) this;
    }

    /**
     * @see IconGenerator
     * @see RadioButtonGroup#setItemIconGenerator(IconGenerator)
     *
     * @param itemIconGenerator
     *            the item icon generator to set, not null
     * @return this for method chaining
     */
    @SuppressWarnings("unchecked")
    public default THIS withItemIconGenerator(IconGenerator<ITEM> itemIconGenerator) {
        ((RadioButtonGroup<ITEM>) this).setItemIconGenerator(itemIconGenerator);
        return (THIS) this;
    }

    /**
     * Sets the item enabled predicate for this radiobutton group. The predicate
     * is applied to each item to determine whether the item should be enabled
     * (true) or disabled (false). Disabled items are displayed as grayed out
     * and the user cannot select them. The default predicate always returns
     * true (all the items are enabled).
     *
     * @param itemEnabledProvider
     *            the item enable predicate, not null
     * @return this for method chaining
     * @see RadioButtonGroup#setItemEnabledProvider(SerializablePredicate)
     */
    @SuppressWarnings("unchecked")
    public default THIS withItemEnabledProvider(SerializablePredicate<ITEM> itemEnabledProvider) {
        ((RadioButtonGroup<ITEM>) this).setItemEnabledProvider(itemEnabledProvider);
        return (THIS) this;
    }

}
