package com.vaadin.fluent.api;

import com.vaadin.ui.GridLayout;

/**
 * The base interface for fluent versions of {@link GridLayout}
 * 
 * @see GridLayout
 */
public interface FluentGridLayout<THIS extends FluentGridLayout<THIS>>
        extends FluentAbstractLayout<THIS>, FluentLayout.FluentAlignmentHandler<THIS>, FluentLayout.FluentMarginHandler<THIS>,
        FluentLayout.FluentSpacingHandler<THIS> {

}
