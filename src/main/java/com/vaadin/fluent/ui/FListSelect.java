package com.vaadin.fluent.ui;

import java.util.Collection;

import com.vaadin.data.provider.DataProvider;
import com.vaadin.fluent.api.FluentListSelect;
import com.vaadin.ui.ListSelect;

public class FListSelect<T>
        extends ListSelect<T>
        implements FluentListSelect<FListSelect<T>, T> {

    private static final long serialVersionUID = 3010574162681816232L;

    public FListSelect() {
        super();
    }

    public FListSelect(String caption) {
        super(caption);
    }

    public FListSelect(String caption, DataProvider<T, ?> dataProvider) {
        super(caption, dataProvider);
    }

    public FListSelect(String caption, Collection<T> options) {
        super(caption, options);
    }

}
