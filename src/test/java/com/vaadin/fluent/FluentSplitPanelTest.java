package com.vaadin.fluent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.vaadin.fluent.ui.FHorizontalSplitPanel;
import com.vaadin.fluent.ui.FVerticalSplitPanel;
import com.vaadin.server.Sizeable.Unit;
import com.vaadin.ui.VerticalLayout;

public class FluentSplitPanelTest {

    @Test
    public void testHorizontalSplitPanel() {
        VerticalLayout c1 = new VerticalLayout();
        VerticalLayout c2 = new VerticalLayout();

        FHorizontalSplitPanel panel = new FHorizontalSplitPanel().withFirstComponent(c1)
                                                                 .withSecondComponent(c2)
                                                                 .withMinSplitPosition(10, Unit.PERCENTAGE)
                                                                 .withMaxSplitPosition(90, Unit.PERCENTAGE)
                                                                 .withSplitPosition(30)
                                                                 .withLocked(true)
                                                                 .withSplitPositionChangeListener(event -> System.out.println("pos changed"))
                                                                 .withSplitterClickListener(event -> System.out.println("splitter clicked"));

        assertEquals(c1, panel.getFirstComponent());
        assertEquals(c2, panel.getSecondComponent());
        assertEquals(10, panel.getMinSplitPosition(), 0);
        assertEquals(90, panel.getMaxSplitPosition(), 0);
        assertEquals(Unit.PERCENTAGE, panel.getMinSplitPositionUnit());
        assertEquals(Unit.PERCENTAGE, panel.getMaxSplitPositionUnit());
        assertEquals(30, panel.getSplitPosition(), 0);
        assertEquals(Unit.PERCENTAGE, panel.getSplitPositionUnit());
        assertTrue(panel.isLocked());
    }

    @Test
    public void testVerticalSplitPanel() {
        VerticalLayout c1 = new VerticalLayout();
        VerticalLayout c2 = new VerticalLayout();

        FVerticalSplitPanel panel = new FVerticalSplitPanel().withFirstComponent(c1)
                                                             .withSecondComponent(c2)
                                                             .withMinSplitPosition(10, Unit.PERCENTAGE)
                                                             .withSplitPosition(30, Unit.PERCENTAGE, true)
                                                             .withMaxSplitPosition(90, Unit.PIXELS)
                                                             .withLocked(true)
                                                             .withSplitPositionChangeListener(event -> System.out.println("pos changed"))
                                                             .withSplitterClickListener(event -> System.out.println("splitter clicked"));

        assertEquals(c1, panel.getFirstComponent());
        assertEquals(c2, panel.getSecondComponent());
        assertEquals(10, panel.getMinSplitPosition(), 0);
        assertEquals(90, panel.getMaxSplitPosition(), 0);
        assertEquals(Unit.PERCENTAGE, panel.getMinSplitPositionUnit());
        assertEquals(Unit.PIXELS, panel.getMaxSplitPositionUnit());
        assertEquals(30, panel.getSplitPosition(), 0);
        assertEquals(Unit.PERCENTAGE, panel.getSplitPositionUnit());
        assertTrue(panel.isLocked());
    }

}
