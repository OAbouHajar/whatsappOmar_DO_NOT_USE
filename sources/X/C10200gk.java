package X;

import android.util.Log;

/* renamed from: X.0gk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C10200gk implements Runnable {
    public final /* synthetic */ C12290k9 A00;
    public final /* synthetic */ C009704q A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C10200gk(C12290k9 r1, C009704q r2, String str) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
    }

    public final void run() {
        C009704q r0 = this.A01;
        C12290k9 r4 = this.A00;
        String str = this.A02;
        if (r0 != null) {
            try {
                if (((C009604p) r0).A02.A00(C011005f.CREATED)) {
                    r4.A86();
                    return;
                }
            } catch (C03930Kl e2) {
                Log.e("CarApp.Dispatch", AnonymousClass000.A0h(str, AnonymousClass000.A0r("Serialization failure in ")), e2);
                return;
            }
        }
        Log.w("CarApp.Dispatch", AnonymousClass000.A0e(r4, "Lifecycle is not at least created when dispatching ", AnonymousClass000.A0o()));
    }
}
