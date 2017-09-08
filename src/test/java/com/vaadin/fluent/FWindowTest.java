package com.vaadin.fluent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.stream.Collectors;

import org.junit.Test;

import com.vaadin.event.ShortcutAction;
import com.vaadin.fluent.ui.FWindow;
import com.vaadin.shared.ui.window.WindowMode;
import com.vaadin.shared.ui.window.WindowRole;
import com.vaadin.ui.Window.CloseEvent;
import com.vaadin.ui.Window.CloseShortcut;
import com.vaadin.ui.Window.ResizeEvent;
import com.vaadin.ui.Window.WindowModeChangeEvent;
import com.vaadin.ui.Window.WindowOrderChangeEvent;

public class FWindowTest {

    @Test
    public void test() {
        FWindow window = new FWindow().withAssistivePostfix("postfix")
                                      .withAssistivePrefix("prefix")
                                      .withAssistiveRole(WindowRole.ALERTDIALOG)
                                      .withCloseListener(event -> System.out.println("closed"))
                                      .withClosable(false)
                                      .withCloseShortcut(ShortcutAction.KeyCode.ENTER, null)
                                      .withDraggable(false)
                                      .withModal(true)
                                      .withResizable(false)
                                      .withResizeLazy(true)
                                      .withResizeListener(event -> System.out.println("resized"))
                                      .withTabStopBottomAssistiveText("bottom")
                                      .withTabStopTopAssistiveText("top")
                                      .withTabStopEnabled(true)
                                      .withWindowMode(WindowMode.MAXIMIZED)
                                      .withWindowModeChangeListener(event -> System.out.println("mode changed"))
                                      .withWindowOrderChangeListener(event -> System.out.println("order changed"))
                                      .withPosition(1, 2)
                                      .withParent(null);

        assertEquals("postfix", window.getAssistivePostfix());
        assertEquals("prefix", window.getAssistivePrefix());
        assertEquals(WindowRole.ALERTDIALOG, window.getAssistiveRole());
        assertEquals(1, window.getListeners(CloseEvent.class).size());
        assertEquals(1, window.getListeners(ResizeEvent.class).size());
        assertEquals(1, window.getListeners(WindowModeChangeEvent.class).size());
        assertEquals(1, window.getListeners(WindowOrderChangeEvent.class).size());
        assertFalse(window.isClosable());
        assertFalse(window.isDraggable());
        assertFalse(window.isResizable());
        assertTrue(window.isModal());
        assertTrue(window.isResizeLazy());
        assertTrue(window.isTabStopEnabled());
        assertTrue(window.getCloseShortcuts()
                         .stream()
                         .map(CloseShortcut::getKeyCode)
                         .collect(Collectors.toList())
                         .contains(ShortcutAction.KeyCode.ENTER));
        assertEquals("bottom", window.getTabStopBottomAssistiveText());
        assertEquals("top", window.getTabStopTopAssistiveText());
        assertEquals(WindowMode.MAXIMIZED, window.getWindowMode());
        assertEquals(1, window.getPositionX());
        assertEquals(2, window.getPositionY());
    }

}
