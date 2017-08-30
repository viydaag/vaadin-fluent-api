package com.vaadin.fluent.api;

import com.vaadin.event.FieldEvents;

public interface FluentFieldEvents
        extends FieldEvents {

    public interface FluentFocusNotifier<THIS extends FluentFocusNotifier<THIS>>
            extends FocusNotifier {

        @SuppressWarnings("unchecked")
        public default THIS withFocusListener(FocusListener listener) {
            this.addFocusListener(listener);
            return (THIS) this;
        }

    }

    public interface FluentBlurNotifier<THIS extends FluentBlurNotifier<THIS>>
            extends BlurNotifier {

        @SuppressWarnings("unchecked")
        public default THIS withBlurListener(BlurListener listener) {
            this.addBlurListener(listener);
            return (THIS) this;
        }

    }

}
