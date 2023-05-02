package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* renamed from: X.126  reason: invalid class name */
public class AnonymousClass126 {
    public final Handler A00;
    public final Handler A01;
    public final HandlerThread A02;
    public final HandlerThread A03;

    public AnonymousClass126() {
        HandlerThread handlerThread = new HandlerThread("Messages Async Commit Thread");
        this.A02 = handlerThread;
        handlerThread.start();
        this.A00 = new C39661sr(handlerThread.getLooper(), this);
        HandlerThread handlerThread2 = new HandlerThread("Receipt Processing Thread");
        this.A03 = handlerThread2;
        handlerThread2.start();
        this.A01 = new C39671ss(handlerThread2.getLooper(), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r3.A01.getLooper() == android.os.Looper.myLooper()) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
            r3 = this;
            android.os.Handler r0 = r3.A00
            android.os.Looper r1 = r0.getLooper()
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r1 == r0) goto L_0x0019
            android.os.Handler r0 = r3.A01
            android.os.Looper r2 = r0.getLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            r0 = 0
            if (r2 != r1) goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            X.AnonymousClass00B.A0G(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass126.A00():void");
    }

    public void A01(Runnable runnable, int i2) {
        Handler handler = this.A00;
        Message obtain = Message.obtain(handler, runnable);
        obtain.arg1 = i2;
        handler.sendMessage(obtain);
    }
}
