package X;

import com.facebook.redex.RunnableRunnableShape15S0200000_I1_3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0iu  reason: invalid class name and case insensitive filesystem */
public final class C11520iu extends AnonymousClass5GL implements C12910lA {
    public final Executor A00;

    public C11520iu(Executor executor) {
        this.A00 = executor;
        C87774Ym.A00(executor);
    }

    public static final void A02(Future future, AnonymousClass5GN r1) {
        A03(future, r1);
    }

    public static final void A03(Future future, AnonymousClass5GN r2) {
        r2.A0F(new AnonymousClass5GC(future));
    }

    public static final void A04(RejectedExecutionException rejectedExecutionException, AnonymousClass1UM r3) {
        CancellationException cancellationException = new CancellationException("The task was rejected");
        cancellationException.initCause(rejectedExecutionException);
        C06300Ve.A00(cancellationException, r3);
    }

    public void A05(Runnable runnable, AnonymousClass1UM r3) {
        try {
            this.A00.execute(runnable);
        } catch (RejectedExecutionException e2) {
            A04(e2, r3);
            C90394e4.A00().A05(runnable, r3);
        }
    }

    public final ScheduledFuture A06(Runnable runnable, ScheduledExecutorService scheduledExecutorService, AnonymousClass1UM r6) {
        try {
            return scheduledExecutorService.schedule(runnable, 500, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e2) {
            A04(e2, r6);
            return null;
        }
    }

    public void Ad6(AnonymousClass5GN r6, long j2) {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledFuture A06;
        Executor executor = this.A00;
        if (!(executor instanceof ScheduledExecutorService) || (scheduledExecutorService = (ScheduledExecutorService) executor) == null || (A06 = A06(new RunnableRunnableShape15S0200000_I1_3(r6, 14, this), scheduledExecutorService, r6.AAx())) == null) {
            AnonymousClass5GP.A01.Ad6(r6, 500);
        } else {
            A02(A06, r6);
        }
    }

    public void close() {
        ExecutorService executorService;
        Executor executor = this.A00;
        if ((executor instanceof ExecutorService) && (executorService = (ExecutorService) executor) != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C11520iu) && ((C11520iu) obj).A00 == this.A00;
    }

    public int hashCode() {
        return System.identityHashCode(this.A00);
    }

    public String toString() {
        return this.A00.toString();
    }
}
