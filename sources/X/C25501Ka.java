package X;

import java.util.Random;

/* renamed from: X.1Ka  reason: invalid class name and case insensitive filesystem */
public class C25501Ka {
    public Integer A00 = null;
    public String A01;
    public Random A02;
    public final C14710pd A03;
    public final C16490t9 A04;

    public C25501Ka(C14710pd r2, C16490t9 r3) {
        this.A04 = r3;
        this.A03 = r2;
    }

    public void A00(int i2, long j2, long j3) {
        Integer num;
        if (i2 == 1 || (num = this.A00) == null || num.intValue() != 4) {
            C75883ss r1 = new C75883ss();
            r1.A01 = 4;
            r1.A06 = Long.valueOf(j2);
            r1.A08 = Long.valueOf(j3);
            r1.A04 = Integer.valueOf(i2);
            A01(r1);
        }
    }

    public final void A01(C75883ss r2) {
        r2.A02 = 0;
        r2.A0A = this.A01;
        this.A04.A06(r2);
        this.A00 = r2.A01;
    }
}
