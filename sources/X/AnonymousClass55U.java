package X;

import java.util.concurrent.ScheduledFuture;

/* renamed from: X.55U  reason: invalid class name */
public final /* synthetic */ class AnonymousClass55U implements Runnable {
    public final /* synthetic */ AnonymousClass3LQ A00;
    public final /* synthetic */ ScheduledFuture A01;

    public /* synthetic */ AnonymousClass55U(AnonymousClass3LQ r1, ScheduledFuture scheduledFuture) {
        this.A00 = r1;
        this.A01 = scheduledFuture;
    }

    public final void run() {
        AnonymousClass3LQ.A01(this.A00, this.A01);
    }
}
