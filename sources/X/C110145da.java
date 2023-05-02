package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.5da  reason: invalid class name and case insensitive filesystem */
public class C110145da extends BroadcastReceiver {
    public final /* synthetic */ C112815jT A00;

    public C110145da(C112815jT r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        C112815jT r1 = this.A00;
        C35521m4 r0 = r1.A00;
        if (r0 != null) {
            r1.A01.A01((C111805hR) r0.A08, (AnonymousClass68R) null);
        } else {
            r1.A07.A06("onLibraryResult got resend otp but bankaccount is null");
        }
    }
}
