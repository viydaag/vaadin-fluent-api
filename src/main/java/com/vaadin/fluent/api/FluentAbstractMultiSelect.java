package com.vaadin.fluent.api;

import java.util.Set;

import com.vaadin.data.HasValue;
import com.vaadin.ui.AbstractMultiSelect;
import com.vaadin.ui.ItemCaptionGenerator;

/**
 * The base interface for fluent versions of {@link AbstractMultiSelect}
 *
 * @see AbstractMultiSelect
 *
 * @param <THIS>    Self-referential generic THIS
 * @param <VALUE>   Object type in the container
 */
public interface FluentAbstractMultiSelect<THIS extends FluentAbstractMultiSelect<THIS, VALUE>, VALUE>
        extends FluentAbstractListing<THIS, VALUE>, FluentMultiSelect<THIS, VALUE> {

    @Override
    @SuppressWarnings("unchecked")
    public default THIS withItemCaptionGenerator(ItemCaptionGenerator<VALUE> itemCaptionGenerator) {
        ((AbstractMultiSelect<VALUE>) this).setItemCaptionGenerator(itemCaptionGenerator);
        return (THIS) this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public default THIS withValueChangeListener(HasValue.ValueChangeListener<Set<VALUE>> listener) {
        ((AbstractMultiSelect<VALUE>) this).addValueChangeListener(listener);
        return (THIS) this;
    }

}
