package com.vaadin.fluent.api;

import com.vaadin.data.provider.DataProvider;
import com.vaadin.data.provider.HierarchicalDataCommunicator;
import com.vaadin.event.CollapseEvent;
import com.vaadin.event.CollapseEvent.CollapseListener;
import com.vaadin.event.ExpandEvent;
import com.vaadin.event.ExpandEvent.ExpandListener;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Grid.Column;
import com.vaadin.ui.ItemCollapseAllowedProvider;
import com.vaadin.ui.TreeGrid;

/**
 * The base interface for fluent versions of {@link TreeGrid}
 * 
 * @see TreeGrid
 *
 * @param <THIS> Self-referential generic THIS
 * @param <ITEM> the item object type in the listing
 */
public interface FluentTreeGrid<THIS extends FluentTreeGrid<THIS, ITEM>, ITEM>
        extends FluentGrid<THIS, ITEM>, FluentHasHierarchicalDataProvider<THIS, ITEM> {

    /**
     * Adds a CollapseListener to this TreeGrid.
     *
     * @see CollapseEvent
     *
     * @param listener
     *            the listener to add
     * @return this for method chaining
     * @see TreeGrid#addCollapseListener(CollapseEvent.CollapseListener)
     */
    @SuppressWarnings("unchecked")
    public default THIS withCollapseListener(CollapseListener<ITEM> listener) {
        ((TreeGrid<ITEM>) this).addCollapseListener(listener);
        return (THIS) this;
    }

    /**
     * Adds an ExpandListener to this TreeGrid.
     *
     * @see ExpandEvent
     *
     * @param listener
     *            the listener to add
     * @return this for method chaining
     * @see TreeGrid#addExpandListener(ExpandEvent.ExpandListener)
     */
    @SuppressWarnings("unchecked")
    public default THIS withExpandListener(ExpandListener<ITEM> listener) {
        ((TreeGrid<ITEM>) this).addExpandListener(listener);
        return (THIS) this;
    }

    /**
     * Sets the data provider for the tree grid.
     * 
     * @param dataProvider
     *              the data provider, not null
     * 
     * @return this for method chaining
     * @see TreeGrid#setDataProvider(DataProvider)
     */
    @SuppressWarnings("unchecked")
    @Override
    public default THIS withDataProvider(DataProvider<ITEM, ?> dataProvider) {
        ((TreeGrid<ITEM>) this).setDataProvider(dataProvider);
        return (THIS) this;
    }

    /**
     * Set the column that displays the hierarchy of this grid's data. By
     * default the hierarchy will be displayed in the first column.
     * <p>
     * Setting a hierarchy column by calling this method also sets the column to
     * be visible and not hidable.
     * <p>
     * <strong>Note:</strong> Changing the Renderer of the hierarchy column is
     * not supported.
     *
     * @param column
     *            the column to use for displaying hierarchy
     * @return this for method chaining
     * @see TreeGrid#setHierarchyColumn(Grid.Column)
     */
    @SuppressWarnings("unchecked")
    public default THIS withHierarchyColumn(Column<ITEM, ?> column) {
        ((TreeGrid<ITEM>) this).setHierarchyColumn(column);
        return (THIS) this;
    }

    /**
     * Set the column that displays the hierarchy of this grid's data. By
     * default the hierarchy will be displayed in the first column.
     * <p>
     * Setting a hierarchy column by calling this method also sets the column to
     * be visible and not hidable.
     * <p>
     * <strong>Note:</strong> Changing the Renderer of the hierarchy column is
     * not supported.
     *
     * @see Column#setId(String)
     *
     * @param id
     *            id of the column to use for displaying hierarchy
     * @return this for method chaining
     * @see TreeGrid#setHierarchyColumn(String)
     */
    @SuppressWarnings("unchecked")
    public default THIS withHierarchyColumn(String id) {
        ((TreeGrid<ITEM>) this).setHierarchyColumn(id);
        return (THIS) this;
    }

    /**
     * Sets the item collapse allowed provider for this TreeGrid. The provider
     * should return {@code true} for any item that the user can collapse.
     * <p>
     * <strong>Note:</strong> This callback will be accessed often when sending
     * data to the client. The callback should not do any costly operations.
     * <p>
     * This method is a shortcut to method with the same name in
     * {@link HierarchicalDataCommunicator}.
     *
     * @param provider
     *            the item collapse allowed provider, not {@code null}
     *
     * @return this for method chaining
     * @see TreeGrid#setItemCollapseAllowedProvider(ItemCollapseAllowedProvider)
     * @see HierarchicalDataCommunicator#setItemCollapseAllowedProvider(ItemCollapseAllowedProvider)
     */
    @SuppressWarnings("unchecked")
    public default THIS withItemCollapseAllowedProvider(ItemCollapseAllowedProvider<ITEM> provider) {
        ((TreeGrid<ITEM>) this).setItemCollapseAllowedProvider(provider);
        return (THIS) this;
    }
}
