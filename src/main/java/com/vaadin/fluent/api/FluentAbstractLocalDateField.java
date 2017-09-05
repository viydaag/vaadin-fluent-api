package com.vaadin.fluent.api;

import java.time.LocalDate;

import com.vaadin.shared.ui.datefield.DateResolution;
import com.vaadin.ui.AbstractLocalDateField;

/**
 * The base interface for fluent versions of {@link AbstractLocalDateField}
 * 
 * @see AbstractLocalDateField
 * 
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentAbstractLocalDateField<THIS extends FluentAbstractLocalDateField<THIS>>
        extends FluentAbstractDateField<THIS, LocalDate, DateResolution> {

}
