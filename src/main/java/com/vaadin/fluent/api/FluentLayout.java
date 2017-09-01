package com.vaadin.fluent.api;

import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Component;
import com.vaadin.ui.Layout;

/**
 * The base interface for fluent versions of {@link Layout}
 * 
 * @see Layout
 * 
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentLayout<THIS extends FluentLayout<THIS>>
        extends Layout, FluentComponentContainer<THIS> {

    /**
     * A {@link AlignmentHandler} complemented by fluent setters.
     *
     * @param <THIS>
     *            Self-referential generic THIS
     * @see AlignmentHandler
     */
    public interface FluentAlignmentHandler<THIS extends FluentAlignmentHandler<THIS>>
            extends AlignmentHandler {

        /**
         * Set alignment for one contained component in this layout. Use
         * predefined alignments from Alignment class.
         *
         * Example: <code>
         *      layout.setComponentAlignment(myComponent, Alignment.TOP_RIGHT);
         * </code>
         *
         * @param childComponent
         *            the component to align within it'THIS layout cell.
         * @param alignment
         *            the Alignment value to be set
         * @return this (for method chaining)
         * @see #setComponentAlignment(com.vaadin.ui.Component,
         *      com.vaadin.ui.Alignment)
         */
        @SuppressWarnings("unchecked")
        public default THIS withComponentAlignment(Component childComponent, Alignment alignment) {
            this.setComponentAlignment(childComponent, alignment);
            return (THIS) this;
        }

        /**
         * Sets the alignment used for new components added to this layout. The
         * default is {@link Alignment#TOP_LEFT}.
         *
         * @param defaultComponentAlignment
         *            The new default alignment
         * @return this (for method chaining)
         * @see #setDefaultComponentAlignment(com.vaadin.ui.Alignment)
         */
        @SuppressWarnings("unchecked")
        public default THIS withDefaultComponentAlignment(Alignment defaultComponentAlignment) {
            this.setDefaultComponentAlignment(defaultComponentAlignment);
            return (THIS) this;
        }
    }

    /**
     * A {@link SpacingHandler} complemented by fluent setters.
     *
     * @param <THIS>
     *            Self-referential generic THIS
     * @see SpacingHandler
     */
    public interface FluentSpacingHandler<THIS extends FluentSpacingHandler<THIS>>
            extends SpacingHandler {

        /**
         * Enable spacing between child components within this layout.
         *
         * <p>
         * <strong>NOTE:</strong> This will only affect the space between
         * components, not the space around all the components in the layout
         * (i.e. do not confuse this with the cellspacing attribute of a HTML
         * Table). Use {@link MarginHandler#setMargin(boolean)} to add space
         * around the layout.
         * </p>
         *
         * <p>
         * See the reference manual for more information about CSS rules for
         * defining the amount of spacing to use.
         * </p>
         *
         * @param enabled
         *            true if spacing should be turned on, false if it should be
         *            turned off
         * @return this (for method chaining)
         * @see #setSpacing(boolean)
         */
        @SuppressWarnings("unchecked")
        public default THIS withSpacing(boolean enabled) {
            this.setSpacing(enabled);
            return (THIS) this;
        }

    }

    /**
     * A {@link MarginHandler} complemented by fluent setters.
     *
     * @param <THIS>
     *            Self-referential generic THIS
     * @see MarginHandler
     */
    public interface FluentMarginHandler<THIS extends FluentMarginHandler<THIS>>
            extends MarginHandler {

        /**
         * Enable layout margins. Affects all four sides of the layout. This
         * will tell the client-side implementation to leave extra space around
         * the layout. The client-side implementation decides the actual amount,
         * and it can vary between themes.
         *
         * @param enabled
         *            true if margins should be enabled on all sides, false to
         *            disable all margins
         * @return this (for method chaining)
         * @see #setMargin(boolean)
         */
        @SuppressWarnings("unchecked")
        public default THIS withMargin(boolean enabled) {
            this.setMargin(enabled);
            return (THIS) this;
        }

        /**
         * Enable margins for this layout.
         *
         * <p>
         * <strong>NOTE:</strong> This will only affect the space around the
         * components in the layout, not space between the components in the
         * layout. Use {@link SpacingHandler#setSpacing(boolean)} to add space
         * between the components in the layout.
         * </p>
         *
         * <p>
         * See the reference manual for more information about CSS rules for
         * defining the size of the margin.
         * </p>
         *
         * @param marginInfo
         *            MarginInfo object containing the new margins.
         * @return this (for method chaining)
         * @see #setMargin(com.vaadin.shared.ui.MarginInfo)
         */
        @SuppressWarnings("unchecked")
        public default THIS withMargin(MarginInfo marginInfo) {
            this.setMargin(marginInfo);
            return (THIS) this;
        }
    }

}
