package com.vaadin.fluent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

import com.vaadin.data.provider.ListDataProvider;
import com.vaadin.fluent.pojo.Person;
import com.vaadin.fluent.ui.FRadioButtonGroup;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.SerializablePredicate;
import com.vaadin.server.Sizeable.Unit;

public class FRadioButtonGroupTest {

    @SuppressWarnings("unchecked")
    @Test
    public void test() {
        Person p1 = new Person(1, "John", LocalDate.of(1990, Month.JANUARY, 2));
        Person p2 = new Person(1, "George", LocalDate.of(1991, Month.JUNE, 19));
        Person p3 = new Person(1, "Tim", LocalDate.of(1995, Month.APRIL, 7));
        SerializablePredicate<Person> predicate = this::isBeforeJan1992;

        FRadioButtonGroup<Person> radio = new FRadioButtonGroup<Person>().withCaption("My ComboBox", true)
                                                                         .withWidth(300, Unit.PIXELS)
                                                                         .withItems(p1, p2, p3)
                                                                         .withItemCaptionGenerator(p -> p.getName())
                                                                         .withItemIconGenerator(p -> VaadinIcons.USER)
                                                                         .withItemEnabledProvider(predicate);

        assertEquals("My ComboBox", radio.getCaption());
        assertTrue(radio.isCaptionAsHtml());
        assertEquals(300, radio.getWidth(), 0);
        assertEquals(Unit.PIXELS, radio.getWidthUnits());
        assertEquals(3, ((ListDataProvider<Person>) radio.getDataProvider()).getItems().size());
        assertEquals(predicate, radio.getItemEnabledProvider());
    }

    public boolean isBeforeJan1992(Person p) {
        return p.getBirthday().isBefore(LocalDate.of(1992, Month.JANUARY, 1));
    }

}
