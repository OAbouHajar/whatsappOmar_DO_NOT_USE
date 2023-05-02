package X;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: X.0iY  reason: invalid class name and case insensitive filesystem */
public class C11320iY extends FutureTask {
    public final /* synthetic */ C06250Uz A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11320iY(C06250Uz r1, Callable callable) {
        super(callable);
        this.A00 = r1;
    }

    public void done() {
        if (!isCancelled()) {
            try {
                this.A00.A02((C06150Um) get());
            } catch (InterruptedException | ExecutionException e2) {
                this.A00.A02(new C06150Um(e2));
            }
        }
    }
}
