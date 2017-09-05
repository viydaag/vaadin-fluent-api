package com.vaadin.fluent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.junit.Test;

import com.vaadin.fluent.ui.FDateField;
import com.vaadin.fluent.ui.FInlineDateField;
import com.vaadin.shared.ui.datefield.DateResolution;

public class FDateFieldTest {

    @Test
    public void testInlineDateField() {
        FInlineDateField date = new FInlineDateField().withCaption("My date")
                                                      .withDateFormat("ddMMyyyy")
                                                      .withRangeStart(LocalDate.now().minus(3, ChronoUnit.YEARS))
                                                      .withRangeEnd(LocalDate.now().plusDays(1))
                                                      .withDateOutOfRangeMessage("out of range")
                                                      .withDefaultValue(LocalDate.now().minusDays(1))
                                                      .withLenient(true)
                                                      .withParseErrorMessage("parse error")
                                                      .withResolution(DateResolution.MONTH)
                                                      .withShowISOWeekNumbers(true);

        assertEquals("My date", date.getCaption());
        assertEquals("ddMMyyyy", date.getDateFormat());
        assertEquals(LocalDate.now().minus(3, ChronoUnit.YEARS), date.getRangeStart());
        assertEquals(LocalDate.now().plusDays(1), date.getRangeEnd());
        assertEquals("out of range", date.getDateOutOfRangeMessage());
        assertEquals(LocalDate.now().minusDays(1), date.getDefaultValue());
        assertEquals("parse error", date.getParseErrorMessage());
        assertEquals(DateResolution.MONTH, date.getResolution());
        assertTrue(date.isLenient());
        assertTrue(date.isShowISOWeekNumbers());
    }

    @Test
    public void testDateField() {
        FDateField date = new FDateField().withCaption("My date")
                                          .withDateFormat("ddMMyyyy")
                                          .withRangeStart(LocalDate.now().minus(3, ChronoUnit.YEARS))
                                          .withRangeEnd(LocalDate.now().plusDays(1))
                                          .withDateOutOfRangeMessage("out of range")
                                          .withDefaultValue(LocalDate.now().minusDays(1))
                                          .withLenient(true)
                                          .withParseErrorMessage("parse error")
                                          .withResolution(DateResolution.MONTH)
                                          .withShowISOWeekNumbers(true)
                                          .withAssistiveText("test")
                                          .withTextFieldEnabled(false)
                                          .withPlaceholder("enter date");

        assertEquals("My date", date.getCaption());
        assertEquals("ddMMyyyy", date.getDateFormat());
        assertEquals(LocalDate.now().minus(3, ChronoUnit.YEARS), date.getRangeStart());
        assertEquals(LocalDate.now().plusDays(1), date.getRangeEnd());
        assertEquals("out of range", date.getDateOutOfRangeMessage());
        assertEquals(LocalDate.now().minusDays(1), date.getDefaultValue());
        assertEquals("parse error", date.getParseErrorMessage());
        assertEquals(DateResolution.MONTH, date.getResolution());
        assertTrue(date.isLenient());
        assertTrue(date.isShowISOWeekNumbers());
        assertFalse(date.isTextFieldEnabled());
        assertEquals("test", date.getAssistiveText());
        assertEquals("enter date", date.getPlaceholder());
    }

}
