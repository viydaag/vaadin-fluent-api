package com.vaadin.fluent.ui;

import com.vaadin.fluent.api.FluentAbstractColorPicker;
import com.vaadin.shared.ui.colorpicker.Color;
import com.vaadin.ui.ColorPicker;

public class FColorPicker
        extends ColorPicker
        implements FluentAbstractColorPicker<FColorPicker> {

    private static final long serialVersionUID = -7604232084305097159L;

    public FColorPicker() {
        super();
    }

    public FColorPicker(String popupCaption) {
        super(popupCaption);
    }

    public FColorPicker(String popupCaption, Color initialColor) {
        super(popupCaption, initialColor);
    }

}
