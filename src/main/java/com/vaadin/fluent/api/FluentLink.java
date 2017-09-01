package com.vaadin.fluent.api;

import com.vaadin.server.Resource;
import com.vaadin.shared.ui.BorderStyle;
import com.vaadin.ui.Link;

/**
 * The base interface for fluent versions of {@link Link}
 * 
 * @see Link
 *
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentLink<THIS extends FluentLink<THIS>>
        extends FluentAbstractComponent<THIS> {

    /**
     * Sets the resource this link opens.
     *
     * @param resource
     *            the resource to set.
     *            
     * @return this for method chaining
     * @see Link#setResource(Resource)
     */
    @SuppressWarnings("unchecked")
    public default THIS withResource(Resource resource) {
        ((Link) this).setResource(resource);
        return (THIS) this;
    }

    /**
     * Sets the border of the target window.
     *
     * @param targetBorder
     *            the targetBorder to set.
     *            
     * @return this for method chaining
     * @see Link#setTargetBorder(BorderStyle)
     */
    @SuppressWarnings("unchecked")
    public default THIS withTargetBorder(BorderStyle targetBorder) {
        ((Link) this).setTargetBorder(targetBorder);
        return (THIS) this;
    }

    /**
     * Sets the target window height.
     *
     * @param targetHeight
     *            the targetHeight to set.
     *            
     * @return this for method chaining
     * @see Link#setTargetHeight(int)
     */
    @SuppressWarnings("unchecked")
    public default THIS withTargetHeight(int targetHeight) {
        ((Link) this).setTargetHeight(targetHeight);
        return (THIS) this;
    }

    /**
     * Sets the target window name.
     *
     * @param targetName
     *            the targetName to set.
     *            
     * @return this for method chaining
     * @see Link#setTargetName(String)
     */
    @SuppressWarnings("unchecked")
    public default THIS withTargetName(String targetName) {
        ((Link) this).setTargetName(targetName);
        return (THIS) this;
    }

    /**
     * Sets the target window width.
     *
     * @param targetWidth
     *            the targetWidth to set.
     *            
     * @return this for method chaining
     * @see Link#setTargetWidth(int)
     */
    @SuppressWarnings("unchecked")
    public default THIS withTargetWidth(int targetWidth) {
        ((Link) this).setTargetWidth(targetWidth);
        return (THIS) this;
    }

}
