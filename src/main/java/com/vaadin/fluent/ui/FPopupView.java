package com.vaadin.fluent.ui;

import com.vaadin.fluent.api.FluentPopupView;
import com.vaadin.ui.Component;
import com.vaadin.ui.PopupView;

public class FPopupView
        extends PopupView
        implements FluentPopupView<FPopupView> {

    private static final long serialVersionUID = 6686642969515052763L;

    public FPopupView(Content content) {
        super(content);
    }

    public FPopupView(String small, Component large) {
        super(small, large);
    }

}
