package X;

import android.content.SharedPreferences;

/* renamed from: X.1Ah  reason: invalid class name and case insensitive filesystem */
public class C23051Ah {
    public final C16490t9 A00;
    public final C17020u3 A01;
    public final AnonymousClass12P A02;

    public C23051Ah(C16490t9 r1, C17020u3 r2, AnonymousClass12P r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public void A00(String str) {
        SharedPreferences A002 = this.A01.A00("ntp-scheduler");
        synchronized (this) {
            A002.edit().putInt(str, A002.getInt(str, 0) + 1).apply();
        }
    }
}
