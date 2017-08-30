package com.vaadin.fluent.ui;

import java.util.Collection;

import com.vaadin.data.provider.DataProvider;
import com.vaadin.fluent.api.FluentCheckBoxGroup;
import com.vaadin.ui.CheckBoxGroup;

public class FCheckBoxGroup<T>
        extends CheckBoxGroup<T>
        implements FluentCheckBoxGroup<FCheckBoxGroup<T>, T> {

    private static final long serialVersionUID = 5870335606972601750L;

    public FCheckBoxGroup() {
        super();
    }

    public FCheckBoxGroup(String caption) {
        super(caption);
    }

    public FCheckBoxGroup(String caption, DataProvider<T, ?> dataProvider) {
        super(caption, dataProvider);
    }

    public FCheckBoxGroup(String caption, Collection<T> items) {
        super(caption, items);
    }


}
