package com.vaadin.fluent.api;

import java.util.Collection;
import java.util.stream.Stream;

import com.vaadin.data.HasItems;

public interface FluentHasItems<THIS extends FluentHasItems<THIS, ITEM>, ITEM>
        extends HasItems<ITEM>, FluentComponent<THIS> {

    @SuppressWarnings("unchecked")
    public default THIS withItems(Collection<ITEM> items) {
        this.setItems(items);
        return (THIS) this;
    }

    @SuppressWarnings("unchecked")
    public default THIS withItems(ITEM... items) {
        this.setItems(items);
        return (THIS) this;
    }

    @SuppressWarnings("unchecked")
    public default THIS withItems(Stream<ITEM> streamOfItems) {
        this.setItems(streamOfItems);
        return (THIS) this;
    }

}
