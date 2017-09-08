package com.vaadin.fluent.ui;

import java.util.Collection;

import com.vaadin.data.PropertySet;
import com.vaadin.data.provider.DataCommunicator;
import com.vaadin.data.provider.DataProvider;
import com.vaadin.fluent.api.FluentGrid;
import com.vaadin.ui.Grid;

public class FGrid<T>
        extends Grid<T>
        implements FluentGrid<FGrid<T>, T> {

    private static final long serialVersionUID = -6192109992359554935L;

    public FGrid() {
        super();
    }

    public FGrid(Class<T> beanType) {
        super(beanType);
    }

    public FGrid(DataCommunicator<T> dataCommunicator) {
        super(dataCommunicator);
    }

    public FGrid(PropertySet<T> propertySet) {
        super(propertySet);
    }

    public FGrid(String caption) {
        super(caption);
    }

    public FGrid(DataProvider<T, ?> dataProvider) {
        super(dataProvider);
    }

    public FGrid(Class<T> beanType, DataCommunicator<T> dataCommunicator) {
        super(beanType, dataCommunicator);
    }

    public FGrid(PropertySet<T> propertySet, DataCommunicator<T> dataCommunicator) {
        super(propertySet, dataCommunicator);
    }

    public FGrid(String caption, DataProvider<T, ?> dataProvider) {
        super(caption, dataProvider);
    }

    public FGrid(String caption, Collection<T> items) {
        super(caption, items);
    }

}
