package X;

import android.content.BroadcastReceiver;
import android.content.Intent;
import com.facebook.redex.RunnableRunnableShape12S0200000_I1;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4RR  reason: invalid class name */
public final class AnonymousClass4RR {
    public boolean A00 = false;
    public final BroadcastReceiver.PendingResult A01;
    public final Intent A02;
    public final ScheduledFuture A03;

    public AnonymousClass4RR(BroadcastReceiver.PendingResult pendingResult, Intent intent, ScheduledExecutorService scheduledExecutorService) {
        this.A02 = intent;
        this.A01 = pendingResult;
        this.A03 = scheduledExecutorService.schedule(new RunnableRunnableShape12S0200000_I1(this, 25, intent), 9000, TimeUnit.MILLISECONDS);
    }

    public final synchronized void A00() {
        if (!this.A00) {
            this.A01.finish();
            this.A03.cancel(false);
            this.A00 = true;
        }
    }
}
