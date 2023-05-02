package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.58G  reason: invalid class name */
public class AnonymousClass58G implements Executor {
    public final Handler A00;

    public AnonymousClass58G(Looper looper) {
        this.A00 = new AnonymousClass3M3(looper);
    }

    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }
}
