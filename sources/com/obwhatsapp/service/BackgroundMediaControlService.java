package com.obwhatsapp.service;

import X.AnonymousClass006;
import X.AnonymousClass2DT;
import X.AnonymousClass54H;
import X.AnonymousClass54I;
import X.C19610yi;
import X.C28311Vk;
import X.C59132uj;
import android.content.Intent;
import android.os.IBinder;

public class BackgroundMediaControlService extends C28311Vk implements AnonymousClass006 {
    public C19610yi A00;
    public boolean A01;
    public final Object A02;
    public volatile AnonymousClass54I A03;

    public BackgroundMediaControlService() {
        this(0);
    }

    public BackgroundMediaControlService(int i2) {
        this.A02 = new Object();
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
        return null;
    }

    public void onCreate() {
        if (!this.A01) {
            this.A01 = true;
            this.A00 = (C19610yi) ((C59132uj) ((AnonymousClass54H) generatedComponent())).A04.AEq.get();
        }
        super.onCreate();
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        String action = intent != null ? intent.getAction() : null;
        AnonymousClass2DT A002 = this.A00.A00();
        if (action != null) {
            if (action.equals("com.obwhatsapp.service.BackgroundMediaControlService.STOP")) {
                this.A00.A04();
            } else if (action.equals("com.obwhatsapp.service.BackgroundMediaControlService.START") && A002 != null) {
                A002.A0B(AnonymousClass2DT.A0x, true, false);
            }
        }
        stopSelf();
        return 2;
    }
}
