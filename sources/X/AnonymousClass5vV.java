package X;

import java.util.Random;

/* renamed from: X.5vV  reason: invalid class name */
public class AnonymousClass5vV {
    public long A00;
    public C16440t3 A01;
    public String A02;
    public Random A03 = new Random();
    public final AnonymousClass1Vo A04 = C110105dW.A0Q("PaymentFieldStats", "notification");

    public AnonymousClass5vV(C16440t3 r3) {
        this.A01 = r3;
    }

    public String A00() {
        String str = this.A02;
        if (str != null) {
            return str;
        }
        byte[] bArr = new byte[8];
        this.A03.nextBytes(bArr);
        String A042 = C004101u.A04(bArr);
        this.A02 = A042;
        return A042;
    }

    public void A01() {
        this.A02 = null;
        this.A00 = 0;
    }

    public void A02() {
        this.A04.A06("PaymentWamEvent timer reset.");
        this.A00 = this.A01.A00();
    }
}
