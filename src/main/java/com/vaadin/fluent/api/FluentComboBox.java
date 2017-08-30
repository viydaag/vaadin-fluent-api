package com.vaadin.fluent.api;

import com.vaadin.fluent.api.FluentFieldEvents.FluentBlurNotifier;
import com.vaadin.fluent.api.FluentFieldEvents.FluentFocusNotifier;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.IconGenerator;
import com.vaadin.ui.ItemCaptionGenerator;

public interface FluentComboBox<THIS extends FluentComboBox<THIS, VALUE>, VALUE>
        extends FluentAbstractSingleSelect<THIS, VALUE>, FluentHasValue<THIS, VALUE>, FluentBlurNotifier<THIS>, FluentFocusNotifier<THIS> {

    @SuppressWarnings("unchecked")
    @Override
    public default THIS withItemCaptionGenerator(ItemCaptionGenerator<VALUE> itemCaptionGenerator) {
        ((ComboBox<VALUE>) this).setItemCaptionGenerator(itemCaptionGenerator);
        return (THIS) this;
    }

    @SuppressWarnings("unchecked")
    public default THIS withItemIconGenerator(IconGenerator<VALUE> itemIconGenerator) {
        ((ComboBox<VALUE>) this).setItemIconGenerator(itemIconGenerator);
        return (THIS) this;
    }

    @SuppressWarnings("unchecked")
    public default THIS withEmptySelectionAllowed(boolean emptySelectionAllowed) {
        ((ComboBox<VALUE>) this).setEmptySelectionAllowed(emptySelectionAllowed);
        return (THIS) this;
    }

    @SuppressWarnings("unchecked")
    public default THIS withEmptySelectionCaption(String caption) {
        ((ComboBox<VALUE>) this).setEmptySelectionCaption(caption);
        return (THIS) this;
    }

    @SuppressWarnings("unchecked")
    public default THIS withPageLength(int pageLength) {
        ((ComboBox<VALUE>) this).setPageLength(pageLength);
        return (THIS) this;
    }

    @SuppressWarnings("unchecked")
    public default THIS withPageLength(String placeholder) {
        ((ComboBox<VALUE>) this).setPlaceholder(placeholder);
        return (THIS) this;
    }

    @SuppressWarnings("unchecked")
    public default THIS withTextInputAllowed(boolean textInputAllowed) {
        ((ComboBox<VALUE>) this).setTextInputAllowed(textInputAllowed);
        return (THIS) this;
    }

}
