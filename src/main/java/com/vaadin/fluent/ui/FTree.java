package com.vaadin.fluent.ui;

import com.vaadin.data.TreeData;
import com.vaadin.data.provider.HierarchicalDataProvider;
import com.vaadin.fluent.api.FluentTree;
import com.vaadin.ui.Tree;

public class FTree<T>
        extends Tree<T>
        implements FluentTree<FTree<T>, T> {

    private static final long serialVersionUID = 4585759895418312642L;

    public FTree() {
        super();
    }

    public FTree(String caption) {
        super(caption);
    }

    public FTree(HierarchicalDataProvider<T, ?> dataProvider) {
        super(dataProvider);
    }

    public FTree(String caption, TreeData<T> treeData) {
        super(caption, treeData);
    }

    public FTree(String caption, HierarchicalDataProvider<T, ?> dataProvider) {
        super(caption, dataProvider);
    }


}
