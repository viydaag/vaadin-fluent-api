package com.vaadin.fluent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.vaadin.data.provider.DataProvider;
import com.vaadin.data.provider.ListDataProvider;
import com.vaadin.fluent.pojo.Person;
import com.vaadin.fluent.ui.FComboBox;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.Sizeable.Unit;

public class FComboBoxTest {

    @SuppressWarnings("unchecked")
    @Test
    public void testItems() {
        Person p1 = new Person(1, "John", LocalDate.of(1990, Month.JANUARY, 2));
        Person p2 = new Person(1, "George", LocalDate.of(1991, Month.JUNE, 19));
        Person p3 = new Person(1, "Tim", LocalDate.of(1995, Month.APRIL, 7));

        FComboBox<Person> combBox = new FComboBox<Person>().withCaption("My ComboBox", true)
                                                           .withWidth(300, Unit.PIXELS)
                                                           .withItems(p1, p2, p3)
                                                           .withEmptySelectionAllowed(false)
                                                           .withEmptySelectionCaption("empty")
                                                           .withItemCaptionGenerator(p -> p.getName())
                                                           .withItemIconGenerator(p -> VaadinIcons.USER)
                                                           .withPageLength(5)
                                                           .withPlaceholder("select")
                                                           .withTextInputAllowed(false);

        assertEquals("My ComboBox", combBox.getCaption());
        assertTrue(combBox.isCaptionAsHtml());
        assertEquals(300, combBox.getWidth(), 0);
        assertEquals(Unit.PIXELS, combBox.getWidthUnits());
        assertFalse(combBox.isEmptySelectionAllowed());
        assertFalse(combBox.isTextInputAllowed());
        assertEquals("empty", combBox.getEmptySelectionCaption());
        assertEquals("select", combBox.getPlaceholder());
        assertEquals(5, combBox.getPageLength());
        assertEquals(3, ((ListDataProvider<Person>) combBox.getDataProvider()).getItems().size());

    }

    @SuppressWarnings("unchecked")
    @Test
    public void testDataProvider() {
        Person p1 = new Person(1, "John", LocalDate.of(1990, Month.JANUARY, 2));
        Person p2 = new Person(1, "George", LocalDate.of(1991, Month.JUNE, 19));
        Person p3 = new Person(1, "Tim", LocalDate.of(1995, Month.APRIL, 7));

        List<Person> persons = Arrays.asList(p1, p2, p3);
        ListDataProvider<Person> dataProvider = DataProvider.ofCollection(persons);

        FComboBox<Person> combBox = new FComboBox<Person>().withCaption("My ComboBox")
                                                           .withWidth(300, Unit.PIXELS)
                                                           .withDataProvider(
                                                                   (item, filterText) -> item.toLowerCase().contains(filterText.toLowerCase()),
                                                                   dataProvider);

        assertEquals("My ComboBox", combBox.getCaption());
        assertFalse(combBox.isCaptionAsHtml());
        assertEquals(300, combBox.getWidth(), 0);
        assertEquals(Unit.PIXELS, combBox.getWidthUnits());
        assertEquals(3, ((ListDataProvider<Person>) combBox.getDataProvider()).getItems().size());

    }

}
