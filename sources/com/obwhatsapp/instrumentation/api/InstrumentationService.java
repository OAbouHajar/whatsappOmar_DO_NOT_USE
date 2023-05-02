package com.obwhatsapp.instrumentation.api;

import X.AnonymousClass006;
import X.AnonymousClass10n;
import X.AnonymousClass54H;
import X.AnonymousClass54I;
import X.C13690nt;
import X.C15940sA;
import X.C16150sX;
import X.C205410o;
import X.C56382nY;
import X.C59132uj;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class InstrumentationService extends Service implements AnonymousClass006 {
    public AnonymousClass10n A00;
    public C205410o A01;
    public C15940sA A02;
    public boolean A03;
    public final C56382nY A04;
    public final Object A05;
    public volatile AnonymousClass54I A06;

    public InstrumentationService() {
        this(0);
        this.A04 = new C56382nY(this);
    }

    public InstrumentationService(int i2) {
        this.A05 = C13690nt.A0Y();
        this.A03 = false;
    }

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
        return this.A04;
    }

    public void onCreate() {
        if (!this.A03) {
            this.A03 = true;
            C16150sX r1 = ((C59132uj) ((AnonymousClass54H) generatedComponent())).A04;
            this.A01 = (C205410o) r1.ALo.get();
            this.A00 = (AnonymousClass10n) r1.AL3.get();
            this.A02 = (C15940sA) r1.ACj.get();
        }
        super.onCreate();
    }
}
