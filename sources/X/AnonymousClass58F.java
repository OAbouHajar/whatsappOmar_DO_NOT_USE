package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.58F  reason: invalid class name */
public final /* synthetic */ class AnonymousClass58F implements Executor {
    public final /* synthetic */ Handler A00;

    public /* synthetic */ AnonymousClass58F(Handler handler) {
        this.A00 = handler;
    }

    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }
}
