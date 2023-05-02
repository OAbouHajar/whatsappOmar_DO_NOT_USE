package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5uN  reason: invalid class name and case insensitive filesystem */
public class C118245uN {
    public final C1222368u A00;
    public final AtomicBoolean A01 = new AtomicBoolean(false);
    public final AtomicInteger A02 = new AtomicInteger(2);
    public final String[] A03 = new String[2];

    public C118245uN(C1222368u r4) {
        this.A00 = r4;
    }

    public void A00(int i2, String str) {
        String[] strArr = this.A03;
        strArr[i2] = str;
        if (this.A02.decrementAndGet() == 0 && this.A01.compareAndSet(false, true)) {
            this.A00.AYF(strArr);
        }
    }
}
