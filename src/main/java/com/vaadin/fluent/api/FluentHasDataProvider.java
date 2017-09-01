package com.vaadin.fluent.api;

import java.util.Collection;

import com.vaadin.data.HasDataProvider;
import com.vaadin.data.provider.DataProvider;

/**
 * The base interface for fluent versions of {@link HasDataProvider}
 * 
 * @see HasDataProvider
 * 
 * @param <THIS> Self-referential generic THIS
 * @param <ITEM> The item type in the data provider
 */
public interface FluentHasDataProvider<THIS extends FluentHasDataProvider<THIS, ITEM>, ITEM>
        extends HasDataProvider<ITEM>, FluentHasItems<THIS, ITEM> {

    /**
     * @see HasDataProvider#setItems(Collection)
     * @return this for method chaining
     */
    @SuppressWarnings("unchecked")
    @Override
    public default THIS withItems(Collection<ITEM> items) {
        this.setItems(items);
        return (THIS) this;
    }

    /**
     * Sets the data provider for this listing. The data provider is queried for
     * displayed items as needed.
     *
     * @param dataProvider
     *            the data provider, not null
     * @return this for method chaining
     * @see HasDataProvider#setDataProvider(DataProvider)
     */
    @SuppressWarnings("unchecked")
    public default THIS withDataProvider(DataProvider<ITEM, ?> dataProvider) {
        this.setDataProvider(dataProvider);
        return (THIS) this;
    }

}
