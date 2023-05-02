package com.obwhatsapp.appwidget;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass15P;
import X.AnonymousClass3DH;
import X.AnonymousClass54H;
import X.AnonymousClass54I;
import X.C13690nt;
import X.C16000sG;
import X.C16080sP;
import X.C16150sX;
import X.C16440t3;
import X.C218415q;
import X.C59132uj;
import android.content.Intent;
import android.widget.RemoteViewsService;

public class WidgetService extends RemoteViewsService implements AnonymousClass006 {
    public AnonymousClass15P A00;
    public C16000sG A01;
    public C16080sP A02;
    public C16440t3 A03;
    public AnonymousClass013 A04;
    public C218415q A05;
    public boolean A06;
    public final Object A07;
    public volatile AnonymousClass54I A08;

    public WidgetService() {
        this(0);
    }

    public WidgetService(int i2) {
        this.A07 = C13690nt.A0Y();
        this.A06 = false;
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
            this.A03 = C16150sX.A0U(r1);
            this.A00 = (AnonymousClass15P) r1.A0b.get();
            this.A01 = C16150sX.A0M(r1);
            this.A02 = C16150sX.A0Q(r1);
            this.A04 = C16150sX.A0Z(r1);
            this.A05 = (C218415q) r1.AGN.get();
        }
        super.onCreate();
    }

    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new AnonymousClass3DH(getApplicationContext(), this.A00, this.A01, this.A02, this.A03, this.A04, this.A05);
    }
}
