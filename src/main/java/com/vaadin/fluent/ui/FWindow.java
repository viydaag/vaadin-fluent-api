package com.vaadin.fluent.ui;

import com.vaadin.fluent.api.FluentWindow;
import com.vaadin.ui.Component;
import com.vaadin.ui.Window;

public class FWindow
        extends Window
        implements FluentWindow<FWindow> {

    private static final long serialVersionUID = 9181013092445662095L;

    public FWindow() {
        super();
    }

    public FWindow(String caption) {
        super(caption);
    }

    public FWindow(String caption, Component content) {
        super(caption, content);
    }

}
