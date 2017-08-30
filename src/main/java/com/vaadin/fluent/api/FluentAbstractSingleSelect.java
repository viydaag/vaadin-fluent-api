package com.vaadin.fluent.api;

import com.vaadin.data.HasValue;
import com.vaadin.event.selection.SingleSelectionListener;
import com.vaadin.ui.AbstractSingleSelect;

public interface FluentAbstractSingleSelect<THIS extends FluentAbstractSingleSelect<THIS, VALUE>, VALUE>
        extends FluentAbstractListing<THIS, VALUE>, FluentHasValue<THIS, VALUE> {

    @SuppressWarnings("unchecked")
    public default THIS withSelectedItem(VALUE item) {
        ((AbstractSingleSelect<VALUE>) this).setSelectedItem(item);
        return (THIS) this;
    }

    @SuppressWarnings("unchecked")
    public default THIS withSelectionListener(SingleSelectionListener<VALUE> listener) {
        ((AbstractSingleSelect<VALUE>) this).addSelectionListener(listener);
        return (THIS) this;
    }

    @SuppressWarnings("unchecked")
    public default THIS withValueChangeListener(HasValue.ValueChangeListener<VALUE> listener) {
        ((AbstractSingleSelect<VALUE>) this).addValueChangeListener(listener);
        return (THIS) this;
    }

}
