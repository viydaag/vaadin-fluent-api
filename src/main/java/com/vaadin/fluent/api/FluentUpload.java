package com.vaadin.fluent.api;

import com.vaadin.fluent.api.FluentComponent.FluentFocusable;
import com.vaadin.ui.Upload;
import com.vaadin.ui.Upload.ChangeListener;
import com.vaadin.ui.Upload.FailedListener;
import com.vaadin.ui.Upload.FinishedListener;
import com.vaadin.ui.Upload.ProgressListener;
import com.vaadin.ui.Upload.StartedListener;
import com.vaadin.ui.Upload.SucceededListener;

/**
 * The base interface for fluent versions of {@link Upload}
 * 
 * @see Upload
 *
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentUpload<THIS extends FluentUpload<THIS>>
        extends FluentAbstractComponent<THIS>, FluentFocusable<THIS> {

    /**
     * Adds a filename change event listener
     *
     * @param listener
     *            the Listener to add, not null
     * @return this for method chaining
     * @see Upload#addChangeListener(ChangeListener)
     */
    @SuppressWarnings("unchecked")
    public default THIS withChangeListener(ChangeListener listener) {
        ((Upload) this).addChangeListener(listener);
        return (THIS) this;
    }

    /**
     * Adds the upload interrupted event listener.
     *
     * @param listener
     *            the Listener to be added, not null
     * @return this for method chaining
     * @see Upload#addFailedListener(FailedListener)
     */
    @SuppressWarnings("unchecked")
    public default THIS withFailedListener(FailedListener listener) {
        ((Upload) this).addFailedListener(listener);
        return (THIS) this;
    }

    /**
     * Adds the upload received event listener.
     *
     * @param listener
     *            the Listener to be added, not null
     * @return this for method chaining
     * @see Upload#addFinishedListener(FinishedListener)
     */
    @SuppressWarnings("unchecked")
    public default THIS withFinishedListener(FinishedListener listener) {
        ((Upload) this).addFinishedListener(listener);
        return (THIS) this;
    }

    /**
     * Adds the upload progress event listener.
     *
     * @param listener
     *            the progress listener to be added
     * @return this for method chaining
     * @see Upload#addProgressListener(ProgressListener)
     */
    @SuppressWarnings("unchecked")
    public default THIS withProgressListener(ProgressListener listener) {
        ((Upload) this).addProgressListener(listener);
        return (THIS) this;
    }

    /**
     * Adds the upload started event listener.
     *
     * @param listener
     *            the Listener to be added, not null
     * @return this for method chaining
     * @see Upload#addStartedListener(StartedListener)
     */
    @SuppressWarnings("unchecked")
    public default THIS withStartedListener(StartedListener listener) {
        ((Upload) this).addStartedListener(listener);
        return (THIS) this;
    }

    /**
     * Adds the upload success event listener.
     *
     * @param listener
     *            the Listener to be added, not null
     * @return this for method chaining
     * @see Upload#addSucceededListener(SucceededListener)
     */
    @SuppressWarnings("unchecked")
    public default THIS withSucceededListener(SucceededListener listener) {
        ((Upload) this).addSucceededListener(listener);
        return (THIS) this;
    }

    /**
     * In addition to the actual file chooser, upload components have button
     * that starts actual upload progress. This method is used to set text in
     * that button.
     * <p>
     * In case the button text is set to null, the button is hidden. In this
     * case developer must explicitly initiate the upload process with
     * {@link Upload#submitUpload()}.
     * <p>
     * In case the Upload is used in immediate mode using
     * {@link Upload#setImmediateMode(boolean)}, the file choose (html input with type
     * "file") is hidden and only the button with this text is shown.
     *
     * <p>
     * <strong>Note</strong> the string given is set as is to the button. HTML
     * formatting is not stripped. Be sure to properly validate your value
     * according to your needs.
     *
     * @param buttonCaption
     *            text for upload components button.
     * @return this for method chaining
     * @see Upload#setButtonCaption(String)
     */
    @SuppressWarnings("unchecked")
    public default THIS withButtonCaption(String buttonCaption) {
        ((Upload) this).setButtonCaption(buttonCaption);
        return (THIS) this;
    }

    /**
     * Sets the immediate mode of the upload.
     * <p>
     * If the upload is in immediate mode, the file upload is started
     * immediately after the user has selected the file.
     * <p>
     * If the upload is not in immediate mode, after selecting the file the user
     * must click another button to start the upload.
     * <p>
     * The default mode of an Upload component is immediate.
     *
     * @param immediateMode
     *            {@code true} for immediate mode, {@code false} for not
     * @return this for method chaining
     * @see Upload#setImmediateMode(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withImmediateMode(boolean immediateMode) {
        ((Upload) this).setImmediateMode(immediateMode);
        return (THIS) this;
    }
}
