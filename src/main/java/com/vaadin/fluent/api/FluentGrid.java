package com.vaadin.fluent.api;

import java.util.List;

import com.vaadin.data.PropertySet;
import com.vaadin.data.provider.CallbackDataProvider;
import com.vaadin.data.provider.GridSortOrder;
import com.vaadin.data.provider.GridSortOrderBuilder;
import com.vaadin.data.provider.Query;
import com.vaadin.event.selection.MultiSelectionListener;
import com.vaadin.event.selection.SelectionListener;
import com.vaadin.event.selection.SingleSelectionListener;
import com.vaadin.server.SerializableSupplier;
import com.vaadin.shared.data.sort.SortDirection;
import com.vaadin.shared.ui.grid.ColumnResizeMode;
import com.vaadin.shared.ui.grid.HeightMode;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Grid.Column;
import com.vaadin.ui.Grid.FetchItemsCallback;
import com.vaadin.ui.Grid.SelectionMode;
import com.vaadin.ui.StyleGenerator;
import com.vaadin.ui.components.grid.DescriptionGenerator;
import com.vaadin.ui.components.grid.DetailsGenerator;
import com.vaadin.ui.components.grid.GridSelectionModel;
import com.vaadin.ui.components.grid.HeaderRow;
import com.vaadin.ui.components.grid.ItemClickListener;
import com.vaadin.ui.components.grid.MultiSelectionModel;
import com.vaadin.ui.components.grid.MultiSelectionModelImpl;
import com.vaadin.ui.components.grid.NoSelectionModel;
import com.vaadin.ui.components.grid.SingleSelectionModel;
import com.vaadin.ui.components.grid.SingleSelectionModelImpl;

/**
 * The base interface for fluent versions of {@link Grid}
 * 
 * @see Grid
 *
 * @param <THIS> Self-referential generic THIS
 * @param <ITEM> the item object type in the listing
 */
public interface FluentGrid<THIS extends FluentGrid<THIS, ITEM>, ITEM>
        extends FluentAbstractListing<THIS, ITEM>, FluentHasComponents<THIS>, FluentHasDataProvider<THIS, ITEM>,
        FluentSortNotifier<THIS, GridSortOrder<ITEM>> {

    /**
     * Adds an item click listener. The listener is called when an item of this
     * {@code Grid} is clicked.
     *
     * @param listener
     *            the item click listener, not null
     * @return this for method chaining
     * @see Grid#addItemClickListener(ItemClickListener)
     */
    @SuppressWarnings("unchecked")
    public default THIS withItemClickListener(ItemClickListener<? super ITEM> listener) {
        ((Grid<ITEM>) this).addItemClickListener(listener);
        return (THIS) this;
    }

    /**
     * Adds a selection listener to the current selection model.
     * <p>
     * <em>NOTE:</em> If selection mode is switched with
     * {@link Grid#setSelectionMode(SelectionMode)}, then this listener is not
     * triggered anymore when selection changes!
     * <p>
     * This is a shorthand for
     * {@code grid.getSelectionModel().addSelectionListener()}. To get more
     * detailed selection events, use {@link Grid#getSelectionModel()} and either
     * {@link SingleSelectionModel#addSingleSelectionListener(SingleSelectionListener)}
     * or
     * {@link MultiSelectionModel#addMultiSelectionListener(MultiSelectionListener)}
     * depending on the used selection mode.
     *
     * @param listener
     *            the listener to add
     * @return this for method chaining
     * @see Grid#addSelectionListener(SelectionListener)
     * @throws UnsupportedOperationException
     *             if selection has been disabled with {@link SelectionMode#NONE}
     */
    @SuppressWarnings("unchecked")
    public default THIS withSelectionListener(SelectionListener<ITEM> listener) throws UnsupportedOperationException {
        ((Grid<ITEM>) this).addSelectionListener(listener);
        return (THIS) this;
    }

    /**
     * Sets a new column order for the grid. All columns which are not ordered
     * here will remain in the order they were before as the last columns of
     * grid.
     *
     * @param columns
     *            the columns in the order they should be
     * @return this for method chaining
     * @see Grid#setColumnOrder(Column...)
     */
    @SuppressWarnings("unchecked")
    public default THIS withColumnOrder(Column<ITEM, ?>... columns) {
        ((Grid<ITEM>) this).setColumnOrder(columns);
        return (THIS) this;
    }

    /**
     * Sets a new column order for the grid based on their column ids. All
     * columns which are not ordered here will remain in the order they were
     * before as the last columns of grid.
     *
     * @param columnIds
     *            the column ids in the order they should be
     *
     * @return this for method chaining
     * @see Grid#setColumnOrder(String...)
     */
    @SuppressWarnings("unchecked")
    public default THIS withColumnOrder(String... columnIds) {
        ((Grid<ITEM>) this).setColumnOrder(columnIds);
        return (THIS) this;
    }

    /**
     * Sets whether or not column reordering is allowed. Default value is
     * <code>false</code>.
     *
     * @param columnReorderingAllowed
     *            specifies whether column reordering is allowed
     * @return this for method chaining
     * @see Grid#setColumnReorderingAllowed(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withColumnReorderingAllowed(boolean columnReorderingAllowed) {
        ((Grid<ITEM>) this).setColumnReorderingAllowed(columnReorderingAllowed);
        return (THIS) this;
    }

    /**
     * Sets the column resize mode to use. The default mode is
     * {@link ColumnResizeMode#ANIMATED}.
     *
     * @param mode
     *            a ColumnResizeMode value
     * @return this for method chaining
     * @see Grid#setColumnResizeMode(ColumnResizeMode)
     */
    @SuppressWarnings("unchecked")
    public default THIS withColumnResizeMode(ColumnResizeMode mode) {
        ((Grid<ITEM>) this).setColumnResizeMode(mode);
        return (THIS) this;
    }

    /**
     * Sets the columns and their order based on their column ids. Columns
     * currently in this grid that are not present in the list of column ids are
     * removed. This includes any column that has no id. Similarly, any new
     * column in columns will be added to this grid. New columns can only be
     * added for a <code>Grid</code> created using {@link Grid#Grid(Class)} or
     * {@link Grid#withPropertySet(PropertySet)}.
     *
     *
     * @param columnIds
     *            the column ids to set
     *
     * @return this for method chaining
     * @see Grid#setColumns(String...)
     */
    @SuppressWarnings("unchecked")
    public default THIS withColumns(String... columnIds) {
        ((Grid<ITEM>) this).setColumns(columnIds);
        return (THIS) this;
    }

    /**
     * Sets a CallbackDataProvider using the given fetch items callback and a
     * size callback.
     * <p>
     * This method is a shorthand for making a {@link CallbackDataProvider} that
     * handles a partial {@link Query} object.
     *
     * @param fetchItems
     *            a callback for fetching items
     * @param sizeCallback
     *            a callback for getting the count of items
     *
     * @return this for method chaining
     * @see Grid#setDataProvider(FetchItemsCallback, SerializableSupplier)
     * @see CallbackDataProvider
     */
    @SuppressWarnings("unchecked")
    public default THIS withDataProvider(FetchItemsCallback<ITEM> fetchItems, SerializableSupplier<Integer> sizeCallback) {
        ((Grid<ITEM>) this).setDataProvider(fetchItems, sizeCallback);
        return (THIS) this;
    }

    /**
     * Sets the default row of the header. The default row is a special header
     * row that displays column captions and sort indicators. By default Grid
     * has a single row which is also the default row. When a header row is set
     * as the default row, any existing cell content is replaced by the column
     * captions.
     *
     * @param row
     *            the new default row, or null for no default row
     * @return this for method chaining
     * @see Grid#setDefaultHeaderRow(HeaderRow)
     *
     * @throws IllegalArgumentException
     *             if the header does not contain the row
     */
    @SuppressWarnings("unchecked")
    public default THIS withDefaultHeaderRow(HeaderRow row) {
        ((Grid<ITEM>) this).setDefaultHeaderRow(row);
        return (THIS) this;
    }

    /**
     * Sets the description generator that is used for generating descriptions
     * for rows.
     *
     * @param descriptionGenerator
     *            the row description generator to set, or <code>null</code> to
     *            remove a previously set generator
     * @return this for method chaining
     * @see Grid#setDescriptionGenerator(DescriptionGenerator)
     */
    @SuppressWarnings("unchecked")
    public default THIS withDescriptionGenerator(DescriptionGenerator<ITEM> descriptionGenerator) {
        ((Grid<ITEM>) this).setDescriptionGenerator(descriptionGenerator);
        return (THIS) this;
    }

    /**
     * Sets the details component generator.
     *
     * @param generator
     *            the generator for details components
     * @return this for method chaining
     * @see Grid#setDetailsGenerator(DetailsGenerator)
     */
    @SuppressWarnings("unchecked")
    public default THIS withDetailsGenerator(DetailsGenerator<ITEM> generator) {
        ((Grid<ITEM>) this).setDetailsGenerator(generator);
        return (THIS) this;
    }

    /**
     * Sets the visibility of the Footer in this Grid.
     * 
     * @param footerVisible
     *            {@code true} if visible; {@code false} if not
     * @return this for method chaining
     * @see Grid#setFooterVisible(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withFooterVisible(boolean footerVisible) {
        ((Grid<ITEM>) this).setFooterVisible(footerVisible);
        return (THIS) this;
    }

    /**
     * Sets the visibility of the Header in this Grid.
     * 
     * @param headerVisible
     *            {@code true} if visible; {@code false} if not
     * 
     * @return this for method chaining
     * @see Grid#setHeaderVisible(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withHeaderVisible(boolean headerVisible) {
        ((Grid<ITEM>) this).setHeaderVisible(headerVisible);
        return (THIS) this;
    }

    /**
     * Sets the number of frozen columns in this grid. Setting the count to 0
     * means that no data columns will be frozen, but the built-in selection
     * checkbox column will still be frozen if it's in use. Setting the count to
     * -1 will also disable the selection column.
     * <p>
     * <em>NOTE:</em> this count includes {@link Column#isHidden() hidden
     * columns} in the count.
     * <p>
     * The default value is 0.
     *
     * @param numberOfColumns
     *            the number of columns that should be frozen
     * @return this for method chaining
     * @see Grid#setFrozenColumnCount(int)
     *
     * @throws IllegalArgumentException
     *             if the column count is less than -1 or greater than the
     *             number of visible columns
     */
    @SuppressWarnings("unchecked")
    public default THIS withFrozenColumnCount(int numberOfColumns) {
        ((Grid<ITEM>) this).setFrozenColumnCount(numberOfColumns);
        return (THIS) this;
    }

    /**
     * Sets the number of rows that should be visible in Grid's body. This
     * method will set the height mode to be {@link HeightMode#ROW}.
     *
     * @param rows
     *            The height in terms of number of rows displayed in Grid's
     *            body. If Grid doesn't contain enough rows, white space is
     *            displayed instead. If <code>null</code> is given, then Grid's
     *            height is undefined
     * @return this for method chaining
     * @see Grid#setHeightByRows(double)
     * @throws IllegalArgumentException
     *             if {@code rows} is zero or less
     * @throws IllegalArgumentException
     *             if {@code rows} is {@link Double#isInfinite(double) infinite}
     * @throws IllegalArgumentException
     *             if {@code rows} is {@link Double#isNaN(double) NaN}
     */
    @SuppressWarnings("unchecked")
    public default THIS withHeightByRows(double rows) {
        ((Grid<ITEM>) this).setHeightByRows(rows);
        return (THIS) this;
    }

    /**
     * Sets the height of a row. If -1 (default), the row height is calculated
     * based on the theme for an empty row before the Grid is displayed.
     * <p>
     * Note that all header, body and footer rows get the same height if
     * explicitly set. In automatic mode, each section is calculated separately
     * based on an empty row of that type.
     *
     * @param rowHeight
     *            The height of a row in pixels or -1 for automatic calculation
     * @return this for method chaining
     * @see Grid#setRowHeight(double)
     */
    @SuppressWarnings("unchecked")
    public default THIS withRowHeight(double rowHeight) {
        ((Grid<ITEM>) this).setRowHeight(rowHeight);
        return (THIS) this;
    }

    /**
     * Sets the grid's selection mode.
     * <p>
     * The built-in selection models are:
     * <ul>
     * <li>{@link SelectionMode#SINGLE} -&lt; {@link SingleSelectionModelImpl},
     * <b>the default model</b></li>
     * <li>{@link SelectionMode#MULTI} -&lt; {@link MultiSelectionModelImpl}, with
     * checkboxes in the first column for selection</li>
     * <li>{@link SelectionMode#NONE} -&lt; {@link NoSelectionModel}, preventing
     * selection</li>
     * </ul>
     * <p>
     * To use your custom selection model, you can use
     * {@link Grid#setSelectionModel(GridSelectionModel)}, see existing selection
     * model implementations for example.
     *
     * @param selectionMode
     *            the selection mode to switch to, not {@code null}
     * @return this for method chaining
     * @see Grid#setSelectionMode(SelectionMode)
     */
    @SuppressWarnings("unchecked")
    public default THIS withSelectionMode(SelectionMode selectionMode) {
        ((Grid<ITEM>) this).setSelectionMode(selectionMode);
        return (THIS) this;
    }

    /**
     * Sets the sort order to use, given a {@link GridSortOrderBuilder}.
     * Shorthand for {@code setSortOrder(builder.build())}.
     *
     * @see GridSortOrderBuilder
     *
     * @param builder
     *            the sort builder to retrieve the sort order from
     * @throws NullPointerException
     *             if builder is null
     * @return this for method chaining
     * @see Grid#setSortOrder(GridSortOrderBuilder)
     */
    @SuppressWarnings("unchecked")
    public default THIS withSortOrder(GridSortOrderBuilder<ITEM> builder) {
        ((Grid<ITEM>) this).setSortOrder(builder);
        return (THIS) this;
    }

    /**
     * Sets the sort order to use.
     *
     * @param order
     *            a sort order list.
     * @return this for method chaining
     * @see Grid#setSortOrder(List)
     *
     * @throws IllegalArgumentException
     *             if order is null
     */
    @SuppressWarnings("unchecked")
    public default THIS withSortOrder(List<GridSortOrder<ITEM>> order) {
        ((Grid<ITEM>) this).setSortOrder(order);
        return (THIS) this;
    }

    /**
     * Sets the style generator that is used for generating class names for rows
     * in this grid. Returning null from the generator results in no custom
     * style name being set.
     *
     * @see StyleGenerator
     *
     * @param styleGenerator
     *            the row style generator to set, not null
     * @throws NullPointerException
     *             if {@code styleGenerator} is {@code null}
     * @return this for method chaining
     * @see Grid#setStyleGenerator(StyleGenerator)
     */
    @SuppressWarnings("unchecked")
    public default THIS withStyleGenerator(StyleGenerator<ITEM> styleGenerator) {
        ((Grid<ITEM>) this).setStyleGenerator(styleGenerator);
        return (THIS) this;
    }

    /**
     * Sort this Grid in ascending order by a specified column.
     *
     * @param column
     *            a column to sort against
     * @return this for method chaining
     * @see Grid#sort(Column)
     */
    @SuppressWarnings("unchecked")
    public default THIS withSort(Column<ITEM, ?> column) {
        ((Grid<ITEM>) this).sort(column);
        return (THIS) this;
    }

    /**
     * Sort this Grid in user-specified direction by a column.
     *
     * @param column
     *            a column to sort against
     * @param direction
     *            a sort order value (ascending/descending)
     * @return this for method chaining
     * @see Grid#sort(Column, SortDirection)
     */
    @SuppressWarnings("unchecked")
    public default THIS withSort(Column<ITEM, ?> column, SortDirection direction) {
        ((Grid<ITEM>) this).sort(column, direction);
        return (THIS) this;
    }

    /**
     * Sort this Grid in ascending order by a specified column defined by id.
     *
     * @param columnId
     *            the id of the column to sort against
     *
     * @return this for method chaining
     * @see Grid#sort(String)
     */
    @SuppressWarnings("unchecked")
    public default THIS withSort(String columnId) {
        ((Grid<ITEM>) this).sort(columnId);
        return (THIS) this;
    }

    /**
     * Sort this Grid in a user-specified direction by a column defined by id.
     *
     * @param columnId
     *            the id of the column to sort against
     * @param direction
     *            a sort order value (ascending/descending)
     *
     * @return this for method chaining
     * @see Grid#sort(String, SortDirection)
     */
    @SuppressWarnings("unchecked")
    public default THIS withSort(String columnId, SortDirection direction) {
        ((Grid<ITEM>) this).sort(columnId, direction);
        return (THIS) this;
    }

}
