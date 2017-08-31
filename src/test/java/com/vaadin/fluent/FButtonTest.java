package com.vaadin.fluent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.vaadin.event.FieldEvents.BlurEvent;
import com.vaadin.event.FieldEvents.FocusEvent;
import com.vaadin.event.ShortcutAction;
import com.vaadin.fluent.ui.FButton;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.Button.ClickEvent;

public class FButtonTest {

    @Test
    public void test() {
        FButton button = new FButton().withCaption("My button")
                                      .withIcon(VaadinIcons.ARROW_BACKWARD)
                                      .withIconAlternateText("backward")
                                      .withClickListener(click -> System.out.println("clicked"))
                                      .withClickShortcut(ShortcutAction.KeyCode.ENTER, null)
                                      .withBlurListener(blur -> System.out.println("lost focus"))
                                      .withFocusListener(focus -> System.out.println("gain focus"))
                                      .withTabIndex(5)
                                      .withDisableOnClick(true);

        assertEquals("My button", button.getCaption());
        assertEquals(VaadinIcons.ARROW_BACKWARD, button.getIcon());
        assertEquals("backward", button.getIconAlternateText());
        assertEquals(5, button.getTabIndex());
        assertEquals(1, button.getListeners(ClickEvent.class).size());
        assertEquals(1, button.getListeners(FocusEvent.class).size());
        assertEquals(1, button.getListeners(BlurEvent.class).size());
        assertTrue(button.getClickShortcut() != null);
        assertTrue(button.isDisableOnClick());

    }

}
