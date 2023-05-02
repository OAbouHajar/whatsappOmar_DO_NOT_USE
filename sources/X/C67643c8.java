package X;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: X.3c8  reason: invalid class name and case insensitive filesystem */
public class C67643c8 extends C67723cH<K, V>.AsMap implements SortedMap<K, Collection<V>> {
    public SortedSet sortedKeySet;
    public final /* synthetic */ C67723cH this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67643c8(C67723cH r1, SortedMap sortedMap) {
        super(r1, sortedMap);
        this.this$0 = r1;
    }

    public Comparator comparator() {
        return sortedMap().comparator();
    }

    public SortedSet createKeySet() {
        return new C67623c6(this.this$0, sortedMap());
    }

    public Object firstKey() {
        return sortedMap().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C67643c8(this.this$0, sortedMap().headMap(obj));
    }

    public SortedSet keySet() {
        SortedSet sortedSet = this.sortedKeySet;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet createKeySet = createKeySet();
        this.sortedKeySet = createKeySet;
        return createKeySet;
    }

    public Object lastKey() {
        return sortedMap().lastKey();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.3cf, X.3c8] */
    public SortedMap sortedMap() {
        return (SortedMap) this.submap;
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C67643c8(this.this$0, sortedMap().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C67643c8(this.this$0, sortedMap().tailMap(obj));
    }
}
