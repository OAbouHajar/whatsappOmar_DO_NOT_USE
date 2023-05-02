package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;

/* renamed from: X.3c7  reason: invalid class name and case insensitive filesystem */
public class C67633c7 extends C67723cH<K, V>.SortedAsMap implements NavigableMap<K, Collection<V>> {
    public final /* synthetic */ C67723cH this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67633c7(C67723cH r1, NavigableMap navigableMap) {
        super(r1, navigableMap);
        this.this$0 = r1;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.3c7, X.3cf] */
    public Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = sortedMap().ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return wrapEntry(ceilingEntry);
    }

    public Object ceilingKey(Object obj) {
        return sortedMap().ceilingKey(obj);
    }

    public NavigableSet createKeySet() {
        return new C67653c9(this.this$0, sortedMap());
    }

    public NavigableSet descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    public NavigableMap descendingMap() {
        return new C67633c7(this.this$0, sortedMap().descendingMap());
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.3c7, X.3cf] */
    public Map.Entry firstEntry() {
        Map.Entry firstEntry = sortedMap().firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return wrapEntry(firstEntry);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.3c7, X.3cf] */
    public Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = sortedMap().floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return wrapEntry(floorEntry);
    }

    public Object floorKey(Object obj) {
        return sortedMap().floorKey(obj);
    }

    public NavigableMap headMap(Object obj) {
        return headMap(obj, false);
    }

    public NavigableMap headMap(Object obj, boolean z2) {
        return new C67633c7(this.this$0, sortedMap().headMap(obj, z2));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.3c7, X.3cf] */
    public Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = sortedMap().higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return wrapEntry(higherEntry);
    }

    public Object higherKey(Object obj) {
        return sortedMap().higherKey(obj);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.3c7, X.3c8] */
    public NavigableSet keySet() {
        return (NavigableSet) C67633c7.super.keySet();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.3c7, X.3cf] */
    public Map.Entry lastEntry() {
        Map.Entry lastEntry = sortedMap().lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return wrapEntry(lastEntry);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.3c7, X.3cf] */
    public Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = sortedMap().lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return wrapEntry(lowerEntry);
    }

    public Object lowerKey(Object obj) {
        return sortedMap().lowerKey(obj);
    }

    public NavigableSet navigableKeySet() {
        return keySet();
    }

    public Map.Entry pollAsMapEntry(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry A0z = AnonymousClass000.A0z(it);
        Collection createCollection = this.this$0.createCollection();
        createCollection.addAll((Collection) A0z.getValue());
        it.remove();
        return C90814er.immutableEntry(A0z.getKey(), this.this$0.unmodifiableCollectionSubclass(createCollection));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractMap, X.3c7] */
    public Map.Entry pollFirstEntry() {
        return pollAsMapEntry(C13690nt.A0j(this));
    }

    public Map.Entry pollLastEntry() {
        return pollAsMapEntry(descendingMap().entrySet().iterator());
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.3c7, X.3c8] */
    public NavigableMap sortedMap() {
        return (NavigableMap) C67633c7.super.sortedMap();
    }

    public NavigableMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    public NavigableMap subMap(Object obj, boolean z2, Object obj2, boolean z3) {
        return new C67633c7(this.this$0, sortedMap().subMap(obj, z2, obj2, z3));
    }

    public NavigableMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    public NavigableMap tailMap(Object obj, boolean z2) {
        return new C67633c7(this.this$0, sortedMap().tailMap(obj, z2));
    }
}
