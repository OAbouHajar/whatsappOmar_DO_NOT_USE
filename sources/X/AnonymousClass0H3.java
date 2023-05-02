package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;

/* renamed from: X.0H3  reason: invalid class name */
public final class AnonymousClass0H3 extends AnonymousClass0V4 {
    public final ConnectivityManager A00;
    public final C02270Aq A01 = new C02270Aq(this);

    public AnonymousClass0H3(Context context, AnonymousClass04d r4) {
        super(context, r4);
        Object systemService = this.A01.getSystemService("connectivity");
        C18450wi.A0M(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.A00 = (ConnectivityManager) systemService;
    }

    public /* bridge */ /* synthetic */ Object A02() {
        return C06320Vg.A00(this.A00);
    }

    public void A03() {
        try {
            C06530Wm.A00().A02(C06320Vg.A00, "Registering network callback");
            AnonymousClass0MS.A00(this.A01, this.A00);
        } catch (IllegalArgumentException | SecurityException e2) {
            C06530Wm.A00();
            Log.e(C06320Vg.A00, "Received exception while registering network callback", e2);
        }
    }

    public void A04() {
        try {
            C06530Wm.A00().A02(C06320Vg.A00, "Unregistering network callback");
            C06260Va.A01(this.A01, this.A00);
        } catch (IllegalArgumentException | SecurityException e2) {
            C06530Wm.A00();
            Log.e(C06320Vg.A00, "Received exception while unregistering network callback", e2);
        }
    }
}
