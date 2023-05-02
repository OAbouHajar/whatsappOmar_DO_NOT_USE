package X;

import android.content.Context;
import androidx.work.WorkerParameters;

/* renamed from: X.02O  reason: invalid class name */
public abstract class AnonymousClass02O {
    public Context A00;
    public WorkerParameters A01;
    public boolean A02;
    public volatile boolean A03;

    public AnonymousClass02O(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.A00 = context;
            this.A01 = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    public C29981bY A00() {
        AnonymousClass0H9 A002 = AnonymousClass0H9.A00();
        A002.A0A(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return A002;
    }

    public abstract C29981bY A02();

    public void A03() {
    }
}
