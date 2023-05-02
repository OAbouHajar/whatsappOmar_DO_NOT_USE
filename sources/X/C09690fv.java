package X;

import java.util.concurrent.BlockingQueue;

/* renamed from: X.0fv  reason: invalid class name and case insensitive filesystem */
public class C09690fv implements Runnable {
    public final /* synthetic */ C11290iV A00;

    public C09690fv(C11290iV r1) {
        this.A00 = r1;
    }

    public void run() {
        try {
            C11290iV r6 = this.A00;
            BlockingQueue blockingQueue = r6.A02;
            Runnable runnable = (Runnable) blockingQueue.poll();
            if (runnable != null) {
                runnable.run();
            } else {
                AnonymousClass0X1.A02(C11290iV.class, r6.A01, "%s: Worker has nothing to run");
            }
            int decrementAndGet = r6.A05.decrementAndGet();
            if (!blockingQueue.isEmpty()) {
                r6.A00();
            } else {
                AnonymousClass0X1.A01(C11290iV.class, r6.A01, Integer.valueOf(decrementAndGet), "%s: worker finished; %d workers left");
            }
        } catch (Throwable th) {
            C11290iV r1 = this.A00;
            int decrementAndGet2 = r1.A05.decrementAndGet();
            if (!r1.A02.isEmpty()) {
                r1.A00();
                throw th;
            } else {
                AnonymousClass0X1.A01(C11290iV.class, r1.A01, Integer.valueOf(decrementAndGet2), "%s: worker finished; %d workers left");
                throw th;
            }
        }
    }
}
