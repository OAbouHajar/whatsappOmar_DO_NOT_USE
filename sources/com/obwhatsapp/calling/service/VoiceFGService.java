package com.obwhatsapp.calling.service;

import X.C18380wb;
import X.C204710g;
import X.C28291Vi;
import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;
import com.whatsapp.util.Log;

public final class VoiceFGService extends C28291Vi {
    public static volatile Notification A02;
    public C18380wb A00;
    public boolean A01 = false;

    public VoiceFGService() {
        super("voicefgservice", true);
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        Log.i("voicefgservice/onCreate");
        A00();
        super.onCreate();
    }

    public void onDestroy() {
        Log.i("voicefgservice/onDestroy");
        stopForeground(true);
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        StringBuilder sb = new StringBuilder("voicefgservice/onStartCommand:");
        sb.append(intent);
        Log.i(sb.toString());
        if (intent != null) {
            String action = intent.getAction();
            if ("hangup_call".equals(action) || "reject_call".equals(action)) {
                this.A00.A00(new C204710g(action, intent.getExtras()));
                return 2;
            } else if (!"com.obwhatsapp.service.VoiceFgService.START".equals(action) || A02 == null) {
                StringBuilder sb2 = new StringBuilder("voicefgservice/onStartCommand service started with unknown action:");
                sb2.append(intent.getAction());
                Log.e(sb2.toString());
                return 2;
            } else {
                if (intent.getBooleanExtra("com.obwhatsapp.service.VoiceFgService.EXTRA_STOP_FOREGROUND_STATE", false)) {
                    stopForeground(true);
                }
                A01(i3, A02, intent.getIntExtra("com.obwhatsapp.service.VoiceFgService.EXTRA_NOTIFICATION_ID", 23));
            }
        }
        return 2;
    }
}
