package X;

import android.os.Build;

/* renamed from: X.0Gx  reason: invalid class name and case insensitive filesystem */
public final class C03020Gx extends C08110d4 {
    public static final String A00;

    static {
        String A01 = C06530Wm.A01("NetworkNotRoamingCtrlr");
        C18450wi.A0B(A01);
        A00 = A01;
    }

    public C03020Gx(AnonymousClass0V4 r1) {
        super(r1);
    }

    public static boolean A00(AnonymousClass0RR r4) {
        boolean z2;
        C18450wi.A0H(r4, 0);
        if (Build.VERSION.SDK_INT < 24) {
            C06530Wm.A00().A02(A00, "Not-roaming network constraint is not supported before API 24, only checking for connected state.");
            z2 = r4.A00;
        } else {
            if (r4.A00) {
                z2 = r4.A02;
            }
        }
        return !z2;
    }

    public boolean A01(C007303i r3) {
        C18450wi.A0H(r3, 0);
        return AnonymousClass000.A1Y(r3.A0A.A02, AnonymousClass041.NOT_ROAMING);
    }

    public /* bridge */ /* synthetic */ boolean A02(Object obj) {
        return A00((AnonymousClass0RR) obj);
    }
}
