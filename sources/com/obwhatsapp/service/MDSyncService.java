package com.obwhatsapp.service;

import X.AnonymousClass01D;
import X.AnonymousClass01T;
import X.AnonymousClass1RS;
import X.AnonymousClass1WE;
import X.C16320sq;
import X.C16980tz;
import X.C23321Bn;
import X.C24931Hv;
import X.C28291Vi;
import android.content.Intent;
import android.os.IBinder;
import com.facebook.redex.IDxExecutorShape280S0100000_2_I0;
import com.facebook.redex.IDxNConsumerShape12S0101000_2_I0;
import com.facebook.redex.IDxProviderShape34S0000000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0400000_I0;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

public final class MDSyncService extends C28291Vi {
    public int A00;
    public RunnableRunnableShape0S0400000_I0 A01;
    public C24931Hv A02;
    public C16980tz A03;
    public AnonymousClass1RS A04;
    public C23321Bn A05;
    public C16320sq A06;
    public AnonymousClass1WE A07;
    public String A08 = null;
    public boolean A09;
    public boolean A0A = false;
    public final AnonymousClass01D A0B = new AnonymousClass01T((Object) null, new IDxProviderShape34S0000000_2_I0(3));

    public MDSyncService() {
        super("md-sync-service", true);
    }

    public final void A03(int i2) {
        StringBuilder sb = new StringBuilder("md-sync-service/showForegroundNotification startId:");
        sb.append(i2);
        Log.i(sb.toString());
        A01(i2, this.A02.A00(this.A08).A01(), 230176025);
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        Log.i("md-sync-service/onCreate");
        A00();
        super.onCreate();
    }

    public void onDestroy() {
        Log.i("md-sync-service/onDestroy");
        AnonymousClass1WE r1 = this.A07;
        if (r1 != null) {
            this.A04.A00.A02(r1);
            this.A07 = null;
        }
        RunnableRunnableShape0S0400000_I0 runnableRunnableShape0S0400000_I0 = this.A01;
        if (runnableRunnableShape0S0400000_I0 != null) {
            ((AtomicBoolean) runnableRunnableShape0S0400000_I0.A01).set(true);
            this.A01 = null;
        }
        stopForeground(true);
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        int i4;
        StringBuilder sb = new StringBuilder("md-sync-service/onStartCommand:");
        sb.append(intent);
        sb.append("; startId: ");
        sb.append(i3);
        Log.i(sb.toString());
        if (intent != null) {
            if ("com.obwhatsapp.service.MDSyncService.STOP_HISTORY_SYNC".equals(intent.getAction())) {
                this.A09 = false;
            } else if (!"com.obwhatsapp.service.MDSyncService.START_HISTORY_SYNC".equals(intent.getAction())) {
                if ("com.obwhatsapp.service.MDSyncService.RMR_STARTED".equals(intent.getAction())) {
                    i4 = this.A00 + 1;
                } else if ("com.obwhatsapp.service.MDSyncService.RMR_COMPLETED".equals(intent.getAction())) {
                    i4 = this.A00 - 1;
                }
                this.A00 = i4;
            } else if (this.A01 == null) {
                this.A09 = true;
                RunnableRunnableShape0S0400000_I0 runnableRunnableShape0S0400000_I0 = new RunnableRunnableShape0S0400000_I0(this.A04, this.A05);
                this.A01 = runnableRunnableShape0S0400000_I0;
                this.A06.Acl(runnableRunnableShape0S0400000_I0);
            }
        }
        A03(i3);
        if (!this.A09 && this.A00 <= 0) {
            this.A01.A01(this.A03.A00, MDSyncService.class);
        } else if (this.A07 == null) {
            IDxNConsumerShape12S0101000_2_I0 iDxNConsumerShape12S0101000_2_I0 = new IDxNConsumerShape12S0101000_2_I0(this, i3, 2);
            this.A07 = iDxNConsumerShape12S0101000_2_I0;
            this.A04.A05(iDxNConsumerShape12S0101000_2_I0, new IDxExecutorShape280S0100000_2_I0(this.A06, 2));
            return 1;
        }
        return 1;
    }
}
