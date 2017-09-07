package com.vaadin.fluent.ui;

import com.vaadin.fluent.api.FluentAudio;
import com.vaadin.server.Resource;
import com.vaadin.ui.Audio;

public class FAudio
        extends Audio
        implements FluentAudio<FAudio> {

    private static final long serialVersionUID = -4408083986235194421L;

    public FAudio() {
        super();
    }

    public FAudio(String caption) {
        super(caption);
    }

    public FAudio(String caption, Resource source) {
        super(caption, source);
    }

}
