package com.vaadin.fluent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.vaadin.fluent.ui.FColorPicker;
import com.vaadin.fluent.ui.FColorPickerArea;
import com.vaadin.ui.AbstractColorPicker.PopupStyle;

public class FColorPickerTest {

    @Test
    public void testColorPicker() {
        FColorPicker color = new FColorPicker().withCaption("My colorpicker")
                                               .withDefaultCaptionEnabled(true)
                                               .withHistoryVisibility(false)
                                               .withHSVVisibility(false)
                                               .withPosition(2, 3)
                                               .withRGBVisibility(false)
                                               .withTextfieldVisibility(false)
                                               .withSwatchesVisibility(true);

        assertEquals("My colorpicker", color.getCaption());
        assertTrue(color.isDefaultCaptionEnabled());
        assertFalse(color.getHistoryVisibility());
        assertFalse(color.getHSVVisibility());
        assertFalse(color.getRGBVisibility());
        assertFalse(color.getTextfieldVisibility());
        assertTrue(color.getSwatchesVisibility());

        color.withPopupStyle(PopupStyle.POPUP_SIMPLE);
        assertEquals(PopupStyle.POPUP_SIMPLE, color.getPopupStyle());
    }

    @Test
    public void testColorPickerArea() {
        FColorPickerArea color = new FColorPickerArea().withCaption("My colorpickerarea")
                                                       .withDefaultCaptionEnabled(true)
                                                       .withHistoryVisibility(false)
                                                       .withHSVVisibility(false)
                                                       .withPosition(2, 3)
                                                       .withRGBVisibility(false)
                                                       .withTextfieldVisibility(false)
                                                       .withSwatchesVisibility(true);

        assertEquals("My colorpickerarea", color.getCaption());
        assertTrue(color.isDefaultCaptionEnabled());
        assertFalse(color.getHistoryVisibility());
        assertFalse(color.getHSVVisibility());
        assertFalse(color.getRGBVisibility());
        assertFalse(color.getTextfieldVisibility());
        assertTrue(color.getSwatchesVisibility());

        color.withPopupStyle(PopupStyle.POPUP_SIMPLE);
        assertEquals(PopupStyle.POPUP_SIMPLE, color.getPopupStyle());
    }

}
