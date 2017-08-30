package com.vaadin.fluent.api;

import com.vaadin.fluent.api.FluentComponent.FluentFocusable;


public interface FluentAbstractField<THIS extends FluentAbstractField<THIS, FIELD>, FIELD>
        extends FluentComponent<THIS>, FluentHasValue<THIS, FIELD>, FluentFocusable<THIS> {

}
