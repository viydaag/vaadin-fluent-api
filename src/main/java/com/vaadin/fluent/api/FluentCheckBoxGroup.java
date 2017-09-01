package com.vaadin.fluent.api;

import com.vaadin.fluent.api.FluentFieldEvents.FluentBlurNotifier;
import com.vaadin.fluent.api.FluentFieldEvents.FluentFocusNotifier;
import com.vaadin.server.SerializablePredicate;
import com.vaadin.ui.AbstractListing;
import com.vaadin.ui.AbstractMultiSelect;
import com.vaadin.ui.CheckBoxGroup;
import com.vaadin.ui.IconGenerator;

/**
 * The base interface for fluent versions of {@link CheckBoxGroup}
 * 
 * @see CheckBoxGroup
 *
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentCheckBoxGroup<THIS extends FluentCheckBoxGroup<THIS, VALUE>, VALUE>
        extends FluentAbstractMultiSelect<THIS, VALUE>, FluentFocusNotifier<THIS>, FluentBlurNotifier<THIS>, FluentHasDataProvider<THIS, VALUE> {

    /**
     * @see IconGenerator
     * @see AbstractListing#setItemIconGenerator(IconGenerator)
     *
     * @param itemIconGenerator
     *            the item icon generator to set, not null
     * @return this for method chaining
     */
    @SuppressWarnings("unchecked")
    public default THIS withItemIconGenerator(IconGenerator<VALUE> itemIconGenerator) {
        ((CheckBoxGroup<VALUE>) this).setItemIconGenerator(itemIconGenerator);
        return (THIS) this;
    }

    /**
     * @see AbstractMultiSelect#setItemEnabledProvider(SerializablePredicate)
     *
     * @param itemEnabledProvider
     *            the item enabled provider to set, not {@code null}
     * @return this for method chaining
     */
    @SuppressWarnings("unchecked")
    public default THIS withItemEnabledProvider(SerializablePredicate<VALUE> itemEnabledProvider) {
        ((CheckBoxGroup<VALUE>) this).setItemEnabledProvider(itemEnabledProvider);
        return (THIS) this;
    }

    /**
     * Sets whether html is allowed in the item captions. If set to true, the
     * captions are passed to the browser as html and the developer is
     * responsible for ensuring no harmful html is used. If set to false, the
     * content is passed to the browser as plain text.
     *
     * @param htmlContentAllowed
     *            true if the captions are used as html, false if used as plain text
     * @return this for method chaining
     * @see CheckBoxGroup#setHtmlContentAllowed(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withHtmlContentAllowed(boolean htmlContentAllowed) {
        ((CheckBoxGroup<VALUE>) this).setHtmlContentAllowed(htmlContentAllowed);
        return (THIS) this;
    }

}
