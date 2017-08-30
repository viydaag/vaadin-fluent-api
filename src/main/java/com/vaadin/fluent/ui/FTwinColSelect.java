package com.vaadin.fluent.ui;

import java.util.Collection;

import com.vaadin.data.provider.DataProvider;
import com.vaadin.fluent.api.FluentTwinColSelect;
import com.vaadin.ui.TwinColSelect;

public class FTwinColSelect<T>
        extends TwinColSelect<T>
        implements FluentTwinColSelect<FTwinColSelect<T>, T> {

    private static final long serialVersionUID = 3236979600921149443L;

    public FTwinColSelect() {
        super();
    }

    public FTwinColSelect(String caption) {
        super(caption);
    }

    public FTwinColSelect(String caption, DataProvider<T, ?> dataProvider) {
        super(caption, dataProvider);
    }

    public FTwinColSelect(String caption, Collection<T> options) {
        super(caption, options);
    }

}
