package X;

import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.48H  reason: invalid class name */
public class AnonymousClass48H {
    public static boolean A00(CountDownLatch countDownLatch) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z2 = false;
        long j2 = 5000;
        boolean z3 = false;
        while (true) {
            try {
                z2 = countDownLatch.await(j2, TimeUnit.MILLISECONDS);
                if (z3) {
                }
            } catch (InterruptedException unused) {
                z3 = true;
                j2 = 5000 - (SystemClock.elapsedRealtime() - elapsedRealtime);
                if (j2 <= 0) {
                    break;
                }
            }
        }
        Thread.currentThread().interrupt();
        return z2;
    }
}
