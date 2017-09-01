package com.vaadin.fluent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.vaadin.fluent.ui.FLabel;
import com.vaadin.shared.ui.ContentMode;

public class FLabelTest {

    @Test
    public void test() {
        FLabel label = new FLabel().withCaption("<strong>My Label</strong>")
                                   .withValue("<strong>label value</strong>")
                                   .withCaptionAsHtml(true)
                                   .withContentMode(ContentMode.HTML)
                                   .withUndefinedWidth()
                                   .withUndefinedHeight();

        assertEquals("<strong>My Label</strong>", label.getCaption());
        assertEquals("<strong>label value</strong>", label.getValue());
        assertTrue(label.isCaptionAsHtml());
        assertEquals(ContentMode.HTML, label.getContentMode());
        assertEquals(-1, label.getWidth(), 0);
        assertEquals(-1, label.getWidth(), 0);
    }

}
