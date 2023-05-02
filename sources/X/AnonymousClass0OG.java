package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;

/* renamed from: X.0OG  reason: invalid class name */
public class AnonymousClass0OG {
    public final BlockingQueue A00 = new DelayQueue();
    public final C11160iI[] A01;

    public AnonymousClass0OG(int i2) {
        this.A01 = new C11160iI[i2];
        int i3 = 0;
        while (true) {
            C11160iI[] r1 = this.A01;
            if (i3 < r1.length) {
                r1[i3] = new C11160iI(this);
                this.A01[i3].setName(AnonymousClass000.A0l(AnonymousClass000.A0r("GCD-Thread #"), i3));
                this.A01[i3].start();
                i3++;
            } else {
                return;
            }
        }
    }
}
