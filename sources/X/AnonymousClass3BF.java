package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.util.Log;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.3BF  reason: invalid class name */
public class AnonymousClass3BF {
    public static final Object A01 = C13690nt.A0Y();
    public static volatile AnonymousClass3BF A02;
    public ConcurrentHashMap A00 = new ConcurrentHashMap();

    public static AnonymousClass3BF A00() {
        if (A02 == null) {
            synchronized (A01) {
                if (A02 == null) {
                    A02 = new AnonymousClass3BF();
                }
            }
        }
        AnonymousClass3BF r0 = A02;
        C13710nw.A01(r0);
        return r0;
    }

    public void A01(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof C107805Lm)) {
            ConcurrentHashMap concurrentHashMap = this.A00;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    public final boolean A02(Context context, Intent intent, ServiceConnection serviceConnection, String str, int i2) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            try {
                if ((C15560rQ.A00(context).A00.getPackageManager().getApplicationInfo(component.getPackageName(), 0).flags & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof C107805Lm) {
            return context.bindService(intent, serviceConnection, i2);
        }
        ConcurrentHashMap concurrentHashMap = this.A00;
        Object putIfAbsent = concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (!(putIfAbsent == null || serviceConnection == putIfAbsent)) {
            Object[] objArr = new Object[3];
            C13690nt.A1L(serviceConnection, str, objArr);
            objArr[2] = intent.getAction();
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", objArr));
        }
        try {
            boolean bindService = context.bindService(intent, serviceConnection, i2);
            if (!bindService) {
                return false;
            }
            return bindService;
        } finally {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
        }
    }
}
