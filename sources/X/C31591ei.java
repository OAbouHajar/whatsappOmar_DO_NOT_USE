package X;

import com.whatsapp.util.Log;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.1ei  reason: invalid class name and case insensitive filesystem */
public abstract class C31591ei {
    public final CountDownLatch A00 = new CountDownLatch(1);
    public volatile Object A01;

    public static Object A00(C31591ei r1) {
        try {
            r1.A01();
            r1.A00.await();
            return r1.A01;
        } catch (Exception e2) {
            Log.e("AsyncRunnable/runAndWait", e2);
            return null;
        }
    }

    public abstract void A01();

    public void A02(Object obj) {
        this.A01 = obj;
        this.A00.countDown();
    }
}
