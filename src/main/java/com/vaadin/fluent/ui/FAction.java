package com.vaadin.fluent.ui;

import com.vaadin.event.Action;
import com.vaadin.fluent.api.FluentAction;
import com.vaadin.server.Resource;

/**
 * An {@link Action} complemented by fluent setters.
 *
 * @see Action
 */
public class FAction
        extends Action
        implements FluentAction<FAction> {

    private static final long serialVersionUID = 1338702785495330411L;

    /**
     * Constructs a new action with the given caption.
     *
     * @param caption
     *            the caption for the new action.
     */
    public FAction(String caption) {
        super(caption);
    }

    /**
     * Constructs a new action with the given caption string and icon.
     *
     * @param caption
     *            the caption for the new action.
     * @param icon
     *            the icon for the new action.
     */
    public FAction(String caption, Resource icon) {
        super(caption, icon);
    }

}
