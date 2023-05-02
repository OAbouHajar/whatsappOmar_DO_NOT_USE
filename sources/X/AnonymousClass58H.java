package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.58H  reason: invalid class name */
public final class AnonymousClass58H implements Executor {
    public final Handler A00 = new AnonymousClass3M1(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }
}
