package com.vaadin.fluent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.vaadin.data.provider.DataProvider;
import com.vaadin.data.provider.ListDataProvider;
import com.vaadin.event.SortEvent;
import com.vaadin.fluent.pojo.Person;
import com.vaadin.fluent.ui.FGrid;
import com.vaadin.shared.data.sort.SortDirection;
import com.vaadin.ui.Grid.Column;
import com.vaadin.ui.Grid.ItemClick;
import com.vaadin.ui.Grid.SelectionMode;
import com.vaadin.ui.Label;
import com.vaadin.ui.components.grid.SingleSelectionModel;

public class FGridTest {

    @Test
    public void test() {
        Person p1 = new Person(1, "John", LocalDate.of(1990, Month.JANUARY, 2));
        Person p2 = new Person(1, "George", LocalDate.of(1991, Month.JUNE, 19));
        Person p3 = new Person(1, "Tim", LocalDate.of(1995, Month.APRIL, 7));

        List<Person> persons = Arrays.asList(p1, p2, p3);
        ListDataProvider<Person> dataProvider = DataProvider.ofCollection(persons);

        FGrid<Person> grid = new FGrid<Person>(Person.class).withColumns("name", "birthday")
                                                            .withSelectionMode(SelectionMode.SINGLE)
                                                            .withFrozenColumnCount(1)
                                                            .withHeaderVisible(false)
                                                            .withFooterVisible(false)
                                                            .withRowHeight(25)
                                                            .withColumnReorderingAllowed(false)
                                                            .withHeightByRows(12)
                                                            .withDataProvider(dataProvider)
                                                            .withSort("birthday", SortDirection.DESCENDING);

        grid.withItemClickListener(event -> grid.setDetailsVisible(event.getItem(), !grid.isDetailsVisible(event.getItem())))
            .withDetailsGenerator(person -> new Label(person.getName()))
            .withSortListener(event -> System.out.println("sort changed"));

        Column<Person, ?> birthdayColumn = grid.getColumn("birthday");

        assertNotNull(grid.getColumn("name"));
        assertNotNull(birthdayColumn);
        assertTrue(grid.getSelectionModel() instanceof SingleSelectionModel);
        assertEquals(1, grid.getFrozenColumnCount());
        assertFalse(grid.isHeaderVisible());
        assertFalse(grid.isFooterVisible());
        assertFalse(grid.isColumnReorderingAllowed());
        assertEquals(25, grid.getRowHeight(), 0);
        assertEquals(12, grid.getHeightByRows(), 0);
        assertEquals(dataProvider, grid.getDataProvider());
        assertEquals(birthdayColumn, grid.getSortOrder().get(0).getSorted());
        assertEquals(SortDirection.DESCENDING, grid.getSortOrder().get(0).getDirection());
        assertEquals(1, grid.getListeners(ItemClick.class).size());
        assertEquals(1, grid.getListeners(SortEvent.class).size());

    }

}
