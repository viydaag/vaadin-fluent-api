package com.vaadin.fluent.ui;

import com.vaadin.fluent.api.FluentSplitPanel;
import com.vaadin.ui.Component;
import com.vaadin.ui.VerticalSplitPanel;

/**
 * 
 * The base class for fluent version of {@link VerticalSplitPanel}
 * 
 * @see VerticalSplitPanel
 *
 */
public class FVerticalSplitPanel
        extends VerticalSplitPanel
        implements FluentSplitPanel<FVerticalSplitPanel> {

    private static final long serialVersionUID = -5097160517084661938L;

    public FVerticalSplitPanel() {
        super();
    }

    public FVerticalSplitPanel(Component firstComponent, Component secondComponent) {
        super(firstComponent, secondComponent);
    }

}
