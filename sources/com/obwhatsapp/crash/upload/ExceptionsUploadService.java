package com.obwhatsapp.crash.upload;

import X.AnonymousClass006;
import X.AnonymousClass03I;
import X.AnonymousClass54H;
import X.AnonymousClass54I;
import X.C13690nt;
import X.C16150sX;
import X.C17080uV;
import X.C205510p;
import X.C205610q;
import X.C205710r;
import X.C205910t;
import X.C206010u;
import X.C59132uj;
import android.content.Intent;

public class ExceptionsUploadService extends AnonymousClass03I implements AnonymousClass006 {
    public C205910t A00;
    public C17080uV A01;
    public C205610q A02;
    public C206010u A03;
    public C205510p A04;
    public C205710r A05;
    public boolean A06;
    public final Object A07;
    public volatile AnonymousClass54I A08;

    public ExceptionsUploadService() {
        this(0);
    }

    public ExceptionsUploadService(int i2) {
        this.A07 = C13690nt.A0Y();
        this.A06 = false;
    }

    public void A05(Intent intent) {
    }

    public final Object generatedComponent() {
        if (this.A08 == null) {
            synchronized (this.A07) {
                if (this.A08 == null) {
                    this.A08 = new AnonymousClass54I(this);
                }
            }
        }
        return this.A08.generatedComponent();
    }

    public void onCreate() {
        if (!this.A06) {
            this.A06 = true;
            C16150sX r1 = ((C59132uj) ((AnonymousClass54H) generatedComponent())).A04;
            this.A02 = (C205610q) r1.A7y.get();
            this.A03 = (C206010u) r1.ACu.get();
            this.A00 = (C205910t) r1.A0C.get();
            this.A05 = (C205710r) r1.AG5.get();
            this.A04 = (C205510p) r1.AEV.get();
            this.A01 = (C17080uV) r1.APK.get();
        }
        super.onCreate();
    }
}
