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
import com.vaadin.fluent.ui.FNativeSelect;
import com.vaadin.server.Sizeable.Unit;

public class FNativeSelectTest {

    @SuppressWarnings("unchecked")
    @Test
    public void testItems() {
        Person p1 = new Person(1, "John", LocalDate.of(1990, Month.JANUARY, 2));
        Person p2 = new Person(1, "George", LocalDate.of(1991, Month.JUNE, 19));
        Person p3 = new Person(1, "Tim", LocalDate.of(1995, Month.APRIL, 7));

        FNativeSelect<Person> select = new FNativeSelect<Person>().withCaption("My NativeSelect", true)
                                                                  .withWidth(300, Unit.PIXELS)
                                                                  .withItems(p1, p2, p3)
                                                                  .withEmptySelectionAllowed(false)
                                                                  .withEmptySelectionCaption("empty")
                                                                  .withItemCaptionGenerator(p -> p.getName())
                                                                  .withVisibleItemCount(5);

        assertEquals("My NativeSelect", select.getCaption());
        assertTrue(select.isCaptionAsHtml());
        assertEquals(300, select.getWidth(), 0);
        assertEquals(Unit.PIXELS, select.getWidthUnits());
        assertFalse(select.isEmptySelectionAllowed());
        assertEquals("empty", select.getEmptySelectionCaption());
        assertEquals(5, select.getVisibleItemCount());
        assertEquals(3, ((ListDataProvider<Person>) select.getDataProvider()).getItems().size());

    }

    @SuppressWarnings("unchecked")
    @Test
    public void testDataProvider() {
        Person p1 = new Person(1, "John", LocalDate.of(1990, Month.JANUARY, 2));
        Person p2 = new Person(1, "George", LocalDate.of(1991, Month.JUNE, 19));
        Person p3 = new Person(1, "Tim", LocalDate.of(1995, Month.APRIL, 7));

        List<Person> persons = Arrays.asList(p1, p2, p3);
        ListDataProvider<Person> dataProvider = DataProvider.ofCollection(persons);

        FNativeSelect<Person> select = new FNativeSelect<Person>().withCaption("My NativeSelect")
                                                                  .withWidth(300, Unit.PIXELS)
                                                                  .withDataProvider(dataProvider);

        assertEquals("My NativeSelect", select.getCaption());
        assertFalse(select.isCaptionAsHtml());
        assertEquals(300, select.getWidth(), 0);
        assertEquals(Unit.PIXELS, select.getWidthUnits());
        assertEquals(3, ((ListDataProvider<Person>) select.getDataProvider()).getItems().size());

    }

}
