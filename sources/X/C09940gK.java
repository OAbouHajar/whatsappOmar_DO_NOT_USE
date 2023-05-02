package X;

import androidx.work.Worker;

/* renamed from: X.0gK  reason: invalid class name and case insensitive filesystem */
public class C09940gK implements Runnable {
    public final /* synthetic */ Worker A00;
    public final /* synthetic */ AnonymousClass0H9 A01;

    public C09940gK(Worker worker, AnonymousClass0H9 r2) {
        this.A00 = worker;
        this.A01 = r2;
    }

    public void run() {
        try {
            throw AnonymousClass000.A0V("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
        } catch (Throwable th) {
            this.A01.A0A(th);
        }
    }
}
