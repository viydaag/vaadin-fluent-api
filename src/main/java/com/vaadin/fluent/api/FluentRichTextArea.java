package com.vaadin.fluent.api;

import com.vaadin.ui.RichTextArea;

/**
 * The base interface for fluent versions of {@link RichTextArea}
 * 
 * @see RichTextArea
 *
 * @param <THIS> Self-referential generic THIS
 */
public interface FluentRichTextArea<THIS extends FluentRichTextArea<THIS>>
        extends FluentAbstractField<THIS, String>, FluentHasValueChangeMode<THIS> {

}
