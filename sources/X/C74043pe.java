package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.3pe  reason: invalid class name and case insensitive filesystem */
public class C74043pe extends C18940xV {
    public final C15830rv A00;
    public final CountDownLatch A01;

    public C74043pe(C15830rv r1, CountDownLatch countDownLatch) {
        this.A00 = r1;
        this.A01 = countDownLatch;
    }

    public void A06(C16740tZ r2, int i2) {
        if (AnonymousClass3K4.A1A(r2, this.A00)) {
            this.A01.countDown();
        }
    }
}
