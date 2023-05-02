package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.0AE  reason: invalid class name */
public class AnonymousClass0AE extends BroadcastReceiver {
    public final /* synthetic */ AnonymousClass09W A00;

    public AnonymousClass0AE(AnonymousClass09W r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        if (intent == null || !intent.getBooleanExtra("noConnectivity", false)) {
            this.A00.invalidate();
        }
    }
}
