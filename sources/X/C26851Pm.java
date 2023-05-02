package X;

import android.os.Build;
import android.telephony.TelephonyManager;

/* renamed from: X.1Pm  reason: invalid class name and case insensitive filesystem */
public class C26851Pm {
    public C56272nC A00;
    public final AnonymousClass01V A01;
    public final C16980tz A02;
    public final C16260sj A03;
    public final C15860rz A04;
    public final AnonymousClass1KP A05;
    public final C16320sq A06;

    public C26851Pm(AnonymousClass01V r1, C16980tz r2, C16260sj r3, C15860rz r4, AnonymousClass1KP r5, C16320sq r6) {
        this.A02 = r2;
        this.A06 = r6;
        this.A01 = r1;
        this.A03 = r3;
        this.A04 = r4;
        this.A05 = r5;
    }

    public static boolean A00(AnonymousClass01V r3, int i2) {
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        TelephonyManager A0N = r3.A0N();
        return (A0N == null || A0N.getSimState() != 1) && i2 == 1;
    }

    public void A01() {
        C56272nC r1 = this.A00;
        if (r1 != null) {
            this.A02.A00.unregisterReceiver(r1);
            this.A00 = null;
        }
    }
}
