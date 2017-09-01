package com.vaadin.fluent.api;

import java.util.Collection;

import com.vaadin.data.provider.DataProvider;
import com.vaadin.data.provider.ListDataProvider;
import com.vaadin.fluent.api.FluentFieldEvents.FluentBlurNotifier;
import com.vaadin.fluent.api.FluentFieldEvents.FluentFocusNotifier;
import com.vaadin.ui.AbstractListing;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.ComboBox.CaptionFilter;
import com.vaadin.ui.IconGenerator;
import com.vaadin.ui.ItemCaptionGenerator;
import com.vaadin.ui.NativeSelect;

/**
 * The base interface for fluent versions of {@link ComboBox}
 * 
 * @see ComboBox
 *
 * @param <THIS> Self-referential generic THIS
 * @param <ITEM> the item object type in the listing
 */
public interface FluentComboBox<THIS extends FluentComboBox<THIS, ITEM>, ITEM>
        extends FluentAbstractSingleSelect<THIS, ITEM>, FluentHasValue<THIS, ITEM>, FluentBlurNotifier<THIS>, FluentFocusNotifier<THIS>,
        FluentHasFilterableDataProvider<THIS, ITEM, String> {

    /**
     * Sets the item caption generator that is used to produce the strings shown
     * in the combo box for each item. By default,
     * {@link String#valueOf(Object)} is used.
     *
     * @param itemCaptionGenerator
     *            the item caption provider to use, not null
     * @return this for method chaining
     * @see ComboBox#setItemCaptionGenerator(ItemCaptionGenerator)
     */
    @SuppressWarnings("unchecked")
    @Override
    public default THIS withItemCaptionGenerator(ItemCaptionGenerator<ITEM> itemCaptionGenerator) {
        ((ComboBox<ITEM>) this).setItemCaptionGenerator(itemCaptionGenerator);
        return (THIS) this;
    }

    /**
     * @see IconGenerator
     * @see AbstractListing#setItemIconGenerator(IconGenerator)
     *
     * @param itemIconGenerator
     *            the item icon generator to set, not null
     * @return this for method chaining
     */
    @SuppressWarnings("unchecked")
    public default THIS withItemIconGenerator(IconGenerator<ITEM> itemIconGenerator) {
        ((ComboBox<ITEM>) this).setItemIconGenerator(itemIconGenerator);
        return (THIS) this;
    }

    /**
     * Sets whether the user is allowed to select nothing in the combo box. When
     * true, a special empty item is shown to the user.
     *
     * @param emptySelectionAllowed
     *            true to allow not selecting anything, false to require
     *            selection
     * @return this for method chaining
     * @see ComboBox#setEmptySelectionAllowed(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withEmptySelectionAllowed(boolean emptySelectionAllowed) {
        ((ComboBox<ITEM>) this).setEmptySelectionAllowed(emptySelectionAllowed);
        return (THIS) this;
    }

    /**
     * Sets the empty selection caption.
     * <p>
     * The empty string {@code ""} is the default empty selection caption.
     * <p>
     * If empty selection is allowed via the
     * {@link #setEmptySelectionAllowed(boolean)} method (it is by default) then
     * the empty item will be shown with the given caption.
     *
     * @param caption
     *            the caption to set, not {@code null}
     * @return this for method chaining
     * @see ComboBox#setEmptySelectionCaption(String)
     * @see ComboBox#isSelected(Object)
     */
    @SuppressWarnings("unchecked")
    public default THIS withEmptySelectionCaption(String caption) {
        ((ComboBox<ITEM>) this).setEmptySelectionCaption(caption);
        return (THIS) this;
    }

    /**
     * Sets the page length for the suggestion popup. Setting the page length to
     * 0 will disable suggestion popup paging (all items visible).
     *
     * @param pageLength
     *            the pageLength to set
     * @return this for method chaining
     * @see ComboBox#setPageLength(int)
     */
    @SuppressWarnings("unchecked")
    public default THIS withPageLength(int pageLength) {
        ((ComboBox<ITEM>) this).setPageLength(pageLength);
        return (THIS) this;
    }

    /**
     * Sets the placeholder string - a textual prompt that is displayed when the
     * select would otherwise be empty, to prompt the user for input.
     *
     * @param placeholder
     *            the desired placeholder, or null to disable
     * @return this for method chaining
     * @see ComboBox#setPlaceholder(String)
     */
    @SuppressWarnings("unchecked")
    public default THIS withPlaceholder(String placeholder) {
        ((ComboBox<ITEM>) this).setPlaceholder(placeholder);
        return (THIS) this;
    }

    /**
     * Sets whether it is possible to input text into the field or whether the
     * field area of the component is just used to show what is selected. By
     * disabling text input, the comboBox will work in the same way as a
     * {@link NativeSelect}
     *
     * @see ComboBox#setTextInputAllowed(boolean)
     *
     * @param textInputAllowed
     *            true to allow entering text, false to just show the current
     *            selection
     *            
     * @return this for method chaining
     */
    @SuppressWarnings("unchecked")
    public default THIS withTextInputAllowed(boolean textInputAllowed) {
        ((ComboBox<ITEM>) this).setTextInputAllowed(textInputAllowed);
        return (THIS) this;
    }

    /**
     * Sets a list data provider as the data provider of this combo box.
     * Filtering will use a case insensitive match to show all items where the
     * filter text is a substring of the caption displayed for that item.
     * <p>
     * Note that this is a shorthand that calls
     * {@link #setDataProvider(DataProvider)} with a wrapper of the provided
     * list data provider. This means that {@link #getDataProvider()} will
     * return the wrapper instead of the original list data provider.
     *
     * @param listDataProvider
     *            the list data provider to use, not <code>null</code>
     * @return this for method chaining
     * @see ComboBox#setDataProvider(ListDataProvider)
     */
    @SuppressWarnings("unchecked")
    public default THIS withDataProvider(ListDataProvider<ITEM> listDataProvider) {
        ((ComboBox<ITEM>) this).setDataProvider(listDataProvider);
        return (THIS) this;
    }

    /**
     * Sets a list data provider with an item caption filter as the data
     * provider of this combo box. The caption filter is used to compare the
     * displayed caption of each item to the filter text entered by the user.
     *
     * @param captionFilter
     *            filter to check if an item is shown when user typed some text
     *            into the ComboBox
     * @param listDataProvider
     *            the list data provider to use, not <code>null</code>
     * @return this for method chaining
     * @see ComboBox#setDataProvider(CaptionFilter, ListDataProvider)
     */
    @SuppressWarnings("unchecked")
    public default THIS withDataProvider(CaptionFilter captionFilter, ListDataProvider<ITEM> listDataProvider) {
        ((ComboBox<ITEM>) this).setDataProvider(captionFilter, listDataProvider);
        return (THIS) this;
    }

    /**
     * Sets the data items of this listing and a simple string filter with which
     * the item string and the text the user has input are compared.
     * <p>
     * Note that unlike {@link #setItems(Collection)}, no automatic case
     * conversion is performed before the comparison.
     *
     * @param captionFilter
     *            filter to check if an item is shown when user typed some text
     *            into the ComboBox
     * @param items
     *            the data items to display
     * @return this for method chaining
     * @see ComboBox#setItems(CaptionFilter, Object...)
     */
    @SuppressWarnings("unchecked")
    public default THIS withItems(CaptionFilter captionFilter, ITEM... items) {
        ((ComboBox<ITEM>) this).setItems(captionFilter, items);
        return (THIS) this;
    }

    /**
     * Sets the data items of this listing and a simple string filter with which
     * the item string and the text the user has input are compared.
     * <p>
     * Note that unlike {@link #setItems(Collection)}, no automatic case
     * conversion is performed before the comparison.
     *
     * @param captionFilter
     *            filter to check if an item is shown when user typed some text
     *            into the ComboBox
     * @param items
     *            the data items to display
     * @return this for method chaining
     * @see ComboBox#setItems(CaptionFilter, Collection)
     */
    @SuppressWarnings("unchecked")
    public default THIS withItems(CaptionFilter captionFilter, Collection<ITEM> items) {
        ((ComboBox<ITEM>) this).setItems(captionFilter, items);
        return (THIS) this;
    }

}
