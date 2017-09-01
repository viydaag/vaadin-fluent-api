package com.vaadin.fluent.ui;

import com.vaadin.fluent.api.FluentButton;
import com.vaadin.ui.NativeButton;

public class FNativeButton
        extends NativeButton
        implements FluentButton<FNativeButton> {

    private static final long serialVersionUID = -9014749925653713677L;

    public FNativeButton() {
        super();
    }

    public FNativeButton(String caption) {
        super(caption);
    }

    public FNativeButton(String caption, ClickListener listener) {
        super(caption, listener);
    }

}
