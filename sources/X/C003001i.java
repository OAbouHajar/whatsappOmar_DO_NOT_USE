package X;

import com.facebook.redex.IDxMCollectionsShape20S0100000_I0;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.01i  reason: invalid class name and case insensitive filesystem */
public final class C003001i<E> implements Collection<E>, Set<E> {
    public static int A04;
    public static int A05;
    public static Object[] A06;
    public static Object[] A07;
    public static final int[] A08 = new int[0];
    public static final Object[] A09 = new Object[0];
    public int A00;
    public AnonymousClass05D A01;
    public int[] A02;
    public Object[] A03;

    public C003001i(int i2) {
        if (i2 == 0) {
            this.A02 = A08;
            this.A03 = A09;
        } else {
            A04(i2);
        }
        this.A00 = 0;
    }

    public C003001i(Collection collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }

    public static void A00(int[] iArr, Object[] objArr, int i2) {
        int length = iArr.length;
        if (length == 8) {
            synchronized (C003001i.class) {
                int i3 = A05;
                if (i3 < 10) {
                    objArr[0] = A07;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    A07 = objArr;
                    A05 = i3 + 1;
                }
            }
        } else if (length == 4) {
            synchronized (C003001i.class) {
                int i5 = A04;
                if (i5 < 10) {
                    objArr[0] = A06;
                    objArr[1] = iArr;
                    for (int i6 = i2 - 1; i6 >= 2; i6--) {
                        objArr[i6] = null;
                    }
                    A06 = objArr;
                    A04 = i5 + 1;
                }
            }
        }
    }

    public final int A01() {
        int i2 = this.A00;
        if (i2 == 0) {
            return -1;
        }
        int[] iArr = this.A02;
        int A002 = AnonymousClass00R.A00(iArr, i2, 0);
        if (A002 >= 0) {
            Object[] objArr = this.A03;
            if (objArr[A002] != null) {
                int i3 = A002 + 1;
                while (i3 < i2 && iArr[i3] == 0) {
                    if (objArr[i3] == null) {
                        return i3;
                    }
                    i3++;
                }
                do {
                    A002--;
                    if (A002 < 0 || iArr[A002] != 0) {
                        return i3 ^ -1;
                    }
                } while (objArr[A002] != null);
                return A002;
            }
        }
        return A002;
    }

    public final int A02(Object obj, int i2) {
        int i3 = this.A00;
        if (i3 == 0) {
            return -1;
        }
        int A002 = AnonymousClass00R.A00(this.A02, i3, i2);
        if (A002 < 0 || obj.equals(this.A03[A002])) {
            return A002;
        }
        int i4 = A002 + 1;
        while (i4 < i3 && this.A02[i4] == i2) {
            if (obj.equals(this.A03[i4])) {
                return i4;
            }
            i4++;
        }
        do {
            A002--;
            if (A002 < 0 || this.A02[A002] != i2) {
                return i4 ^ -1;
            }
        } while (!obj.equals(this.A03[A002]));
        return A002;
    }

    public void A03(int i2) {
        Object[] objArr = this.A03;
        int i3 = this.A00;
        if (i3 <= 1) {
            A00(this.A02, objArr, i3);
            this.A02 = A08;
            this.A03 = A09;
            this.A00 = 0;
            return;
        }
        int[] iArr = this.A02;
        int length = iArr.length;
        int i4 = 8;
        if (length <= 8 || i3 >= length / 3) {
            int i5 = i3 - 1;
            this.A00 = i5;
            if (i2 < i5) {
                int i6 = i2 + 1;
                System.arraycopy(iArr, i6, iArr, i2, i5 - i2);
                Object[] objArr2 = this.A03;
                System.arraycopy(objArr2, i6, objArr2, i2, this.A00 - i2);
            }
            this.A03[this.A00] = null;
            return;
        }
        if (i3 > 8) {
            i4 = i3 + (i3 >> 1);
        }
        A04(i4);
        this.A00--;
        if (i2 > 0) {
            System.arraycopy(iArr, 0, this.A02, 0, i2);
            System.arraycopy(objArr, 0, this.A03, 0, i2);
        }
        int i7 = this.A00;
        if (i2 < i7) {
            int i8 = i2 + 1;
            System.arraycopy(iArr, i8, this.A02, i2, i7 - i2);
            System.arraycopy(objArr, i8, this.A03, i2, this.A00 - i2);
        }
    }

    public final void A04(int i2) {
        if (i2 == 8) {
            synchronized (C003001i.class) {
                Object[] objArr = A07;
                if (objArr != null) {
                    this.A03 = objArr;
                    A07 = (Object[]) objArr[0];
                    this.A02 = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    A05--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (C003001i.class) {
                Object[] objArr2 = A06;
                if (objArr2 != null) {
                    this.A03 = objArr2;
                    A06 = (Object[]) objArr2[0];
                    this.A02 = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    A04--;
                    return;
                }
            }
        }
        this.A02 = new int[i2];
        this.A03 = new Object[i2];
    }

    public boolean add(Object obj) {
        int hashCode;
        int A022;
        if (obj == null) {
            A022 = A01();
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
            A022 = A02(obj, hashCode);
        }
        if (A022 >= 0) {
            return false;
        }
        int i2 = A022 ^ -1;
        int i3 = this.A00;
        int[] iArr = this.A02;
        if (i3 >= iArr.length) {
            int i4 = 4;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i4 = 8;
            }
            Object[] objArr = this.A03;
            A04(i4);
            int[] iArr2 = this.A02;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.A03, 0, objArr.length);
            }
            A00(iArr, objArr, this.A00);
        }
        int i5 = this.A00;
        if (i2 < i5) {
            int[] iArr3 = this.A02;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.A03;
            System.arraycopy(objArr2, i2, objArr2, i6, this.A00 - i2);
        }
        this.A02[i2] = hashCode;
        this.A03[i2] = obj;
        this.A00++;
        return true;
    }

    public boolean addAll(Collection collection) {
        int size = this.A00 + collection.size();
        int[] iArr = this.A02;
        if (iArr.length < size) {
            Object[] objArr = this.A03;
            A04(size);
            int i2 = this.A00;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.A02, 0, i2);
                System.arraycopy(objArr, 0, this.A03, 0, this.A00);
            }
            A00(iArr, objArr, this.A00);
        }
        boolean z2 = false;
        for (Object add : collection) {
            z2 |= add(add);
        }
        return z2;
    }

    public void clear() {
        int i2 = this.A00;
        if (i2 != 0) {
            A00(this.A02, this.A03, i2);
            this.A02 = A08;
            this.A03 = A09;
            this.A00 = 0;
        }
    }

    public boolean contains(Object obj) {
        return (obj == null ? A01() : A02(obj, obj.hashCode())) >= 0;
    }

    public boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                if (size() == set.size()) {
                    int i2 = 0;
                    while (i2 < this.A00) {
                        try {
                            if (set.contains(this.A03[i2])) {
                                i2++;
                            }
                        } catch (ClassCastException | NullPointerException unused) {
                        }
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int[] iArr = this.A02;
        int i2 = this.A00;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public boolean isEmpty() {
        return this.A00 <= 0;
    }

    public Iterator iterator() {
        AnonymousClass05D r1 = this.A01;
        if (r1 == null) {
            r1 = new IDxMCollectionsShape20S0100000_I0(this, 1);
            this.A01 = r1;
        }
        AnonymousClass05E r0 = r1.A01;
        if (r0 == null) {
            r0 = new AnonymousClass05E(r1);
            r1.A01 = r0;
        }
        return r0.iterator();
    }

    public boolean remove(Object obj) {
        int A012 = obj == null ? A01() : A02(obj, obj.hashCode());
        if (A012 < 0) {
            return false;
        }
        A03(A012);
        return true;
    }

    public boolean removeAll(Collection collection) {
        boolean z2 = false;
        for (Object remove : collection) {
            z2 |= remove(remove);
        }
        return z2;
    }

    public boolean retainAll(Collection collection) {
        boolean z2 = false;
        for (int i2 = this.A00 - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.A03[i2])) {
                A03(i2);
                z2 = true;
            }
        }
        return z2;
    }

    public int size() {
        return this.A00;
    }

    public Object[] toArray() {
        int i2 = this.A00;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.A03, 0, objArr, 0, i2);
        return objArr;
    }

    public Object[] toArray(Object[] objArr) {
        if (objArr.length < this.A00) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.A00);
        }
        System.arraycopy(this.A03, 0, objArr, 0, this.A00);
        int length = objArr.length;
        int i2 = this.A00;
        if (length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.A00 * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.A00; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.A03[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
