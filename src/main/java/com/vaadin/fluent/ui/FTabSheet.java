package com.vaadin.fluent.ui;

import com.vaadin.fluent.api.FluentTabSheet;
import com.vaadin.ui.Component;
import com.vaadin.ui.TabSheet;

public class FTabSheet
        extends TabSheet
        implements FluentTabSheet<FTabSheet> {

    private static final long serialVersionUID = 890844339243199613L;

    public FTabSheet() {
        super();
    }

    public FTabSheet(Component... components) {
        super(components);
    }

}
