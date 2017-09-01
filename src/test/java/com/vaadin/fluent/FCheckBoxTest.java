package com.vaadin.fluent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.vaadin.fluent.ui.FCheckBox;

public class FCheckBoxTest {

    @Test
    public void test() {
        FCheckBox checkBox = new FCheckBox().withCaption("My CheckBox")
                                            .withDescription("description")
                                            .withValue(true)
                                            .withRequiredIndicatorVisible(true);

        assertEquals("My CheckBox", checkBox.getCaption());
        assertEquals("description", checkBox.getDescription());
        assertTrue(checkBox.getValue());
        assertTrue(checkBox.isRequiredIndicatorVisible());
    }

}
