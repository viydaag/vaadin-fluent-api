package com.vaadin.fluent.api;

import com.vaadin.data.provider.DataProvider;
import com.vaadin.event.CollapseEvent;
import com.vaadin.event.CollapseEvent.CollapseListener;
import com.vaadin.event.ExpandEvent;
import com.vaadin.event.ExpandEvent.ExpandListener;
import com.vaadin.event.selection.SelectionListener;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Grid.SelectionMode;
import com.vaadin.ui.IconGenerator;
import com.vaadin.ui.ItemCaptionGenerator;
import com.vaadin.ui.ItemCollapseAllowedProvider;
import com.vaadin.ui.StyleGenerator;
import com.vaadin.ui.Tree;
import com.vaadin.ui.Tree.ItemClickListener;

/**
 * The base interface for fluent versions of {@link Tree}
 * 
 * @see Tree
 *
 * @param <THIS> Self-referential generic THIS
 * @param <ITEM> the item object type in the listing
 */
public interface FluentTree<THIS extends FluentTree<THIS, ITEM>, ITEM>
        extends FluentComposite<THIS>, FluentHasHierarchicalDataProvider<THIS, ITEM> {

    /**
     * Adds a CollapseListener to this Tree.
     *
     * @see CollapseEvent
     *
     * @param listener
     *            the listener to add
     * @return this for method chaining
     * @see Tree#addCollapseListener(CollapseEvent.CollapseListener)
     */
    @SuppressWarnings("unchecked")
    public default THIS withCollapseListener(CollapseListener<ITEM> listener) {
        ((Tree<ITEM>) this).addCollapseListener(listener);
        return (THIS) this;
    }

    /**
     * Adds an ExpandListener to this Tree.
     *
     * @see ExpandEvent
     *
     * @param listener
     *            the listener to add
     * @return this for method chaining
     * @see Tree#addExpandListener(ExpandEvent.ExpandListener)
     */
    @SuppressWarnings("unchecked")
    public default THIS withExpandListener(ExpandListener<ITEM> listener) {
        ((Tree<ITEM>) this).addExpandListener(listener);
        return (THIS) this;
    }

    /**
     * Adds an item click listener. The listener is called when an item of this
     * {@code Tree} is clicked.
     *
     * @param listener
     *            the item click listener, not null
     * @return this for method chaining
     * @see Tree#addItemClickListener(ItemClickListener)
     */
    @SuppressWarnings("unchecked")
    public default THIS withItemClickListener(ItemClickListener<ITEM> listener) {
        ((Tree<ITEM>) this).addItemClickListener(listener);
        return (THIS) this;
    }

    /**
     * Adds a selection listener to the current selection model.
     * <p>
     * <strong>NOTE:</strong> If selection mode is switched with
     * {@link Tree#setSelectionMode(Grid.SelectionMode)}, then this listener is not
     * triggered anymore when selection changes!
     *
     * @param listener
     *            the listener to add
     * @return this for method chaining
     * @see Tree#addSelectionListener(SelectionListener)
     *
     * @throws UnsupportedOperationException
     *             if selection has been disabled with
     *             {@link SelectionMode#NONE}
     */
    @SuppressWarnings("unchecked")
    public default THIS withSelectionListener(SelectionListener<ITEM> listener) throws UnsupportedOperationException {
        ((Tree<ITEM>) this).addSelectionListener(listener);
        return (THIS) this;
    }

    /**
     * Sets the automatic width recalculation on or off. This feature is on by
     * default.
     * 
     * @param autoRecalculateWidth
     *            {@code true} to enable recalculation; {@code false} to turn it
     *            off
     * 
     * @return this for method chaining
     * @see Tree#setAutoRecalculateWidth(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withAutoRecalculateWidth(boolean autoRecalculateWidth) {
        ((Tree<ITEM>) this).setAutoRecalculateWidth(autoRecalculateWidth);
        return (THIS) this;
    }

    /**
     * Sets the content mode of the item caption.
     *
     * @param contentMode
     *            the content mode
     *            
     * @return this for method chaining
     * @see Tree#setContentMode(ContentMode)
     */
    @SuppressWarnings("unchecked")
    public default THIS withContentMode(ContentMode contentMode) {
        ((Tree<ITEM>) this).setContentMode(contentMode);
        return (THIS) this;
    }

    @SuppressWarnings("unchecked")
    @Override
    public default THIS withDataProvider(DataProvider<ITEM, ?> dataProvider) {
        ((Tree<ITEM>) this).setDataProvider(dataProvider);
        return (THIS) this;
    }

    /**
     * Sets the item caption generator that is used to produce the strings shown
     * as the text for each item. By default, {@link String#valueOf(Object)} is
     * used.
     *
     * @param captionGenerator
     *            the item caption provider to use, not <code>null</code>
     *            
     * @return this for method chaining
     * @see Tree#setItemCaptionGenerator(ItemCaptionGenerator)
     */
    @SuppressWarnings("unchecked")
    public default THIS withItemCaptionGenerator(ItemCaptionGenerator<ITEM> captionGenerator) {
        ((Tree<ITEM>) this).setItemCaptionGenerator(captionGenerator);
        return (THIS) this;
    }

    /**
     * Sets the item collapse allowed provider for this Tree. The provider
     * should return {@code true} for any item that the user can collapse.
     * <p>
     * <strong>Note:</strong> This callback will be accessed often when sending
     * data to the client. The callback should not do any costly operations.
     *
     * @param provider
     *            the item collapse allowed provider, not {@code null}
     *            
     * @return this for method chaining
     * @see Tree#setItemCollapseAllowedProvider(ItemCollapseAllowedProvider)
     */
    @SuppressWarnings("unchecked")
    public default THIS withItemCollapseAllowedProvider(ItemCollapseAllowedProvider<ITEM> provider) {
        ((Tree<ITEM>) this).setItemCollapseAllowedProvider(provider);
        return (THIS) this;
    }

    /**
     * Sets the item icon generator that is used to produce custom icons for
     * items. The generator can return <code>null</code> for items with no icon.
     *
     * @see IconGenerator
     *
     * @param iconGenerator
     *            the item icon generator to set, not <code>null</code>
     * @return this for method chaining
     * @see Tree#setItemIconGenerator(IconGenerator)
     * @throws NullPointerException
     *             if {@code itemIconGenerator} is {@code null}
     */
    @SuppressWarnings("unchecked")
    public default THIS withItemIconGenerator(IconGenerator<ITEM> iconGenerator) {
        ((Tree<ITEM>) this).setItemIconGenerator(iconGenerator);
        return (THIS) this;
    }

    /**
     * Sets the height of a row. If -1 (default), the row height is calculated
     * based on the theme for an empty row before the Tree is displayed.
     *
     * @param rowHeight
     *            The height of a row in pixels or -1 for automatic calculation
     * @return this for method chaining
     * @see Tree#setRowHeight(double)
     */
    @SuppressWarnings("unchecked")
    public default THIS withRowHeight(double rowHeight) {
        ((Tree<ITEM>) this).setRowHeight(rowHeight);
        return (THIS) this;
    }

    /**
     * Sets the tree's selection mode.
     * <p>
     * The built-in selection modes are:
     * <ul>
     * <li>{@link SelectionMode#SINGLE} <b>the default model</b></li>
     * <li>{@link SelectionMode#MULTI}</li>
     * <li>{@link SelectionMode#NONE} preventing selection</li>
     * </ul>
     *
     * @param selectionMode
     *            the selection mode to switch to, not {@code null}
     * @return this for method chaining
     * @see Tree#setSelectionMode(Grid.SelectionMode)
     *
     * @see SelectionMode
     */
    @SuppressWarnings("unchecked")
    public default THIS withSelectionMode(SelectionMode selectionMode) {
        ((Tree<ITEM>) this).setSelectionMode(selectionMode);
        return (THIS) this;
    }

    /**
     * Sets the style generator that is used for generating class names for
     * items in this tree. Returning null from the generator results in no
     * custom style name being set.
     *
     * @see StyleGenerator
     *
     * @param styleGenerator
     *            the item style generator to set, not {@code null}
     * @return this for method chaining
     * @see Tree#setStyleGenerator(StyleGenerator)
     * @throws NullPointerException
     *             if {@code styleGenerator} is {@code null}
     */
    @SuppressWarnings("unchecked")
    public default THIS withStyleGenerator(StyleGenerator<ITEM> styleGenerator) {
        ((Tree<ITEM>) this).setStyleGenerator(styleGenerator);
        return (THIS) this;
    }

}
