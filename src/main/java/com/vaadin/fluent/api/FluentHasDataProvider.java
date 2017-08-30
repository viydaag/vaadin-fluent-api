package com.vaadin.fluent.api;

import java.util.Collection;

import com.vaadin.data.HasDataProvider;
import com.vaadin.data.provider.DataProvider;

public interface FluentHasDataProvider<THIS extends FluentHasDataProvider<THIS, ITEM>, ITEM>
        extends HasDataProvider<ITEM>, FluentHasItems<THIS, ITEM> {

    @SuppressWarnings("unchecked")
    @Override
    public default THIS withItems(Collection<ITEM> items) {
        this.setItems(items);
        return (THIS) this;
    }

    @SuppressWarnings("unchecked")
    public default THIS withDataProvider(DataProvider<ITEM, ?> dataProvider) {
        this.setDataProvider(dataProvider);
        return (THIS) this;
    }

}
