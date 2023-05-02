package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0hv  reason: invalid class name and case insensitive filesystem */
public class C10930hv implements ThreadFactory {
    public final AtomicInteger A00 = new AtomicInteger(0);
    public final /* synthetic */ AnonymousClass0Pz A01;
    public final /* synthetic */ boolean A02;

    public C10930hv(AnonymousClass0Pz r3, boolean z2) {
        this.A01 = r3;
        this.A02 = z2;
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, AnonymousClass000.A0l(AnonymousClass000.A0q(this.A02 ? "WM.task-" : "androidx.work-"), this.A00.incrementAndGet()));
    }
}
