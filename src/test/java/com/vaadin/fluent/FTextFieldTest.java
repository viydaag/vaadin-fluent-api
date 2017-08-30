package com.vaadin.fluent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.vaadin.fluent.ui.FTextField;
import com.vaadin.shared.ui.ValueChangeMode;

public class FTextFieldTest {

    @Test
    public void test() {
        FTextField field = new FTextField().withPlaceholder("enter text")
                                           .withValue("some text")
                                           .withVisible(false)
                                           .withValueChangeMode(ValueChangeMode.TIMEOUT)
                                           .withValueChangeTimeout(5000);

        assertEquals("enter text", field.getPlaceholder());
        assertEquals("some text", field.getValue());
        assertFalse(field.isVisible());
        assertEquals(ValueChangeMode.TIMEOUT, field.getValueChangeMode());
        assertEquals(5000, field.getValueChangeTimeout());
    }

}
