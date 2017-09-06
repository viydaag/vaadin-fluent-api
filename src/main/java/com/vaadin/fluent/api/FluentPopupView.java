package com.vaadin.fluent.api;

import com.vaadin.ui.PopupView;

/**
 * The base interface for fluent versions of {@link PopupView}.
 * 
 * The setContent method is not fluent because it is necessary in the constructor.
 * 
 * @see PopupView
 *
 * @param <THIS> Self-referential generic THIS
 * 
 */
public interface FluentPopupView<THIS extends FluentPopupView<THIS>>
        extends FluentAbstractComponent<THIS>, FluentHasComponents<THIS> {

    /**
     * Should the popup automatically hide when the user takes the mouse cursor
     * out of the popup area? If this is false, the user must click outside the
     * popup to close it. The default is true.
     *
     * @param hideOnMouseOut true for auto hide the popup on mouse out, otherwise false
     * @return this for method chaining
     * @see PopupView#setHideOnMouseOut(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withHideOnMouseOut(boolean hideOnMouseOut) {
        ((PopupView) this).setHideOnMouseOut(hideOnMouseOut);
        return (THIS) this;
    }

    /**
     * Set the visibility of the popup. Does not hide the minimal
     * representation.
     *
     * @param visible true for visible, false otherwise
     * @return this for method chaining
     * @see PopupView#setPopupVisible(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withPopupVisible(boolean visible) {
        ((PopupView) this).setPopupVisible(visible);
        return (THIS) this;
    }

}
