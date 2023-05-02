package X;

import android.os.Trace;

/* renamed from: X.4dm  reason: invalid class name and case insensitive filesystem */
public final class C90224dm {
    public static void A00() {
        if (AnonymousClass3C1.A01 >= 18) {
            A01();
        }
    }

    public static void A01() {
        Trace.endSection();
    }

    public static void A02(String str) {
        if (AnonymousClass3C1.A01 >= 18) {
            A03(str);
        }
    }

    public static void A03(String str) {
        Trace.beginSection(str);
    }
}
