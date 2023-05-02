package X;

import java.util.concurrent.Executor;

/* renamed from: X.1Ud  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C28041Ud implements Executor {
    public final void execute(Runnable runnable) {
        new AnonymousClass1ZS(runnable, "AnomalyExecutorThread").start();
    }
}
