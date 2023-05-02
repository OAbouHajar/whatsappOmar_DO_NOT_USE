package X;

import android.content.Context;
import android.os.PowerManager;

/* renamed from: X.0TC  reason: invalid class name */
public final class AnonymousClass0TC {
    public static final String A00;

    static {
        String A01 = C06530Wm.A01("WakeLocks");
        C18450wi.A0B(A01);
        A00 = A01;
    }

    public static final PowerManager.WakeLock A00(Context context, String str) {
        C18450wi.A0H(context, 0);
        C18450wi.A0H(str, 1);
        Object systemService = context.getApplicationContext().getSystemService("power");
        C18450wi.A0M(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String A0h = AnonymousClass000.A0h(str, AnonymousClass000.A0r("WorkManager: "));
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, A0h);
        synchronized (AnonymousClass0TW.A00) {
            AnonymousClass0TW.A01.put(newWakeLock, A0h);
        }
        C18450wi.A0B(newWakeLock);
        return newWakeLock;
    }
}
