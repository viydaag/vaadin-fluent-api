package com.vaadin.fluent.api;

import com.vaadin.server.Scrollable;

/**
 * The base interface for fluent versions of {@link Scrollable}
 * 
 * @see Scrollable
 * 
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentScrollable<THIS extends FluentScrollable<THIS>>
        extends Scrollable {

    /**
     * Sets scroll left offset.
     * 
     * <p>
     * Scrolling offset is the number of pixels this scrollable has been
     * scrolled right.
     * </p>
     * 
     * @param scrollLeft
     *            the xOffset.
     * @return this (for method chaining)
     * @see Scrollable#setScrollLeft(int)
     */
    @SuppressWarnings("unchecked")
    public default THIS withScrollLeft(int scrollLeft) {
        ((Scrollable) this).setScrollLeft(scrollLeft);
        return (THIS) this;
    }

    /**
     * Sets scroll top offset.
     * 
     * <p>
     * Scrolling offset is the number of pixels this scrollable has been
     * scrolled down.
     * </p>
     * 
     * <p>
     * The scrolling position is limited by the current height of the content
     * area. If the position is below the height, it is scrolled to the bottom.
     * However, if the same response also adds height to the content area,
     * scrolling to bottom only scrolls to the bottom of the previous content
     * area.
     * </p>
     * 
     * @param scrollTop
     *            the yOffset.
     * @return this (for method chaining)
     * @see Scrollable#setScrollTop(int)
     */
    @SuppressWarnings("unchecked")
    public default THIS withScrollTop(int scrollTop) {
        ((Scrollable) this).setScrollTop(scrollTop);
        return (THIS) this;
    }
}
