package com.vaadin.fluent.api;

import java.time.LocalDateTime;

import com.vaadin.shared.ui.datefield.DateTimeResolution;
import com.vaadin.ui.AbstractLocalDateTimeField;

/**
 * The base interface for fluent versions of {@link AbstractLocalDateTimeField}
 * 
 * @see AbstractLocalDateTimeField
 * 
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentAbstractLocalDateTimeField<THIS extends FluentAbstractLocalDateTimeField<THIS>>
        extends FluentAbstractDateField<THIS, LocalDateTime, DateTimeResolution> {

}
