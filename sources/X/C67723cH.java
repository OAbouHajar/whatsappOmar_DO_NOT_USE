package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: X.3cH  reason: invalid class name and case insensitive filesystem */
public abstract class C67723cH extends C99064tQ implements Serializable {
    public static final long serialVersionUID = 2447537837011683357L;
    public transient Map map;
    public transient int totalSize;

    public C67723cH(Map map2) {
        if (map2.isEmpty()) {
            this.map = map2;
            return;
        }
        throw AnonymousClass3K3.A0f();
    }

    public static /* synthetic */ int access$208(C67723cH r2) {
        int i2 = r2.totalSize;
        r2.totalSize = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int access$210(C67723cH r2) {
        int i2 = r2.totalSize;
        r2.totalSize = i2 - 1;
        return i2;
    }

    public static /* synthetic */ int access$212(C67723cH r1, int i2) {
        int i3 = r1.totalSize + i2;
        r1.totalSize = i3;
        return i3;
    }

    public static /* synthetic */ int access$220(C67723cH r1, int i2) {
        int i3 = r1.totalSize - i2;
        r1.totalSize = i3;
        return i3;
    }

    public static Iterator iteratorOrListIterator(Collection collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* access modifiers changed from: private */
    public void removeValuesForKey(Object obj) {
        Collection collection = (Collection) C90814er.safeRemove(this.map, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.totalSize -= size;
        }
    }

    public Map backingMap() {
        return this.map;
    }

    public void clear() {
        Iterator A0q = C13680ns.A0q(this.map);
        while (A0q.hasNext()) {
            ((Collection) A0q.next()).clear();
        }
        this.map.clear();
        this.totalSize = 0;
    }

    public abstract Collection createCollection();

    public Collection createCollection(Object obj) {
        return createCollection();
    }

    public final Map createMaybeNavigableAsMap() {
        Map map2 = this.map;
        return map2 instanceof NavigableMap ? new C67633c7(this, (NavigableMap) map2) : map2 instanceof SortedMap ? new C67643c8(this, (SortedMap) map2) : new C67963cf(this, map2);
    }

    public final Set createMaybeNavigableKeySet() {
        Map map2 = this.map;
        return map2 instanceof NavigableMap ? new C67653c9(this, (NavigableMap) map2) : map2 instanceof SortedMap ? new C67623c6(this, (SortedMap) map2) : new C67953ce(this, map2);
    }

    public Collection createValues() {
        return new C105805Bg(this);
    }

    public boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.map.get(obj);
        if (collection == null) {
            Collection createCollection = createCollection(obj);
            if (createCollection.add(obj2)) {
                this.totalSize++;
                this.map.put(obj, createCollection);
                return true;
            }
            throw AnonymousClass3K4.A0T("New Collection violated the Collection spec");
        } else if (!collection.add(obj2)) {
            return false;
        } else {
            this.totalSize++;
            return true;
        }
    }

    public final void setMap(Map map2) {
        this.map = map2;
        this.totalSize = 0;
        Iterator A0q = C13680ns.A0q(map2);
        while (A0q.hasNext()) {
            Collection collection = (Collection) A0q.next();
            if (!collection.isEmpty()) {
                this.totalSize += collection.size();
            } else {
                throw AnonymousClass3K3.A0f();
            }
        }
    }

    public int size() {
        return this.totalSize;
    }

    public abstract Collection unmodifiableCollectionSubclass(Collection collection);

    public Iterator valueIterator() {
        return new C67613c5(this);
    }

    public abstract Collection wrapCollection(Object obj, Collection collection);

    /* JADX WARNING: type inference failed for: r0v2, types: [X.3cB, java.util.List] */
    public final List wrapList(Object obj, List list, C105845Bk r4) {
        return list instanceof RandomAccess ? new C67673cB(this, obj, list, r4) : new C67683cC(this, obj, list, r4);
    }
}
