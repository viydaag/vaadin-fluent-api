package com.vaadin.fluent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.vaadin.data.provider.HierarchicalDataProvider;
import com.vaadin.event.CollapseEvent;
import com.vaadin.event.ExpandEvent;
import com.vaadin.fluent.pojo.Person;
import com.vaadin.fluent.ui.FTree;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.Sizeable.Unit;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.Grid.SelectionMode;
import com.vaadin.ui.IconGenerator;
import com.vaadin.ui.ItemCaptionGenerator;
import com.vaadin.ui.StyleGenerator;
import com.vaadin.ui.Tree.ItemClick;
import com.vaadin.ui.components.grid.MultiSelectionModel;

public class FTreeTest {

    @Test
    public void test() {
        Person p1 = new Person(1, "John", LocalDate.of(1990, Month.JANUARY, 2));
        Person p2 = new Person(2, "George", LocalDate.of(1991, Month.JUNE, 19));
        Person p3 = new Person(3, "Tim", LocalDate.of(1995, Month.APRIL, 7));

        List<Person> persons = Arrays.asList(p1, p2, p3);

        ItemCaptionGenerator<Person> captionGenerator = Person::getName;
        IconGenerator<Person> iconProvider = person -> VaadinIcons.USER;
        StyleGenerator<Person> styleGenerator = person -> "test";

        FTree<Person> tree = new FTree<Person>().withCaption("My Tree", true)
                                                .withContentMode(ContentMode.HTML)
                                                .withDescription("description", ContentMode.HTML)
                                                .withCollapseListener(event -> System.out.println("collapsed"))
                                                .withExpandListener(event -> System.out.println("expanded"))
                                                .withAutoRecalculateWidth(false)
                                                .withItemCaptionGenerator(captionGenerator)
                                                .withItemClickListener(event -> System.out.println("clicked"))
                                                .withItemIconGenerator(iconProvider)
                                                .withItems(persons)
                                                .withItemCollapseAllowedProvider(person -> person.getId() > 1)
                                                .withSelectionMode(SelectionMode.MULTI)
                                                .withSelectionListener(event -> System.out.println("selected"))
                                                .withRowHeight(14)
                                                .withStyleGenerator(styleGenerator)
                                                .withWidth("50%")
                                                .withId("treeId");

        assertEquals("My Tree", tree.getCaption());
        assertEquals("treeId", tree.getId());
        assertEquals("description", tree.getDescription());
        assertFalse(tree.isAutoRecalculateWidth());
        assertEquals(1, tree.getListeners(CollapseEvent.class).size());
        assertEquals(1, tree.getListeners(ExpandEvent.class).size());
        assertEquals(1, tree.getListeners(ItemClick.class).size());
        assertTrue(tree.getSelectionModel() instanceof MultiSelectionModel);
        assertEquals(captionGenerator, tree.getItemCaptionGenerator());
        assertEquals(iconProvider, tree.getItemIconGenerator());
        assertEquals(styleGenerator, tree.getStyleGenerator());
        assertEquals(50, tree.getWidth(), 0);
        assertEquals(Unit.PERCENTAGE, tree.getWidthUnits());
        assertTrue(tree.getDataProvider() instanceof HierarchicalDataProvider);
    }

}
