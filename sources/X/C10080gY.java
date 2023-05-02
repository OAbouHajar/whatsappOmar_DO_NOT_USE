package X;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* renamed from: X.0gY  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C10080gY implements Runnable {
    public final /* synthetic */ ConstraintTrackingWorker A00;
    public final /* synthetic */ C29981bY A01;

    public /* synthetic */ C10080gY(ConstraintTrackingWorker constraintTrackingWorker, C29981bY r2) {
        this.A00 = constraintTrackingWorker;
        this.A01 = r2;
    }

    public final void run() {
        ConstraintTrackingWorker.A00(this.A00, this.A01);
    }
}
