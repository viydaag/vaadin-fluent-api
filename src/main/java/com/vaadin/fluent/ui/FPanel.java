package com.vaadin.fluent.ui;

import com.vaadin.fluent.api.FluentPanel;
import com.vaadin.ui.Component;
import com.vaadin.ui.Panel;

public class FPanel
        extends Panel
        implements FluentPanel<FPanel> {

    private static final long serialVersionUID = 8200973348099977390L;

    public FPanel() {
        super();
    }

    public FPanel(Component content) {
        super(content);
    }

    public FPanel(String caption) {
        super(caption);
    }

    public FPanel(String caption, Component content) {
        super(caption, content);
    }

}
