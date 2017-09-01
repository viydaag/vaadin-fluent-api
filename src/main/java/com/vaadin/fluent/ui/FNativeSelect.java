package com.vaadin.fluent.ui;

import java.util.Collection;

import com.vaadin.data.provider.DataProvider;
import com.vaadin.fluent.api.FluentNativeSelect;
import com.vaadin.ui.NativeSelect;

public class FNativeSelect<T>
        extends NativeSelect<T>
        implements FluentNativeSelect<FNativeSelect<T>, T> {

    private static final long serialVersionUID = -8375689535557547846L;

    public FNativeSelect() {
        super();
    }

    public FNativeSelect(String caption, Collection<T> items) {
        super(caption, items);
    }

    public FNativeSelect(String caption, DataProvider<T, ?> dataProvider) {
        super(caption, dataProvider);
    }

    public FNativeSelect(String caption) {
        super(caption);
    }

}
