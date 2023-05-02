package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;

/* renamed from: X.0h9  reason: invalid class name and case insensitive filesystem */
public class C10450h9 implements Runnable {
    public final Throwable A00;
    public final /* synthetic */ Handler A01;
    public final /* synthetic */ AnonymousClass01A A02;
    public final /* synthetic */ Runnable A03;

    public C10450h9(Handler handler, AnonymousClass01A r6, Runnable runnable) {
        this.A02 = r6;
        this.A01 = handler;
        this.A03 = runnable;
        Thread currentThread = Thread.currentThread();
        StringBuilder A0r = AnonymousClass000.A0r("Runnable instantiated on thread id: ");
        A0r.append(currentThread.getId());
        A0r.append(", name: ");
        this.A00 = new Throwable(AnonymousClass000.A0h(currentThread.getName(), A0r));
    }

    public final void run() {
        try {
            AnonymousClass01A r0 = this.A02;
            Context A0u = r0.A0u();
            boolean z2 = true;
            boolean A1V = AnonymousClass000.A1V(r0.A0A);
            boolean A1W = AnonymousClass000.A1W(A0u);
            if (!(A0u instanceof ContextWrapper) || ((ContextWrapper) A0u).getBaseContext() != null) {
                z2 = false;
            }
            if (!A1V || A1W || z2) {
                this.A01.post(this);
            } else {
                this.A03.run();
            }
        } catch (Throwable th) {
            Throwable th2 = this.A00;
            if (C06410Vr.A01.AJ7(5)) {
                C06410Vr.A01.Ai1("CDSThreadTracing", "--- start debug trace");
            }
            if (C06410Vr.A01.AJ7(5)) {
                C06410Vr.A01.Ai2("CDSThreadTracing", "Thread tracing stacktrace", th2);
            }
            if (C06410Vr.A01.AJ7(5)) {
                C06410Vr.A01.Ai1("CDSThreadTracing", "--- end debug trace");
            }
            throw th;
        }
    }
}
