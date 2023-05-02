package X;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.5tc  reason: invalid class name and case insensitive filesystem */
public class C117825tc {
    public final AtomicReference A00 = new AtomicReference(new CountDownLatch(0));

    public static void A00(AnonymousClass5zC r3) {
        C117825tc r2 = r3.A0N;
        AtomicReference atomicReference = r2.A00;
        ((CountDownLatch) atomicReference.get()).countDown();
        ((CountDownLatch) atomicReference.get()).countDown();
        r2.A01(0);
        C118215uK r1 = r3.A0L;
        r1.A01.A00();
        r1.A02.A00();
        r3.Adx((AnonymousClass687) null);
        r3.A0O.A05.A00();
        r3.A0Q.A00();
    }

    public void A01(int i2) {
        CountDownLatch countDownLatch = (CountDownLatch) this.A00.getAndSet(new CountDownLatch(i2));
        if (countDownLatch != null) {
            while (countDownLatch.getCount() > 0) {
                countDownLatch.countDown();
            }
        }
    }
}
