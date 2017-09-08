package com.vaadin.fluent.ui;

import com.vaadin.fluent.api.FluentVideo;
import com.vaadin.server.Resource;
import com.vaadin.ui.Video;

public class FVideo
        extends Video
        implements FluentVideo<FVideo> {

    private static final long serialVersionUID = -7660168966587787822L;

    public FVideo() {
        super();
    }

    public FVideo(String caption) {
        super(caption);
    }

    public FVideo(String caption, Resource source) {
        super(caption, source);
    }

}
