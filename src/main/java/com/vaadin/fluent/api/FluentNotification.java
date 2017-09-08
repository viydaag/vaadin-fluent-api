package com.vaadin.fluent.api;

import java.io.Serializable;

import com.vaadin.server.Resource;
import com.vaadin.shared.Position;
import com.vaadin.ui.Notification;

/**
 * The base interface for fluent versions of {@link Notification}
 * 
 * @see Notification
 *
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentNotification<THIS extends Notification>
        extends Serializable {

    /**
     * Sets the caption part of the notification message
     *
     * @param caption
     *            The message caption
     * @return this for method chaining
     * @see Notification#setCaption(String)
     */
    @SuppressWarnings("unchecked")
    public default THIS withCaption(String caption) {
        ((Notification) this).setCaption(caption);
        return (THIS) this;
    }

    /**
     * Sets the delay before the notification disappears.
     *
     * @param delayMsec
     *            the desired delay in msec, -1 to require the user to click the message
     * @return this for method chaining
     * @see Notification#setDelayMsec(int)
     */
    @SuppressWarnings("unchecked")
    public default THIS withDelayMsec(int delayMsec) {
        ((Notification) this).setDelayMsec(delayMsec);
        return (THIS) this;
    }

    /**
     * Sets the description part of the notification message.
     *
     * @param description
     *              the description part of the notification message
     * @return this for method chaining
     * @see Notification#setDescription(String)
     */
    @SuppressWarnings("unchecked")
    public default THIS withDescription(String description) {
        ((Notification) this).setDescription(description);
        return (THIS) this;
    }

    /**
     * Sets whether html is allowed in the caption and description. If set to
     * true, the texts are passed to the browser as html and the developer is
     * responsible for ensuring no harmful html is used. If set to false, the
     * texts are passed to the browser as plain text.
     *
     * @param htmlContentAllowed
     *            true if the texts are used as html, false if used as plain text
     * @return this for method chaining
     * @see Notification#setHtmlContentAllowed(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withHtmlContentAllowed(boolean htmlContentAllowed) {
        ((Notification) this).setHtmlContentAllowed(htmlContentAllowed);
        return (THIS) this;
    }

    /**
     * Sets the icon part of the notification message.
     *
     * @param icon
     *            The desired message icon
     * @return this for method chaining
     * @see Notification#setIcon(Resource)
     */
    @SuppressWarnings("unchecked")
    public default THIS withIcon(Resource icon) {
        ((Notification) this).setIcon(icon);
        return (THIS) this;
    }

    /**
     * Sets the position of the notification message.
     *
     * @param position
     *            The desired notification position
     * @return this for method chaining
     * @see Notification#setPosition(Position)
     */
    @SuppressWarnings("unchecked")
    public default THIS withPosition(Position position) {
        ((Notification) this).setPosition(position);
        return (THIS) this;
    }

    /**
     * Sets the style name for the notification message.
     *
     * @param styleName
     *            The desired style name.
     * @return this for method chaining
     * @see Notification#setStyleName(String)
     */
    @SuppressWarnings("unchecked")
    public default THIS withStyleName(String styleName) {
        ((Notification) this).setStyleName(styleName);
        return (THIS) this;
    }

}
