package com.vaadin.fluent;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.vaadin.fluent.ui.FMenuBar;

public class FMenuBarTest {

    @Test
    public void test() {
        FMenuBar bar = new FMenuBar().withAutoOpen(true).withHtmlContentAllowed(true);

        assertTrue(bar.isAutoOpen());
        assertTrue(bar.isHtmlContentAllowed());
    }

}
