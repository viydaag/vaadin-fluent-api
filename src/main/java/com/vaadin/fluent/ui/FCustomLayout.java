package com.vaadin.fluent.ui;

import java.io.IOException;
import java.io.InputStream;

import com.vaadin.fluent.api.FluentCustomLayout;
import com.vaadin.ui.CustomLayout;

public class FCustomLayout
        extends CustomLayout
        implements FluentCustomLayout<FCustomLayout> {

    private static final long serialVersionUID = -1407865342130847703L;

    public FCustomLayout() {
        super();
    }

    public FCustomLayout(InputStream templateStream) throws IOException {
        super(templateStream);
    }

    public FCustomLayout(String template) {
        super(template);
    }

}
