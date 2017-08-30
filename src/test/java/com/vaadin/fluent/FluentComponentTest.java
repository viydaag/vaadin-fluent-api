package com.vaadin.fluent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Locale;

import org.junit.Test;

import com.vaadin.fluent.ui.FTextField;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.UserError;

public class FluentComponentTest {

    @Test
    public void test() {

        UserError error = new UserError("error");

        FTextField field = new FTextField().withCaption("test")
                                           .withEnabled(false)
                                           .withIcon(VaadinIcons.AIRPLANE)
                                           .withId("id")
                                           .withPrimaryStyleName("pStyle")
                                           .withStyleName("t1 t2")
                                           .withVisible(false)
                                           .withTabIndex(5)
                                           .withCaptionAsHtml(true)
                                           .withComponentError(error)
                                           .withDescription("description")
                                           .withData("data")
                                           .withLocale(Locale.CANADA)
                                           .withResponsive(true);

        assertEquals("test", field.getCaption());
        assertFalse(field.isEnabled());
        assertEquals(VaadinIcons.AIRPLANE, field.getIcon());
        assertEquals("id", field.getId());
        assertEquals("pStyle", field.getPrimaryStyleName());
        assertTrue(field.getStyleName().contains("t1"));
        assertTrue(field.getStyleName().contains("t2"));
        assertFalse(field.isVisible());
        assertEquals(5, field.getTabIndex());
        assertTrue(field.isCaptionAsHtml());
        assertEquals(error, field.getComponentError());
        assertEquals("description", field.getDescription());
        assertEquals("data", field.getData());
        assertEquals(Locale.CANADA, field.getLocale());
        assertEquals(error, field.isResponsive());
    }

}
