package X;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.collections.AbstractMutableList;

/* renamed from: X.2dH  reason: invalid class name and case insensitive filesystem */
public final class C52182dH<E> extends AbstractMutableList<E> implements List<E>, RandomAccess, Serializable, C52192dI {
    public Object[] array;
    public final C52182dH backing;
    public boolean isReadOnly;
    public int length;
    public int offset;
    public final C52182dH root;

    public C52182dH(int i2, int i3) {
    }

    public C52182dH(C52182dH r1, C52182dH r2, Object[] objArr, int i2, int i3, boolean z2) {
        this.array = objArr;
        this.offset = i2;
        this.length = i3;
        this.isReadOnly = z2;
        this.backing = r1;
        this.root = r2;
    }

    public static final void A00(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            StringBuilder sb = new StringBuilder("index: ");
            sb.append(i2);
            sb.append(", size: ");
            sb.append(i3);
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }

    public static final void A01(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            StringBuilder sb = new StringBuilder("index: ");
            sb.append(i2);
            sb.append(", size: ");
            sb.append(i3);
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }

    private final Object writeReplace() {
        C52182dH r0;
        if (this.isReadOnly || ((r0 = this.root) != null && r0.isReadOnly)) {
            return new AnonymousClass54X(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    public final int A02(Collection collection, int i2, int i3, boolean z2) {
        C52182dH r0 = this.backing;
        if (r0 != null) {
            int A02 = r0.A02(collection, i2, i3, z2);
            this.length -= A02;
            return A02;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int i6 = i2 + i4;
            if (collection.contains(this.array[i6]) == z2) {
                Object[] objArr = this.array;
                i4++;
                objArr[i5 + i2] = objArr[i6];
                i5++;
            } else {
                i4++;
            }
        }
        int i7 = i3 - i5;
        Object[] objArr2 = this.array;
        int i8 = i3 + i2;
        int i9 = this.length;
        C18450wi.A0H(objArr2, 0);
        System.arraycopy(objArr2, i8, objArr2, i2 + i5, i9 - i8);
        Object[] objArr3 = this.array;
        int i10 = this.length;
        C813847y.A00(objArr3, i10 - i7, i10);
        this.length -= i7;
        return i7;
    }

    public final Object A03(int i2) {
        C52182dH r0 = this.backing;
        if (r0 != null) {
            this.length--;
            return r0.A03(i2);
        }
        Object[] objArr = this.array;
        Object obj = objArr[i2];
        int i3 = i2 + 1;
        System.arraycopy(objArr, i3, objArr, i2, (this.offset + this.length) - i3);
        Object[] objArr2 = this.array;
        C18450wi.A0H(objArr2, 0);
        objArr2[(this.offset + this.length) - 1] = null;
        this.length--;
        return obj;
    }

    public final void A04() {
        C52182dH r0;
        if (this.isReadOnly || ((r0 = this.root) != null && r0.isReadOnly)) {
            throw new UnsupportedOperationException();
        }
    }

    public final void A05(int i2, int i3) {
        int i4 = this.length + i3;
        if (this.backing != null) {
            throw new IllegalStateException();
        } else if (i4 >= 0) {
            Object[] objArr = this.array;
            int length2 = objArr.length;
            if (i4 > length2) {
                int i5 = length2 + (length2 >> 1);
                if (i5 - i4 < 0) {
                    i5 = i4;
                }
                if (i5 - 2147483639 > 0) {
                    i5 = 2147483639;
                    if (i4 > 2147483639) {
                        i5 = Integer.MAX_VALUE;
                    }
                }
                objArr = Arrays.copyOf(objArr, i5);
                C18450wi.A0B(objArr);
                this.array = objArr;
            }
            System.arraycopy(objArr, i2, objArr, i2 + i3, (this.offset + this.length) - i2);
            this.length += i3;
        } else {
            throw new OutOfMemoryError();
        }
    }

    public final void A06(int i2, int i3) {
        C52182dH r0 = this.backing;
        if (r0 != null) {
            r0.A06(i2, i3);
        } else {
            Object[] objArr = this.array;
            int i4 = i2 + i3;
            int i5 = this.length;
            C18450wi.A0H(objArr, 0);
            System.arraycopy(objArr, i4, objArr, i2, i5 - i4);
            Object[] objArr2 = this.array;
            int i6 = this.length;
            C813847y.A00(objArr2, i6 - i3, i6);
        }
        this.length -= i3;
    }

    public final void A07(int i2, Object obj) {
        C52182dH r1 = this.backing;
        if (r1 != null) {
            r1.A07(i2, obj);
            this.array = this.backing.array;
            this.length++;
            return;
        }
        A05(i2, 1);
        this.array[i2] = obj;
    }

    public final void A08(Collection collection, int i2, int i3) {
        C52182dH r0 = this.backing;
        if (r0 != null) {
            r0.A08(collection, i2, i3);
            this.array = this.backing.array;
            this.length += i3;
            return;
        }
        A05(i2, i3);
        Iterator it = collection.iterator();
        for (int i4 = 0; i4 < i3; i4++) {
            this.array[i2 + i4] = it.next();
        }
    }

    public void add(int i2, Object obj) {
        A04();
        A01(i2, this.length);
        A07(this.offset + i2, obj);
    }

    public boolean add(Object obj) {
        A04();
        A07(this.offset + this.length, obj);
        return true;
    }

    public boolean addAll(int i2, Collection collection) {
        C18450wi.A0H(collection, 1);
        A04();
        A01(i2, this.length);
        int size = collection.size();
        A08(collection, this.offset + i2, size);
        return size > 0;
    }

    public boolean addAll(Collection collection) {
        C18450wi.A0H(collection, 0);
        A04();
        int size = collection.size();
        A08(collection, this.offset + this.length, size);
        return size > 0;
    }

    public void clear() {
        A04();
        A06(this.offset, this.length);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        Object[] objArr = this.array;
        int i2 = this.offset;
        int i3 = this.length;
        if (i3 != list.size()) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C18450wi.A0R(objArr[i2 + i4], list.get(i4))) {
                return false;
            }
        }
        return true;
    }

    public Object get(int i2) {
        A00(i2, this.length);
        return this.array[this.offset + i2];
    }

    public int hashCode() {
        Object[] objArr = this.array;
        int i2 = this.offset;
        int i3 = this.length;
        int i4 = 1;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj = objArr[i2 + i5];
            i4 = (i4 * 31) + (obj == null ? 0 : obj.hashCode());
        }
        return i4;
    }

    public int indexOf(Object obj) {
        for (int i2 = 0; i2 < this.length; i2++) {
            if (C18450wi.A0R(this.array[this.offset + i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public Iterator iterator() {
        return new C1049457n(this, 0);
    }

    public int lastIndexOf(Object obj) {
        int i2 = this.length;
        do {
            i2--;
            if (i2 < 0) {
                return -1;
            }
        } while (!C18450wi.A0R(this.array[this.offset + i2], obj));
        return i2;
    }

    public ListIterator listIterator() {
        return new C1049457n(this, 0);
    }

    public ListIterator listIterator(int i2) {
        A01(i2, this.length);
        return new C1049457n(this, i2);
    }

    public final /* bridge */ Object remove(int i2) {
        A04();
        A00(i2, this.length);
        return A03(this.offset + i2);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractList, X.2dH] */
    public boolean remove(Object obj) {
        A04();
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public boolean removeAll(Collection collection) {
        C18450wi.A0H(collection, 0);
        A04();
        return A02(collection, this.offset, this.length, false) > 0;
    }

    public boolean retainAll(Collection collection) {
        C18450wi.A0H(collection, 0);
        A04();
        return A02(collection, this.offset, this.length, true) > 0;
    }

    public Object set(int i2, Object obj) {
        A04();
        A00(i2, this.length);
        Object[] objArr = this.array;
        int i3 = this.offset + i2;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    public final /* bridge */ int size() {
        return this.length;
    }

    public List subList(int i2, int i3) {
        int i4 = this.length;
        if (i2 < 0 || i3 > i4) {
            StringBuilder sb = new StringBuilder();
            sb.append("fromIndex: ");
            sb.append(i2);
            sb.append(", toIndex: ");
            sb.append(i3);
            sb.append(", size: ");
            sb.append(i4);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 <= i3) {
            Object[] objArr = this.array;
            int i5 = this.offset + i2;
            int i6 = i3 - i2;
            boolean z2 = this.isReadOnly;
            C52182dH r2 = this.root;
            if (r2 == null) {
                r2 = this;
            }
            return new C52182dH(this, r2, objArr, i5, i6, z2);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("fromIndex: ");
            sb2.append(i2);
            sb2.append(" > toIndex: ");
            sb2.append(i3);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public Object[] toArray() {
        Object[] objArr = this.array;
        int i2 = this.offset;
        int i3 = this.length + i2;
        C18450wi.A0H(objArr, 0);
        int length2 = objArr.length;
        if (i3 <= length2) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr, i2, i3);
            C18450wi.A0B(copyOfRange);
            return copyOfRange;
        }
        StringBuilder sb = new StringBuilder("toIndex (");
        sb.append(i3);
        sb.append(") is greater than size (");
        sb.append(length2);
        sb.append(").");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public Object[] toArray(Object[] objArr) {
        C18450wi.A0H(objArr, 0);
        int length2 = objArr.length;
        int i2 = this.length;
        Object[] objArr2 = this.array;
        if (length2 < i2) {
            int i3 = this.offset;
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i3, i2 + i3, objArr.getClass());
            C18450wi.A0B(copyOfRange);
            return copyOfRange;
        }
        int i4 = this.offset;
        C18450wi.A0H(objArr2, 0);
        System.arraycopy(objArr2, i4, objArr, 0, (i2 + i4) - i4);
        int i5 = this.length;
        if (length2 <= i5) {
            return objArr;
        }
        objArr[i5] = null;
        return objArr;
    }

    public String toString() {
        Object[] objArr = this.array;
        int i2 = this.offset;
        int i3 = this.length;
        StringBuilder sb = new StringBuilder((i3 * 3) + 2);
        sb.append("[");
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(objArr[i2 + i4]);
        }
        sb.append("]");
        String obj = sb.toString();
        C18450wi.A0B(obj);
        return obj;
    }
}
