package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: X.0uz  reason: invalid class name and case insensitive filesystem */
public abstract class C17380uz<E> extends C17390v0<E> implements Set<E> {
    public transient C34641kb asList;

    public static C18390wc builderWithExpectedSize(int i2) {
        C29011Zs.checkNonnegative(i2, "expectedSize");
        return new C18390wc(i2);
    }

    public static int chooseTableSize(int i2) {
        int max = Math.max(i2, 2);
        boolean z2 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z2 = false;
        }
        if (z2) {
            return 1073741824;
        }
        throw new IllegalArgumentException(String.valueOf("collection too large"));
    }

    public static C17380uz construct(int i2, Object... objArr) {
        Object[] objArr2 = objArr;
        if (i2 == 0) {
            return of();
        }
        if (i2 == 1) {
            return of(objArr[0]);
        }
        int chooseTableSize = chooseTableSize(i2);
        Object[] objArr3 = new Object[chooseTableSize];
        int i3 = chooseTableSize - 1;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            Object obj = objArr[i6];
            AnonymousClass2CC.checkElementNotNull(obj, i6);
            int hashCode = obj.hashCode();
            int smear = C29041Zv.smear(hashCode);
            while (true) {
                int i7 = smear & i3;
                Object obj2 = objArr3[i7];
                if (obj2 != null) {
                    if (obj2.equals(obj)) {
                        break;
                    }
                    smear++;
                } else {
                    objArr[i5] = obj;
                    objArr3[i7] = obj;
                    i4 += hashCode;
                    i5++;
                    break;
                }
            }
        }
        Arrays.fill(objArr, i5, i2, (Object) null);
        if (i5 == 1) {
            return new C67903cZ(objArr[0]);
        }
        if (chooseTableSize(i5) < (chooseTableSize >> 1)) {
            return construct(i5, objArr);
        }
        if (shouldTrim(i5, objArr.length)) {
            objArr2 = Arrays.copyOf(objArr, i5);
        }
        return new AnonymousClass2CD(objArr2, i4, objArr3, i3, i5);
    }

    public static C17380uz copyOf(Collection collection) {
        if ((collection instanceof C17380uz) && !(collection instanceof SortedSet)) {
            C17380uz r1 = (C17380uz) collection;
            if (!r1.isPartialView()) {
                return r1;
            }
        }
        Object[] array = collection.toArray();
        return construct(array.length, array);
    }

    public static C17380uz copyOf(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? construct(length, (Object[]) objArr.clone()) : of(objArr[0]) : of();
    }

    public static C17380uz of() {
        return AnonymousClass2CD.EMPTY;
    }

    public static C17380uz of(Object obj) {
        return new C67903cZ(obj);
    }

    public static C17380uz of(Object obj, Object obj2) {
        return construct(2, obj, obj2);
    }

    public static C17380uz of(Object obj, Object obj2, Object obj3) {
        return construct(3, obj, obj2, obj3);
    }

    public static C17380uz of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length;
        boolean z2 = false;
        if (length <= 2147483641) {
            z2 = true;
        }
        if (z2) {
            int i2 = length + 6;
            Object[] objArr2 = new Object[i2];
            objArr2[0] = obj;
            objArr2[1] = obj2;
            objArr2[2] = obj3;
            objArr2[3] = obj4;
            objArr2[4] = obj5;
            objArr2[5] = obj6;
            System.arraycopy(objArr, 0, objArr2, 6, length);
            return construct(i2, objArr2);
        }
        throw new IllegalArgumentException(String.valueOf("the total number of elements must fit in an int"));
    }

    public static boolean shouldTrim(int i2, int i3) {
        return i2 < (i3 >> 1) + (i3 >> 2);
    }

    public C34641kb asList() {
        C34641kb r0 = this.asList;
        if (r0 != null) {
            return r0;
        }
        C34641kb createAsList = createAsList();
        this.asList = createAsList;
        return createAsList;
    }

    public C34641kb createAsList() {
        return C34641kb.asImmutableList(toArray());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17380uz) || !isHashCodeFast() || !((C17380uz) obj).isHashCodeFast() || hashCode() == obj.hashCode()) {
            return C90734ei.equalsImpl(this, obj);
        }
        return false;
    }

    public int hashCode() {
        return C90734ei.hashCodeImpl(this);
    }

    public boolean isHashCodeFast() {
        return false;
    }

    public abstract C28031Ub iterator();

    public Object writeReplace() {
        return new C1041654e(toArray());
    }
}
