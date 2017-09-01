package com.vaadin.fluent;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.vaadin.fluent.ui.FLink;
import com.vaadin.server.ExternalResource;
import com.vaadin.shared.ui.BorderStyle;

public class FLinkTest {

    @Test
    public void test() {
        ExternalResource resource = new ExternalResource("http://www.google.com");
        FLink link = new FLink().withCaption("My link")
                                .withResource(resource)
                                .withTargetBorder(BorderStyle.MINIMAL)
                                .withTargetHeight(500)
                                .withTargetWidth(500)
                                .withTargetName("_blank");

        assertEquals("My link", link.getCaption());
        assertEquals(resource, link.getResource());
        assertEquals(BorderStyle.MINIMAL, link.getTargetBorder());
        assertEquals(500, link.getTargetHeight());
        assertEquals(500, link.getTargetWidth());
        assertEquals("_blank", link.getTargetName());
    }

}
