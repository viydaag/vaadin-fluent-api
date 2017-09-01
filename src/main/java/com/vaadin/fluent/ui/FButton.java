package com.vaadin.fluent.ui;

import com.vaadin.fluent.api.FluentButton;
import com.vaadin.server.Resource;
import com.vaadin.ui.Button;

/**
 * A {@link Button} complemented by fluent setters.
 *
 * @see Button
 */
public class FButton
        extends Button
        implements FluentButton<FButton> {

    private static final long serialVersionUID = 861653848265761654L;

    public FButton() {
        super();
    }

    public FButton(String caption) {
        super(caption);
    }

    public FButton(Resource icon) {
        super(icon);
    }

    public FButton(String caption, Resource icon) {
        super(caption, icon);
    }

    public FButton(String caption, ClickListener listener) {
        super(caption, listener);
    }

    public ClickShortcut getClickShortcut() {
        return clickShortcut;
    }

}
