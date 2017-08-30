package com.vaadin.fluent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.vaadin.fluent.ui.FTextArea;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.shared.ui.ValueChangeMode;

public class FTextAreaTest {

    @Test
    public void test() {
        FTextArea area = new FTextArea().withCaption("test")
                                        .withEnabled(false)
                                        .withIcon(VaadinIcons.AIRPLANE)
                                        .withId("textId")
                                        .withPlaceholder("enter text")
                                        .withValue("some text")
                                        .withVisible(false)
                                        .withValueChangeMode(ValueChangeMode.TIMEOUT)
                                        .withValueChangeTimeout(5000)
                                        .withRows(20)
                                        .withWordWrap(false);

        assertEquals("test", area.getCaption());
        assertFalse(area.isEnabled());
        assertEquals(VaadinIcons.AIRPLANE, area.getIcon());
        assertEquals("textId", area.getId());
        assertEquals("enter text", area.getPlaceholder());
        assertEquals("some text", area.getValue());
        assertFalse(area.isVisible());
        assertEquals(ValueChangeMode.TIMEOUT, area.getValueChangeMode());
        assertEquals(5000, area.getValueChangeTimeout());
        assertEquals(20, area.getRows());
        assertFalse(area.isWordWrap());
    }

}
