package X;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: X.5CZ  reason: invalid class name */
public class AnonymousClass5CZ extends FutureTask {
    public final /* synthetic */ C30711cp A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5CZ(C30711cp r1, Callable callable) {
        super(callable);
        this.A00 = r1;
    }

    public void done() {
        C30711cp r2 = this.A00;
        if (r2.A02.isCancelled()) {
            r2.A00.A04(Boolean.TRUE);
        }
        r2.A01.countDown();
    }
}
