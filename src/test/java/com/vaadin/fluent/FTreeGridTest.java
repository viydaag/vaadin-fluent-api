package com.vaadin.fluent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

import com.vaadin.data.provider.HierarchicalDataProvider;
import com.vaadin.event.CollapseEvent;
import com.vaadin.event.ExpandEvent;
import com.vaadin.fluent.pojo.Person;
import com.vaadin.fluent.ui.FTreeGrid;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.Grid.ItemClick;
import com.vaadin.ui.Grid.SelectionMode;
import com.vaadin.ui.StyleGenerator;
import com.vaadin.ui.components.grid.MultiSelectionModel;

public class FTreeGridTest {

    @Test
    public void test() {
        Person p1 = new Person(1, "John", LocalDate.of(1990, Month.JANUARY, 2));
        Person p2 = new Person(2, "George", LocalDate.of(1991, Month.JUNE, 19));
        Person p3 = new Person(3, "Tim", LocalDate.of(1995, Month.APRIL, 7));

        StyleGenerator<Person> styleGenerator = person -> "test";

        FTreeGrid<Person> tree = new FTreeGrid<Person>(Person.class).withCaption("My Tree", true)
                                                                    .withDescription("description", ContentMode.HTML)
                                                                    .withCollapseListener(event -> System.out.println("collapsed"))
                                                                    .withExpandListener(event -> System.out.println("expanded"))
                                                                    .withItemClickListener(event -> System.out.println("clicked"))
                                                                    .withItems(p1, p2, p3)
                                                                    .withItemCollapseAllowedProvider(person -> person.getId() > 1)
                                                                    .withSelectionMode(SelectionMode.MULTI)
                                                                    .withSelectionListener(event -> System.out.println("selected"))
                                                                    .withRowHeight(14)
                                                                    .withStyleGenerator(styleGenerator)
                                                                    .withHierarchyColumn("name");

        assertEquals("My Tree", tree.getCaption());
        assertEquals("description", tree.getDescription());
        assertEquals(1, tree.getListeners(CollapseEvent.class).size());
        assertEquals(1, tree.getListeners(ExpandEvent.class).size());
        assertEquals(1, tree.getListeners(ItemClick.class).size());
        assertTrue(tree.getSelectionModel() instanceof MultiSelectionModel);
        assertEquals(styleGenerator, tree.getStyleGenerator());
        assertTrue(tree.getDataProvider() instanceof HierarchicalDataProvider);
        assertEquals("name", tree.getHierarchyColumn().getId());
    }

}
