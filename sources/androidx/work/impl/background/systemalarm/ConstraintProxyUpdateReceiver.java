package androidx.work.impl.background.systemalarm;

import X.AnonymousClass000;
import X.AnonymousClass022;
import X.C06530Wm;
import X.C10430h7;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final String A00 = C06530Wm.A01("ConstrntProxyUpdtRecvr");

    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            C06530Wm.A00().A02(A00, AnonymousClass000.A0h(action, AnonymousClass000.A0r("Ignoring unknown action ")));
        } else {
            AnonymousClass022.A01(context).A06.A8p(new C10430h7(goAsync(), context, intent, this));
        }
    }
}
