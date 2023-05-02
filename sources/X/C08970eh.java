package X;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0eh  reason: invalid class name and case insensitive filesystem */
public final class C08970eh implements C29981bY {
    public final C08980ei A00 = new C02610Dg(this);
    public final WeakReference A01;

    public C08970eh(AnonymousClass0RM r2) {
        this.A01 = new WeakReference(r2);
    }

    public void A00(Throwable th) {
        this.A00.A06(th);
    }

    public boolean A01(Object obj) {
        return this.A00.A07(obj);
    }

    public void A4b(Runnable runnable, Executor executor) {
        this.A00.A4b(runnable, executor);
    }

    public boolean cancel(boolean z2) {
        AnonymousClass0RM r1 = (AnonymousClass0RM) this.A01.get();
        boolean cancel = this.A00.cancel(z2);
        if (cancel && r1 != null) {
            r1.A00();
        }
        return cancel;
    }

    public Object get() {
        return this.A00.get();
    }

    public Object get(long j2, TimeUnit timeUnit) {
        return this.A00.get(j2, timeUnit);
    }

    public boolean isCancelled() {
        return this.A00.isCancelled();
    }

    public boolean isDone() {
        return this.A00.isDone();
    }

    public String toString() {
        return this.A00.toString();
    }
}
