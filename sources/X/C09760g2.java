package X;

import android.app.Application;

/* renamed from: X.0g2  reason: invalid class name and case insensitive filesystem */
public class C09760g2 implements Runnable {
    public final /* synthetic */ Application A00;
    public final /* synthetic */ C06640Xb A01;

    public C09760g2(Application application, C06640Xb r2) {
        this.A00 = application;
        this.A01 = r2;
    }

    public void run() {
        this.A00.unregisterActivityLifecycleCallbacks(this.A01);
    }
}
