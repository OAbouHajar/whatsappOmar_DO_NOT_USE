package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: X.3Ke  reason: invalid class name and case insensitive filesystem */
public final class C63573Ke extends BroadcastReceiver {
    public Context A00;
    public final AnonymousClass4PL A01;

    public C63573Ke(AnonymousClass4PL r1) {
        this.A01 = r1;
    }

    public final synchronized void A00() {
        Context context = this.A00;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.A00 = null;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.A01.A00();
            A00();
        }
    }
}
