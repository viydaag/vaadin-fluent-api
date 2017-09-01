package com.vaadin.fluent.api;

import com.vaadin.data.HasFilterableDataProvider;
import com.vaadin.data.provider.DataProvider;
import com.vaadin.server.SerializableFunction;

/**
 * The base interface for fluent versions of {@link HasFilterableDataProvider}
 * 
 * @see HasFilterableDataProvider
 * 
 * @param <THIS> Self-referential generic THIS
 * @param <ITEM> The item type in the listing
 * @param <FILTER> The filter object type
 */
public interface FluentHasFilterableDataProvider<THIS extends FluentHasFilterableDataProvider<THIS, ITEM, FILTER>, ITEM, FILTER>
        extends HasFilterableDataProvider<ITEM, FILTER>, FluentHasItems<THIS, ITEM> {

    /**
     * Sets the data provider for this listing. The data provider is queried for
     * displayed items as needed.
     *
     * @param dataProvider
     *            the data provider, not <code>null</code>
     * @return this for method chaining
     * @see HasFilterableDataProvider#setDataProvider(DataProvider)
     */
    @SuppressWarnings("unchecked")
    public default THIS withDataProvider(DataProvider<ITEM, FILTER> dataProvider) {
        this.setDataProvider(dataProvider);
        return (THIS) this;
    }

    /**
     * Sets the data provider and filter converter for this listing. The data
     * provider is queried for displayed items as needed.
     * @param <C> the listing type to convert to FILTER type
     *
     * @param dataProvider
     *            the data provider, not <code>null</code>
     * @param filterConverter
     *            a function that converts filter values produced by this
     *            listing into filter values expected by the provided data
     *            provider, not <code>null</code>
     * @return this for method chaining
     * @see HasFilterableDataProvider#setDataProvider(DataProvider, SerializableFunction)
     */
    @SuppressWarnings("unchecked")
    public default <C> THIS withDataProvider(DataProvider<ITEM, C> dataProvider, SerializableFunction<FILTER, C> filterConverter) {
        this.setDataProvider(dataProvider, filterConverter);
        return (THIS) this;
    }

}
