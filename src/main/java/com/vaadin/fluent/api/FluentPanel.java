package com.vaadin.fluent.api;

import com.vaadin.fluent.api.FluentAction.FluentNotifier;
import com.vaadin.fluent.api.FluentComponent.FluentFocusable;

public interface FluentPanel<THIS extends FluentPanel<THIS>>
        extends FluentAbstractSingleComponentContainer<THIS>, FluentScrollable<THIS>, FluentFocusable<THIS>, FluentNotifier<THIS> {
}
