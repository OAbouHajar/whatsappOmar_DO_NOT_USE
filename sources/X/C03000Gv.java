package X;

import android.os.Build;

/* renamed from: X.0Gv  reason: invalid class name and case insensitive filesystem */
public final class C03000Gv extends C08110d4 {
    public C03000Gv(AnonymousClass0V4 r1) {
        super(r1);
    }

    public static boolean A00(AnonymousClass0RR r1) {
        C18450wi.A0H(r1, 0);
        return !r1.A00 || r1.A01;
    }

    public boolean A01(C007303i r4) {
        C18450wi.A0H(r4, 0);
        AnonymousClass041 r2 = r4.A0A.A02;
        if (r2 != AnonymousClass041.UNMETERED) {
            return Build.VERSION.SDK_INT >= 30 && r2 == AnonymousClass041.TEMPORARILY_UNMETERED;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ boolean A02(Object obj) {
        return A00((AnonymousClass0RR) obj);
    }
}
