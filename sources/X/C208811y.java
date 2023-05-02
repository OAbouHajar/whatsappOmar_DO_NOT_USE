package X;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: X.11y  reason: invalid class name and case insensitive filesystem */
public class C208811y {
    public Handler A00;
    public HandlerThread A01;

    public synchronized Handler A00() {
        Handler handler;
        handler = this.A00;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("db_write", 10);
            this.A01 = handlerThread;
            handlerThread.start();
            handler = new Handler(this.A01.getLooper());
            this.A00 = handler;
        }
        return handler;
    }

    public void A01(Runnable runnable) {
        A00().post(runnable);
    }
}
