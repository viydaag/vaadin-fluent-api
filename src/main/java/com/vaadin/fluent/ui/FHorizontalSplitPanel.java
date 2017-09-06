package com.vaadin.fluent.ui;

import com.vaadin.fluent.api.FluentSplitPanel;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalSplitPanel;;

/**
 * 
 * The base class for fluent version of {@link HorizontalSplitPanel}
 * 
 * @see HorizontalSplitPanel
 *
 */
public class FHorizontalSplitPanel
        extends HorizontalSplitPanel
        implements FluentSplitPanel<FHorizontalSplitPanel> {

    private static final long serialVersionUID = 8177641079646529173L;

    public FHorizontalSplitPanel() {
        super();
    }

    public FHorizontalSplitPanel(Component firstComponent, Component secondComponent) {
        super(firstComponent, secondComponent);
    }

}
