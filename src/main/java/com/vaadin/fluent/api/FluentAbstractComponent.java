package com.vaadin.fluent.api;

import java.util.Locale;

import com.vaadin.event.ShortcutListener;
import com.vaadin.server.ErrorMessage;
import com.vaadin.ui.AbstractComponent;

/**
 * A {@link AbstractComponent} complemented by fluent setters.
 *
 * @param <THIS>
 *            Self-referential generic THIS
 * @see AbstractComponent
 */
public interface FluentAbstractComponent<THIS extends FluentAbstractComponent<THIS>>
        extends FluentComponent<THIS>, FluentClientConnector<THIS>, FluentContextClickNotifier<THIS> {

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
     * @see AbstractComponent#setCaptionAsHtml(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withCaptionAsHtml(boolean captionAsHtml) {
        ((AbstractComponent) this).setCaptionAsHtml(captionAsHtml);
        return (THIS) this;
    }

    /**
     * Sets the locale of this component.
     *
     * <pre>
     * // Component for which the locale is meaningful
     * InlineDateField date = new InlineDateField(&quot;Datum&quot;);
     *
     * // German language specified with ISO 639-1 language
     * // code and ISO 3166-1 alpha-2 country code.
     * date.setLocale(new Locale(&quot;de&quot;, &quot;DE&quot;));
     *
     * date.setResolution(DateField.RESOLUTION_DAY);
     * layout.addComponent(date);
     * </pre>
     *
     * @param locale
     *            the locale to become this component'THIS locale.
     * @return this (for method chaining)
     * @see AbstractComponent#setLocale(java.util.Locale)
     */
    @SuppressWarnings("unchecked")
    public default THIS withLocale(Locale locale) {
        ((AbstractComponent) this).setLocale(locale);
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
     * @see AbstractComponent#setDescription(java.lang.String)
     */
    @SuppressWarnings("unchecked")
    public default THIS withDescription(String description) {
        ((AbstractComponent) this).setDescription(description);
        return (THIS) this;
    }

    /**
     * Sets the component'THIS error message.
     *
     * @param componentError
     *            the new <code>ErrorMessage</code> of the component.
     * @return this (for method chaining)
     * @see AbstractComponent#setComponentError(com.vaadin.server.ErrorMessage)
     */
    @SuppressWarnings("unchecked")
    public default THIS withComponentError(ErrorMessage componentError) {
        ((AbstractComponent) this).setComponentError(componentError);
        return (THIS) this;
    }

    /**
     * Sets the data object, that can be used for any application specific data.
     * The component does not use or modify this data.
     *
     * @param data
     *            the Application specific data.
     * @return this (for method chaining)
     * @see AbstractComponent#setData(java.lang.Object)
     */
    @SuppressWarnings("unchecked")
    public default THIS withData(Object data) {
        ((AbstractComponent) this).setData(data);
        return (THIS) this;
    }

    /**
     * Registers a new shortcut listener for the component.
     *
     * @param shortcut
     *            the new Listener to be registered.
     * @return this (for method chaining)
     * @see AbstractComponent#addShortcutListener(com.vaadin.event.ShortcutListener)
     */
    @SuppressWarnings("unchecked")
    public default THIS withShortcutListener(ShortcutListener shortcut) {
        ((AbstractComponent) this).addShortcutListener(shortcut);
        return (THIS) this;
    }

    /**
     * Toggles responsiveness of this component.
     *
     * @since 7.5.0
     * @param responsive
     *            boolean enables responsiveness, false disables
     * @return this (for method chaining)
     * @see AbstractComponent#setResponsive(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withResponsive(boolean responsive) {
        ((AbstractComponent) this).setResponsive(responsive);
        return (THIS) this;
    }

    public default THIS withCaption(String caption, boolean captionAsHtml) {
        setCaption(caption);
        return withCaptionAsHtml(captionAsHtml);
    }

}
