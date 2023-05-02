package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;

/* renamed from: X.0H1  reason: invalid class name */
public final class AnonymousClass0H1 extends AnonymousClass0H2 {
    public final ConnectivityManager A00;

    public AnonymousClass0H1(Context context, AnonymousClass04d r4) {
        super(context, r4);
        Object systemService = this.A01.getSystemService("connectivity");
        C18450wi.A0M(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.A00 = (ConnectivityManager) systemService;
    }

    public /* bridge */ /* synthetic */ Object A02() {
        return C06320Vg.A00(this.A00);
    }

    public IntentFilter A07() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    public void A08(Intent intent) {
        if (C18450wi.A0R(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            C06530Wm.A00().A02(C06320Vg.A00, "Network broadcast received");
            A06(C06320Vg.A00(this.A00));
        }
    }
}
