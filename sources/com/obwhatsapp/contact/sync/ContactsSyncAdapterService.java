package com.obwhatsapp.contact.sync;

import X.AnonymousClass006;
import X.AnonymousClass54H;
import X.AnonymousClass54I;
import X.C13690nt;
import X.C206110v;
import X.C28311Vk;
import X.C59132uj;
import android.content.Intent;
import android.os.IBinder;

public class ContactsSyncAdapterService extends C28311Vk implements AnonymousClass006 {
    public C206110v A00;
    public boolean A01;
    public final Object A02;
    public volatile AnonymousClass54I A03;

    public ContactsSyncAdapterService() {
        this(0);
    }

    public ContactsSyncAdapterService(int i2) {
        this.A02 = C13690nt.A0Y();
        this.A01 = false;
    }

    public final Object generatedComponent() {
        if (this.A03 == null) {
            synchronized (this.A02) {
                if (this.A03 == null) {
                    this.A03 = new AnonymousClass54I(this);
                }
            }
        }
        return this.A03.generatedComponent();
    }

    public IBinder onBind(Intent intent) {
        return this.A00.getSyncAdapterBinder();
    }

    public void onCreate() {
        if (!this.A01) {
            this.A01 = true;
            this.A00 = (C206110v) ((C59132uj) ((AnonymousClass54H) generatedComponent())).A04.A56.get();
        }
        super.onCreate();
    }
}
