package com.vaadin.fluent.api;

import java.util.Collection;
import java.util.stream.Stream;

import com.vaadin.data.HasHierarchicalDataProvider;
import com.vaadin.data.TreeData;
import com.vaadin.data.ValueProvider;
import com.vaadin.data.provider.DataProvider;
import com.vaadin.data.provider.HierarchicalDataProvider;
import com.vaadin.data.provider.TreeDataProvider;

public interface FluentHasHierarchicalDataProvider<THIS extends FluentHasHierarchicalDataProvider<THIS, ITEM>, ITEM>
        extends HasHierarchicalDataProvider<ITEM>, FluentHasDataProvider<THIS, ITEM> {

    /**
     * Sets a new {@link TreeDataProvider} wrapping the given {@link TreeData}.
     *
     * @param treeData
     *            the tree data to set
     * @return this form method chaining
     * @see HasHierarchicalDataProvider#setTreeData(TreeData)
     */
    @SuppressWarnings("unchecked")
    public default THIS withTreeData(TreeData<ITEM> treeData) {
        setTreeData(treeData);
        return (THIS) this;
    }

    /**
     * Sets the root data items of this component provided as a collection and
     * recursively populates them with child items with the given value
     * provider.
     * <p>
     * The provided items are wrapped into a {@link TreeDataProvider} backed by
     * a flat {@link TreeData} structure. The data provider instance is used as
     * a parameter for the {@link #setDataProvider(DataProvider)} method. It
     * means that the items collection can be accessed later on via
     * {@link #getTreeData()}:
     *
     * <pre>
     * <code>
     * Collection&lt;Person&gt; grandParents = getGrandParents();
     * HasHierarchicalDataProvider&lt;Person&gt; treeGrid = new TreeGrid&lt;&gt;();
     * treeGrid.setItems(grandParents, Person::getChildren);
     * ...
     *
     * TreeData&lt;Person&gt; data = treeGrid.getTreeData();
     * </code>
     * </pre>
     * <p>
     * The returned {@link TreeData} instance may be used as-is to add, remove
     * or modify items in the hierarchy. These modifications to the object are
     * not automatically reflected back to the TreeGrid. Items modified should
     * be refreshed with {@link HierarchicalDataProvider#refreshItem(Object)}
     * and when adding or removing items
     * {@link HierarchicalDataProvider#refreshAll()} should be called.
     *
     * @param rootItems
     *            the root items to display, not {@code null}
     * @param childItemProvider
     *            the value provider used to recursively populate the given root
     *            items with child items, not {@code null}
     * @return this form method chaining
     * @see HasHierarchicalDataProvider#setItems(Collection, ValueProvider)
     */
    @SuppressWarnings("unchecked")
    public default THIS withItems(Collection<ITEM> rootItems, ValueProvider<ITEM, Collection<ITEM>> childItemProvider) {
        setItems(rootItems, childItemProvider);
        return (THIS) this;
    }

    /**
     * Sets the root data items of this component provided as a stream and
     * recursively populates them with child items with the given value
     * provider.
     * <p>
     * The provided items are wrapped into a {@link TreeDataProvider} backed by
     * a flat {@link TreeData} structure. The data provider instance is used as
     * a parameter for the {@link #setDataProvider(DataProvider)} method. It
     * means that the items collection can be accessed later on via
     * {@link #getTreeData()}:
     *
     * <pre>
     * <code>
     * Stream&lt;Person&gt; grandParents = getGrandParents();
     * HasHierarchicalDataProvider&lt;Person&gt; treeGrid = new TreeGrid&lt;&gt;();
     * treeGrid.setItems(grandParents, Person::getChildren);
     * ...
     *
     * TreeData&lt;Person&gt; data = treeGrid.getTreeData();
     * </code>
     * </pre>
     * <p>
     * The returned {@link TreeData} instance may be used as-is to add, remove
     * or modify items in the hierarchy. These modifications to the object are
     * not automatically reflected back to the TreeGrid. Items modified should
     * be refreshed with {@link HierarchicalDataProvider#refreshItem(Object)}
     * and when adding or removing items
     * {@link HierarchicalDataProvider#refreshAll()} should be called.
     *
     * @param rootItems
     *            the root items to display, not {@code null}
     * @param childItemProvider
     *            the value provider used to recursively populate the given root
     *            items with child items, not {@code null}
     * @return this form method chaining
     * @see HasHierarchicalDataProvider#setItems(Stream, ValueProvider)
     */
    @SuppressWarnings("unchecked")
    public default THIS withItems(Stream<ITEM> rootItems, ValueProvider<ITEM, Stream<ITEM>> childItemProvider) {
        setItems(rootItems, childItemProvider);
        return (THIS) this;
    }

    /**
     * Sets the data items of this component provided as a collection.
     * <p>
     * The provided items are wrapped into a {@link TreeDataProvider} backed by
     * a flat {@link TreeData} structure. The data provider instance is used as
     * a parameter for the {@link #setDataProvider(DataProvider)} method. It
     * means that the items collection can be accessed later on via
     * {@link #getTreeData()}:
     *
     * <pre>
     * <code>
     * HasHierarchicalDataProvider&lt;String&gt; treeGrid = new TreeGrid&lt;&gt;();
     * treeGrid.setItems(Arrays.asList("a","b"));
     * ...
     *
     * TreeData&lt;String&gt; data = treeGrid.getTreeData();
     * </code>
     * </pre>
     * <p>
     * The returned {@link TreeData} instance may be used as-is to add, remove
     * or modify items in the hierarchy. These modifications to the object are
     * not automatically reflected back to the TreeGrid. Items modified should
     * be refreshed with {@link HierarchicalDataProvider#refreshItem(Object)}
     * and when adding or removing items
     * {@link HierarchicalDataProvider#refreshAll()} should be called.
     *
     * @param items
     *            the data items to display, not {@code null}
     * @return this form method chaining
     * @see HasHierarchicalDataProvider#setItems(Collection)
     */
    @SuppressWarnings("unchecked")
    @Override
    public default THIS withItems(Collection<ITEM> items) {
        setItems(items);
        return (THIS) this;
    }

    /**
     * Sets the data items of this component provided as a stream.
     * <p>
     * The provided items are wrapped into a {@link TreeDataProvider} backed by
     * a flat {@link TreeData} structure. The data provider instance is used as
     * a parameter for the {@link #setDataProvider(DataProvider)} method. It
     * means that the items collection can be accessed later on via
     * {@link #getTreeData()}:
     *
     * <pre>
     * <code>
     * HasHierarchicalDataProvider&lt;String&gt; treeGrid = new TreeGrid&lt;&gt;();
     * treeGrid.setItems(Stream.of("a","b"));
     * ...
     *
     * TreeData&lt;String&gt; data = treeGrid.getTreeData();
     * </code>
     * </pre>
     * <p>
     * The returned {@link TreeData} instance may be used as-is to add, remove
     * or modify items in the hierarchy. These modifications to the object are
     * not automatically reflected back to the TreeGrid. Items modified should
     * be refreshed with {@link HierarchicalDataProvider#refreshItem(Object)}
     * and when adding or removing items
     * {@link HierarchicalDataProvider#refreshAll()} should be called.
     *
     * @param items
     *            the data items to display, not {@code null}
     * @return this form method chaining
     * @see HasHierarchicalDataProvider#setItems(Stream)
     */
    @SuppressWarnings("unchecked")
    @Override
    public default THIS withItems(Stream<ITEM> items) {
        setItems(items);
        return (THIS) this;
    }

    /**
     * Sets the data items of this listing.
     * <p>
     * The provided items are wrapped into a {@link TreeDataProvider} backed by
     * a flat {@link TreeData} structure. The data provider instance is used as
     * a parameter for the {@link #setDataProvider(DataProvider)} method. It
     * means that the items collection can be accessed later on via
     * {@link #getTreeData()}:
     *
     * <pre>
     * <code>
     * TreeGrid&lt;String&gt; treeGrid = new TreeGrid&lt;&gt;();
     * treeGrid.setItems("a","b");
     * ...
     *
     * TreeData&lt;String&gt; data = treeGrid.getTreeData();
     * </code>
     * </pre>
     * <p>
     * The returned {@link TreeData} instance may be used as-is to add, remove
     * or modify items in the hierarchy. These modifications to the object are
     * not automatically reflected back to the TreeGrid. Items modified should
     * be refreshed with {@link HierarchicalDataProvider#refreshItem(Object)}
     * and when adding or removing items
     * {@link HierarchicalDataProvider#refreshAll()} should be called.
     *
     * @param items
     *            the data items to display, not {@code null}
     * @return this form method chaining
     * @see HasHierarchicalDataProvider#setItems(Object...)
     */
    @SuppressWarnings("unchecked")
    @Override
    public default THIS withItems(ITEM... items) {
        setItems(items);
        return (THIS) this;
    }

}
