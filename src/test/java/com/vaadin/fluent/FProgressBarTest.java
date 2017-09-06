package com.vaadin.fluent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.vaadin.fluent.ui.FProgressBar;

public class FProgressBarTest {

    @Test
    public void test() {
        FProgressBar bar = new FProgressBar().withCaption("My progress bar").withIndeterminate(true).withValue(0.4f);

        assertEquals("My progress bar", bar.getCaption());
        assertTrue(bar.isIndeterminate());
        assertEquals(0.4f, bar.getValue(), 0);
    }

}
