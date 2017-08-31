package com.vaadin.fluent.api;

import java.util.Collection;
import java.util.stream.Stream;

import com.vaadin.data.HasItems;
import com.vaadin.data.provider.BackEndDataProvider;
import com.vaadin.data.provider.DataProvider;
import com.vaadin.data.provider.ListDataProvider;

/**
 * The base interface for fluent versions of {@link HasItems}
 * 
 * @see HasItems
 * 
 * @param <THIS> Self-referential generic THIS
 * @param <ITEM> The item type in the listing
 */
public interface FluentHasItems<THIS extends FluentHasItems<THIS, ITEM>, ITEM>
        extends HasItems<ITEM>, FluentComponent<THIS> {

    /**
     * Sets the data items of this component provided as a collection.
     * <p>
     * The provided items are wrapped into a {@link ListDataProvider} and this
     * instance is used as a data provider for the
     * {@link #setDataProvider(DataProvider)} method. It means that the items
     * collection can be accessed later on via
     * {@link ListDataProvider#getItems()}:
     *
     * <pre>
     * <code>
     * HasDataProvider&lt;String&gt; listing = new CheckBoxGroup&lt;&gt;();
     * listing.setItems(Arrays.asList("a","b"));
     * ...
     *
     * Collection<String> collection = ((ListDataProvider<String>)listing.getDataProvider()).getItems();
     * </code>
     * </pre>
     * <p>
     * The provided collection instance may be used as-is. Subsequent
     * modification of the collection might cause inconsistent data to be shown
     * in the component unless it is explicitly instructed to read the data
     * again.
     *
     * @param items
     *            the data items to display, not null
     * @return this for method chaining
     * @see HasItems#setItems(Collection)
     */
    @SuppressWarnings("unchecked")
    public default THIS withItems(Collection<ITEM> items) {
        this.setItems(items);
        return (THIS) this;
    }

    /**
     * Sets the data items of this listing.
     * <p>
     * The provided items are wrapped into a {@link ListDataProvider} and this
     * instance is used as a data provider for the
     * {@link #setDataProvider(DataProvider)} method. It means that the items
     * collection can be accessed later on via
     * {@link ListDataProvider#getItems()}:
     *
     * <pre>
     * <code>
     * HasDataProvider<String> listing = new CheckBoxGroup<>();
     * listing.setItems("a","b");
     * ...
     *
     * Collection<String> collection = ((ListDataProvider<String>)listing.getDataProvider()).getItems();
     * </code>
     * </pre>
     * <p>
     *
     * @see HasItems#setItems(Object...)
     *
     * @param items
     *            the data items to display
     * @return this for method chaining
     */
    @SuppressWarnings("unchecked")
    public default THIS withItems(ITEM... items) {
        this.setItems(items);
        return (THIS) this;
    }

    /**
     * Sets the data items of this listing provided as a stream.
     * <p>
     * This is just a shorthand for {@link #setItems(Collection)}, that
     * <b>collects objects in the stream to a list</b>. Thus, using this method,
     * instead of its array and Collection variations, doesn't save any memory.
     * If you have a large data set to bind, using a lazy data provider is
     * recommended. See {@link BackEndDataProvider} for more info.
     * <p>
     * The provided items are wrapped into a {@link ListDataProvider} and this
     * instance is used as a data provider for the
     * {@link #setDataProvider(DataProvider)} method. It means that the items
     * collection can be accessed later on via
     * {@link ListDataProvider#getItems()}:
     *
     * <pre>
     * <code>
     * HasDataProvider&lt;String&gt; listing = new CheckBoxGroup<&gt;();
     * listing.setItems(Stream.of("a","b"));
     * ...
     *
     * Collection<String> collection = ((ListDataProvider&lt;String&gt;)listing.getDataProvider()).getItems();
     * </code>
     * </pre>
     * <p>
     *
     * @see HasItems#setItems(Stream)
     *
     * @param streamOfItems
     *            the stream of data items to display, not {@code null}
     * @return this for method chaining
     */
    @SuppressWarnings("unchecked")
    public default THIS withItems(Stream<ITEM> streamOfItems) {
        this.setItems(streamOfItems);
        return (THIS) this;
    }

}
