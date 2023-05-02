package com.google.android.gms.auth.api.signin;

import X.AnonymousClass3Yc;
import X.C13680ns;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public final class RevocationBoundService extends Service {
    public IBinder onBind(Intent intent) {
        if ("com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent.getAction()) || "com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(intent.getAction())) {
            if (Log.isLoggable("RevocationService", 2)) {
                Log.v("RevocationService", C13680ns.A0g(String.valueOf(intent.getAction()), "RevocationBoundService handling "));
            }
            return new AnonymousClass3Yc(this);
        }
        Log.w("RevocationService", C13680ns.A0g(String.valueOf(intent.getAction()), "Unknown action sent to RevocationBoundService: "));
        return null;
    }
}
