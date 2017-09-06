package com.vaadin.fluent.api;

import com.vaadin.ui.MenuBar;

/**
 * The base interface for fluent versions of {@link MenuBar}.
 * 
 * addItem methods continues to return {@link MenuBar.MenuItem} objects to be able to build fluent menu items.
 * 
 * @see MenuBar
 * 
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentMenuBar<THIS extends FluentMenuBar<THIS>>
        extends FluentAbstractComponent<THIS> {

    /**
     * Using this method menubar can be put into a special mode where top level
     * menus opens without clicking on the menu, but automatically when mouse
     * cursor is moved over the menu. In this mode the menu also closes itself
     * if the mouse is moved out of the opened menu.
     * <p>
     * Note, that on touch devices the menu still opens on a click event.
     *
     * @param autoOpenTopLevelMenu
     *            true if menus should be opened without click, the default is
     *            false
     * @return this for method chaining
     * @see MenuBar#setAutoOpen(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withAutoOpen(boolean autoOpenTopLevelMenu) {
        ((MenuBar) this).setAutoOpen(autoOpenTopLevelMenu);
        return (THIS) this;
    }

    /**
     * Sets whether html is allowed in the item captions. If set to true, the
     * captions are passed to the browser as html and the developer is
     * responsible for ensuring no harmful html is used. If set to false, the
     * content is passed to the browser as plain text.
     *
     * @param htmlContentAllowed
     *            true if the captions are used as html, false if used as plain text
     * @return this (for method chaining)
     * @see MenuBar#setHtmlContentAllowed(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withHtmlContentAllowed(boolean htmlContentAllowed) {
        ((MenuBar) this).setHtmlContentAllowed(htmlContentAllowed);
        return (THIS) this;
    }

}
