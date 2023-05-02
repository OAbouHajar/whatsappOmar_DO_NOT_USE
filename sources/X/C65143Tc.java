package X;

import android.util.SparseIntArray;

/* renamed from: X.3Tc  reason: invalid class name and case insensitive filesystem */
public abstract class C65143Tc extends C95614mv {
    public final int[] A00;

    public C65143Tc(C12190jz r5, C88144a1 r6, AnonymousClass5Kx r7) {
        super(r5, r6, r7);
        SparseIntArray sparseIntArray = r6.A03;
        this.A00 = new int[sparseIntArray.size()];
        int i2 = 0;
        while (true) {
            int[] iArr = this.A00;
            if (i2 < iArr.length) {
                iArr[i2] = sparseIntArray.keyAt(i2);
                i2++;
            } else {
                return;
            }
        }
    }
}
