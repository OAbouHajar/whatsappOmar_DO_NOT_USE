package X;

import androidx.work.Worker;

/* renamed from: X.0fh  reason: invalid class name and case insensitive filesystem */
public class C09550fh implements Runnable {
    public final /* synthetic */ Worker A00;

    public C09550fh(Worker worker) {
        this.A00 = worker;
    }

    public void run() {
        try {
            Worker worker = this.A00;
            worker.A00.A09(worker.A04());
        } catch (Throwable th) {
            this.A00.A00.A0A(th);
        }
    }
}
