package X;

import com.facebook.redex.RunnableRunnableShape8S0100000_I0_7;
import java.lang.ref.WeakReference;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.1mh  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C35911mh implements ThreadFactory {
    public final /* synthetic */ AnonymousClass16P A00;

    public /* synthetic */ C35911mh(AnonymousClass16P r1) {
        this.A00 = r1;
    }

    public final Thread newThread(Runnable runnable) {
        AnonymousClass16P r3 = this.A00;
        AnonymousClass1ZS r1 = new AnonymousClass1ZS(new RunnableRunnableShape8S0100000_I0_7(runnable, 31), "SignalExecutor");
        r3.A01 = new WeakReference(r1);
        return r1;
    }
}
