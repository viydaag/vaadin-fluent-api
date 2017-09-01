package com.vaadin.fluent.api;

import com.vaadin.server.Sizeable;

/**
 * The base interface for fluent versions of {@link Sizeable}
 * 
 * @see Sizeable
 * 
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentSizeable<THIS extends FluentSizeable<THIS>>
        extends Sizeable {

    /**
     * Sets the height of the component using String presentation.
     *
     * String presentation is similar to what is used in Cascading Style Sheets.
     * Size can be length or percentage of available size.
     *
     * The empty string ("") or null will unset the height and set the units to
     * pixels.
     *
     * See <a
     * href="http://www.w3.org/TR/REC-CSS2/syndata.html#value-def-length">CSS
     * specification</a> for more details.
     *
     * @param height in CSS style string representation
     * @return this (for method chaining)
     * @see #setHeight(java.lang.String)
     */
    @SuppressWarnings("unchecked")
    public default THIS withHeight(String height) {
        this.setHeight(height);
        return (THIS) this;
    }

    /**
     * Sets the height of the object. Negative number implies unspecified size
     * (terminal is free to set the size).
     *
     * @param height the height of the object.
     * @param unit the unit used for the width.
     * @return this (for method chaining)
     * @see #setHeight(float, com.vaadin.server.Sizeable.Unit)
     */
    @SuppressWarnings("unchecked")
    public default THIS withHeight(float height, Unit unit) {
        this.setHeight(height, unit);
        return (THIS) this;
    }

    /**
     * Sets the width of the component using String presentation.
     *
     * String presentation is similar to what is used in Cascading Style Sheets.
     * Size can be length or percentage of available size.
     *
     * The empty string ("") or null will unset the width and set the units to
     * pixels.
     *
     * See <a
     * href="http://www.w3.org/TR/REC-CSS2/syndata.html#value-def-length">CSS
     * specification</a> for more details.
     *
     * @param width in CSS style string representation, null or empty string to
     * reset
     * @return this (for method chaining)
     * @see #setWidth(java.lang.String)
     */
    @SuppressWarnings("unchecked")
    public default THIS withWidth(String width) {
        this.setWidth(width);
        return (THIS) this;
    }

    /**
     * Sets the width of the object. Negative number implies unspecified size
     * (terminal is free to set the size).
     *
     * @param width the width of the object.
     * @param unit the unit used for the width.
     * @return this (for method chaining)
     * @see #setWidth(float, com.vaadin.server.Sizeable.Unit)
     */
    @SuppressWarnings("unchecked")
    public default THIS withWidth(float width, Unit unit) {
        this.setWidth(width, unit);
        return (THIS) this;
    }

    /**
     * Sets the size to 100% x 100%.
     * @return this (for method chaining)
     * @see #setSizeFull()
     */
    @SuppressWarnings("unchecked")
    public default THIS withFullSize() {
        this.setSizeFull();
        return (THIS) this;
    }

    /**
     * Sets the width to 100%.
     *
     * @return this (for method chaining)
     */
    public default THIS withFullWidth() {
        return withWidth("100%");
    }

    /**
     * Sets the height to 100%.
     *
     * @return this (for method chaining)
     */
    public default THIS withFullHeight() {
        return withHeight("100%");
    }

    /**
     * Clears any size settings.
     * @return this (for method chaining)
     * @see #setSizeUndefined()
     */
    @SuppressWarnings("unchecked")
    public default THIS withUndefinedSize() {
        this.setSizeUndefined();
        return (THIS) this;
    }

    /**
     * Clears any defined width
     *
     * @return this (for method chaining)
     * @see #setWidthUndefined()
     */
    @SuppressWarnings("unchecked")
    public default THIS withUndefinedWidth() {
        this.setWidthUndefined();
        return (THIS) this;
    }

    /**
     * Clears any defined height
     *
     * @return this (for method chaining)
     * @see #setHeightUndefined()
     */
    @SuppressWarnings("unchecked")
    public default THIS withUndefinedHeight() {
        this.setHeightUndefined();
        return (THIS) this;
    }

    @SuppressWarnings("unchecked")
    public default THIS withSize(String width, String height) {
        setWidth(width);
        setHeight(height);
        return (THIS) this;
    }

}
