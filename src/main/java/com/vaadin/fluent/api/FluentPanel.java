package com.vaadin.fluent.api;

import com.vaadin.fluent.api.FluentAction.FluentNotifier;
import com.vaadin.fluent.api.FluentComponent.FluentFocusable;
import com.vaadin.ui.Panel;

/**
 * The base interface for fluent versions of {@link Panel}
 * 
 * @see Panel
 * 
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentPanel<THIS extends FluentPanel<THIS>>
        extends FluentAbstractSingleComponentContainer<THIS>, FluentScrollable<THIS>, FluentFocusable<THIS>, FluentNotifier<THIS> {
}
