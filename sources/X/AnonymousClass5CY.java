package X;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.FutureTask;

/* renamed from: X.5CY  reason: invalid class name */
public final class AnonymousClass5CY extends FutureTask {
    public final /* synthetic */ C15010qB A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5CY(C15010qB r1, Object obj, Runnable runnable) {
        super(runnable, obj);
        this.A00 = r1;
    }

    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.A00.A00.A00;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        } else if (Log.isLoggable("GAv4", 6)) {
            String valueOf = String.valueOf(th);
            StringBuilder A0g = C13690nt.A0g(valueOf.length() + 37);
            A0g.append("MeasurementExecutor: job failed with ");
            Log.e("GAv4", AnonymousClass000.A0h(valueOf, A0g));
        }
        super.setException(th);
    }
}
