package com.obwhatsapp.service;

import X.C007503l;
import X.C008804a;
import X.C14750ph;
import X.C218415q;
import X.C42341xd;
import X.C446524y;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.IBinder;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;

public class YoHiddenService extends GcmFGService {
    static boolean A01;

    public YoHiddenService() {
        super("gcmfgservice", false);
        this.A00 = false;
    }

    public static synchronized void A00(Context context) {
        Class<YoHiddenService> cls = YoHiddenService.class;
        synchronized (cls) {
            C446524y.A00(context, new Intent(context, cls).setAction("com.obwhatsapp.service.GcmFGService.START"));
            A01 = true;
        }
    }

    public static void A01(Context context) {
        boolean z2 = A01;
        if (Build.VERSION.SDK_INT < 26 || !z2) {
            context.stopService(new Intent(context, YoHiddenService.class));
        } else {
            C446524y.A00(context, new Intent(context, YoHiddenService.class).setAction("com.obwhatsapp.service.GcmFGService.STOP"));
        }
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
        String action;
        StringBuilder sb = new StringBuilder("gcmfgservice/onStartCommand:");
        sb.append(intent);
        sb.append(" startId:");
        sb.append(i3);
        Log.i(sb.toString());
        Resources resources = getResources();
        if (resources instanceof C008804a) {
            resources = ((C008804a) resources).A00;
        }
        C007503l A00 = C218415q.A00(this);
        A00.A0J = "other_notifications@1";
        A00.A0B(resources.getString(R.string.str1cf7));
        A00.A0A(resources.getString(R.string.str1cf7));
        A00.A09(resources.getString(R.string.str0e28));
        A00.A09 = C42341xd.A00(this, 1, C14750ph.A02(this), 0);
        int i4 = Build.VERSION.SDK_INT;
        int i5 = -2;
        if (i4 >= 26) {
            i5 = -1;
        }
        A00.A03 = i5;
        if (i4 != 24) {
            A00.A07.icon = yo.getNIcon(R.drawable.notifybar);
        }
        Notification A012 = A00.A01();
        int i6 = 11;
        if (i4 == 24) {
            Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(this, A012);
            recoverBuilder.setSmallIcon(Icon.createWithBitmap(BitmapFactory.decodeResource(getResources(), yo.getNIcon(R.drawable.notifybar))));
            A012 = recoverBuilder.build();
            i6 = 230176012;
        }
        A01(i3, A012, i6);
        if (intent == null || ((action = intent.getAction()) != null && !action.equals("com.obwhatsapp.service.GcmFGService.STOP"))) {
            return 1;
        }
        stopSelf();
        return 2;
    }
}
