package com.vaadin.fluent.api;

import com.vaadin.fluent.api.FluentFieldEvents.FluentBlurNotifier;
import com.vaadin.fluent.api.FluentFieldEvents.FluentFocusNotifier;
import com.vaadin.ui.ItemCaptionGenerator;
import com.vaadin.ui.NativeSelect;

/**
 * The base interface for fluent versions of {@link NativeSelect}
 * 
 * @see NativeSelect
 *
 * @param <THIS> Self-referential generic THIS
 * @param <ITEM> the item object type in the listing
 */
public interface FluentNativeSelect<THIS extends FluentNativeSelect<THIS, ITEM>, ITEM>
        extends FluentAbstractSingleSelect<THIS, ITEM>, FluentFocusNotifier<THIS>, FluentBlurNotifier<THIS>, FluentHasDataProvider<THIS, ITEM> {

    /**
     * Sets the item caption generator that is used to produce the strings shown
     * in the combo box for each item. By default,
     * {@link String#valueOf(Object)} is used.
     *
     * @param itemCaptionGenerator
     *            the item caption provider to use, not null
     * @return this for method chaining
     * @see NativeSelect#setItemCaptionGenerator(ItemCaptionGenerator)
     */
    @SuppressWarnings("unchecked")
    @Override
    public default THIS withItemCaptionGenerator(ItemCaptionGenerator<ITEM> itemCaptionGenerator) {
        ((NativeSelect<ITEM>) this).setItemCaptionGenerator(itemCaptionGenerator);
        return (THIS) this;
    }

    /**
     * Sets the number of items that are visible. If only one item is visible,
     * then the box will be displayed as a drop-down list (the default).
     *
     * @param visibleItemCount
     *            the visible item count
     * @throws IllegalArgumentException
     *             if the value is smaller than one
     * @return this for method chaining
     * @see NativeSelect#setVisibleItemCount(int)
     */
    @SuppressWarnings("unchecked")
    public default THIS withVisibleItemCount(int visibleItemCount) {
        ((NativeSelect<ITEM>) this).setVisibleItemCount(visibleItemCount);
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
     * @see NativeSelect#setEmptySelectionAllowed(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withEmptySelectionAllowed(boolean emptySelectionAllowed) {
        ((NativeSelect<ITEM>) this).setEmptySelectionAllowed(emptySelectionAllowed);
        return (THIS) this;
    }

    /**
     * Sets the empty selection caption.
     * <p>
     * The empty string {@code ""} is the default empty selection caption.
     * <p>
     * If empty selection is allowed via the
     * {@link NativeSelect#setEmptySelectionAllowed(boolean)} method (it is by default) then
     * the empty item will be shown with the given caption.
     *
     * @param caption
     *            the caption to set, not {@code null}
     * @return this for method chaining
     * @see NativeSelect#setEmptySelectionCaption(String)
     * @see NativeSelect#isSelected(Object)
     */
    @SuppressWarnings("unchecked")
    public default THIS withEmptySelectionCaption(String caption) {
        ((NativeSelect<ITEM>) this).setEmptySelectionCaption(caption);
        return (THIS) this;
    }

}
