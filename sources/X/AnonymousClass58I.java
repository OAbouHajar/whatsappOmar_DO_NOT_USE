package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.58I  reason: invalid class name */
public class AnonymousClass58I implements Executor {
    public final Handler A00 = AnonymousClass000.A0L();

    public void execute(Runnable runnable) {
        this.A00.post(runnable);
    }
}
