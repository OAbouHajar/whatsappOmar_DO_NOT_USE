package com.obwhatsapp.instrumentation.service;

import X.AnonymousClass000;
import X.C007503l;
import X.C13680ns;
import X.C14750ph;
import X.C218415q;
import X.C28291Vi;
import X.C42341xd;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import com.facebook.redex.RunnableRunnableShape18S0100000_I1_1;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.yo;

public class InstrumentationFGService extends C28291Vi {
    public Handler A00 = new Handler();
    public Runnable A01 = new RunnableRunnableShape18S0100000_I1_1((Object) this, 43);
    public boolean A02 = false;

    public InstrumentationFGService() {
        super("instrumentationfgservice", true);
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        A00();
        super.onCreate();
    }

    public void onDestroy() {
        stopForeground(true);
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        StringBuilder A0r = AnonymousClass000.A0r("instrumentationfgservice/onStartCommand:");
        A0r.append(intent);
        A0r.append(" startId:");
        A0r.append(i3);
        C13680ns.A1V(A0r);
        C007503l A002 = C218415q.A00(this);
        A002.A0J = "other_notifications@1";
        A002.A0B(getString(R.string.str1cf7));
        A002.A0A(getString(R.string.str1cf7));
        A002.A09(getString(R.string.str0e5d));
        A002.A09 = C42341xd.A00(this, 1, C14750ph.A02(this), 0);
        int i4 = -2;
        if (Build.VERSION.SDK_INT >= 26) {
            i4 = -1;
        }
        A002.A03 = i4;
        A002.A07.icon = yo.getNIcon(R.drawable.notifybar);
        A01(i3, A002.A01(), 25);
        Handler handler = this.A00;
        Runnable runnable = this.A01;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 5000);
        return 2;
    }
}
