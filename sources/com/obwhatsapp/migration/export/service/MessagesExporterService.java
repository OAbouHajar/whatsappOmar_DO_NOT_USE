package com.obwhatsapp.migration.export.service;

import X.AnonymousClass006;
import X.AnonymousClass54H;
import X.AnonymousClass54I;
import X.C103004zs;
import X.C13690nt;
import X.C16150sX;
import X.C16330sr;
import X.C17320ut;
import X.C59132uj;
import X.C605634a;
import X.C615039e;
import android.content.Intent;
import android.os.IBinder;
import com.whatsapp.util.Log;

public class MessagesExporterService extends C605634a implements AnonymousClass006 {
    public C16330sr A00;
    public C615039e A01;
    public C17320ut A02;
    public C103004zs A03;
    public boolean A04 = false;
    public final Object A05 = C13690nt.A0Y();
    public volatile AnonymousClass54I A06;

    public final Object generatedComponent() {
        if (this.A06 == null) {
            synchronized (this.A05) {
                if (this.A06 == null) {
                    this.A06 = new AnonymousClass54I(this);
                }
            }
        }
        return this.A06.generatedComponent();
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        if (!this.A04) {
            this.A04 = true;
            C59132uj r2 = (C59132uj) ((AnonymousClass54H) generatedComponent());
            C16150sX r1 = r2.A04;
            this.A01 = C16150sX.A00(r1);
            this.A02 = C16150sX.A1B(r1);
            this.A00 = (C16330sr) r1.A85.get();
            this.A02 = (C17320ut) r1.AFc.get();
            this.A01 = r2.A02();
        }
        super.onCreate();
        C103004zs r12 = new C103004zs(this);
        this.A03 = r12;
        this.A02.A02(r12);
    }

    public void onDestroy() {
        Log.i("xpm-export-service-onDestroy()");
        super.onDestroy();
        this.A02.A03(this.A03);
        stopForeground(false);
    }
}
