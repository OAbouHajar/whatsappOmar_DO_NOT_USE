package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;

/* renamed from: X.0yG  reason: invalid class name and case insensitive filesystem */
public class C19330yG extends BroadcastReceiver {
    public final Context A00;
    public final C18260wP A01;
    public final C19310yE A02;
    public final AnonymousClass01V A03;
    public final C16440t3 A04;
    public final C20260zl A05;

    public C19330yG(Context context, C18260wP r2, C19310yE r3, AnonymousClass01V r4, C16440t3 r5, C20260zl r6) {
        this.A04 = r5;
        this.A00 = context;
        this.A05 = r6;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public static AnonymousClass1UW A00(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return null;
        }
        boolean z2 = true;
        boolean z3 = false;
        if (networkInfo.getType() == 1) {
            z3 = true;
        }
        if (networkInfo.getType() != 0) {
            z2 = false;
        }
        return new AnonymousClass1UW(networkInfo.getTypeName(), networkInfo.getSubtypeName(), networkInfo.getSubtype(), z3, z2, networkInfo.isConnected(), networkInfo.isRoaming());
    }

    public static /* synthetic */ void A01(C19330yG r6) {
        boolean A022 = (Build.VERSION.SDK_INT < 29 || !r6.A05.A00.A0E(C16620tM.A02, 614)) ? false : r6.A02();
        AnonymousClass1UW A002 = A00(r6.A02.A01());
        long A003 = r6.A04.A00();
        if (Build.VERSION.SDK_INT < 29 || !A022) {
            r6.A00.registerReceiver(r6, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } else {
            r6.A01.A08(A002);
        }
        r6.A01.A09(AnonymousClass1UX.A00(A002, A003));
    }

    public final boolean A02() {
        AnonymousClass01V r1 = this.A03;
        AnonymousClass01V.A0P = true;
        ConnectivityManager A0H = r1.A0H();
        TelephonyManager A0N = r1.A0N();
        AnonymousClass01V.A0P = false;
        return this.A01.A0D(A0H, A0N);
    }

    public void onReceive(Context context, Intent intent) {
        C18260wP r3 = this.A01;
        r3.A09(AnonymousClass1UX.A00(r3.A06(), this.A04.A00()));
    }
}
