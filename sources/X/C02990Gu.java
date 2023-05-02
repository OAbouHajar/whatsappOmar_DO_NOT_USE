package X;

import android.os.Build;

/* renamed from: X.0Gu  reason: invalid class name and case insensitive filesystem */
public final class C02990Gu extends C08110d4 {
    public C02990Gu(AnonymousClass0V4 r1) {
        super(r1);
    }

    public static boolean A00(AnonymousClass0RR r4) {
        C18450wi.A0H(r4, 0);
        int i2 = Build.VERSION.SDK_INT;
        boolean z2 = r4.A00;
        if (i2 >= 26) {
            if (!z2) {
                return true;
            }
            z2 = r4.A03;
        }
        return !z2;
    }

    public boolean A01(C007303i r3) {
        C18450wi.A0H(r3, 0);
        return AnonymousClass000.A1Y(r3.A0A.A02, AnonymousClass041.CONNECTED);
    }

    public /* bridge */ /* synthetic */ boolean A02(Object obj) {
        return A00((AnonymousClass0RR) obj);
    }
}
