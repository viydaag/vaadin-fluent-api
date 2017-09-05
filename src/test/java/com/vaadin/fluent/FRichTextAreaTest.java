package com.vaadin.fluent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.vaadin.fluent.ui.FRichTextArea;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.shared.ui.ValueChangeMode;

public class FRichTextAreaTest {

    @Test
    public void test() {
        FRichTextArea area = new FRichTextArea().withCaption("test")
                                                .withEnabled(false)
                                                .withIcon(VaadinIcons.AIRPLANE)
                                                .withId("textId")
                                                .withValue("some text")
                                                .withVisible(false)
                                                .withValueChangeMode(ValueChangeMode.TIMEOUT)
                                                .withValueChangeTimeout(5000);

        assertEquals("test", area.getCaption());
        assertFalse(area.isEnabled());
        assertEquals(VaadinIcons.AIRPLANE, area.getIcon());
        assertEquals("textId", area.getId());
        assertEquals("some text", area.getValue());
        assertFalse(area.isVisible());
        assertEquals(ValueChangeMode.TIMEOUT, area.getValueChangeMode());
        assertEquals(5000, area.getValueChangeTimeout());
    }

}
