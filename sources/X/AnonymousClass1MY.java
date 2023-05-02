package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1MY  reason: invalid class name */
public class AnonymousClass1MY {
    public final C16490t9 A00;
    public final AtomicInteger A01 = new AtomicInteger();

    public AnonymousClass1MY(C16490t9 r2) {
        this.A00 = r2;
    }

    public void A00(Boolean bool, Boolean bool2, int i2) {
        C75123re r2 = new C75123re();
        r2.A03 = Long.valueOf((long) this.A01.getAndIncrement());
        r2.A02 = Integer.valueOf(i2);
        r2.A00 = bool;
        r2.A01 = bool2;
        this.A00.A06(r2);
    }
}
