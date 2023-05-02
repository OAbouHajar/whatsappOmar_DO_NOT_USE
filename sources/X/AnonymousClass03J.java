package X;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
/* renamed from: X.03J  reason: invalid class name */
public abstract class AnonymousClass03J extends Service {
    public static final Object A05 = new Object();
    public static final HashMap A06 = new HashMap();
    public C02310Au A00;
    public C12980lH A01;
    public C05540Ry A02;
    public boolean A03 = false;
    public final ArrayList A04;

    public AnonymousClass03J() {
        this.A04 = Build.VERSION.SDK_INT >= 26 ? null : new ArrayList();
    }

    public static void A00(Context context, Intent intent, Class cls, int i2) {
        ComponentName componentName = new ComponentName(context, cls);
        if (intent != null) {
            synchronized (A05) {
                HashMap hashMap = A06;
                C05540Ry r0 = (C05540Ry) hashMap.get(componentName);
                if (r0 == null) {
                    r0 = Build.VERSION.SDK_INT >= 26 ? new AnonymousClass0Dz(componentName, context, i2) : new AnonymousClass0E0(componentName, context);
                    hashMap.put(componentName, r0);
                }
                r0.A03(i2);
                r0.A04(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    public C12990lI A01() {
        C12990lI r0;
        C12980lH r02 = this.A01;
        if (r02 != null) {
            return r02.A7s();
        }
        ArrayList arrayList = this.A04;
        synchronized (arrayList) {
            r0 = arrayList.size() > 0 ? (C12990lI) arrayList.remove(0) : null;
        }
        return r0;
    }

    public void A02() {
        ArrayList arrayList = this.A04;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.A00 = null;
                if (arrayList.size() > 0) {
                    A03(false);
                } else if (!this.A03) {
                    this.A02.A00();
                }
            }
        }
    }

    public void A03(boolean z2) {
        if (this.A00 == null) {
            this.A00 = new C02310Au(this);
            C05540Ry r0 = this.A02;
            if (r0 != null && z2) {
                r0.A01();
            }
            this.A00.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean A04() {
        return true;
    }

    public abstract void A05(Intent intent);

    public IBinder onBind(Intent intent) {
        C12980lH r0 = this.A01;
        if (r0 != null) {
            return r0.A6S();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.A01 = new AnonymousClass0A9(this);
            this.A02 = null;
            return;
        }
        this.A01 = null;
        ComponentName componentName = new ComponentName(this, getClass());
        HashMap hashMap = A06;
        C05540Ry r0 = (C05540Ry) hashMap.get(componentName);
        if (r0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            r0 = new AnonymousClass0E0(componentName, this);
            hashMap.put(componentName, r0);
        }
        this.A02 = r0;
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.A04;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.A03 = true;
                this.A02.A00();
            }
        }
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        ArrayList arrayList = this.A04;
        if (arrayList == null) {
            return 2;
        }
        this.A02.A02();
        synchronized (arrayList) {
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C07270at(intent, this, i3));
            A03(true);
        }
        return 3;
    }
}
