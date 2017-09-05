package com.vaadin.fluent.ui;

import com.vaadin.fluent.api.FluentSlider;
import com.vaadin.ui.Slider;

public class FSlider
        extends Slider
        implements FluentSlider<FSlider> {

    private static final long serialVersionUID = 715007255611414671L;

    public FSlider() {
        super();
    }

    public FSlider(double min, double max, int resolution) {
        super(min, max, resolution);
    }

    public FSlider(int min, int max) {
        super(min, max);
    }

    public FSlider(String caption, int min, int max) {
        super(caption, min, max);
    }

    public FSlider(String caption) {
        super(caption);
    }
}
