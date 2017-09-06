package com.vaadin.fluent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.vaadin.fluent.ui.FPopupView;
import com.vaadin.ui.Label;

public class FPopupViewTest {

    @Test
    public void test() {

        Label label = new Label("Popup");

        FPopupView popup = new FPopupView("My Popup", label).withPopupVisible(true).withHideOnMouseOut(false);

        assertTrue(popup.isPopupVisible());
        assertFalse(popup.isHideOnMouseOut());
        assertEquals(label, popup.getContent().getPopupComponent());
    }

}
