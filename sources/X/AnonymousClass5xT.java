package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.5xT  reason: invalid class name */
public class AnonymousClass5xT {
    public static final Handler A00 = AnonymousClass000.A0L();

    public static void A00(Runnable runnable) {
        if (A02()) {
            runnable.run();
        } else {
            A00.post(runnable);
        }
    }

    public static void A01(String str) {
        if (A02()) {
            StringBuilder A0q = AnonymousClass000.A0q(str);
            A0q.append(" Current thread: ");
            throw new IllegalThreadStateException(AnonymousClass000.A0h(Thread.currentThread().getName(), A0q));
        }
    }

    public static boolean A02() {
        return AnonymousClass000.A1Y(Looper.getMainLooper().getThread(), Thread.currentThread());
    }
}
