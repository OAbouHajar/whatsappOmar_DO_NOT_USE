package X;

import android.util.SparseIntArray;

/* renamed from: X.3Te  reason: invalid class name and case insensitive filesystem */
public class C65163Te extends C95614mv implements C13560ma {
    public final int[] A00;

    public C65163Te(C12190jz r5, C88144a1 r6, AnonymousClass5Kx r7) {
        super(r5, r6, r7);
        SparseIntArray sparseIntArray = r6.A03;
        this.A00 = new int[sparseIntArray.size()];
        for (int i2 = 0; i2 < sparseIntArray.size(); i2++) {
            this.A00[i2] = sparseIntArray.keyAt(i2);
        }
    }
}
