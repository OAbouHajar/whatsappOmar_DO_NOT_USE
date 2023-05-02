package X;

import android.util.Log;

/* renamed from: X.4ca  reason: invalid class name and case insensitive filesystem */
public class C89634ca {
    public static volatile AnonymousClass44q A00;

    public static void A00() {
        if (A00 == null) {
            synchronized (C89634ca.class) {
                if (A00 == null) {
                    A00 = new AnonymousClass44q();
                }
            }
        }
    }

    public static void A01(String str) {
        A00();
        if (C814548h.A00) {
            Log.e(AnonymousClass000.A0h(str, AnonymousClass000.A0q("RenderCore:")), "More than 4 recursive mount attempts. Skipping mounting the latest version.", (Throwable) null);
        }
    }
}
