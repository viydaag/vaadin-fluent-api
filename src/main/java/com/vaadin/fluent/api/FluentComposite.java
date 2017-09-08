package com.vaadin.fluent.api;

import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Resource;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.Button;
import com.vaadin.ui.Composite;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

/**
 * The base interface for fluent versions of {@link Composite}
 *
 * @param <THIS> Self-referential generic THIS
 * 
 * @see Composite
 */
public interface FluentComposite<THIS extends FluentComposite<THIS>>
        extends FluentAbstractComponent<THIS>, FluentHasComponents<THIS> {

    /**
     * Sets the caption of the component.
     *
     * <p>
     * A <i>caption</i> is an explanatory textual label accompanying a user
     * interface component, usually shown above, left of, or inside the
     * component. <i>Icon</i> (see {@link #setIcon(Resource) setIcon()} is
     * closely related to caption and is usually displayed horizontally before
     * or after it, depending on the component and the containing layout.
     * </p>
     *
     * <p>
     * The caption can usually also be given as the first parameter to a
     * constructor, though some components do not support it.
     * </p>
     *
     * <pre>
     * RichTextArea area = new RichTextArea();
     * area.setCaption(&quot;You can edit stuff here&quot;);
     * area.setValue(&quot;&lt;h1&gt;Helpful Heading&lt;/h1&gt;&quot;
     *         + &quot;&lt;p&gt;All this is for you to edit.&lt;/p&gt;&quot;);
     * </pre>
     *
     * <p>
     * The contents of a caption are automatically quoted, so no raw HTML can be
     * rendered in a caption. The validity of the used character encoding,
     * usually UTF-8, is not checked.
     * </p>
     *
     * <p>
     * The caption of a component is, by default, managed and displayed by the
     * layout component or component container in which the component is placed.
     * For example, the {@link VerticalLayout} component shows the captions
     * left-aligned above the contained components, while the {@link FormLayout}
     * component shows the captions on the left side of the vertically laid
     * components, with the captions and their associated components
     * left-aligned in their own columns. The {@link CustomComponent} does not
     * manage the caption of its composition root, so if the root component has
     * a caption, it will not be rendered. Some components, such as
     * {@link Button} and {@link Panel}, manage the caption themselves and
     * display it inside the component.
     * </p>
     *
     * <p>
     * A reimplementation should call the superclass implementation.
     * </p>
     *
     * @param caption
     *            the new caption for the component. If the caption is
     *            {@code null}, no caption is shown and it does not normally
     *            take any space
     * @return this (for method chaining)
     * @see Composite#setCaption(java.lang.String)
     */
    @Override
    @SuppressWarnings("unchecked")
    public default THIS withCaption(String caption) {
        ((Composite) this).setCaption(caption);
        return (THIS) this;
    }

    /**
     * Sets the icon of the component.
     *
     * <p>
     * An icon is an explanatory graphical label accompanying a user interface
     * component, usually shown above, left of, or inside the component. Icon is
     * closely related to caption (see {@link #setCaption(String) setCaption()})
     * and is usually displayed horizontally before or after it, depending on
     * the component and the containing layout.
     * </p>
     *
     * <p>
     * The image is loaded by the browser from a resource, typically a
     * {@link com.vaadin.server.ThemeResource}.
     * </p>
     *
     * <pre>
     * // Component with an icon from a custom theme
     * TextField name = new TextField(&quot;Name&quot;);
     * name.setIcon(new ThemeResource(&quot;icons/user.png&quot;));
     * layout.addComponent(name);
     *
     * // Component with an icon from another theme ('runo')
     * Button ok = new Button(&quot;OK&quot;);
     * ok.setIcon(new ThemeResource(&quot;../runo/icons/16/ok.png&quot;));
     * layout.addComponent(ok);
     * </pre>
     *
     * <p>
     * The icon of a component is, by default, managed and displayed by the
     * layout component or component container in which the component is placed.
     * For example, the {@link VerticalLayout} component shows the icons
     * left-aligned above the contained components, while the {@link FormLayout}
     * component shows the icons on the left side of the vertically laid
     * components, with the icons and their associated components left-aligned
     * in their own columns. The {@link CustomComponent} does not manage the
     * icon of its composition root, so if the root component has an icon, it
     * will not be rendered.
     * </p>
     *
     * <p>
     * An icon will be rendered inside an HTML element that has the
     * {@code v-icon} CSS style class. The containing layout may enclose an icon
     * and a caption inside elements related to the caption, such as
     * {@code v-caption} .
     * </p>
     *
     * @param icon
     *            the icon of the component. If null, no icon is shown and it
     *            does not normally take any space.
     * @return this (for method chaining)
     * @see Composite#setIcon(com.vaadin.server.Resource)
     */
    @Override
    @SuppressWarnings("unchecked")
    public default THIS withIcon(Resource icon) {
        ((Composite) this).setIcon(icon);
        return (THIS) this;
    }

    /**
     * Adds an unique id for component that is used in the client-side for
     * testing purposes. Keeping identifiers unique is the responsibility of the
     * programmer.
     *
     * @param id
     *            An alphanumeric id
     * @return this (for method chaining)
     * @see Composite#setId(java.lang.String)
     */
    @Override
    @SuppressWarnings("unchecked")
    public default THIS withId(String id) {
        ((Composite) this).setId(id);
        return (THIS) this;
    }

    /**
     * Changes the primary style name of the component.
     *
     * <p>
     * The primary style name identifies the component when applying the CSS
     * theme to the Component. By changing the style name all CSS rules targeted
     * for that style name will no longer apply, and might result in the
     * component not working as intended.
     * </p>
     *
     * <p>
     * To preserve the original style of the component when changing to a new
     * primary style you should make your new primary style inherit the old
     * primary style using the SASS @include directive. See more in the SASS
     * tutorials.
     * </p>
     *
     * @param style
     *            The new primary style name
     * @return this (for method chaining)
     * @see Composite#setPrimaryStyleName(java.lang.String)
     */
    @Override
    @SuppressWarnings("unchecked")
    public default THIS withPrimaryStyleName(String style) {
        ((Composite) this).setPrimaryStyleName(style);
        return (THIS) this;
    }

    /**
     * Sets one or more user-defined style names of the component, replacing any
     * previous user-defined styles. Multiple styles can be specified as a
     * space-separated list of style names. The style names must be valid CSS
     * class names and should not conflict with any built-in style names in
     * Vaadin or GWT.
     *
     * <pre>
     * Label label = new Label(&quot;This text has a lot of style&quot;);
     * label.setStyleName(&quot;myonestyle myotherstyle&quot;);
     * </pre>
     *
     * <p>
     * Each style name will occur in two versions: one as specified and one that
     * is prefixed with the style name of the component. For example, if you
     * have a {@code Button} component and give it "{@code mystyle}" style, the
     * component will have both "{@code mystyle}" and "{@code v-button-mystyle}"
     * styles. You could then style the component either with:
     * </p>
     *
     * <pre>
     * .myonestyle {background: blue;}
     * </pre>
     *
     * <p>
     * or
     * </p>
     *
     * <pre>
     * .v-button-myonestyle {background: blue;}
     * </pre>
     *
     * <p>
     * It is normally a good practice to use {@link #addStyleName(String)
     * addStyleName()} rather than this setter, as different software
     * abstraction layers can then add their own styles without accidentally
     * removing those defined in other layers.
     * </p>
     *
     * @param style
     *            the new style or styles of the component as a space-separated
     *            list
     * @see Composite#getStyleName()
     * @see Composite#addStyleName(String)
     * @see Composite#removeStyleName(String)
     */
    @Override
    @SuppressWarnings("unchecked")
    public default THIS withStyleName(String style) {
        ((Composite) this).setStyleName(style);
        return (THIS) this;
    }

    /**
     * Adds or removes a style name. Multiple styles can be specified as a
     * space-separated list of style names.
     *
     * If the {@code add} parameter is true, the style name is added to the
     * component. If the {@code add} parameter is false, the style name is
     * removed from the component.
     * <p>
     * Functionally this is equivalent to using {@link Composite#addStyleName(String)} or
     * {@link Composite#removeStyleName(String)}
     *
     * @param style
     *            the style name to be added or removed
     * @param add
     *            <code>true</code> to add the given style, <code>false</code> to remove it
     *            
     * @return this for method chaining           
     * @see Composite#addStyleName(String)
     * @see Composite#removeStyleName(String)
     */
    @Override
    @SuppressWarnings("unchecked")
    public default THIS withStyleName(String style, boolean add) {
        ((Composite) this).setStyleName(style, add);
        return (THIS) this;
    }

    /**
     * Sets whether the caption is rendered as HTML.
     * <p>
     * If set to true, the captions are rendered in the browser as HTML and the
     * developer is responsible for ensuring no harmful HTML is used. If set to
     * false, the caption is rendered in the browser as plain text.
     * <p>
     * The default is false, i.e. to render that caption as plain text.
     *
     * @param captionAsHtml
     *            true if the captions are rendered as HTML, false if rendered
     *            as plain text
     * @return this (for method chaining)
     * @see Composite#setCaptionAsHtml(boolean)
     */
    @Override
    @SuppressWarnings("unchecked")
    public default THIS withCaptionAsHtml(boolean captionAsHtml) {
        ((Composite) this).setCaptionAsHtml(captionAsHtml);
        return (THIS) this;
    }

    /**
     * Sets the component'THIS description. See {@link #getDescription()} for more
     * information on what the description is.
     *
     * The description is displayed as HTML in tooltips or directly in certain
     * components so care should be taken to avoid creating the possibility for
     * HTML injection and possibly XSS vulnerabilities.
     *
     * @param description
     *            the new description string for the component.
     * @return this (for method chaining)
     * @see Composite#setDescription(java.lang.String)
     */
    @Override
    @SuppressWarnings("unchecked")
    public default THIS withDescription(String description) {
        ((Composite) this).setDescription(description);
        return (THIS) this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public default THIS withDescription(String description, ContentMode mode) {
        ((Composite) this).setDescription(description, mode);
        return (THIS) this;
    }

    /**
     * Sets the component'THIS error message.
     *
     * @param componentError
     *            the new <code>ErrorMessage</code> of the component.
     * @return this (for method chaining)
     * @see Composite#setComponentError(com.vaadin.server.ErrorMessage)
     */
    @Override
    @SuppressWarnings("unchecked")
    public default THIS withComponentError(ErrorMessage componentError) {
        ((Composite) this).setComponentError(componentError);
        return (THIS) this;
    }

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
     * @see Composite#setHeight(java.lang.String)
     */
    @Override
    @SuppressWarnings("unchecked")
    public default THIS withHeight(String height) {
        ((Composite) this).setHeight(height);
        return (THIS) this;
    }

    /**
     * Sets the height of the object. Negative number implies unspecified size
     * (terminal is free to set the size).
     *
     * @param height the height of the object.
     * @param unit the unit used for the width.
     * @return this (for method chaining)
     * @see Composite#setHeight(float, com.vaadin.server.Sizeable.Unit)
     */
    @Override
    @SuppressWarnings("unchecked")
    public default THIS withHeight(float height, Unit unit) {
        ((Composite) this).setHeight(height, unit);
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
     * @see Composite#setWidth(java.lang.String)
     */
    @Override
    @SuppressWarnings("unchecked")
    public default THIS withWidth(String width) {
        ((Composite) this).setWidth(width);
        return (THIS) this;
    }

    /**
     * Sets the width of the object. Negative number implies unspecified size
     * (terminal is free to set the size).
     *
     * @param width the width of the object.
     * @param unit the unit used for the width.
     * @return this (for method chaining)
     * @see Composite#setWidth(float, com.vaadin.server.Sizeable.Unit)
     */
    @Override
    @SuppressWarnings("unchecked")
    public default THIS withWidth(float width, Unit unit) {
        ((Composite) this).setWidth(width, unit);
        return (THIS) this;
    }

    /**
     * Sets the size to 100% x 100%.
     * @return this (for method chaining)
     * @see Composite#setSizeFull()
     */
    @Override
    @SuppressWarnings("unchecked")
    public default THIS withFullSize() {
        ((Composite) this).setSizeFull();
        return (THIS) this;
    }

    /**
     * Sets the width to 100%.
     *
     * @return this (for method chaining)
     */
    @Override
    public default THIS withFullWidth() {
        return withWidth("100%");
    }

    /**
     * Sets the height to 100%.
     *
     * @return this (for method chaining)
     */
    @Override
    public default THIS withFullHeight() {
        return withHeight("100%");
    }

    /**
     * Clears any size settings.
     * @return this (for method chaining)
     * @see Composite#setSizeUndefined()
     */
    @Override
    @SuppressWarnings("unchecked")
    public default THIS withUndefinedSize() {
        ((Composite) this).setSizeUndefined();
        return (THIS) this;
    }

    /**
     * Clears any defined width
     *
     * @return this (for method chaining)
     * @see Composite#setWidthUndefined()
     */
    @Override
    @SuppressWarnings("unchecked")
    public default THIS withUndefinedWidth() {
        ((Composite) this).setWidthUndefined();
        return (THIS) this;
    }

    /**
     * Clears any defined height
     *
     * @return this (for method chaining)
     * @see Composite#setHeightUndefined()
     */
    @Override
    @SuppressWarnings("unchecked")
    public default THIS withUndefinedHeight() {
        ((Composite) this).setHeightUndefined();
        return (THIS) this;
    }

    @Override
    public default THIS withSize(String width, String height) {
        return withWidth(width).withHeight(height);
    }

    @Override
    public default THIS withCaption(String caption, boolean captionAsHtml) {
        return withCaption(caption).withCaptionAsHtml(captionAsHtml);
    }

}
