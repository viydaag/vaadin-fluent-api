package com.vaadin.fluent.api;

import com.vaadin.ui.HasComponents;

/**
 * The base interface for fluent versions of {@link HasComponents}
 * 
 * @see HasComponents
 * 
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentHasComponents<THIS extends FluentHasComponents<THIS>>
        extends HasComponents, FluentComponent<THIS> {

    /**
     * A {@link ComponentAttachDetachNotifier} complemented by fluent setters.
     *
     * @param <THIS>
     *            Self-referential generic THIS
     * @see ComponentAttachDetachNotifier
     */
    public interface FluentComponentAttachDetachNotifier<THIS extends FluentHasComponents<THIS>>
            extends ComponentAttachDetachNotifier {

        /**
         * Listens the component attach events.
         *
         * @param listener
         *            the listener to add.
         * @return this (for method chaining)
         * @see #addComponentAttachListener(com.vaadin.ui.HasComponents.ComponentAttachListener)
         */
        @SuppressWarnings("unchecked")
        public default THIS withComponentAttachListener(ComponentAttachListener listener) {
            this.addComponentAttachListener(listener);
            return (THIS) this;
        }

        /**
         * Listens the component detach events.
         *
         * @param listener
         *            the listener to add.
         * @return this (for method chaining)
         * @see #addComponentDetachListener(com.vaadin.ui.HasComponents.ComponentDetachListener)
         */
        @SuppressWarnings("unchecked")
        public default THIS withComponentDetachListener(ComponentDetachListener listener) {
            this.addComponentDetachListener(listener);
            return (THIS) this;
        }

    }

}
