package com.obwhatsapp.companiondevice;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass1WN;
import X.AnonymousClass2IF;
import X.C007503l;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C15860rz;
import X.C16150sX;
import X.C16590tJ;
import X.C19380yL;
import X.C19410yO;
import X.C19720yt;
import X.C218415q;
import X.C24571Gl;
import X.C33261iI;
import X.C42341xd;
import X.C47672Jx;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.obwhatsapp.R;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CompanionDeviceVerificationReceiver extends BroadcastReceiver {
    public C24571Gl A00;
    public C15860rz A01;
    public C19410yO A02;
    public final Object A03;
    public volatile boolean A04;

    public CompanionDeviceVerificationReceiver() {
        this(0);
    }

    public CompanionDeviceVerificationReceiver(int i2) {
        this.A04 = false;
        this.A03 = C13690nt.A0Y();
    }

    public void onReceive(Context context, Intent intent) {
        List asList;
        AnonymousClass1WN r5;
        if (!this.A04) {
            synchronized (this.A03) {
                if (!this.A04) {
                    C16150sX A002 = AnonymousClass2IF.A00(context);
                    this.A01 = C16150sX.A0Y(A002);
                    this.A02 = (C19410yO) A002.A4T.get();
                    this.A00 = (C24571Gl) A002.A4W.get();
                    this.A04 = true;
                }
            }
        }
        String A0E = C13700nu.A0E(C13680ns.A0B(this.A01), "companion_device_verification_ids");
        if (A0E != null && (asList = Arrays.asList(A0E.split(","))) != null) {
            Iterator it = asList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String A0m = AnonymousClass000.A0m(it);
                C19410yO r2 = this.A02;
                DeviceJid nullable = DeviceJid.getNullable(A0m);
                AnonymousClass00B.A06(nullable);
                if (r2.A0L.A01.A1d() && (r5 = (AnonymousClass1WN) r2.A0I.A00().get(nullable)) != null) {
                    Iterator A003 = C16590tJ.A00(this.A00);
                    while (A003.hasNext()) {
                        C19720yt r1 = ((C33261iI) A003.next()).A00;
                        Context context2 = r1.A02.A00;
                        AnonymousClass013 r22 = r1.A04;
                        C19380yL r4 = r1.A03;
                        String string = context2.getString(R.string.str0e2d);
                        String A004 = C47672Jx.A00(r22, r5.A04);
                        Object[] A1Z = C13690nt.A1Z();
                        A1Z[0] = r5.A08;
                        C007503l A012 = C218415q.A01(context2, string, C13680ns.A0d(context2, A004, A1Z, 1, R.string.str0e2c));
                        A012.A0D(true);
                        A012.A07.icon = R.drawable.notify_web_client_connected;
                        r4.A02(21, A012.A01());
                    }
                }
            }
        } else {
            Log.e("CompanionDeviceVerificationReceiver/onReceive/ deviceIds are missing from prefs");
        }
        C13690nt.A0v(this.A01.A0K(), "companion_device_verification_ids");
        PendingIntent A013 = C42341xd.A01(context, 0, intent, 536870912);
        if (A013 != null) {
            A013.cancel();
        }
    }
}
