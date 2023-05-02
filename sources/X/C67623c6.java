package X;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: X.3c6  reason: invalid class name and case insensitive filesystem */
public class C67623c6 extends C67723cH<K, V>.KeySet implements SortedSet<K> {
    public final /* synthetic */ C67723cH this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67623c6(C67723cH r1, SortedMap sortedMap) {
        super(r1, sortedMap);
        this.this$0 = r1;
    }

    public Comparator comparator() {
        return sortedMap().comparator();
    }

    public Object first() {
        return sortedMap().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C67623c6(this.this$0, sortedMap().headMap(obj));
    }

    public Object last() {
        return sortedMap().lastKey();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.3cp, X.3c6] */
    public SortedMap sortedMap() {
        return (SortedMap) C67623c6.super.map();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C67623c6(this.this$0, sortedMap().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C67623c6(this.this$0, sortedMap().tailMap(obj));
    }
}
