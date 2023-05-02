package com.mod.libs;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

public abstract class TService extends Service {
    public IBinder onBind(Intent intent) {
        onServiceBind(intent);
        return null;
    }

    public void onCreate() {
        Context applicationContext = getApplicationContext();
        super.onCreate();
        onServiceCreate(applicationContext);
    }

    public abstract void onServiceBind(Intent intent);

    public abstract void onServiceCreate(Context context);

    public abstract void onStart(Intent intent, int i2, int i3);

    public int onStartCommand(Intent intent, int i2, int i3) {
        onStart(intent, i2, i3);
        return super.onStartCommand(intent, i2, i3);
    }
}
