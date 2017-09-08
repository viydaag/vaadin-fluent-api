package com.vaadin.fluent.api;

import com.vaadin.fluent.api.FluentFieldEvents.FluentBlurNotifier;
import com.vaadin.fluent.api.FluentFieldEvents.FluentFocusNotifier;
import com.vaadin.shared.ui.window.WindowMode;
import com.vaadin.shared.ui.window.WindowRole;
import com.vaadin.ui.Component;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Window.CloseListener;
import com.vaadin.ui.Window.ResizeListener;
import com.vaadin.ui.Window.WindowModeChangeListener;
import com.vaadin.ui.Window.WindowOrderChangeListener;

/**
 * The base interface for fluent versions of {@link Window}
 * 
 * @see Window
 *
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentWindow<THIS extends FluentWindow<THIS>>
        extends FluentPanel<THIS>, FluentFocusNotifier<THIS>, FluentBlurNotifier<THIS> {

    /**
     * Adds a close shortcut - pressing this key while holding down all (if any)
     * modifiers specified while this Window is in focus will close the Window.
     *
     * @param keyCode
     *            the keycode for invoking the shortcut
     * @param modifiers
     *            the (optional) modifiers for invoking the shortcut. Can be set
     *            to null to be explicit about not having modifiers.
     * @return this for method chaining
     * @see Window#addCloseShortcut(int, int...)
     */
    @SuppressWarnings("unchecked")
    public default THIS withCloseShortcut(int keyCode, int... modifiers) {
        ((Window) this).addCloseShortcut(keyCode, modifiers);
        return (THIS) this;
    }

    /**
     * Adds a CloseListener to the window.
     *
     * For a window the CloseListener is fired when the user closes it (clicks
     * on the close button).
     *
     * For a browser level window the CloseListener is fired when the browser
     * level window is closed. Note that closing a browser level window does not
     * mean it will be destroyed. Also note that Opera does not send events like
     * all other browsers and therefore the close listener might not be called
     * if Opera is used.
     *
     * <p>
     * Since Vaadin 6.5, removing windows using {@link UI#removeWindow(Window)}
     * does fire the CloseListener.
     * </p>
     *
     * @param listener
     *            the CloseListener to add, not null
     * @return this for method chaining
     * @see Window#addCloseListener(CloseListener)
     */
    @SuppressWarnings("unchecked")
    public default THIS withCloseListener(CloseListener listener) {
        ((Window) this).addCloseListener(listener);
        return (THIS) this;
    }

    /**
     * Add a resize listener.
     *
     * @param listener
     *            the listener to add, not null
     * @return this for method chaining
     * @see Window#addResizeListener(ResizeListener)
     */
    @SuppressWarnings("unchecked")
    public default THIS withResizeListener(ResizeListener listener) {
        ((Window) this).addResizeListener(listener);
        return (THIS) this;
    }

    /**
     * Adds a WindowModeChangeListener to the window.
     *
     * The WindowModeChangeEvent is fired when the user changed the display
     * state by clicking the maximize/restore button or by double clicking on
     * the window header. The event is also fired if the state is changed using
     * {@link Window#setWindowMode(WindowMode)}.
     *
     * @param listener
     *            the WindowModeChangeListener to add.
     * @return this for method chaining
     * @see Window#addWindowModeChangeListener(WindowModeChangeListener)
     */
    @SuppressWarnings("unchecked")
    public default THIS withWindowModeChangeListener(WindowModeChangeListener listener) {
        ((Window) this).addWindowModeChangeListener(listener);
        return (THIS) this;
    }

    /**
     * Adds a WindowOrderChangeListener to the window.
     * <p>
     * The WindowOrderChangeEvent is fired when the order position is changed.
     * It can happen when some window (this or other) is brought to front or
     * detached.
     * <p>
     * The other way to listen positions of all windows in UI is
     * {@link UI#addWindowOrderUpdateListener(com.vaadin.ui.UI.WindowOrderUpdateListener)}
     *
     * @see UI#addWindowOrderUpdateListener(com.vaadin.ui.UI.WindowOrderUpdateListener)
     *
     * @param listener
     *            the WindowModeChangeListener to add.
     * @return this for method chaining
     * @see Window#addWindowOrderChangeListener(WindowOrderChangeListener)
     */
    @SuppressWarnings("unchecked")
    public default THIS withWindowOrderChangeListener(WindowOrderChangeListener listener) {
        ((Window) this).addWindowOrderChangeListener(listener);
        return (THIS) this;
    }

    /**
     * Allows to specify which components contain the description for the
     * window. Text contained in these components will be read by assistive
     * devices when it is opened.
     *
     * @param components
     *            the components to use as description
     * @return this for method chaining
     * @see Window#setAssistiveDescription(Component...)
     */
    @SuppressWarnings("unchecked")
    public default THIS withAssistiveDescription(Component... components) {
        ((Window) this).setAssistiveDescription(components);
        return (THIS) this;
    }

    /**
     * Sets the accessibility postfix for the window caption.
     *
     * This postfix is read to assistive device users after the window caption,
     * but not visible on the page.
     *
     * @param assistivePostfix
     *            String that is placed after the window caption
     * @return this for method chaining
     * @see Window#setAssistivePostfix(String)
     */
    @SuppressWarnings("unchecked")
    public default THIS withAssistivePostfix(String assistivePostfix) {
        ((Window) this).setAssistivePostfix(assistivePostfix);
        return (THIS) this;
    }

    /**
     * Sets the accessibility prefix for the window caption.
     *
     * This prefix is read to assistive device users before the window caption,
     * but not visible on the page.
     *
     * @param prefix
     *            String that is placed before the window caption
     * @return this for method chaining
     * @see Window#setAssistivePrefix(String)
     */
    @SuppressWarnings("unchecked")
    public default THIS withAssistivePrefix(String prefix) {
        ((Window) this).setAssistivePrefix(prefix);
        return (THIS) this;
    }

    /**
     * Sets the WAI-ARIA role the window.
     *
     * This role defines how an assistive device handles a window. Available
     * roles are alertdialog and dialog (@see
     * <a href="http://www.w3.org/TR/2011/CR-wai-aria-20110118/roles">Roles
     * Model</a>).
     *
     * The default role is dialog.
     *
     * @param role
     *            WAI-ARIA role to set for the window
     * @return this for method chaining
     * @see Window#setAssistiveRole(WindowRole)
     */
    @SuppressWarnings("unchecked")
    public default THIS withAssistiveRole(WindowRole role) {
        ((Window) this).setAssistiveRole(role);
        return (THIS) this;
    }

    /**
     * Sets the closable status for the window. If a window is closable it
     * typically shows an X in the upper right corner. Clicking on the X sends a
     * close event to the server. Setting closable to false will remove the X
     * from the window and prevent the user from closing the window.
     *
     * @param closable
     *            determines if the window can be closed by the user.
     * @return this for method chaining
     * @see Window#setClosable(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withClosable(boolean closable) {
        ((Window) this).setClosable(closable);
        return (THIS) this;
    }

    /**
     * Enables or disables that a window can be dragged (moved) by the user. By
     * default a window is draggable.
     * 
     * @param draggable
     *            true if the window can be dragged by the user
     * @return this for method chaining
     * @see Window#setDraggable(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withDraggable(boolean draggable) {
        ((Window) this).setDraggable(draggable);
        return (THIS) this;
    }

    /**
     * Sets window modality. When a modal window is open, components outside
     * that window cannot be accessed.
     * <p>
     * Keyboard navigation is restricted by blocking the tab key at the top and
     * bottom of the window by activating the tab stop function internally.
     *
     * @param modal
     *            true if modality is to be turned on
     * @return this for method chaining
     * @see Window#setDraggable(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withModal(boolean modal) {
        ((Window) this).setModal(modal);
        return (THIS) this;
    }

    /**
     * Sets the position of the window on the screen using
     * {@link #withPositionX(int)} and {@link #withPositionY(int)}
     *
     * @param x
     *            The new x coordinate for the window
     * @param y
     *            The new y coordinate for the window
     * @return this for method chaining
     * @see Window#setPosition(int, int)
     */
    public default THIS withPosition(int x, int y) {
        return withPositionX(x).withPositionY(y);
    }

    /**
     * Sets the distance of Window left border in pixels from left border of the
     * containing (main window). Has effect only if in {@link WindowMode#NORMAL}
     * mode.
     *
     * @param positionX
     *            the Distance of Window left border in pixels from left border
     *            of the containing (main window). or -1 if unspecified.
     * @return this for method chaining
     * @see Window#setPositionX(int)
     */
    @SuppressWarnings("unchecked")
    public default THIS withPositionX(int positionX) {
        ((Window) this).setPositionX(positionX);
        return (THIS) this;
    }

    /**
     * Sets the distance of Window top border in pixels from top border of the
     * containing (main window). Has effect only if in {@link WindowMode#NORMAL}
     * mode.
     *
     * @param positionY
     *            the Distance of Window top border in pixels from top border of
     *            the containing (main window). or -1 if unspecified
     *
     * @return this for method chaining
     * @see Window#setPositionY(int)
     */
    @SuppressWarnings("unchecked")
    public default THIS withPositionY(int positionY) {
        ((Window) this).setPositionY(positionY);
        return (THIS) this;
    }

    /**
     * Sets window resizable.
     *
     * @param resizable
     *            true if resizability is to be turned on
     * @return this for method chaining
     * @see Window#setResizable(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withResizable(boolean resizable) {
        ((Window) this).setResizable(resizable);
        return (THIS) this;
    }

    /**
     * Should resize operations be lazy, i.e. should there be a delay before
     * layout sizes are recalculated. Speeds up resize operations in slow UIs
     * with the penalty of slightly decreased usability.
     *
     * Note, some browser send false resize events for the browser window and
     * are therefore always lazy.
     *
     * @param resizeLazy
     *            true to use a delay before recalculating sizes, false to
     *            calculate immediately.
     * @return this for method chaining
     * @see Window#setResizeLazy(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withResizeLazy(boolean resizeLazy) {
        ((Window) this).setResizeLazy(resizeLazy);
        return (THIS) this;
    }

    /**
     * Sets the message that is provided to users of assistive devices when the
     * user reaches the bottom of the window when leaving a window with the tab
     * key is prevented.
     * <p>
     * This message is not visible on the screen.
     *
     * @param bottomMessage
     *            String provided when the user navigates with the Tab key to
     *            the bottom of the window
     * @return this for method chaining
     * @see Window#setTabStopBottomAssistiveText(String)
     */
    @SuppressWarnings("unchecked")
    public default THIS withTabStopBottomAssistiveText(String bottomMessage) {
        ((Window) this).setTabStopBottomAssistiveText(bottomMessage);
        return (THIS) this;
    }

    /**
     * Set if it should be prevented to set the focus to a component outside a
     * non-modal window with the tab key.
     * <p>
     * This is meant to help users of assistive devices to not leaving the
     * window unintentionally.
     * <p>
     * For modal windows, this function is activated automatically, while
     * preserving the stored value of tabStop.
     *
     * @param tabStop
     *            true to keep the focus inside the window when reaching the top
     *            or bottom, false (default) to allow leaving the window
     * @return this for method chaining
     * @see Window#setTabStopEnabled(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withTabStopEnabled(boolean tabStop) {
        ((Window) this).setTabStopEnabled(tabStop);
        return (THIS) this;
    }

    /**
     * Sets the message that is provided to users of assistive devices when the
     * user reaches the top of the window when leaving a window with the tab key
     * is prevented.
     * <p>
     * This message is not visible on the screen.
     *
     * @param topMessage
     *            String provided when the user navigates with Shift-Tab keys to
     *            the top of the window
     * @return this for method chaining
     * @see Window#setTabStopTopAssistiveText(String)
     */
    @SuppressWarnings("unchecked")
    public default THIS withTabStopTopAssistiveText(String topMessage) {
        ((Window) this).setTabStopTopAssistiveText(topMessage);
        return (THIS) this;
    }

    /**
     * Sets the mode for the window.
     *
     * @see WindowMode
     * @param windowMode
     *            The new mode
     * @return this for method chaining
     * @see Window#setWindowMode(WindowMode)
     */
    @SuppressWarnings("unchecked")
    public default THIS withWindowMode(WindowMode windowMode) {
        ((Window) this).setWindowMode(windowMode);
        return (THIS) this;
    }

}
