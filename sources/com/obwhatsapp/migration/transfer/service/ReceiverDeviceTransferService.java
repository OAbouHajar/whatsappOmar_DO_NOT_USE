package com.obwhatsapp.migration.transfer.service;

import X.AnonymousClass006;
import X.AnonymousClass11L;
import X.AnonymousClass1NH;
import X.AnonymousClass1NP;
import X.AnonymousClass3AD;
import X.AnonymousClass3KT;
import X.AnonymousClass54H;
import X.AnonymousClass54I;
import X.C13690nt;
import X.C16150sX;
import X.C16180sb;
import X.C16340ss;
import X.C16350st;
import X.C16440t3;
import X.C18810xI;
import X.C19650ym;
import X.C19760yx;
import X.C26591Oj;
import X.C26601Ok;
import X.C26881Pp;
import X.C30311c8;
import X.C59132uj;
import X.C610337b;
import X.C615039e;
import X.C63453Ig;
import X.C77013v5;
import X.C82404Cr;
import X.C82794Ee;
import X.C82804Ef;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager;
import android.net.wifi.p2p.nsd.WifiP2pDnsSdServiceInfo;
import android.os.IBinder;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.ServerSocket;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.util.Collections;

public class ReceiverDeviceTransferService extends AnonymousClass3KT implements AnonymousClass006 {
    public C82404Cr A00;
    public C615039e A01;
    public C26591Oj A02;
    public C610337b A03;
    public C77013v5 A04;
    public boolean A05;
    public final Object A06;
    public volatile AnonymousClass54I A07;

    public ReceiverDeviceTransferService() {
        this(0);
    }

    public ReceiverDeviceTransferService(int i2) {
        this.A06 = C13690nt.A0Y();
        this.A05 = false;
    }

    public final Object generatedComponent() {
        if (this.A07 == null) {
            synchronized (this.A06) {
                if (this.A07 == null) {
                    this.A07 = new AnonymousClass54I(this);
                }
            }
        }
        return this.A07.generatedComponent();
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        if (!this.A05) {
            this.A05 = true;
            C59132uj r3 = (C59132uj) ((AnonymousClass54H) generatedComponent());
            C16150sX r2 = r3.A04;
            this.A04 = new C77013v5(C16150sX.A0V(r2));
            this.A02 = (C26591Oj) r2.A6r.get();
            this.A00 = (C82404Cr) r3.A02.get();
            this.A01 = r3.A02();
        }
        super.onCreate();
    }

    public void onDestroy() {
        Log.i("fpm/ReceiverTransferDonorService/onDestroy");
        C610337b r1 = this.A03;
        if (r1 != null) {
            C30311c8.A07(r1.A00);
            ServerSocket serverSocket = r1.A04;
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (Throwable th) {
                    Log.e(th);
                }
            }
            r1.interrupt();
        }
        this.A04.A02();
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        String action;
        Intent intent2 = intent;
        if (intent == null || (action = intent2.getAction()) == null) {
            return 2;
        }
        if (action.equals("com.obwhatsapp.migration.START")) {
            startForeground(31, this.A01.A00());
            try {
                C82404Cr r2 = this.A00;
                ServerSocket createServerSocket = new C63453Ig((PrivateKey) intent2.getSerializableExtra("privateKey"), (Certificate) intent2.getSerializableExtra("certificate")).createServerSocket(8988);
                C82794Ee r8 = new C82794Ee(this);
                C16150sX r12 = r2.A00.A01.A04;
                C16440t3 A0U = C16150sX.A0U(r12);
                C18810xI A0v = C16150sX.A0v(r12);
                Context context = r12.AS2.A00;
                C16340ss.A01(context);
                AnonymousClass1NP r6 = new AnonymousClass1NP(new C16350st(context));
                C26881Pp r20 = (C26881Pp) r12.AC1.get();
                C26591Oj r21 = (C26591Oj) r12.A6r.get();
                AnonymousClass1NH r19 = (AnonymousClass1NH) r12.AFd.get();
                C19650ym r16 = (C19650ym) r12.AFS.get();
                C610337b r0 = new C610337b(new AnonymousClass3AD((C16180sb) r12.A8b.get(), A0U, C16150sX.A0W(r12), r16, A0v, r6, r19, r20, r21, (C26601Ok) r12.ALn.get(), (AnonymousClass11L) r12.AIx.get(), (C19760yx) r12.AKx.get()), r8, (String) intent2.getSerializableExtra("authToken"), createServerSocket);
                this.A03 = r0;
                r0.start();
                C77013v5 r22 = this.A04;
                C82804Ef r1 = new C82804Ef(this);
                if (r22.A04()) {
                    r22.A00 = r1;
                }
                C77013v5 r4 = this.A04;
                WifiP2pDnsSdServiceInfo newInstance = WifiP2pDnsSdServiceInfo.newInstance("_devicetransfer._whatsapp.com", "_presence._tcp", Collections.emptyMap());
                WifiP2pManager wifiP2pManager = r4.A01;
                if (wifiP2pManager != null) {
                    wifiP2pManager.createGroup(r4.A00, (WifiP2pManager.ActionListener) null);
                    r4.A01.addLocalService(r4.A00, newInstance, (WifiP2pManager.ActionListener) null);
                }
                Log.i("fpm/ReceiverTransferDonorService/Started discovery service, waiting for connections...");
                A00();
            } catch (IOException e2) {
                Log.i("fpm/ReceiverTransferDonorService/failed to start receiver service", e2);
                this.A02.A04(600);
                stopSelf();
            }
        } else if (action.equals("com.obwhatsapp.migration.STOP")) {
            stopSelf();
        }
        return 1;
    }
}
