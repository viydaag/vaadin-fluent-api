package com.vaadin.fluent.api;

import com.vaadin.fluent.api.FluentFieldEvents.FluentBlurNotifier;
import com.vaadin.fluent.api.FluentFieldEvents.FluentFocusNotifier;
import com.vaadin.ui.CheckBox;

/**
 * The base interface for fluent versions of {@link CheckBox}
 * 
 * @see CheckBox
 *
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentCheckBox<THIS extends FluentCheckBox<THIS>>
        extends FluentAbstractField<THIS, Boolean>, FluentBlurNotifier<THIS>, FluentFocusNotifier<THIS> {

}
