package X;

import android.net.Network;
import java.util.concurrent.ScheduledFuture;

/* renamed from: X.55l  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1044555l implements Runnable {
    public final /* synthetic */ Network A00;
    public final /* synthetic */ AnonymousClass3LQ A01;
    public final /* synthetic */ ScheduledFuture A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C1044555l(Network network, AnonymousClass3LQ r2, ScheduledFuture scheduledFuture, boolean z2) {
        this.A01 = r2;
        this.A02 = scheduledFuture;
        this.A00 = network;
        this.A03 = z2;
    }

    public final void run() {
        AnonymousClass3LQ.A00(this.A00, this.A01, this.A02, this.A03);
    }
}
