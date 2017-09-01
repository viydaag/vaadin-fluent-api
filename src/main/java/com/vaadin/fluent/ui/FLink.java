package com.vaadin.fluent.ui;

import com.vaadin.fluent.api.FluentLink;
import com.vaadin.server.Resource;
import com.vaadin.shared.ui.BorderStyle;
import com.vaadin.ui.Link;

public class FLink
        extends Link
        implements FluentLink<FLink> {

    private static final long serialVersionUID = -7257485188996097937L;

    public FLink() {
        super();
    }

    public FLink(String caption, Resource resource) {
        super(caption, resource);
    }

    public FLink(String caption, Resource resource, String targetName, int width, int height, BorderStyle border) {
        super(caption, resource, targetName, width, height, border);
    }

}
