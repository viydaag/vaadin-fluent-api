package com.vaadin.fluent.api;

import com.vaadin.fluent.api.FluentComponent.FluentFocusable;
import com.vaadin.fluent.api.FluentFieldEvents.FluentBlurNotifier;
import com.vaadin.fluent.api.FluentFieldEvents.FluentFocusNotifier;
import com.vaadin.server.Resource;
import com.vaadin.shared.Registration;
import com.vaadin.ui.Component;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TabSheet.CloseHandler;
import com.vaadin.ui.TabSheet.SelectedTabChangeListener;
import com.vaadin.ui.TabSheet.Tab;

/**
 * The base interface for fluent versions of {@link TabSheet}
 * 
 * @see TabSheet
 * 
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentTabSheet<THIS extends FluentTabSheet<THIS>>
        extends FluentFocusable<THIS>, FluentFocusNotifier<THIS>, FluentBlurNotifier<THIS>, FluentAbstractComponentContainer<THIS> {

    /**
     * Adds a tab selection listener.
     *
     * @see Registration
     *
     * @param listener
     *            the Listener to be added, not null
     * @return this for method chaining
     * @see TabSheet#addSelectedTabChangeListener(SelectedTabChangeListener)
     */
    @SuppressWarnings("unchecked")
    public default THIS withSelectedTabChangeListener(SelectedTabChangeListener listener) {
        ((TabSheet) this).addSelectedTabChangeListener(listener);
        return (THIS) this;
    }

    /**
     * Adds a new tab into TabSheet. Component caption and icon are copied to
     * the tab metadata at creation time.
     *
     * If the tab sheet already contains the component, it does nothing.
     * If you want the returned {@link Tab} instead, use {@link TabSheet#addTab(Component)}
     *
     * @param c
     *            the component to be added onto tab - should not be null.
     * @return this for method chaining
     * @see TabSheet#addTab(Component)
     */
    @SuppressWarnings("unchecked")
    public default THIS withTab(Component c) {
        ((TabSheet) this).addTab(c);
        return (THIS) this;
    }

    /**
     * Adds a new tab into TabSheet. Component caption and icon are copied to
     * the tab metadata at creation time.
     *
     * If the tab sheet already contains the component, its tab is returned.
     * If you want the returned {@link Tab} instead, use {@link TabSheet#addTab(Component, int)}
     *
     * @param component
     *            the component to be added onto tab - should not be null.
     * @param position
     *            The position where the tab should be added
     * @return this for method chaining
     * @see TabSheet#addTab(Component, int)
     */
    @SuppressWarnings("unchecked")
    public default THIS withTab(Component component, int position) {
        ((TabSheet) this).addTab(component, position);
        return (THIS) this;
    }

    /**
     * Adds a new tab into TabSheet.
     *
     * The first tab added to a tab sheet is automatically selected and a tab
     * selection event is fired.
     *
     * If the component is already present in the tab sheet, it only changes its caption
     * preserving other tab metadata.
     * If you want the returned {@link Tab} instead, use {@link TabSheet#addTab(Component, String)}.
     *
     * @param c
     *            the component to be added onto tab - should not be null.
     * @param caption
     *            the caption to be set for the component and used rendered in tab bar
     * @return this for method chaining
     * @see TabSheet#addTab(Component, String)
     */
    @SuppressWarnings("unchecked")
    public default THIS withTab(Component c, String caption) {
        ((TabSheet) this).addTab(c, caption);
        return (THIS) this;
    }

    /**
     * Adds a new tab into TabSheet.
     *
     * The first tab added to a tab sheet is automatically selected and a tab
     * selection event is fired.
     *
     * If the component is already present in the tab sheet, it only changes its caption
     * and icon, preserving other tab metadata.
     * If you want the returned {@link Tab} instead, use {@link TabSheet#addTab(Component, String, Resource)}.
     *
     * @param c
     *            the component to be added onto tab - should not be null.
     * @param caption
     *            the caption to be set for the component and used rendered in
     *            tab bar
     * @param icon
     *            the icon to be set for the component and used rendered in tab
     *            bar
     * @return this for method chaining
     * @see TabSheet#addTab(Component, String, Resource)
     */
    @SuppressWarnings("unchecked")
    public default THIS withTab(Component c, String caption, Resource icon) {
        ((TabSheet) this).addTab(c, caption, icon);
        return (THIS) this;
    }

    /**
     * Adds a new tab into TabSheet.
     *
     * The first tab added to a tab sheet is automatically selected and a tab
     * selection event is fired.
     *
     * If the component is already present in the tab sheet, it only changes its caption
     * and icon, preserving other tab metadata like the position.
     * If you want the returned {@link Tab} instead, use {@link TabSheet#addTab(Component, String, Resource, int)}.
     *
     * @param tabComponent
     *            the component to be added onto tab - should not be null.
     * @param caption
     *            the caption to be set for the component and used rendered in
     *            tab bar
     * @param icon
     *            the icon to be set for the component and used rendered in tab
     *            bar
     * @param position
     *            the position at where the the tab should be added.
     * @return this for method chaining
     * @see TabSheet#addTab(Component, String, Resource, int)
     */
    @SuppressWarnings("unchecked")
    public default THIS withTab(Component tabComponent, String caption, Resource icon, int position) {
        ((TabSheet) this).addTab(tabComponent, caption, icon, position);
        return (THIS) this;
    }

    /**
     * Provide a custom {@link CloseHandler} for this TabSheet if you wish to
     * perform some additional tasks when a user clicks on a tabs close button,
     * e.g. show a confirmation dialogue before removing the tab.
     *
     * To remove the tab, if you provide your own close handler, you must call
     * {@link #removeComponent(Component)} yourself.
     *
     * The default CloseHandler for TabSheet will only remove the tab.
     *
     * @param handler
     *              the close handler
     * @return this for method chaining
     * @see TabSheet#setCloseHandler(CloseHandler)
     */
    @SuppressWarnings("unchecked")
    public default THIS withCloseHandler(CloseHandler handler) {
        ((TabSheet) this).setCloseHandler(handler);
        return (THIS) this;
    }

    /**
     * Sets the selected tab. The tab is identified by the tab content
     * component. Does nothing if the tabsheet doesn't contain the component.
     *
     * @param component
     *            the component of the tab to select
     * @return this for method chaining
     * @see TabSheet#setSelectedTab(Component)
     */
    @SuppressWarnings("unchecked")
    public default THIS withSelectedTab(Component component) {
        ((TabSheet) this).setSelectedTab(component);
        return (THIS) this;
    }

    /**
     * Sets the selected tab. The tab is identified by the tab content
     * component. Does nothing if the tabsheet doesn't contain the component.
     *
     * @param component
     *            the component of the tab to select
     * @param userOriginated
     *            <code>true</code> if the event originates from the client
     *            side, <code>false</code> otherwise
     * @return this for method chaining
     * @see TabSheet#setSelectedTab(Component, boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withSelectedTab(Component component, boolean userOriginated) {
        ((TabSheet) this).setSelectedTab(component, userOriginated);
        return (THIS) this;
    }

    /**
     * Sets the selected tab. The tab is identified by the corresponding
     * {@link Tab Tab} instance. Does nothing if the tabsheet doesn't contain
     * the given tab.
     *
     * @param tab
     *            the tab to select
     * @return this for method chaining
     * @see TabSheet#setSelectedTab(Tab)
     */
    @SuppressWarnings("unchecked")
    public default THIS withSelectedTab(Tab tab) {
        ((TabSheet) this).setSelectedTab(tab);
        return (THIS) this;
    }

    /**
     * Sets the selected tab, identified by its index. Does nothing if the
     * position is out of bounds.
     *
     * @param index
     *            the index of the tab to select
     * @return this for method chaining
     * @see TabSheet#setSelectedTab(int)
     */
    @SuppressWarnings("unchecked")
    public default THIS withSelectedTab(int index) {
        ((TabSheet) this).setSelectedTab(index);
        return (THIS) this;
    }

    /**
     * Sets whether HTML is allowed in the tab captions.
     * <p>
     * If set to true, the captions are rendered in the browser as HTML and the
     * developer is responsible for ensuring no harmful HTML is used. If set to
     * false, the content is rendered in the browser as plain text.
     * <p>
     * The default is false, i.e. render tab captions as plain text
     *
     * @param tabCaptionsAsHtml
     *            true if the tab captions are rendered as HTML, false if
     *            rendered as plain text
     * @return this for method chaining
     * @see TabSheet#setTabCaptionsAsHtml(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withTabCaptionsAsHtml(boolean tabCaptionsAsHtml) {
        ((TabSheet) this).setTabCaptionsAsHtml(tabCaptionsAsHtml);
        return (THIS) this;
    }

    /**
     * Sets the position of the tab.
     *
     * @param tab
     *            The tab
     * @param position
     *            The new position of the tab
     *            
     * @return this for method chaining
     * @see TabSheet#setTabPosition(Tab, int)
     */
    @SuppressWarnings("unchecked")
    public default THIS withTabPosition(Tab tab, int position) {
        ((TabSheet) this).setTabPosition(tab, position);
        return (THIS) this;
    }

    /**
     * Sets whether the tab selection part should be shown in the UI
     *
     * @param tabsVisible
     *            true if the tabs should be shown in the UI, false otherwise
     * @return this for method chaining
     * @see TabSheet#setTabsVisible(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withTabsVisible(boolean tabsVisible) {
        ((TabSheet) this).setTabsVisible(tabsVisible);
        return (THIS) this;
    }

}
