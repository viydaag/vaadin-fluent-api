package com.vaadin.fluent.api;

import com.vaadin.ui.TwinColSelect;

/**
 * The base interface for fluent versions of {@link TwinColSelect}
 * 
 * @see TwinColSelect
 *
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentTwinColSelect<THIS extends FluentTwinColSelect<THIS, ITEM>, ITEM>
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
     * @see TwinColSelect#setRows(int)
     */
    @SuppressWarnings("unchecked")
    public default THIS withRows(int rows) {
        ((TwinColSelect<ITEM>) this).setRows(rows);
        return (THIS) this;
    }

    /**
     * Sets the text shown above the left column. {@code null} clears the
     * caption.
     *
     * @param leftColumnCaption
     *            The text to show, {@code null} to clear
     * @return this (for method chaining)
     * @see TwinColSelect#setLeftColumnCaption(String)
     */
    @SuppressWarnings("unchecked")
    public default THIS withLeftColumnCaption(String leftColumnCaption) {
        ((TwinColSelect<ITEM>) this).setLeftColumnCaption(leftColumnCaption);
        return (THIS) this;
    }

    /**
     * Sets the text shown above the right column. {@code null} clears the
     * caption.
     *
     * @param rightColumnCaption
     *            The text to show, {@code null} to clear
     * @return this (for method chaining)
     * @see TwinColSelect#setRightColumnCaption(String)
     */
    @SuppressWarnings("unchecked")
    public default THIS withRightColumnCaption(String rightColumnCaption) {
        ((TwinColSelect<ITEM>) this).setRightColumnCaption(rightColumnCaption);
        return (THIS) this;
    }

}
