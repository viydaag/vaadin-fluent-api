package com.vaadin.fluent.ui;

import com.vaadin.fluent.api.FluentAbstractColorPicker;
import com.vaadin.shared.ui.colorpicker.Color;
import com.vaadin.ui.ColorPickerArea;

public class FColorPickerArea
        extends ColorPickerArea
        implements FluentAbstractColorPicker<FColorPickerArea> {

    private static final long serialVersionUID = 6171712374445494018L;

    public FColorPickerArea() {
        super();
    }

    public FColorPickerArea(String popupCaption) {
        super(popupCaption);
    }

    public FColorPickerArea(String popupCaption, Color initialColor) {
        super(popupCaption, initialColor);
    }

}
