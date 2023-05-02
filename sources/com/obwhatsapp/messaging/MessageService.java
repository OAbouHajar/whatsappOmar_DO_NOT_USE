package com.obwhatsapp.messaging;

import X.AnonymousClass006;
import X.AnonymousClass1A4;
import X.AnonymousClass54H;
import X.AnonymousClass54I;
import X.C18900xR;
import X.C28311Vk;
import X.C59132uj;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.whatsapp.util.Log;

public class MessageService extends C28311Vk implements AnonymousClass006 {
    public C18900xR A00;
    public boolean A01;
    public final Object A02;
    public volatile AnonymousClass54I A03;

    public MessageService() {
        this(0);
    }

    public MessageService(int i2) {
        this.A02 = new Object();
        this.A01 = false;
    }

    public static void A00(Context context) {
        try {
            context.startService(new Intent(context, MessageService.class).setAction("com.obwhatsapp.messaging.MessageService.START"));
            Log.i("messageservice/startService success");
        } catch (Exception e2) {
            if (Build.VERSION.SDK_INT >= 26) {
                e2.getMessage();
                return;
            }
            throw e2;
        }
    }

    public static void A01(Context context, AnonymousClass1A4 r3) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                context.startService(new Intent(context, MessageService.class).setAction("com.obwhatsapp.messaging.MessageService.START"));
                Log.i("messageservice/startOnForeground success");
            } catch (Exception e2) {
                StringBuilder sb = new StringBuilder("messageservice/startOnForeground failed:");
                sb.append(e2.getMessage());
                Log.e(sb.toString());
                r3.A00();
            }
        }
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
        Log.i("messageservice/onCreate");
        if (!this.A01) {
            this.A01 = true;
            this.A00 = (C18900xR) ((C59132uj) ((AnonymousClass54H) generatedComponent())).A04.ALD.get();
        }
        super.onCreate();
    }

    public void onDestroy() {
        Log.i("messageservice/onDestroy");
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        if (!C18900xR.A00() && intent != null) {
            intent.getAction();
        }
        return 1;
    }
}
