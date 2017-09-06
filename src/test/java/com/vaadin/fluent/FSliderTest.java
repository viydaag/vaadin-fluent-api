package com.vaadin.fluent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.vaadin.fluent.ui.FSlider;
import com.vaadin.server.Sizeable.Unit;
import com.vaadin.shared.ui.slider.SliderOrientation;

public class FSliderTest {

    @Test
    public void test() {
        FSlider slider = new FSlider().withCaption("My Slider")
                                      .withEnabled(true)
                                      .withWidth("75%")
                                      .withMin(25.0)
                                      .withMax(75.0)
                                      .withResolution(1)
                                      .withOrientation(SliderOrientation.VERTICAL)
                                      .withValue(34.1);

        assertEquals("My Slider", slider.getCaption());
        assertTrue(slider.isEnabled());
        assertEquals(75, slider.getWidth(), 0);
        assertEquals(Unit.PERCENTAGE, slider.getWidthUnits());
        assertEquals(25, slider.getMin(), 0);
        assertEquals(34.1, slider.getValue(), 0);
        assertEquals(1, slider.getResolution());
        assertEquals(SliderOrientation.VERTICAL, slider.getOrientation());
    }

}
