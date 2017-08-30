package com.vaadin.fluent.api;

import com.vaadin.fluent.api.FluentFieldEvents.FluentBlurNotifier;
import com.vaadin.fluent.api.FluentFieldEvents.FluentFocusNotifier;
import com.vaadin.server.SerializablePredicate;
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

    @SuppressWarnings("unchecked")
    public default THIS withItemIconGenerator(IconGenerator<VALUE> itemIconGenerator) {
        ((CheckBoxGroup<VALUE>) this).setItemIconGenerator(itemIconGenerator);
        return (THIS) this;
    }

    @SuppressWarnings("unchecked")
    public default THIS withItemEnabledProvider(SerializablePredicate<VALUE> itemEnabledProvider) {
        ((CheckBoxGroup<VALUE>) this).setItemEnabledProvider(itemEnabledProvider);
        return (THIS) this;
    }

    @SuppressWarnings("unchecked")
    public default THIS withHtmlContentAllowed(boolean htmlContentAllowed) {
        ((CheckBoxGroup<VALUE>) this).setHtmlContentAllowed(htmlContentAllowed);
        return (THIS) this;
    }

}
