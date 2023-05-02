package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.0T5  reason: invalid class name */
public final class AnonymousClass0T5 {
    public static final Handler A00 = AnonymousClass000.A0L();

    public static void A00(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            A00.post(runnable);
        }
    }
}
