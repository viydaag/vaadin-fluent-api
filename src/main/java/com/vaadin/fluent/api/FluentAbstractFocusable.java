package com.vaadin.fluent.api;

import com.vaadin.fluent.api.FluentComponent.FluentFocusable;
import com.vaadin.fluent.api.FluentFieldEvents.FluentBlurNotifier;
import com.vaadin.fluent.api.FluentFieldEvents.FluentFocusNotifier;
import com.vaadin.ui.AbstractFocusable;

public interface FluentAbstractFocusable<THIS extends FluentAbstractFocusable<THIS>>
        extends FluentAbstractComponent<THIS>, FluentFocusable<THIS>, FluentFocusNotifier<THIS>, FluentBlurNotifier<THIS> {

    /**
     * Sets the <i>tabulator index</i> of the {@code Focusable} component.
     * The tab index property is used to specify the order in which the
     * fields are focused when the user presses the Tab key. Components with
     * a defined tab index are focused sequentially first, and then the
     * components with no tab index.
     * 
     * @param tabIndex
     *            the tab order of this component. Indexes usually start
     *            from 1. Zero means that default tab order should be used.
     *            A negative value means that the field should not be
     *            included in the tabbing sequence.
     * @return this for method chaining
     * @see AbstractFocusable#setTabIndex()
     */
    @SuppressWarnings("unchecked")
    @Override
    public default THIS withTabIndex(int tabIndex) {
        ((AbstractFocusable) this).setTabIndex(tabIndex);
        return (THIS) this;
    }

}
