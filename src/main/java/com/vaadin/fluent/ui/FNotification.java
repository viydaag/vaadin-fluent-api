package com.vaadin.fluent.ui;

import com.vaadin.fluent.api.FluentNotification;
import com.vaadin.ui.Notification;

public class FNotification
        extends Notification
        implements FluentNotification<FNotification> {

    private static final long serialVersionUID = -7006461752584633560L;

    public FNotification(String caption) {
        super(caption);
    }

    public FNotification(String caption, Type type) {
        super(caption, type);
    }

    public FNotification(String caption, String description) {
        super(caption, description);
    }

    public FNotification(String caption, String description, Type type) {
        super(caption, description, type);
    }

    public FNotification(String caption, String description, Type type, boolean htmlContentAllowed) {
        super(caption, description, type, htmlContentAllowed);
    }

}
