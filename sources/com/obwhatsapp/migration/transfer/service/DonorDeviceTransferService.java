package com.obwhatsapp.migration.transfer.service;

import X.AnonymousClass006;
import X.AnonymousClass00B;
import X.AnonymousClass2S9;
import X.AnonymousClass3KT;
import X.AnonymousClass4IJ;
import X.AnonymousClass54H;
import X.AnonymousClass54I;
import X.C13690nt;
import X.C16150sX;
import X.C26591Oj;
import X.C30311c8;
import X.C59132uj;
import X.C610237a;
import X.C615039e;
import X.C82384Cp;
import X.C82394Cq;
import X.C87914Zd;
import android.content.Intent;
import android.os.IBinder;
import com.whatsapp.util.Log;

public class DonorDeviceTransferService extends AnonymousClass3KT implements AnonymousClass006 {
    public C82384Cp A00;
    public C82394Cq A01;
    public C615039e A02;
    public C26591Oj A03;
    public C610237a A04;
    public AnonymousClass2S9 A05;
    public boolean A06;
    public final Object A07;
    public volatile AnonymousClass54I A08;

    public DonorDeviceTransferService() {
        this(0);
    }

    public DonorDeviceTransferService(int i2) {
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

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        if (!this.A06) {
            this.A06 = true;
            C59132uj r4 = (C59132uj) ((AnonymousClass54H) generatedComponent());
            C16150sX r3 = r4.A04;
            this.A05 = new AnonymousClass2S9(C16150sX.A0V(r3), C16150sX.A1B(r3));
            this.A03 = (C26591Oj) r3.A6r.get();
            this.A00 = (C82384Cp) r4.A00.get();
            this.A01 = (C82394Cq) r4.A01.get();
            this.A02 = r4.A02();
        }
        super.onCreate();
    }

    public void onDestroy() {
        Log.i("fpm/DonorDeviceTransferService/onDestroy");
        this.A05.A02();
        C610237a r1 = this.A04;
        if (r1 != null) {
            C30311c8.A07(r1.A04);
            r1.interrupt();
        }
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        String action;
        if (intent == null || (action = intent.getAction()) == null) {
            return 2;
        }
        if (action.equals("com.obwhatsapp.migration.START")) {
            startForeground(31, this.A02.A00());
            AnonymousClass00B.A0C("intent.getExtras()[EXTRA_DETAILS_KEY] is required but is not present", intent.hasExtra("details_key"));
            C87914Zd A002 = C87914Zd.A00(intent.getStringExtra("details_key"));
            AnonymousClass00B.A06(A002);
            AnonymousClass2S9 r3 = this.A05;
            AnonymousClass4IJ r1 = new AnonymousClass4IJ(A002, this);
            if (r3.A04()) {
                r3.A01 = r1;
                r3.A02.A00.registerReceiver(r3.A04, AnonymousClass2S9.A08);
            }
            Log.i("fpm/DonorDeviceTransferService/starting service discovery");
            this.A05.A05();
            A00();
        } else if (action.equals("com.obwhatsapp.migration.STOP")) {
            stopSelf();
        }
        return 1;
    }
}
