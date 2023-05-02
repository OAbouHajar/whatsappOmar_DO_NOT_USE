package X;

import java.io.File;
import java.util.Random;

/* renamed from: X.1ON  reason: invalid class name */
public class AnonymousClass1ON implements C23541Cj {
    public final C26301Ne A00;
    public final C26311Nf A01;

    public AnonymousClass1ON(C26301Ne r1, C26311Nf r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public /* synthetic */ void APJ() {
    }

    public void APK() {
        C26301Ne r1 = this.A00;
        if (!r1.A0B.A01() || r1.A03.A05() == null || r1.A01() == 5) {
            C26311Nf r2 = this.A01;
            C16900tq r0 = r2.A05;
            r0.A04();
            if (r0.A01 && r2.A06.A0E(C16620tM.A02, 1456)) {
                Random random = r2.A0A;
                byte byteValue = new Byte[]{(byte) 1, (byte) 3, (byte) 2, (byte) 20, (byte) 13}[random.nextInt(5)].byteValue();
                File A0C = r2.A01.A0C(byteValue, 0, new Integer[]{2, 1, 3}[random.nextInt(3)].intValue());
                C16320sq r9 = r2.A09;
                C16300so r3 = r2.A00;
                C16490t9 r7 = r2.A07;
                C221516v r8 = r2.A08;
                r9.Ack(new C79013z3(r3, r2.A02, r2.A03, r2.A04, r7, r8, r9, A0C, byteValue), new Void[0]);
            }
        }
    }
}
