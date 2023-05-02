package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.1kb  reason: invalid class name and case insensitive filesystem */
public abstract class C34641kb<E> extends C17390v0<E> implements List<E>, RandomAccess {
    public static final AnonymousClass2NP EMPTY_ITR = new AnonymousClass2NN(AnonymousClass2NM.EMPTY, 0);

    public static C34641kb asImmutableList(Object[] objArr) {
        return asImmutableList(objArr, objArr.length);
    }

    public static C34641kb asImmutableList(Object[] objArr, int i2) {
        return i2 == 0 ? of() : new AnonymousClass2NM(objArr, i2);
    }

    public static C67763cL builder() {
        return new C67763cL();
    }

    public static C34641kb construct(Object... objArr) {
        AnonymousClass2CC.checkElementsNotNull(objArr);
        return asImmutableList(objArr);
    }

    public static C34641kb copyOf(Collection collection) {
        if (!(collection instanceof C17390v0)) {
            return construct(collection.toArray());
        }
        C34641kb asList = ((C17390v0) collection).asList();
        return asList.isPartialView() ? asImmutableList(asList.toArray()) : asList;
    }

    public static C34641kb copyOf(Object[] objArr) {
        return objArr.length == 0 ? of() : construct((Object[]) objArr.clone());
    }

    public static C34641kb of() {
        return AnonymousClass2NM.EMPTY;
    }

    public static C34641kb of(Object obj) {
        return construct(obj);
    }

    public static C34641kb of(Object obj, Object obj2) {
        return construct(obj, obj2);
    }

    public static C34641kb of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return construct(obj, obj2, obj3, obj4, obj5);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Deprecated
    public final void add(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final C34641kb asList() {
        return this;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public int copyIntoArray(Object[] objArr, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i2 + i3] = get(i3);
        }
        return i2 + size;
    }

    public boolean equals(Object obj) {
        return AnonymousClass3Bv.equalsImpl(this, obj);
    }

    public int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            i2 = (((i2 * 31) + get(i3).hashCode()) ^ -1) ^ -1;
        }
        return i2;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return AnonymousClass3Bv.indexOfImpl(this, obj);
    }

    public C28031Ub iterator() {
        return listIterator();
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return AnonymousClass3Bv.lastIndexOfImpl(this, obj);
    }

    public AnonymousClass2NP listIterator() {
        return listIterator(0);
    }

    public AnonymousClass2NP listIterator(int i2) {
        C29031Zu.A02(i2, size());
        return isEmpty() ? EMPTY_ITR : new AnonymousClass2NN(this, i2);
    }

    @Deprecated
    public final Object remove(int i2) {
        throw new UnsupportedOperationException();
    }

    public C34641kb reverse() {
        return size() <= 1 ? this : new C58112ss(this);
    }

    @Deprecated
    public final Object set(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    public C34641kb subList(int i2, int i3) {
        C29031Zu.A03(i2, i3, size());
        int i4 = i3 - i2;
        return i4 == size() ? this : i4 == 0 ? of() : subListUnchecked(i2, i3);
    }

    public C34641kb subListUnchecked(int i2, int i3) {
        return new C67793cO(this, i2, i3 - i2);
    }

    public Object writeReplace() {
        return new C1041554d(toArray());
    }
}
