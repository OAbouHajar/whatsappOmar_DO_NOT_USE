package X;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.4ck  reason: invalid class name and case insensitive filesystem */
public final class C89694ck {
    public static final Object[] A00 = new Object[0];

    public static final Object[] A00(Collection collection) {
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    objArr[i2] = it.next();
                    int length = objArr.length;
                    boolean hasNext = it.hasNext();
                    if (i3 >= length) {
                        if (!hasNext) {
                            return objArr;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            if (i3 < 2147483645) {
                                i4 = 2147483645;
                            } else {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i4);
                        C18450wi.A0B(objArr);
                    } else if (!hasNext) {
                        Object[] copyOf = Arrays.copyOf(objArr, i3);
                        C18450wi.A0B(copyOf);
                        return copyOf;
                    }
                    i2 = i3;
                }
            }
        }
        return A00;
    }

    public static final Object[] A01(Collection collection, Object[] objArr) {
        Object[] objArr2;
        int i2 = 0;
        int size = collection.size();
        int i3 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    if (newInstance != null) {
                        objArr2 = (Object[]) newInstance;
                    } else {
                        throw AnonymousClass000.A0W("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    }
                }
                while (true) {
                    i2++;
                    objArr2[i3] = it.next();
                    int length = objArr2.length;
                    boolean hasNext = it.hasNext();
                    if (i2 >= length) {
                        if (!hasNext) {
                            return objArr2;
                        }
                        int i4 = ((i2 * 3) + 1) >>> 1;
                        if (i4 <= i2) {
                            if (i2 < 2147483645) {
                                i4 = 2147483645;
                            } else {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i4);
                        C18450wi.A0B(objArr2);
                    } else if (!hasNext) {
                        if (objArr2 != objArr) {
                            Object[] copyOf = Arrays.copyOf(objArr2, i2);
                            C18450wi.A0B(copyOf);
                            return copyOf;
                        }
                    }
                    i3 = i2;
                }
                objArr[i2] = null;
                return objArr;
            }
        }
        if (objArr.length <= 0) {
            return objArr;
        }
        objArr[i2] = null;
        return objArr;
    }
}
