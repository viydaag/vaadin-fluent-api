package com.vaadin.fluent.api;

import com.vaadin.fluent.api.FluentFieldEvents.FluentBlurNotifier;
import com.vaadin.fluent.api.FluentFieldEvents.FluentFocusNotifier;
import com.vaadin.ui.AbstractListing;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.IconGenerator;
import com.vaadin.ui.ItemCaptionGenerator;
import com.vaadin.ui.NativeSelect;

/**
 * The base interface for fluent versions of {@link ComboBox}
 * 
 * @see ComboBox
 *
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentComboBox<THIS extends FluentComboBox<THIS, VALUE>, VALUE>
        extends FluentAbstractSingleSelect<THIS, VALUE>, FluentHasValue<THIS, VALUE>, FluentBlurNotifier<THIS>, FluentFocusNotifier<THIS> {

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
    public default THIS withItemCaptionGenerator(ItemCaptionGenerator<VALUE> itemCaptionGenerator) {
        ((ComboBox<VALUE>) this).setItemCaptionGenerator(itemCaptionGenerator);
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
    public default THIS withItemIconGenerator(IconGenerator<VALUE> itemIconGenerator) {
        ((ComboBox<VALUE>) this).setItemIconGenerator(itemIconGenerator);
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
        ((ComboBox<VALUE>) this).setEmptySelectionAllowed(emptySelectionAllowed);
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
        ((ComboBox<VALUE>) this).setEmptySelectionCaption(caption);
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
        ((ComboBox<VALUE>) this).setPageLength(pageLength);
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
    public default THIS withPageLength(String placeholder) {
        ((ComboBox<VALUE>) this).setPlaceholder(placeholder);
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
        ((ComboBox<VALUE>) this).setTextInputAllowed(textInputAllowed);
        return (THIS) this;
    }

}
