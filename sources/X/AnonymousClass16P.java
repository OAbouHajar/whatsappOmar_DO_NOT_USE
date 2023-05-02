package X;

import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.16P  reason: invalid class name */
public class AnonymousClass16P {
    public final ThreadPoolExecutor A00 = new ThreadPoolExecutor(0, 1, 300, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C35911mh(this));
    public volatile WeakReference A01;
    public volatile boolean A02 = false;

    public void A00() {
        if (!this.A02) {
            AnonymousClass00B.A0B("Not running on SignalExecutor thread", A01());
        }
    }

    public boolean A01() {
        WeakReference weakReference = this.A01;
        return weakReference != null && Thread.currentThread() == weakReference.get();
    }
}
