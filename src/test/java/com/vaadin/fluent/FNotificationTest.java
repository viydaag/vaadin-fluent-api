package com.vaadin.fluent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.vaadin.fluent.ui.FNotification;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.shared.Position;
import com.vaadin.ui.Notification.Type;

public class FNotificationTest {

    @Test
    public void test() {
        FNotification notif = new FNotification("", Type.WARNING_MESSAGE).withCaption("My notif")
                                                                         .withDelayMsec(3000)
                                                                         .withDescription("description")
                                                                         .withHtmlContentAllowed(true)
                                                                         .withIcon(VaadinIcons.ARCHIVE)
                                                                         .withPosition(Position.TOP_RIGHT)
                                                                         .withStyleName("test");

        assertEquals("My notif", notif.getCaption());
        assertEquals(3000, notif.getDelayMsec());
        assertEquals("description", notif.getDescription());
        assertTrue(notif.isHtmlContentAllowed());
        assertEquals(VaadinIcons.ARCHIVE, notif.getIcon());
        assertEquals(Position.TOP_RIGHT, notif.getPosition());
        assertEquals("test", notif.getStyleName());
    }

}
