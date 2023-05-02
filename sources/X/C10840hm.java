package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.0hm  reason: invalid class name and case insensitive filesystem */
public class C10840hm implements Executor {
    public final Handler A00 = AnonymousClass000.A0L();

    public void execute(Runnable runnable) {
        this.A00.post(runnable);
    }
}
