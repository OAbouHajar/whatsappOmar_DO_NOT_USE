package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.0AC  reason: invalid class name */
public class AnonymousClass0AC extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
            C007803p.A00();
        }
    }
}
