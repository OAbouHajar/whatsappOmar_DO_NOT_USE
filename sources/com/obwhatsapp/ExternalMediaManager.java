package com.obwhatsapp;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass03I;
import X.AnonymousClass03J;
import X.AnonymousClass12W;
import X.AnonymousClass54H;
import X.AnonymousClass54I;
import X.C13690nt;
import X.C16150sX;
import X.C16320sq;
import X.C19290yC;
import X.C19670yo;
import X.C40751ud;
import X.C59132uj;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import com.whatsapp.util.Log;

public class ExternalMediaManager extends AnonymousClass03I implements AnonymousClass006 {
    public C19670yo A00;
    public AnonymousClass12W A01;
    public C19290yC A02;
    public C16320sq A03;
    public boolean A04;
    public final Object A05;
    public volatile AnonymousClass54I A06;

    public class ExternalMediaStateReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            if ("android.intent.action.MEDIA_BAD_REMOVAL".equals(intent.getAction()) || "android.intent.action.MEDIA_EJECT".equals(intent.getAction()) || "android.intent.action.MEDIA_MOUNTED".equals(intent.getAction()) || "android.intent.action.MEDIA_REMOVED".equals(intent.getAction()) || "android.intent.action.MEDIA_SHARED".equals(intent.getAction()) || "android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                Class<ExternalMediaManager> cls = ExternalMediaManager.class;
                AnonymousClass03J.A00(context, intent.setClass(context, cls), cls, 5);
            }
        }
    }

    public ExternalMediaManager() {
        this(0);
    }

    public ExternalMediaManager(int i2) {
        this.A05 = C13690nt.A0Y();
        this.A04 = false;
    }

    public void A05(Intent intent) {
        String str;
        String externalStorageState = Environment.getExternalStorageState();
        if (!externalStorageState.equals("mounted")) {
            boolean equals = externalStorageState.equals("mounted_ro");
            C40751ud r1 = (C40751ud) this.A01.A06.get();
            boolean z2 = r1.A00;
            if (!equals) {
                if (!z2) {
                    r1.A00 = true;
                    r1.A01 = true;
                    Log.i(AnonymousClass000.A0h(Environment.getExternalStorageState(), AnonymousClass000.A0r("media-state-manager/external/unavailable ")));
                }
            } else if (z2 || !r1.A01) {
                r1.A00 = false;
                r1.A01 = true;
                str = "media-state-manager/read-only";
                Log.i(str);
                this.A02.A01(true, false);
            }
        } else {
            C40751ud r12 = (C40751ud) this.A01.A06.get();
            if (r12.A00 || r12.A01) {
                r12.A00 = false;
                r12.A01 = false;
                str = "media-state-manager/external/available";
                Log.i(str);
                this.A02.A01(true, false);
            }
        }
        this.A00.A09(externalStorageState);
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

    public void onCreate() {
        if (!this.A04) {
            this.A04 = true;
            C16150sX r1 = ((C59132uj) ((AnonymousClass54H) generatedComponent())).A04;
            this.A03 = C16150sX.A1B(r1);
            this.A01 = (AnonymousClass12W) r1.AEM.get();
            this.A02 = (C19290yC) r1.AEN.get();
            this.A00 = (C19670yo) r1.AB4.get();
        }
        super.onCreate();
    }
}
