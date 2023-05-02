package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.builders.AbstractMapBuilderEntrySet;

/* renamed from: X.5Cm  reason: invalid class name and case insensitive filesystem */
public final class C106095Cm<K, V> extends AbstractMapBuilderEntrySet<Map.Entry<K, V>, K, V> {
    public final AnonymousClass28m A00;

    public C106095Cm(AnonymousClass28m r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw C13680ns.A0m();
    }

    public boolean addAll(Collection collection) {
        throw C13680ns.A0m();
    }

    public void clear() {
        this.A00.clear();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C18450wi.A0H(entry, 0);
        return this.A00.A06(entry);
    }

    public boolean containsAll(Collection collection) {
        C18450wi.A0H(collection, 0);
        AnonymousClass28m r2 = this.A00;
        for (Object next : collection) {
            if (next == null) {
                return false;
            }
            try {
                if (!r2.A06((Map.Entry) next)) {
                    return false;
                }
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public Iterator iterator() {
        return new C106125Cp(this.A00);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C18450wi.A0H(entry, 0);
        AnonymousClass28m r3 = this.A00;
        r3.A02();
        int A01 = r3.A01(entry.getKey());
        if (A01 < 0) {
            return false;
        }
        Object[] objArr = r3.valuesArray;
        C18450wi.A0F(objArr);
        if (!C18450wi.A0R(objArr[A01], entry.getValue())) {
            return false;
        }
        r3.A05(A01);
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.5Cm, java.util.AbstractSet] */
    public boolean removeAll(Collection collection) {
        C18450wi.A0H(collection, 0);
        this.A00.A02();
        return C106095Cm.super.removeAll(collection);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.5Cm, java.util.AbstractSet] */
    public boolean retainAll(Collection collection) {
        C18450wi.A0H(collection, 0);
        this.A00.A02();
        return C106095Cm.super.retainAll(collection);
    }
}
