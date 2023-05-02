package X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;

/* renamed from: X.4qV  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C97754qV implements C108375Ns {
    public final /* synthetic */ AnonymousClass2PT A00;
    public final /* synthetic */ C96224nz A01;

    public /* synthetic */ C97754qV(AnonymousClass2PT r1, C96224nz r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void AIY(C86294Sb r7, Object obj) {
        boolean z2;
        C65643Vo r72 = (C65643Vo) r7;
        SparseArray sparseArray = this.A01.A03;
        SparseArray sparseArray2 = r72.A00;
        sparseArray2.clear();
        int i2 = 0;
        while (true) {
            SparseBooleanArray sparseBooleanArray = r72.A00;
            if (i2 < sparseBooleanArray.size()) {
                if (i2 >= 0) {
                    z2 = true;
                    if (i2 < sparseBooleanArray.size()) {
                        C90524eJ.A03(z2);
                        int keyAt = sparseBooleanArray.keyAt(i2);
                        sparseArray2.append(keyAt, sparseArray.get(keyAt));
                        i2++;
                    }
                }
                z2 = false;
                C90524eJ.A03(z2);
                int keyAt2 = sparseBooleanArray.keyAt(i2);
                sparseArray2.append(keyAt2, sparseArray.get(keyAt2));
                i2++;
            } else {
                throw AnonymousClass000.A0W("onEvents");
            }
        }
    }
}
