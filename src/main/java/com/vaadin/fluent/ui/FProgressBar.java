package com.vaadin.fluent.ui;

import com.vaadin.fluent.api.FluentProgressBar;
import com.vaadin.ui.ProgressBar;

public class FProgressBar
        extends ProgressBar
        implements FluentProgressBar<FProgressBar> {

    private static final long serialVersionUID = -5144742016777655154L;

    public FProgressBar() {
        super();
    }

    public FProgressBar(float progress) {
        super(progress);
    }
}
