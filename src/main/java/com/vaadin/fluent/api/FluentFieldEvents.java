package com.vaadin.fluent.api;

import com.vaadin.event.FieldEvents;

/**
 * The base interface for fluent versions of {@link FieldEvents}
 * 
 * @see FieldEvents
 *
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentFieldEvents
        extends FieldEvents {

    /**
     * The base interface for fluent versions of {@link FocusNotifier}
     * 
     * @see FocusNotifier
     *
     * @param <THIS> Self-referential generic THIS
     */
    public interface FluentFocusNotifier<THIS extends FluentFocusNotifier<THIS>>
            extends FocusNotifier {

        /**
         * Adds a <code>FocusListener</code> to the Component which gets fired
         * when a <code>Field</code> receives keyboard focus.
         *
         * @param listener
         *            the focus listener to add, not null
         * @return this for method chaining
         * @see FocusNotifier#addFocusListener(FocusListener)
         */
        @SuppressWarnings("unchecked")
        public default THIS withFocusListener(FocusListener listener) {
            this.addFocusListener(listener);
            return (THIS) this;
        }

    }

    /**
     * The base interface for fluent versions of {@link BlurNotifier}
     * 
     * @see BlurNotifier
     *
     * @param <THIS> Self-referential generic THIS
     */
    public interface FluentBlurNotifier<THIS extends FluentBlurNotifier<THIS>>
            extends BlurNotifier {

        /**
         * Adds a <code>BlurListener</code> to the Component which gets fired
         * when a <code>Field</code> loses keyboard focus.
         *
         * @param listener
         *            the blur listener to add, not null
         * @return this for method chaining
         * @see BlurNotifier#addBlurListener(BlurListener)
         */
        @SuppressWarnings("unchecked")
        public default THIS withBlurListener(BlurListener listener) {
            this.addBlurListener(listener);
            return (THIS) this;
        }

    }

}
