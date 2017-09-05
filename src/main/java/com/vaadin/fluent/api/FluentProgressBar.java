package com.vaadin.fluent.api;

import com.vaadin.ui.ProgressBar;

/**
 * The base interface for fluent versions of {@link ProgressBar}
 * 
 * @see ProgressBar
 *
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentProgressBar<THIS extends FluentProgressBar<THIS>>
        extends FluentAbstractComponent<THIS> {

    /**
     * Sets the value of this progress bar. The value is a <code>float</code>
     * between 0 and 1 where 0 represents no progress at all and 1 represents
     * fully completed.
     *
     * @param newValue
     *            the current progress value
     * @return this for method chaining
     * @see ProgressBar#setValue(float)
     */
    @SuppressWarnings("unchecked")
    public default THIS withValue(float newValue) {
        ((ProgressBar) this).setValue(newValue);
        return (THIS) this;
    }

    /**
     * Sets whether or not this progress indicator is indeterminate. In
     * indeterminate mode there is an animation indicating that the task is
     * running but without providing any information about the current progress.
     *
     * @param indeterminate
     *            <code>true</code> to set to indeterminate mode; otherwise
     *            <code>false</code>
     * @return this for method chaining
     * @see ProgressBar#setIndeterminate(boolean)
     */
    @SuppressWarnings("unchecked")
    public default THIS withIndeterminate(boolean indeterminate) {
        ((ProgressBar) this).setIndeterminate(indeterminate);
        return (THIS) this;
    }

}
