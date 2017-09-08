package com.vaadin.fluent.ui;

import com.vaadin.fluent.api.FluentUpload;
import com.vaadin.ui.Upload;

public class FUpload
        extends Upload
        implements FluentUpload<FUpload> {

    private static final long serialVersionUID = -6691332823188181990L;

    public FUpload() {
        super();
    }

    public FUpload(String caption, Receiver uploadReceiver) {
        super(caption, uploadReceiver);
    }

}
