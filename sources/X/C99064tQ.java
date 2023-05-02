package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4tQ  reason: invalid class name and case insensitive filesystem */
public abstract class C99064tQ implements AnonymousClass5T4 {
    public transient Map asMap;
    public transient Set keySet;
    public transient Collection values;

    public Map asMap() {
        Map map = this.asMap;
        if (map != null) {
            return map;
        }
        Map createAsMap = createAsMap();
        this.asMap = createAsMap;
        return createAsMap;
    }

    public boolean containsValue(Object obj) {
        Iterator A0q = C13680ns.A0q(asMap());
        while (A0q.hasNext()) {
            if (((Collection) A0q.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map createAsMap();

    public abstract Set createKeySet();

    public abstract Collection createValues();

    public boolean equals(Object obj) {
        return C87534Xh.equalsImpl(this, obj);
    }

    public int hashCode() {
        return asMap().hashCode();
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1P(size());
    }

    public Set keySet() {
        Set set = this.keySet;
        if (set != null) {
            return set;
        }
        Set createKeySet = createKeySet();
        this.keySet = createKeySet;
        return createKeySet;
    }

    public abstract boolean put(Object obj, Object obj2);

    public String toString() {
        return asMap().toString();
    }

    public abstract Iterator valueIterator();

    public Collection values() {
        Collection collection = this.values;
        if (collection != null) {
            return collection;
        }
        Collection createValues = createValues();
        this.values = createValues;
        return createValues;
    }
}
