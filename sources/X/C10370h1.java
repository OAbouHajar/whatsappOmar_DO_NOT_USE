package X;

import android.os.PowerManager;

/* renamed from: X.0h1  reason: invalid class name and case insensitive filesystem */
public class C10370h1 implements Runnable {
    public final /* synthetic */ PowerManager.WakeLock A00;
    public final /* synthetic */ AnonymousClass0OJ A01;
    public final /* synthetic */ Runnable A02;

    public C10370h1(PowerManager.WakeLock wakeLock, AnonymousClass0OJ r2, Runnable runnable) {
        this.A01 = r2;
        this.A02 = runnable;
        this.A00 = wakeLock;
    }

    public void run() {
        try {
            this.A02.run();
        } finally {
            this.A00.release();
        }
    }
}
