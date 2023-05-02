package X;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: X.5wx  reason: invalid class name and case insensitive filesystem */
public class C119355wx {
    public static final UUID A06 = UUID.randomUUID();
    public Handler A00;
    public UUID A01;
    public final Handler A02;
    public final Handler A03;
    public final HandlerThread A04;
    public final HandlerThread A05;

    public C119355wx() {
        HandlerThread handlerThread = new HandlerThread("Optic-Task-Handler-Thread");
        this.A05 = handlerThread;
        handlerThread.start();
        this.A03 = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("Optic-Camera-Handler-Thread");
        this.A04 = handlerThread2;
        handlerThread2.start();
        this.A02 = new Handler(handlerThread2.getLooper());
    }

    public synchronized C1218367a A00(C118595uw r7, String str, Callable callable) {
        C1218367a r4;
        synchronized (this) {
            r4 = new C1218367a(this, str, this.A01, callable);
            if (r7 != null) {
                r4.A00(r7);
            }
            this.A03.postAtTime(r4, this.A01, SystemClock.uptimeMillis());
        }
        return r4;
    }

    public synchronized C1218367a A01(C118595uw r7, Callable callable) {
        C1218367a r3;
        synchronized (this) {
            UUID uuid = A06;
            r3 = new C1218367a(this, "load_camera_infos", uuid, callable);
            r3.A00(r7);
            this.A03.postAtTime(r3, uuid, SystemClock.uptimeMillis());
        }
        return r3;
    }

    public synchronized C1218367a A02(String str, Callable callable, long j2) {
        C1218367a r4;
        synchronized (this) {
            r4 = new C1218367a(this, str, this.A01, callable);
            this.A03.postAtTime(r4, this.A01, SystemClock.uptimeMillis() + j2);
        }
        return r4;
    }

    public Object A03(String str, Callable callable) {
        C1218367a r1;
        synchronized (this) {
            r1 = new C1218367a(this, str, this.A01, callable);
            this.A02.post(r1);
        }
        return r1.get();
    }

    public Object A04(String str, Callable callable) {
        C1218367a r1;
        synchronized (this) {
            r1 = new C1218367a(this, str, this.A01, callable);
            this.A02.post(r1);
        }
        C1221668n r0 = (C1221668n) r1.get();
        r0.A5c();
        return r0.AFb();
    }

    public synchronized void A05(Runnable runnable, UUID uuid) {
        UUID uuid2 = this.A01;
        if ((uuid2 != null && uuid2.equals(uuid)) || A06.equals(uuid)) {
            Handler handler = this.A00;
            if (handler != null) {
                handler.postAtTime(runnable, uuid, SystemClock.uptimeMillis());
            } else {
                long uptimeMillis = SystemClock.uptimeMillis();
                synchronized (AnonymousClass5xT.class) {
                    AnonymousClass5xT.A00.postAtTime(runnable, uuid, uptimeMillis);
                }
            }
        }
    }

    public void A06(String str) {
        if (!A09()) {
            StringBuilder A0q = AnonymousClass000.A0q(str);
            A0q.append(" Current thread: ");
            throw AnonymousClass000.A0a(AnonymousClass000.A0h(Thread.currentThread().getName(), A0q));
        }
    }

    public synchronized void A07(String str, Callable callable) {
        A00((C118595uw) null, str, callable);
    }

    public synchronized void A08(FutureTask futureTask) {
        this.A03.removeCallbacks(futureTask);
    }

    public boolean A09() {
        return AnonymousClass000.A1Y(this.A03.getLooper().getThread(), Thread.currentThread());
    }

    public void finalize() {
        super.finalize();
        HandlerThread handlerThread = this.A04;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 18) {
            handlerThread.quitSafely();
        } else {
            handlerThread.quit();
        }
        try {
            handlerThread.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        HandlerThread handlerThread2 = this.A05;
        if (i2 >= 18) {
            handlerThread2.quitSafely();
        } else {
            handlerThread2.quit();
        }
        try {
            handlerThread2.join();
        } catch (InterruptedException unused2) {
            Thread.currentThread().interrupt();
        }
    }
}
