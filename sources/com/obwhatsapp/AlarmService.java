package com.obwhatsapp;

import X.AnonymousClass000;
import X.AnonymousClass4X3;
import X.C13680ns;
import X.C57072q3;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Set;

public class AlarmService extends C57072q3 {
    public WhatsAppLibLoader A00;
    public Set A01;
    public volatile AnonymousClass4X3 A02;

    public boolean A04() {
        AnonymousClass4X3 r3 = this.A02;
        if (r3 == null) {
            return false;
        }
        boolean A03 = r3.A03();
        StringBuilder A0r = AnonymousClass000.A0r("AlarmService/onStopCurrentWork; retry=");
        A0r.append(A03);
        A0r.append(", handler= ");
        Log.i(AnonymousClass000.A0h(AnonymousClass000.A0d(r3), A0r));
        return A03;
    }

    public void A05(Intent intent) {
        String action = intent.getAction();
        Log.i(C13680ns.A0h("AlarmService/onHandleWork received intent with action ", action));
        if (action == null) {
            Log.w("AlarmService/onHandleWork received null action in intent");
        } else if (!this.A00.A03()) {
            Log.e("AlarmService/onHandleWork skip, native libraries missing");
        } else {
            try {
                if (!TextUtils.equals(action, "com.obwhatsapp.action.SETUP")) {
                    Iterator it = this.A01.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            Log.w(AnonymousClass000.A0e(intent, "AlarmService/onHandleWork: received unrecognized intent; intent=", AnonymousClass000.A0o()));
                            break;
                        }
                        AnonymousClass4X3 r2 = (AnonymousClass4X3) it.next();
                        if (r2.A04(intent)) {
                            StringBuilder A0o = AnonymousClass000.A0o();
                            A0o.append("AlarmService/onHandleWork: handling ");
                            A0o.append(action);
                            A0o.append(" using ");
                            Log.i(AnonymousClass000.A0h(AnonymousClass000.A0d(r2), A0o));
                            this.A02 = r2;
                            r2.A02(intent);
                            break;
                        }
                    }
                } else {
                    Log.i(AnonymousClass000.A0g("AlarmService/setup; intent=", intent));
                    for (AnonymousClass4X3 r22 : this.A01) {
                        Log.i(AnonymousClass000.A0h(AnonymousClass000.A0d(r22), AnonymousClass000.A0r("AlarmService/setup: ")));
                        r22.A01();
                    }
                }
            } finally {
                this.A02 = null;
            }
        }
    }
}
