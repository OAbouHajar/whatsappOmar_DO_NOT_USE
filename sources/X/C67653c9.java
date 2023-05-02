package X;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;

/* renamed from: X.3c9  reason: invalid class name and case insensitive filesystem */
public class C67653c9 extends C67723cH<K, V>.SortedKeySet implements NavigableSet<K> {
    public final /* synthetic */ C67723cH this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67653c9(C67723cH r1, NavigableMap navigableMap) {
        super(r1, navigableMap);
        this.this$0 = r1;
    }

    public Object ceiling(Object obj) {
        return sortedMap().ceilingKey(obj);
    }

    public Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    public NavigableSet descendingSet() {
        return new C67653c9(this.this$0, sortedMap().descendingMap());
    }

    public Object floor(Object obj) {
        return sortedMap().floorKey(obj);
    }

    public NavigableSet headSet(Object obj) {
        return headSet(obj, false);
    }

    public NavigableSet headSet(Object obj, boolean z2) {
        return new C67653c9(this.this$0, sortedMap().headMap(obj, z2));
    }

    public Object higher(Object obj) {
        return sortedMap().higherKey(obj);
    }

    public Object lower(Object obj) {
        return sortedMap().lowerKey(obj);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractCollection, X.3c9] */
    public Object pollFirst() {
        return C28021Ua.pollNext(iterator());
    }

    public Object pollLast() {
        return C28021Ua.pollNext(descendingIterator());
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.3c6, X.3c9] */
    public NavigableMap sortedMap() {
        return (NavigableMap) C67653c9.super.sortedMap();
    }

    public NavigableSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public NavigableSet subSet(Object obj, boolean z2, Object obj2, boolean z3) {
        return new C67653c9(this.this$0, sortedMap().subMap(obj, z2, obj2, z3));
    }

    public NavigableSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    public NavigableSet tailSet(Object obj, boolean z2) {
        return new C67653c9(this.this$0, sortedMap().tailMap(obj, z2));
    }
}
