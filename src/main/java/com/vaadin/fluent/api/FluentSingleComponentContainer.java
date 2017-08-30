package com.vaadin.fluent.api;

import com.vaadin.ui.Component;
import com.vaadin.ui.SingleComponentContainer;

public interface FluentSingleComponentContainer<THIS extends FluentSingleComponentContainer<THIS>>
        extends SingleComponentContainer, FluentHasComponents<THIS>, FluentHasComponents.FluentComponentAttachDetachNotifier<THIS> {

    /**
     * Sets the content of this container. The content is a component that
     * serves as the outermost item of the visual contents.
     * 
     * The content should always be set, either as a constructor parameter or by
     * calling this method.
     * 
     * @param content
     *            a component (typically a layout) to use as content
     * @return this (for method chaining)
     * @see SingleComponentContainer#setContent(Component)
     */
    @SuppressWarnings("unchecked")
    public default THIS withContent(Component content) {
        ((SingleComponentContainer) this).setContent(content);
        return (THIS) this;
    }
}
