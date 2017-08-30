package com.vaadin.fluent.api;

import com.vaadin.fluent.api.FluentComponent.FluentFocusable;
import com.vaadin.ui.ItemCaptionGenerator;

public interface FluentAbstractListing<THIS extends FluentAbstractListing<THIS, ITEM>, ITEM>
        extends FluentAbstractComponent<THIS>, FluentHasItems<THIS, ITEM>, FluentFocusable<THIS> {

    public THIS withItemCaptionGenerator(ItemCaptionGenerator<ITEM> itemCaptionGenerator);

    //    public THIS withItemIconGenerator(IconGenerator<ITEM> itemIconGenerator);

}
