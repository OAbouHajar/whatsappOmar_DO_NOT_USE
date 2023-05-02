package X;

import android.util.Log;

/* renamed from: X.0Wm  reason: invalid class name and case insensitive filesystem */
public class C06530Wm {
    public static final Object A01 = new Object();
    public static volatile C06530Wm A02;
    public final int A00;

    public C06530Wm(int i2) {
        this.A00 = i2;
    }

    public static C06530Wm A00() {
        C06530Wm r0;
        synchronized (A01) {
            if (A02 == null) {
                A02 = new C06530Wm(3);
            }
            r0 = A02;
        }
        return r0;
    }

    public static String A01(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            str = str.substring(0, 20);
        }
        return AnonymousClass000.A0h(str, sb);
    }

    public void A02(String str, String str2) {
        if (this.A00 <= 3) {
            Log.d(str, str2);
        }
    }
}
