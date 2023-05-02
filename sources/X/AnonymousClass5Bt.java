package X;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* renamed from: X.5Bt  reason: invalid class name */
public abstract class AnonymousClass5Bt<K, V> extends AbstractMap<K, V> {
    public transient Set entrySet;
    public transient Collection values;

    public abstract Set createEntrySet();

    public Collection createValues() {
        return new C105825Bi(this);
    }

    public Set entrySet() {
        Set set = this.entrySet;
        if (set != null) {
            return set;
        }
        Set createEntrySet = createEntrySet();
        this.entrySet = createEntrySet;
        return createEntrySet;
    }

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
