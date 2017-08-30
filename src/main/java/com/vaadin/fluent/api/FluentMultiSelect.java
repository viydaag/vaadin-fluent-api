package com.vaadin.fluent.api;

import java.util.Set;

import com.vaadin.event.selection.MultiSelectionListener;
import com.vaadin.ui.MultiSelect;

public interface FluentMultiSelect<THIS, VALUE>
        extends MultiSelect<VALUE>, FluentHasValue<THIS, Set<VALUE>> {

    @SuppressWarnings("unchecked")
    public default THIS withSelectionListener(MultiSelectionListener<VALUE> listener) {
        this.addSelectionListener(listener);
        return (THIS) this;
    }

}
