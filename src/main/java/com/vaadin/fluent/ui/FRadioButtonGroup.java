package com.vaadin.fluent.ui;

import java.util.Collection;

import com.vaadin.data.provider.DataProvider;
import com.vaadin.fluent.api.FluentRadioButtonGroup;
import com.vaadin.ui.RadioButtonGroup;

public class FRadioButtonGroup<T>
        extends RadioButtonGroup<T>
        implements FluentRadioButtonGroup<FRadioButtonGroup<T>, T> {

    private static final long serialVersionUID = -8532721610683566260L;

    public FRadioButtonGroup() {
        super();
    }

    public FRadioButtonGroup(String caption) {
        super(caption);
    }

    public FRadioButtonGroup(String caption, DataProvider<T, ?> dataProvider) {
        super(caption, dataProvider);
    }

    public FRadioButtonGroup(String caption, Collection<T> items) {
        super(caption, items);
    }

}
