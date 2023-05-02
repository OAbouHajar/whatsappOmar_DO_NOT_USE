package X;

import android.util.SparseIntArray;

/* renamed from: X.0Q9  reason: invalid class name */
public abstract class AnonymousClass0Q9 {
    public final SparseIntArray A00 = new SparseIntArray();

    public abstract int A00(int i2);

    public int A01(int i2, int i3) {
        int A002 = A00(i2);
        if (A002 != i3) {
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                int A003 = A00(i5);
                i4 += A003;
                if (i4 == i3) {
                    i4 = 0;
                } else if (i4 > i3) {
                    i4 = A003;
                }
            }
            if (A002 + i4 <= i3) {
                return i4;
            }
        }
        return 0;
    }
}
