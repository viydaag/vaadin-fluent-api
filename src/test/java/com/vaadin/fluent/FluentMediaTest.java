package com.vaadin.fluent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.vaadin.fluent.ui.FAudio;
import com.vaadin.fluent.ui.FVideo;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.Resource;
import com.vaadin.shared.ui.PreloadMode;

public class FluentMediaTest {

    @Test
    public void testAudio() {
        final Resource audioResource = new ExternalResource(
                "http://mirrors.creativecommons.org/ccmixter/contrib/Wired/The%20Rapture%20-%20Sister%20Saviour%20(Blackstrobe%20Remix).mp3");
        FAudio audio = new FAudio().withAltText("alt")
                                   .withAutoplay(true)
                                   .withCaption("My audio")
                                   .withHtmlContentAllowed(true)
                                   .withMuted(true)
                                   .withLoop(true)
                                   .withPreload(PreloadMode.METADATA)
                                   .withSource(audioResource)
                                   .withShowControls(true);

        assertEquals("alt", audio.getAltText());
        assertEquals("My audio", audio.getCaption());
        assertTrue(audio.isAutoplay());
        assertTrue(audio.isHtmlContentAllowed());
        assertTrue(audio.isShowControls());
        assertTrue(audio.isLoop());
        assertTrue(audio.isMuted());
        assertEquals(PreloadMode.METADATA, audio.getPreload());
        assertEquals(audioResource, audio.getSources().get(0));

    }

    @Test
    public void testVideo() {
        final Resource mp4Resource = new ExternalResource("https://s3.amazonaws.com/videos.vaadin.com/vaadin_fin_web002.mp4");
        final Resource ogvResource = new ExternalResource("https://s3.amazonaws.com/videos.vaadin.com/vaadin_fin_web002.ogv");
        FVideo video = new FVideo().withAltText("alt")
                                   .withAutoplay(false)
                                   .withCaption("My video")
                                   .withHtmlContentAllowed(false)
                                   .withMuted(false)
                                   .withLoop(false)
                                   .withPreload(PreloadMode.METADATA)
                                   .withSources(mp4Resource, ogvResource)
                                   .withShowControls(true)
                                   .withPoster(VaadinIcons.POWER_OFF);

        assertEquals("alt", video.getAltText());
        assertEquals("My video", video.getCaption());
        assertFalse(video.isAutoplay());
        assertFalse(video.isHtmlContentAllowed());
        assertTrue(video.isShowControls());
        assertFalse(video.isLoop());
        assertFalse(video.isMuted());
        assertEquals(PreloadMode.METADATA, video.getPreload());
        assertTrue(video.getSources().contains(mp4Resource));
        assertTrue(video.getSources().contains(ogvResource));
        assertEquals(VaadinIcons.POWER_OFF, video.getPoster());
    }

}
