package com.vaadin.fluent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.vaadin.fluent.ui.FCssLayout;
import com.vaadin.fluent.ui.FGridLayout;
import com.vaadin.fluent.ui.FHorizontalLayout;
import com.vaadin.fluent.ui.FTabSheet;
import com.vaadin.fluent.ui.FVerticalLayout;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.TabSheet.SelectedTabChangeEvent;

public class FTabSheetTest {

    @Test
    public void test1() {
        FVerticalLayout c1 = new FVerticalLayout();
        FHorizontalLayout c2 = new FHorizontalLayout();
        FGridLayout c3 = new FGridLayout();
        FCssLayout c4 = new FCssLayout();
        FVerticalLayout c5 = new FVerticalLayout();

        FTabSheet tabSheet = new FTabSheet().withCaption("My TabSheet")
                                            .withSelectedTabChangeListener(event -> System.out.println("tab changed"))
                                            .withTab(c1)
                                            .withTab(c2, 0)
                                            .withTab(c3, "tab 3")
                                            .withTab(c4, "tab 4", VaadinIcons.ADD_DOCK)
                                            .withTab(c5, "tab 5", VaadinIcons.COMMENTS, 1)
                                            .withSelectedTab(c1)
                                            .withTabCaptionsAsHtml(true);

        assertEquals("My TabSheet", tabSheet.getCaption());
        assertEquals(1, tabSheet.getListeners(SelectedTabChangeEvent.class).size());
        assertEquals(5, tabSheet.getComponentCount());
        assertEquals(c1, tabSheet.getTab(2).getComponent());
        assertEquals(c2, tabSheet.getTab(0).getComponent());
        assertEquals(c3, tabSheet.getTab(3).getComponent());
        assertEquals(c4, tabSheet.getTab(4).getComponent());
        assertEquals(c5, tabSheet.getTab(1).getComponent());
        assertEquals(c1, tabSheet.getSelectedTab());
        assertTrue(tabSheet.isTabCaptionsAsHtml());

    }

    @Test
    public void test2() {
        FVerticalLayout c1 = new FVerticalLayout();
        FHorizontalLayout c2 = new FHorizontalLayout();
        FGridLayout c3 = new FGridLayout();
        FCssLayout c4 = new FCssLayout();
        FVerticalLayout c5 = new FVerticalLayout();

        FTabSheet tabSheet = new FTabSheet().withCaption("My TabSheet")
                                            .withSelectedTabChangeListener(event -> System.out.println("tab changed"))
                                            .withTab(c1)
                                            .withTab(c2, 0)
                                            .withTab(c3, "tab 3")
                                            .withTab(c4, "tab 4", VaadinIcons.ADD_DOCK)
                                            .withTab(c5, "tab 5", VaadinIcons.COMMENTS, 1)
                                            .withSelectedTab(0)
                                            .withTabsVisible(false);

        assertEquals("My TabSheet", tabSheet.getCaption());
        assertEquals(1, tabSheet.getListeners(SelectedTabChangeEvent.class).size());
        assertEquals(5, tabSheet.getComponentCount());
        assertEquals(c1, tabSheet.getTab(2).getComponent());
        assertEquals(c2, tabSheet.getTab(0).getComponent());
        assertEquals(c3, tabSheet.getTab(3).getComponent());
        assertEquals(c4, tabSheet.getTab(4).getComponent());
        assertEquals(c5, tabSheet.getTab(1).getComponent());
        assertEquals(c2, tabSheet.getSelectedTab());
        assertFalse(tabSheet.isTabCaptionsAsHtml());
        assertFalse(tabSheet.isTabsVisible());

    }

}
