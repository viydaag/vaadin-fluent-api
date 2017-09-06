package com.vaadin.fluent.api;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.util.Calendar;

import com.vaadin.fluent.api.FluentFieldEvents.FluentBlurNotifier;
import com.vaadin.fluent.api.FluentFieldEvents.FluentFocusNotifier;
import com.vaadin.shared.ui.datefield.DateResolution;
import com.vaadin.ui.AbstractDateField;

/**
 * The base interface for fluent versions of {@link AbstractDateField}
 * 
 * @see AbstractDateField
 * 
 * @param <THIS> Self-referential generic THIS
 * @param <FIELD> type of date ({@code LocalDate} or {@code LocalDateTime}).
 * @param <R> resolution enumeration type
 */
public interface FluentAbstractDateField<THIS extends FluentAbstractDateField<THIS, FIELD, R>, FIELD extends Temporal & TemporalAdjuster & Serializable & Comparable<? super FIELD>, R extends Enum<R>>
        extends FluentAbstractField<THIS, FIELD>, FluentFocusNotifier<THIS>, FluentBlurNotifier<THIS> {

    /**
     * Sets formatting used by some component implementations. See
     * {@link SimpleDateFormat} for format details.
     *
     * @param dateFormat
     *            the dateFormat to set
     * @return this for method chaining
     * @see AbstractDateField#setDateFormat(String)
     */
    @SuppressWarnings("unchecked")
    public default THIS withDateFormat(String dateFormat) {
        ((AbstractDateField<FIELD, R>) this).setDateFormat(dateFormat);
        return (THIS) this;
    }

    /**
     * Sets the current error message if the range validation fails.
     *
     * @param dateOutOfRangeMessage
     *            - Localizable message which is shown when value (the date) is
     *            set outside allowed range
     * @return this for method chaining
     * @see AbstractDateField#setDateOutOfRangeMessage(String)
     */
    @SuppressWarnings("unchecked")
    public default THIS withDateOutOfRangeMessage(String dateOutOfRangeMessage) {
        ((AbstractDateField<FIELD, R>) this).setDateOutOfRangeMessage(dateOutOfRangeMessage);
        return (THIS) this;
    }

    /**
     * Sets the default value for the field. The default value is the starting
     * point for the date field when nothing has been selected yet. If no
     * default value is set, current date/time is used.
     *
     * @param defaultValue 
     *           the field default temporal value
     * @return this for method chaining
     * @see AbstractDateField#setDefaultValue(Temporal)
     */
    @SuppressWarnings("unchecked")
    public default THIS withDefaultValue(FIELD defaultValue) {
        ((AbstractDateField<FIELD, R>) this).setDefaultValue(defaultValue);
        return (THIS) this;
    }

    /**
     * Specifies whether or not date/time interpretation in component is to be
     * lenient.
     *
     * @see Calendar#setLenient(boolean)
     *
     * @param lenient
     *            true if the lenient mode is to be turned on; false if it is to
     *            be turned off.
     * @return this for method chaining
     * @see AbstractDateField#setLenient(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withLenient(boolean lenient) {
        ((AbstractDateField<FIELD, R>) this).setLenient(lenient);
        return (THIS) this;
    }

    /**
     * Sets the default error message used if the DateField cannot parse the
     * text input by user to a Date field. Note that if the
     * {@link AbstractDateField#handleUnparsableDateString(String)} method is overridden, the
     * localized message from its exception is used.
     *
     * @see AbstractDateField#getParseErrorMessage()
     * @see AbstractDateField#handleUnparsableDateString(String)
     * @param parsingErrorMessage
     *            the parsing error message
     * @return this for method chaining
     * @see AbstractDateField#setParseErrorMessage(String)
     */
    @SuppressWarnings("unchecked")
    public default THIS withParseErrorMessage(String parsingErrorMessage) {
        ((AbstractDateField<FIELD, R>) this).setParseErrorMessage(parsingErrorMessage);
        return (THIS) this;
    }

    /**
     * Sets the end range for this component. If the value is set after this
     * date (taking the resolution into account), the component will not
     * validate. If <code>endDate</code> is set to <code>null</code>, any value
     * after <code>startDate</code> will be accepted by the range.
     *
     * @param endDate
     *            - the allowed range's end date (inclusive, based on the
     *            current resolution)
     * @return this for method chaining
     * @see AbstractDateField#setRangeEnd(Temporal)
     */
    @SuppressWarnings("unchecked")
    public default THIS withRangeEnd(FIELD endDate) {
        ((AbstractDateField<FIELD, R>) this).setRangeEnd(endDate);
        return (THIS) this;
    }

    /**
     * Sets the start range for this component. If the value is set before this
     * date (taking the resolution into account), the component will not
     * validate. If <code>startDate</code> is set to <code>null</code>, any
     * value before <code>endDate</code> will be accepted by the range
     *
     * @param startDate
     *            - the allowed range's start date
     * @return this for method chaining
     * @see AbstractDateField#setRangeStart(Temporal)
     */
    @SuppressWarnings("unchecked")
    public default THIS withRangeStart(FIELD startDate) {
        ((AbstractDateField<FIELD, R>) this).setRangeStart(startDate);
        return (THIS) this;
    }

    /**
     * Sets the resolution of the DateField.
     *
     * The default resolution is {@link DateResolution#DAY} since Vaadin 7.0.
     *
     * @param resolution
     *            the resolution to set, not {@code null}
     * @return this for method chaining
     * @see AbstractDateField#setResolution(Enum)
     */
    @SuppressWarnings("unchecked")
    public default THIS withResolution(R resolution) {
        ((AbstractDateField<FIELD, R>) this).setResolution(resolution);
        return (THIS) this;
    }

    /**
     * Sets the visibility of ISO 8601 week numbers in the date selector. ISO
     * 8601 defines that a week always starts with a Monday so the week numbers
     * are only shown if this is the case.
     *
     * @param showWeekNumbers
     *            true if week numbers should be shown, false otherwise.
     * @return this for method chaining
     * @see AbstractDateField#setShowISOWeekNumbers(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withShowISOWeekNumbers(boolean showWeekNumbers) {
        ((AbstractDateField<FIELD, R>) this).setShowISOWeekNumbers(showWeekNumbers);
        return (THIS) this;
    }

}
