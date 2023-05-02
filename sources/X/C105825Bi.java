package X;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.5Bi  reason: invalid class name and case insensitive filesystem */
public class C105825Bi<K, V> extends AbstractCollection<V> {
    public final Map map;

    public C105825Bi(Map map2) {
        this.map = map2;
    }

    public void clear() {
        map().clear();
    }

    public boolean contains(Object obj) {
        return map().containsValue(obj);
    }

    public boolean isEmpty() {
        return map().isEmpty();
    }

    public Iterator iterator() {
        return C90814er.valueIterator(AnonymousClass000.A0y(map()));
    }

    public final Map map() {
        return this.map;
    }

    public boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            Iterator A0y = AnonymousClass000.A0y(map());
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass000.A0z(A0y);
                if (AnonymousClass45Q.A00(obj, A0z.getValue())) {
                    map().remove(A0z.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    public boolean removeAll(Collection collection) {
        try {
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet newHashSet = C90734ei.newHashSet();
            Iterator A0y = AnonymousClass000.A0y(map());
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass000.A0z(A0y);
                if (collection.contains(A0z.getValue())) {
                    newHashSet.add(A0z.getKey());
                }
            }
            return map().keySet().removeAll(newHashSet);
        }
    }

    public boolean retainAll(Collection collection) {
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet newHashSet = C90734ei.newHashSet();
            Iterator A0y = AnonymousClass000.A0y(map());
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass000.A0z(A0y);
                if (collection.contains(A0z.getValue())) {
                    newHashSet.add(A0z.getKey());
                }
            }
            return map().keySet().retainAll(newHashSet);
        }
    }

    public int size() {
        return map().size();
    }
}
