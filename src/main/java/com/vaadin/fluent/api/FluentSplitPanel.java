package com.vaadin.fluent.api;

import com.vaadin.server.Sizeable;
import com.vaadin.ui.AbstractSplitPanel;
import com.vaadin.ui.AbstractSplitPanel.SplitPositionChangeEvent;
import com.vaadin.ui.AbstractSplitPanel.SplitPositionChangeListener;
import com.vaadin.ui.AbstractSplitPanel.SplitterClickEvent;
import com.vaadin.ui.AbstractSplitPanel.SplitterClickListener;
import com.vaadin.ui.Component;

/**
 * The base interface for fluent versions of {@link AbstractSplitPanel}
 * 
 * @see AbstractSplitPanel
 * 
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentSplitPanel<THIS extends FluentSplitPanel<THIS>>
        extends FluentAbstractComponentContainer<THIS> {

    /**
     * Sets the first component of this split panel. Depending on the direction
     * the first component is shown at the top or to the left.
     *
     * @param c
     *            The component to use as first component
     * @return this for method chaining
     * @see AbstractSplitPanel#setFirstComponent(Component)
     */
    @SuppressWarnings("unchecked")
    public default THIS withFirstComponent(Component c) {
        ((AbstractSplitPanel) this).setFirstComponent(c);
        return (THIS) this;
    }

    /**
     * Sets the second component of this split panel. Depending on the direction
     * the second component is shown at the bottom or to the right.
     *
     * @param c
     *            The component to use as second component
     * @return this for method chaining
     * @see AbstractSplitPanel#setSecondComponent(Component)
     */
    @SuppressWarnings("unchecked")
    public default THIS withSecondComponent(Component c) {
        ((AbstractSplitPanel) this).setSecondComponent(c);
        return (THIS) this;
    }

    /**
     * Lock the SplitPanels position, disabling the user from dragging the split
     * handle.
     *
     * @param locked
     *            Set <code>true</code> if locked, <code>false</code> otherwise.
     * @return this for method chaining
     * @see AbstractSplitPanel#setLocked(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withLocked(boolean locked) {
        ((AbstractSplitPanel) this).setLocked(locked);
        return (THIS) this;
    }

    /**
     * Sets the minimum split position to the given position and unit. If the
     * split position is reversed, maximum and minimum are also reversed.
     *
     * @param pos
     *            the minimum position of the split
     * @param unit
     *            the unit (from {@link Sizeable}) in which the size is given.
     *            Allowed units are UNITS_PERCENTAGE and UNITS_PIXELS
     * @return this for method chaining
     * @see AbstractSplitPanel#setMinSplitPosition(float, com.vaadin.server.Sizeable.Unit)
     */
    @SuppressWarnings("unchecked")
    public default THIS withMinSplitPosition(float pos, Unit unit) {
        ((AbstractSplitPanel) this).setMinSplitPosition(pos, unit);
        return (THIS) this;
    }

    /**
     * Sets the maximum split position to the given position and unit. If the
     * split position is reversed, maximum and minimum are also reversed.
     *
     * @param pos
     *            the maximum position of the split
     * @param unit
     *            the unit (from {@link Sizeable}) in which the size is given.
     *            Allowed units are UNITS_PERCENTAGE and UNITS_PIXELS
     * @return this for method chaining
     * @see AbstractSplitPanel#setMaxSplitPosition(float, com.vaadin.server.Sizeable.Unit)
     */
    @SuppressWarnings("unchecked")
    public default THIS withMaxSplitPosition(float pos, Unit unit) {
        ((AbstractSplitPanel) this).setMaxSplitPosition(pos, unit);
        return (THIS) this;
    }

    /**
     * Moves the position of the splitter.
     *
     * @param pos
     *            the new size of the first region in the unit that was last
     *            used (default is percentage). Fractions are only allowed when
     *            unit is percentage.
     * @return this for method chaining
     * @see AbstractSplitPanel#setSplitPosition(float)
     */
    @SuppressWarnings("unchecked")
    public default THIS withSplitPosition(float pos) {
        ((AbstractSplitPanel) this).setSplitPosition(pos);
        return (THIS) this;
    }

    /**
     * Moves the position of the splitter.
     *
     * @param pos
     *            the new size of the region in the unit that was last used
     *            (default is percentage). Fractions are only allowed when unit
     *            is percentage.
     *
     * @param reverse
     *            if set to true the split splitter position is measured by the
     *            second region else it is measured by the first region
     * @return this for method chaining
     * @see AbstractSplitPanel#setSplitPosition(float, boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withSplitPosition(float pos, boolean reverse) {
        ((AbstractSplitPanel) this).setSplitPosition(pos, reverse);
        return (THIS) this;
    }

    /**
     * Moves the position of the splitter with given position and unit.
     *
     * @param pos
     *            the new size of the first region. Fractions are only allowed
     *            when unit is percentage.
     * @param unit
     *            the unit (from {@link Sizeable}) in which the size is given.
     * @return this for method chaining
     * @see AbstractSplitPanel#setSplitPosition(float, com.vaadin.server.Sizeable.Unit)
     */
    public default THIS withSplitPosition(float pos, Unit unit) {
        return withSplitPosition(pos, unit, false);
    }

    /**
     * Moves the position of the splitter with given position and unit.
     *
     * @param pos
     *            the new size of the first region. Fractions are only allowed
     *            when unit is percentage.
     * @param unit
     *            the unit (from {@link Sizeable}) in which the size is given.
     * @param reverse
     *            if set to true the split splitter position is measured by the
     *            second region else it is measured by the first region
     *            
     * @return this for method chaining
     * @see AbstractSplitPanel#setSplitPosition(float, com.vaadin.server.Sizeable.Unit, boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withSplitPosition(float pos, Unit unit, boolean reverse) {
        ((AbstractSplitPanel) this).setSplitPosition(pos, unit, reverse);
        return (THIS) this;
    }

    /**
     * Add a listener to handle {@link SplitPositionChangeEvent}s.
     *
     * @param listener
     *            {@link SplitPositionChangeListener} to be registered.
     * @return this for method chaining
     * @see AbstractSplitPanel#addSplitPositionChangeListener(SplitPositionChangeListener)
     */
    @SuppressWarnings("unchecked")
    public default THIS withSplitPositionChangeListener(SplitPositionChangeListener listener) {
        ((AbstractSplitPanel) this).addSplitPositionChangeListener(listener);
        return (THIS) this;
    }

    /**
     * Add a listener to handle {@link SplitterClickEvent}s.
     *
     * @param listener
     *            {@link SplitterClickListener} to be registered.
     * @return this for method chaining
     * @see AbstractSplitPanel#addSplitterClickListener(SplitterClickListener)
     */
    @SuppressWarnings("unchecked")
    public default THIS withSplitterClickListener(SplitterClickListener listener) {
        ((AbstractSplitPanel) this).addSplitterClickListener(listener);
        return (THIS) this;
    }

}
