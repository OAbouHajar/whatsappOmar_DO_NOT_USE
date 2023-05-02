package X;

import android.util.SparseArray;

/* renamed from: X.5qW  reason: invalid class name and case insensitive filesystem */
public class C115915qW {
    public final C31201dg A00;

    public C115915qW(C31201dg r5) {
        C31201dg r2 = new C31201dg(13535);
        this.A00 = r2;
        C31201dg r0 = (C31201dg) r5.A02.get(35);
        if (r0 != null) {
            AnonymousClass2Wa A01 = AnonymousClass2Wa.A01(r0);
            SparseArray sparseArray = r2.A02;
            sparseArray.put(35, A01);
            sparseArray.put(38, r5.A0H(38));
            sparseArray.put(36, r5.A0K(36, ""));
            sparseArray.put(46, r5.A0K(46, ""));
            sparseArray.put(48, r5.A0K(48, ""));
            sparseArray.put(45, r5.A0H(45));
            return;
        }
        throw AnonymousClass000.A0V("Null content for BottomSheet");
    }
}
