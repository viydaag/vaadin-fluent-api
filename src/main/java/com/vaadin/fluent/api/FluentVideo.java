package com.vaadin.fluent.api;

import com.vaadin.server.Resource;
import com.vaadin.ui.Video;

/**
 * The base interface for fluent versions of {@link Video}
 * 
 * @see Video
 *
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentVideo<THIS extends FluentVideo<THIS>>
        extends FluentMedia<THIS> {

    /**
     * Sets the poster image, which is shown in place of the video before the
     * user presses play.
     *
     * @param poster the image shown before the video is played
     * @return this for method chaining
     * @see Video#setPoster(Resource)
     */
    @SuppressWarnings("unchecked")
    public default THIS withPoster(Resource poster) {
        ((Video) this).setPoster(poster);
        return (THIS) this;
    }
}
