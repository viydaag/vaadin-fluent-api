package com.vaadin.fluent.api;

import com.vaadin.ui.Component;
import com.vaadin.ui.CustomLayout;

/**
 * The base interface for fluent versions of {@link CustomLayout}
 *
 * @param <THIS> Self-referential generic THIS
 * 
 * @see CustomLayout
 */
public interface FluentCustomLayout<THIS extends FluentCustomLayout<THIS>>
        extends FluentAbstractLayout<THIS> {

    /**
     * Adds the component into this container to given location. If the location
     * is already populated, the old component is removed.
     *
     * @param c
     *            the component to be added.
     * @param location
     *            the location of the component.
     * @return this for method chaining
     * @see CustomLayout#addComponent(Component, String)
     */
    @SuppressWarnings("unchecked")
    public default THIS withComponent(Component c, String location) {
        ((CustomLayout) this).addComponent(c, location);
        return (THIS) this;
    }

    /**
     * Set the contents of the template used to draw the custom layout (usually html).
     *
     * @param templateContents 
     *              html content
     * @return this for method chaining
     * @see CustomLayout#setTemplateContents(String)
     */
    @SuppressWarnings("unchecked")
    public default THIS withTemplateContents(String templateContents) {
        ((CustomLayout) this).setTemplateContents(templateContents);
        return (THIS) this;
    }

    /**
     * Set the name of the template used to draw custom layout.
     *
     * With GWT-adapter, the template with name 'templatename' is loaded from
     * VAADIN/themes/themename/layouts/templatename.html. If the theme has not
     * been set (with Application.setTheme()), themename is 'default'.
     *
     * @param templateName
     *              name of the html file
     * @return this for method chaining
     * @see CustomLayout#setTemplateName(String)
     */
    @SuppressWarnings("unchecked")
    public default THIS withTemplateName(String templateName) {
        ((CustomLayout) this).setTemplateName(templateName);
        return (THIS) this;
    }

}
