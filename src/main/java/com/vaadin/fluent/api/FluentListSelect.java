package com.vaadin.fluent.api;

import com.vaadin.ui.ListSelect;

/**
 * The base interface for fluent versions of {@link ListSelect}
 * 
 * @see ListSelect
 *
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentListSelect<THIS extends FluentListSelect<THIS, ITEM>, ITEM>
        extends FluentAbstractMultiSelect<THIS, ITEM>, FluentHasDataProvider<THIS, ITEM> {

    /**
     * Sets the number of rows in the selects. If the number of rows is set to 0
     * or less, the actual number of displayed rows is determined implicitly by
     * the selects.
     * <p>
     * If a height if set (using {@link #setHeight(String)} or
     * {@link #setHeight(float, Unit)}) it overrides the number of rows. Leave
     * the height undefined to use this method.
     *
     * @param rows
     *            the number of rows to set.
     * @return this (for method chaining)
     * @see ListSelect#setRows(int)
     */
    @SuppressWarnings("unchecked")
    public default THIS withRows(int rows) {
        ((ListSelect<ITEM>) this).setRows(rows);
        return (THIS) this;
    }

}
