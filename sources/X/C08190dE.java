package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.0dE  reason: invalid class name and case insensitive filesystem */
public class C08190dE implements AnonymousClass04d {
    public final Handler A00 = AnonymousClass000.A0L();
    public final C10880hq A01;
    public final Executor A02 = new C10860ho(this);

    public C08190dE(Executor executor) {
        this.A01 = new C10880hq(executor);
    }

    public /* synthetic */ void A8p(Runnable runnable) {
        this.A01.execute(runnable);
    }
}
