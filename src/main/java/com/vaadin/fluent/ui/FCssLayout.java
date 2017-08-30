/**
 * 
 */
package com.vaadin.fluent.ui;

import com.vaadin.fluent.api.FluentCssLayout;
import com.vaadin.ui.Component;
import com.vaadin.ui.CssLayout;

public class FCssLayout
        extends CssLayout
        implements FluentCssLayout<FCssLayout> {

    private static final long serialVersionUID = -8414826676489173411L;

    public FCssLayout() {
        super();
    }

    public FCssLayout(Component... children) {
        super(children);
    }

}
