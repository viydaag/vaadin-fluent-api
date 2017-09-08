package com.vaadin.fluent.api;

import com.vaadin.shared.ui.colorpicker.Color;
import com.vaadin.ui.AbstractColorPicker;
import com.vaadin.ui.AbstractColorPicker.PopupStyle;

/**
 * The base interface for fluent versions of {@link AbstractColorPicker}
 *
 * @param <THIS> Self-referential generic THIS
 * 
 * @see AbstractColorPicker
 */
public interface FluentAbstractColorPicker<THIS extends FluentAbstractColorPicker<THIS>>
        extends FluentAbstractField<THIS, Color> {

    /**
     * Set true if the component should show a default caption (css-code for the
     * currently selected color, e.g. #ffffff) when no other caption is
     * available.
     *
     * @param enabled
     *            {@code true} to enable the default caption, {@code false} to disable
     * @return this for method chaining
     * @see AbstractColorPicker#setDefaultCaptionEnabled(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withDefaultCaptionEnabled(boolean enabled) {
        ((AbstractColorPicker) this).setDefaultCaptionEnabled(enabled);
        return (THIS) this;
    }

    /**
     * Sets the visibility of the color history, displaying recently picked
     * colors.
     *
     * @param visible
     *            {@code true} to display the history, {@code false} to hide it
     * @return this for method chaining
     * @see AbstractColorPicker#setHistoryVisibility(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withHistoryVisibility(boolean visible) {
        ((AbstractColorPicker) this).setHistoryVisibility(visible);
        return (THIS) this;
    }

    /**
     * Sets the visibility of the HSV Tab.
     *
     * @param visible
     *            {@code true} to display the HSV tab, {@code false} to hide it
     * @return this for method chaining
     * @see AbstractColorPicker#setHSVVisibility(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withHSVVisibility(boolean visible) {
        ((AbstractColorPicker) this).setHSVVisibility(visible);
        return (THIS) this;
    }

    /**
     * Sets the style of the popup window.
     *
     * @param style
     *            the popup window style
     * @return this for method chaining
     * @see AbstractColorPicker#setPopupStyle(PopupStyle)
     */
    @SuppressWarnings("unchecked")
    public default THIS withPopupStyle(PopupStyle style) {
        ((AbstractColorPicker) this).setPopupStyle(style);
        return (THIS) this;
    }

    /**
     * Sets the position of the popup window.
     *
     * @param x
     *            the x-coordinate
     * @param y
     *            the y-coordinate
     * @return this for method chaining
     * @see AbstractColorPicker#setPosition(int, int)
     */
    @SuppressWarnings("unchecked")
    public default THIS withPosition(int x, int y) {
        ((AbstractColorPicker) this).setPosition(x, y);
        return (THIS) this;
    }

    /**
     * Sets the visibility of the RGB tab.
     *
     * @param visible
     *            {@code true} to display the RGB tab, {@code false} to hide it
     * @return this for method chaining
     * @see AbstractColorPicker#setRGBVisibility(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withRGBVisibility(boolean visible) {
        ((AbstractColorPicker) this).setRGBVisibility(visible);
        return (THIS) this;
    }

    /**
     * Sets the visibility of the Swatches (palette) tab.
     *
     * @param visible
     *            {@code true} to display the Swatches tab, {@code false} to hide it
     * @return this for method chaining
     * @see AbstractColorPicker#setSwatchesVisibility(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withSwatchesVisibility(boolean visible) {
        ((AbstractColorPicker) this).setSwatchesVisibility(visible);
        return (THIS) this;
    }

    /**
     * Sets the visibility of the CSS color code text field.
     *
     * @param visible
     *            {@code true} to display the CSS text field, {@code false} to hide it
     * @return this for method chaining
     * @see AbstractColorPicker#setTextfieldVisibility(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withTextfieldVisibility(boolean visible) {
        ((AbstractColorPicker) this).setTextfieldVisibility(visible);
        return (THIS) this;
    }

}
