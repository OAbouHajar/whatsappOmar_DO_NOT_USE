package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1qJ  reason: invalid class name and case insensitive filesystem */
public class C38141qJ {
    public C38131qI A00;
    public AtomicInteger A01 = new AtomicInteger();

    public C38141qJ(C38131qI r2) {
        this.A00 = r2;
    }

    public Object A00(AnonymousClass2A2 r7) {
        C38131qI r0;
        C29561ap ABS = this.A00.ABS();
        if (ABS == null) {
            return null;
        }
        C90774em r3 = null;
        boolean z2 = false;
        while (ABS != null) {
            r3 = r7.Acg(ABS);
            if (z2) {
                this.A01.incrementAndGet();
            }
            if (!r3.A05) {
                int i2 = r3.A00;
                z2 = true;
                if (i2 != 1 || (r0 = r3.A01) == null) {
                    this.A00.AQd(r3.A04, i2);
                    if (!r3.A03) {
                    }
                } else {
                    this.A00 = r0;
                    z2 = false;
                }
                try {
                    Thread.sleep(this.A00.AA2());
                    ABS = this.A00.ABS();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            return r3.A02;
        }
        if (r3 != null) {
            return r3.A02;
        }
        return null;
    }
}
