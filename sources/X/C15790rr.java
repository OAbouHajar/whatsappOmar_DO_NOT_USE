package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0rr  reason: invalid class name and case insensitive filesystem */
public class C15790rr {
    public static Handler A00;
    public static final List A01 = new ArrayList();

    public static synchronized Handler A00() {
        Handler handler;
        synchronized (C15790rr.class) {
            handler = A00;
            if (handler == null) {
                HandlerThread handlerThread = new HandlerThread("BackgroundLayoutPreparer", 5);
                handlerThread.getThreadId();
                handlerThread.start();
                handler = new Handler(handlerThread.getLooper());
                A00 = handler;
            }
        }
        return handler;
    }
}
