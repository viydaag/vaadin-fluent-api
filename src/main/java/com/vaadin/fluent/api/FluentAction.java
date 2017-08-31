package com.vaadin.fluent.api;

import com.vaadin.event.Action;
import com.vaadin.event.Action.Container;
import com.vaadin.event.Action.Notifier;
import com.vaadin.event.Action.ShortcutNotifier;
import com.vaadin.event.ShortcutListener;
import com.vaadin.server.Resource;

/**
 * The base interface for fluent versions of {@link Action}
 * 
 * @see Action
 *
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentAction<THIS extends FluentAction<THIS>> {

    /**
     * A {@link Notifier} complemented by fluent setters.
     * 
     * @param <THIS>
     *            Self-referential generic THIS
     * @see Notifier
     */
    public interface FluentNotifier<THIS extends FluentNotifier<THIS>>
            extends Notifier, FluentContainer<THIS> {
        @SuppressWarnings("unchecked")
        public default <T extends Action & Action.Listener> THIS withAction(T action) {
            this.addAction(action);
            return (THIS) this;
        }
    }

    /**
     * A {@link ShortcutNotifier} complemented by fluent setters.
     *
     * @param <THIS>
     *            Self-referential generic THIS
     * @see ShortcutNotifier
     */
    public interface FluentShortcutNotifier<THIS extends FluentShortcutNotifier<THIS>>
            extends ShortcutNotifier {

        /**
         * Add a shortcut listener and return a registration object for
         * unregistering it.
         *
         * @param shortcut
         *            listener to add
         * @return this (for method chaining)
         * @see ShortcutNotifier#addShortcutListener(ShortcutListener)
         */
        @SuppressWarnings("unchecked")
        public default THIS withShortcutListener(ShortcutListener shortcut) {
            this.addShortcutListener(shortcut);
            return (THIS) this;
        }

    }

    /**
     * A {@link Container} complemented by fluent setters.
     *
     * @param <THIS>
     *            Self-referential generic THIS
     * @see Container
     */
    public interface FluentContainer<THIS extends FluentContainer<THIS>>
            extends Container {

        /**
         * Registers a new action handler for this container
         *
         * @param actionHandler
         *            the new handler to be added.
         * @return this (for method chaining)
         * @see Container#addActionHandler(com.vaadin.event.Action.Handler)
         */
        @SuppressWarnings("unchecked")
        public default THIS withActionHandler(Action.Handler actionHandler) {
            this.addActionHandler(actionHandler);
            return (THIS) this;
        }

    }

    /**
     * Sets the caption.
     *
     * @param caption
     *            the caption to set.
     * @return This action
     * @see Action#setCaption(java.lang.String)
     */
    @SuppressWarnings("unchecked")
    public default THIS withCaption(String caption) {
        ((Action) this).setCaption(caption);
        return (THIS) this;
    }

    /**
     * Sets the icon.
     *
     * @param icon
     *            the icon to set.
     * @return This action
     * @see Action#setIcon(com.vaadin.server.Resource)
     */
    @SuppressWarnings("unchecked")
    public default THIS withIcon(Resource icon) {
        ((Action) this).setIcon(icon);
        return (THIS) this;
    }

}
