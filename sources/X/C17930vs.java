package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.SortedMap;

/* renamed from: X.0vs  reason: invalid class name and case insensitive filesystem */
public abstract class C17930vs<K, V> implements Map<K, V>, Serializable {
    public static final Map.Entry[] EMPTY_ENTRY_ARRAY = new Map.Entry[0];
    public transient C17380uz entrySet;
    public transient C17380uz keySet;
    public transient C17390v0 values;

    public static AnonymousClass1C5 builder() {
        return new AnonymousClass1C5();
    }

    public static AnonymousClass1C5 builderWithExpectedSize(int i2) {
        C29011Zs.checkNonnegative(i2, "expectedSize");
        return new AnonymousClass1C5(i2);
    }

    public static C17930vs copyOf(Iterable iterable) {
        int i2 = 4;
        if (iterable instanceof Collection) {
            i2 = ((Collection) iterable).size();
        }
        AnonymousClass1C5 r0 = new AnonymousClass1C5(i2);
        r0.putAll(iterable);
        return r0.build();
    }

    public static C17930vs copyOf(Map map) {
        return (!(map instanceof C17930vs) || (map instanceof SortedMap)) ? copyOf((Iterable) map.entrySet()) : (C17930vs) map;
    }

    public static C17930vs of() {
        return C29021Zt.EMPTY;
    }

    public static C17930vs of(Object obj, Object obj2) {
        C29011Zs.checkEntryNotNull(obj, obj2);
        return C29021Zt.create(1, new Object[]{obj, obj2});
    }

    public static C17930vs of(Object obj, Object obj2, Object obj3, Object obj4) {
        C29011Zs.checkEntryNotNull(obj, obj2);
        C29011Zs.checkEntryNotNull(obj3, obj4);
        return C29021Zt.create(2, new Object[]{obj, obj2, obj3, obj4});
    }

    public static C17930vs of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        C29011Zs.checkEntryNotNull("BR", obj2);
        C29011Zs.checkEntryNotNull("IN", obj4);
        C29011Zs.checkEntryNotNull("SG", obj6);
        return C29021Zt.create(3, new Object[]{"BR", obj2, "IN", obj4, "SG", obj6});
    }

    public static C17930vs of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        C29011Zs.checkEntryNotNull(obj, obj2);
        C29011Zs.checkEntryNotNull(obj3, obj4);
        C29011Zs.checkEntryNotNull(obj5, obj6);
        C29011Zs.checkEntryNotNull(obj7, obj8);
        return C29021Zt.create(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8});
    }

    public static C17930vs of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        C29011Zs.checkEntryNotNull(obj, obj2);
        C29011Zs.checkEntryNotNull(obj3, obj4);
        C29011Zs.checkEntryNotNull(obj5, obj6);
        C29011Zs.checkEntryNotNull(obj7, obj8);
        C29011Zs.checkEntryNotNull(obj9, obj10);
        return C29021Zt.create(5, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10});
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract C17380uz createEntrySet();

    public abstract C17380uz createKeySet();

    public abstract C17390v0 createValues();

    public C17380uz entrySet() {
        C17380uz r0 = this.entrySet;
        if (r0 != null) {
            return r0;
        }
        C17380uz createEntrySet = createEntrySet();
        this.entrySet = createEntrySet;
        return createEntrySet;
    }

    public boolean equals(Object obj) {
        return C90814er.equalsImpl(this, obj);
    }

    public abstract Object get(Object obj);

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public int hashCode() {
        return C90734ei.hashCodeImpl(entrySet());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public C17380uz keySet() {
        C17380uz r0 = this.keySet;
        if (r0 != null) {
            return r0;
        }
        C17380uz createKeySet = createKeySet();
        this.keySet = createKeySet;
        return createKeySet;
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return C90814er.toStringImpl(this);
    }

    public C17390v0 values() {
        C17390v0 r0 = this.values;
        if (r0 != null) {
            return r0;
        }
        C17390v0 createValues = createValues();
        this.values = createValues;
        return createValues;
    }

    public Object writeReplace() {
        return new C1041954h(this);
    }
}
