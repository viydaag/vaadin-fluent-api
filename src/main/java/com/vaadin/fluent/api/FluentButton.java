package com.vaadin.fluent.api;

import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.event.ShortcutAction.ModifierKey;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickListener;

/**
 * The base interface for fluent versions of {@link Button}
 * 
 * @see Button
 *
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentButton<THIS extends FluentButton<THIS>>
        extends FluentAbstractFocusable<THIS> {

    /**
     * Adds the button click listener.
     *
     * @see Button#addClickListener(ClickListener)
     *
     * @param listener
     *            the Listener to be added.
     * @return this for method chaining
     */
    @SuppressWarnings("unchecked")
    public default THIS withClickListener(ClickListener listener) {
        ((Button) this).addClickListener(listener);
        return (THIS) this;
    }

    /**
     * Makes it possible to invoke a click on this button by pressing the given
     * {@link KeyCode} and (optional) {@link ModifierKey}s.<br>
     * The shortcut is global (bound to the containing Window).
     *
     * @param keyCode
     *            the keycode for invoking the shortcut
     * @param modifiers
     *            the (optional) modifiers for invoking the shortcut, null for
     *            none
     * @return this for method chaining
     * @see Button#setClickShortcut(int, int...)
     */
    @SuppressWarnings("unchecked")
    public default THIS withClickShortcut(int keyCode, int... modifiers) {
        ((Button) this).setClickShortcut(keyCode, modifiers);
        return (THIS) this;
    }

    /**
     * Determines if a button is automatically disabled when clicked. If this is
     * set to true the button will be automatically disabled when clicked,
     * typically to prevent (accidental) extra clicks on a button.
     * <p>
     * Note that this is only used when the click comes from the user, not when
     * calling {@link Button#click()} method programmatically. Also, if developer
     * wants to re-enable the button, it needs to be done programmatically.
     * </p>
     *
     * @param disableOnClick
     *            true to disable button when it is clicked, false otherwise
     * @return this for method chaining
     * @see Button#setDisableOnClick(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withDisableOnClick(boolean disableOnClick) {
        ((Button) this).setDisableOnClick(disableOnClick);
        return (THIS) this;
    }

    @SuppressWarnings("unchecked")
    public default THIS withIconAlternateText(String iconAltText) {
        ((Button) this).setIconAlternateText(iconAltText);
        return (THIS) this;
    }

}
