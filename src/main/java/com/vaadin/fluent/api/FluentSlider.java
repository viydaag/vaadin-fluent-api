package com.vaadin.fluent.api;

import com.vaadin.shared.ui.slider.SliderOrientation;
import com.vaadin.ui.Slider;

/**
 * The base interface for fluent versions of {@link Slider}
 * 
 * @see Slider
 * 
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentSlider<THIS extends FluentSlider<THIS>>
        extends FluentAbstractField<THIS, Double> {

    /**
     * Sets the minimum slider value. If the current value of the slider is
     * smaller than this, the value is set to the new minimum.
     *
     * @param min
     *            The new minimum slider value
     * @return this for method chaining
     * @see Slider#setMin(double)
     */
    @SuppressWarnings("unchecked")
    public default THIS withMin(double min) {
        ((Slider) this).setMin(min);
        return (THIS) this;
    }

    /**
     * Sets the maximum slider value. If the current value of the slider is
     * larger than this, the value is set to the new maximum.
     *
     * @param max
     *            The new maximum slider value
     * @return this for method chaining
     * @see Slider#setMax(double)
     */
    @SuppressWarnings("unchecked")
    public default THIS withMax(double max) {
        ((Slider) this).setMax(max);
        return (THIS) this;
    }

    /**
     * Sets the orientation of the slider.
     *
     * @param orientation
     *            the new orientation, either
     *            {@link SliderOrientation#HORIZONTAL} or
     *            {@link SliderOrientation#VERTICAL}
     * @return this for method chaining
     * @see Slider#setOrientation(SliderOrientation)
     */
    @SuppressWarnings("unchecked")
    public default THIS withOrientation(SliderOrientation orientation) {
        ((Slider) this).setOrientation(orientation);
        return (THIS) this;
    }

    /**
     * Set a new resolution for the slider. The resolution is the number of
     * digits after the decimal point.
     *
     * @throws IllegalArgumentException
     *             if resolution is negative.
     *
     * @param resolution
     *            the number of digits after the decimal point
     * @return this for method chaining
     * @see Slider#setResolution(int)
     */
    @SuppressWarnings("unchecked")
    public default THIS withResolution(int resolution) {
        ((Slider) this).setResolution(resolution);
        return (THIS) this;
    }

}
