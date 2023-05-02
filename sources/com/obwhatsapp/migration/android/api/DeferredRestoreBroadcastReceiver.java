package com.obwhatsapp.migration.android.api;

import X.AnonymousClass000;
import X.AnonymousClass00F;
import X.AnonymousClass11I;
import X.AnonymousClass2IF;
import X.C13690nt;
import X.C14710pd;
import X.C16040sK;
import X.C16150sX;
import X.C16490t9;
import X.C16620tM;
import X.C74783r6;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

public class DeferredRestoreBroadcastReceiver extends BroadcastReceiver {
    public C16040sK A00;
    public AnonymousClass11I A01;
    public C14710pd A02;
    public C16490t9 A03;
    public final Object A04;
    public volatile boolean A05;

    public DeferredRestoreBroadcastReceiver() {
        this(0);
    }

    public DeferredRestoreBroadcastReceiver(int i2) {
        this.A05 = false;
        this.A04 = C13690nt.A0Y();
    }

    public void onReceive(Context context, Intent intent) {
        String str;
        if (!this.A05) {
            synchronized (this.A04) {
                if (!this.A05) {
                    C16150sX A002 = AnonymousClass2IF.A00(context);
                    this.A02 = C16150sX.A0k(A002);
                    this.A00 = C16150sX.A04(A002);
                    this.A03 = C16150sX.A0m(A002);
                    this.A01 = (AnonymousClass11I) A002.AJc.get();
                    this.A05 = true;
                }
            }
        }
        Log.i("DeferredRestoreBroadcastReceiver/on-receive");
        if (intent != null && "com.google.android.apps.pixelmigrate.IOS_APP_DATA_AVAILABLE".equals(intent.getAction())) {
            if (!this.A02.A0E(C16620tM.A02, 835)) {
                str = "DeferredRestoreBroadcastReceiver/sendWamEventIfApplicable/did not send data because ab prop is not enabled";
            } else {
                C74783r6 r4 = new C74783r6();
                C16040sK r0 = this.A00;
                r0.A0B();
                boolean z2 = false;
                r4.A01 = Boolean.valueOf(AnonymousClass000.A1V(r0.A00));
                try {
                    if (this.A01.A00("cross_platform_migration_completed", 0) != 0) {
                        z2 = true;
                    }
                    r4.A00 = Boolean.valueOf(z2);
                } catch (RuntimeException e2) {
                    Log.e("DeferredRestoreBroadcastReceiver/sendWamEventIfApplicable/", e2);
                    r4.A00 = Boolean.FALSE;
                }
                this.A03.A0B(r4, new AnonymousClass00F(1, 1), true);
                str = "DeferredRestoreBroadcastReceiver/sendWamEventIfApplicable/sent wam event";
            }
            Log.i(str);
        }
    }
}
