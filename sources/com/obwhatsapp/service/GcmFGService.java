package com.obwhatsapp.service;

import X.C007503l;
import X.C008804a;
import X.C14750ph;
import X.C218415q;
import X.C28291Vi;
import X.C42341xd;
import android.app.Notification;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.IBinder;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;

public class GcmFGService extends C28291Vi {
    public boolean A00 = false;

    public GcmFGService() {
        super("gcmfgservice", false);
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        Log.i("gcmfgservice/onCreate");
        A00();
        super.onCreate();
    }

    public void onDestroy() {
        Log.i("gcmfgservice/onDestroy");
        stopForeground(true);
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        StringBuilder sb = new StringBuilder("gcmfgservice/onStartCommand:");
        sb.append(intent);
        sb.append(" startId:");
        sb.append(i3);
        Log.i(sb.toString());
        Resources resources = getResources();
        if (resources instanceof C008804a) {
            resources = ((C008804a) resources).A00;
        }
        C007503l A002 = C218415q.A00(this);
        A002.A0J = "other_notifications@1";
        A002.A0B(resources.getString(R.string.str1cf7));
        A002.A0A(resources.getString(R.string.str1cf7));
        A002.A09(resources.getString(R.string.str1d29));
        A002.A09 = C42341xd.A00(this, 1, C14750ph.A02(this), 0);
        int i4 = Build.VERSION.SDK_INT;
        int i5 = -2;
        if (i4 >= 26) {
            i5 = -1;
        }
        A002.A03 = i5;
        if (i4 != 24) {
            A002.A07.icon = yo.getNIcon(R.drawable.notifybar);
        }
        Notification A01 = A002.A01();
        int i6 = 11;
        if (i4 == 24) {
            Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(this, A01);
            recoverBuilder.setSmallIcon(Icon.createWithBitmap(BitmapFactory.decodeResource(getResources(), yo.getNIcon(R.drawable.notifybar))));
            A01 = recoverBuilder.build();
            i6 = 230176012;
        }
        A01(i3, A01, i6);
        return 1;
    }
}
