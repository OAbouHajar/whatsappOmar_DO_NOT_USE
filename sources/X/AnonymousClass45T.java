package X;

import java.util.Arrays;
import java.util.Collection;

/* renamed from: X.45T  reason: invalid class name */
public final class AnonymousClass45T {
    public static int[] A00(Collection collection) {
        if (collection instanceof C105915Br) {
            C105915Br r4 = (C105915Br) collection;
            return Arrays.copyOfRange(r4.array, r4.start, r4.end);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = AnonymousClass000.A0D(array[i2]);
        }
        return iArr;
    }
}
