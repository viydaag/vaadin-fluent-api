package com.vaadin.fluent.api;

import com.vaadin.server.Resource;
import com.vaadin.shared.ui.PreloadMode;
import com.vaadin.ui.AbstractMedia;

/**
 * The base interface for fluent versions of {@link AbstractMedia}
 * 
 * @see AbstractMedia
 *
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentMedia<THIS extends FluentMedia<THIS>>
        extends FluentAbstractComponent<THIS> {

    /**
     * Sets the alternative text to be displayed if the browser does not support
     * HTML5. This text is rendered as HTML if
     * {@link #withHtmlContentAllowed(boolean)} is set to true. With HTML
     * rendering, this method can also be used to implement fallback to a
     * flash-based player, see the <a href=
     * "https://developer.mozilla.org/En/Using_audio_and_video_in_Firefox#Using_Flash"
     * >Mozilla Developer Network</a> for details.
     *
     * @param altText the alternate text if video is unavailable
     * @return this for method chaining
     * @see AbstractMedia#setAltText(String)
     */
    @SuppressWarnings("unchecked")
    public default THIS withAltText(String altText) {
        ((AbstractMedia) this).setAltText(altText);
        return (THIS) this;
    }

    /**
     * Sets whether the media is to automatically start playback when enough
     * data has been loaded.
     *
     * @param autoplay if true, enable autoplay
     * @return this for method chaining
     * @see AbstractMedia#setAutoplay(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withAutoplay(boolean autoplay) {
        ((AbstractMedia) this).setAutoplay(autoplay);
        return (THIS) this;
    }

    /**
     * Set whether the alternative text ({@link AbstractMedia#setAltText(String)}) is
     * rendered as HTML or not.
     *
     * @param htmlContentAllowed true if alternated text may contain html, false otherwise
     * @return this for method chaining
     * @see AbstractMedia#setHtmlContentAllowed(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withHtmlContentAllowed(boolean htmlContentAllowed) {
        ((AbstractMedia) this).setHtmlContentAllowed(htmlContentAllowed);
        return (THIS) this;
    }

    /**
     * Enables or disables looping.
     *
     * @param loop if true, enable looping
     * @return this for method chaining
     * @see AbstractMedia#setLoop(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withLoop(final boolean loop) {
        ((AbstractMedia) this).setLoop(loop);
        return (THIS) this;
    }

    /**
     * Set whether to mute the audio or not.
     *
     * @param muted if true, media is muted
     * @return this for method chaining
     * @see AbstractMedia#setMuted(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withMuted(boolean muted) {
        ((AbstractMedia) this).setMuted(muted);
        return (THIS) this;
    }

    /**
     * Sets the preload attribute that is intended to provide a hint to the
     * browser how the media should be preloaded. Valid values are 'none',
     * 'metadata', 'preload', see the <a href=
     * "https://developer.mozilla.org/en/docs/Web/HTML/Element/video#attr-preload">
     * Mozilla Developer Network</a> for details.
     *
     * @param preload preload mode
     * @return this for method chaining
     * @see AbstractMedia#setPreload(PreloadMode)
     */
    @SuppressWarnings("unchecked")
    public default THIS withPreload(final PreloadMode preload) {
        ((AbstractMedia) this).setPreload(preload);
        return (THIS) this;
    }

    /**
     * Sets whether or not the browser should show native media controls.
     *
     * @param showControls if true, controls are visible
     * @return this for method chaining
     * @see AbstractMedia#setShowControls(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withShowControls(boolean showControls) {
        ((AbstractMedia) this).setShowControls(showControls);
        return (THIS) this;
    }

    /**
     * Sets a single media file as the source of the media component.
     *
     * @param source the media source
     * @return this for method chaining
     * @see AbstractMedia#setSource(Resource)
     */
    @SuppressWarnings("unchecked")
    public default THIS withSource(Resource source) {
        ((AbstractMedia) this).setSource(source);
        return (THIS) this;
    }

    /**
     * Set multiple sources at once. Which of the sources is used is selected by
     * the browser depending on which file formats it supports. See
     * <a href="http://en.wikipedia.org/wiki/HTML5_video#Table">wikipedia</a>
     * for a table of formats supported by different browsers.
     *
     * @param sources the media sources
     * @return this for method chaining
     * @see AbstractMedia#setSources(Resource...)
     */
    @SuppressWarnings("unchecked")
    public default THIS withSources(Resource... sources) {
        ((AbstractMedia) this).setSources(sources);
        return (THIS) this;
    }
}
