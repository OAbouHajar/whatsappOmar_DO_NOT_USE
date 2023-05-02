package X;

import com.facebook.redex.RunnableRunnableShape2S0200000_I0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.0ox  reason: invalid class name and case insensitive filesystem */
public final class C14310ox {
    public static Object A00(C14210on r4, TimeUnit timeUnit, long j2) {
        C13710nw.A06("Must not be called on the main application thread");
        C13710nw.A02(r4, "Task must not be null");
        C13710nw.A02(timeUnit, "TimeUnit must not be null");
        if (!r4.A09()) {
            C14490pG r3 = new C14490pG((RunnableRunnableShape2S0200000_I0) null);
            Executor executor = C14500pH.A01;
            r4.A06(r3, executor);
            r4.A05(r3, executor);
            r4.A03.A00(new C14510pI(r3, executor));
            r4.A04();
            if (!r3.A00.await(j2, timeUnit)) {
                throw new TimeoutException("Timed out waiting for Task");
            }
        }
        if (r4.A0A()) {
            return r4.A01();
        }
        if (r4.A05) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(r4.A00());
    }
}
