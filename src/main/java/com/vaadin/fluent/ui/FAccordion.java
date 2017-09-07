package com.vaadin.fluent.ui;

import com.vaadin.fluent.api.FluentTabSheet;
import com.vaadin.ui.Accordion;
import com.vaadin.ui.Component;

public class FAccordion
        extends Accordion
        implements FluentTabSheet<FAccordion> {

    private static final long serialVersionUID = 6109196552076922449L;

    public FAccordion() {
        super();
    }

    public FAccordion(Component... components) {
        super(components);
    }

}
