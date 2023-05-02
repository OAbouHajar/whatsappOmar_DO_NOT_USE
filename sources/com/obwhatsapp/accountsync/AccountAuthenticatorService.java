package com.obwhatsapp.accountsync;

import X.AnonymousClass006;
import X.AnonymousClass3K5;
import X.AnonymousClass54I;
import X.C13690nt;
import X.C28311Vk;
import android.content.Intent;
import android.os.IBinder;

public class AccountAuthenticatorService extends C28311Vk implements AnonymousClass006 {
    public static AnonymousClass3K5 A03;
    public boolean A00;
    public final Object A01;
    public volatile AnonymousClass54I A02;

    public AccountAuthenticatorService() {
        this(0);
    }

    public AccountAuthenticatorService(int i2) {
        this.A01 = C13690nt.A0Y();
        this.A00 = false;
    }

    public final Object generatedComponent() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    this.A02 = new AnonymousClass54I(this);
                }
            }
        }
        return this.A02.generatedComponent();
    }

    public IBinder onBind(Intent intent) {
        if (!"android.accounts.AccountAuthenticator".equals(intent.getAction())) {
            return null;
        }
        AnonymousClass3K5 r0 = A03;
        if (r0 == null) {
            r0 = new AnonymousClass3K5(this);
            A03 = r0;
        }
        return r0.getIBinder();
    }

    public void onCreate() {
        if (!this.A00) {
            this.A00 = true;
            generatedComponent();
        }
        super.onCreate();
    }
}
