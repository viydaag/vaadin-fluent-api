package com.vaadin.fluent.ui;

import com.vaadin.data.PropertySet;
import com.vaadin.data.provider.HierarchicalDataCommunicator;
import com.vaadin.data.provider.HierarchicalDataProvider;
import com.vaadin.fluent.api.FluentTreeGrid;
import com.vaadin.ui.TreeGrid;

public class FTreeGrid<T>
        extends TreeGrid<T>
        implements FluentTreeGrid<FTreeGrid<T>, T> {

    private static final long serialVersionUID = -7374239898451545589L;

    public FTreeGrid() {
        super();
    }

    public FTreeGrid(Class<T> beanType) {
        super(beanType);
    }

    public FTreeGrid(HierarchicalDataProvider<T, ?> dataProvider) {
        super(dataProvider);
    }

    public FTreeGrid(HierarchicalDataCommunicator<T> dataCommunicator) {
        super(dataCommunicator);
    }

    public FTreeGrid(PropertySet<T> propertySet, HierarchicalDataCommunicator<T> dataCommunicator) {
        super(propertySet, dataCommunicator);
    }

}
