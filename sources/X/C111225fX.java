package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.5fX  reason: invalid class name and case insensitive filesystem */
public class C111225fX extends C04350Mf {
    public long A00;
    public String A01;
    public String A02;
    public final int A03;
    public final C17420v3 A04;
    public final C117585tE A05;
    public final Integer A06;

    public C111225fX(C17420v3 r1, C117585tE r2, Integer num, int i2) {
        this.A05 = r2;
        this.A04 = r1;
        this.A03 = i2;
        this.A06 = num;
    }

    public void A00() {
        String str = this.A02;
        if (str == null) {
            this.A04.ALp(this.A03);
        } else {
            String str2 = this.A01;
            long j2 = this.A00;
            Integer num = this.A06;
            int i2 = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
            if (num != null) {
                C117585tE r0 = this.A05;
                if (i2 == 0) {
                    r0.A03.ALA(str, str2, this.A03, num.intValue());
                } else {
                    int i3 = this.A03;
                    int intValue = num.intValue();
                    r0.A03.ALB(str, str2, TimeUnit.MILLISECONDS, i3, intValue, j2);
                }
            } else if (i2 == 0) {
                C117585tE r02 = this.A05;
                r02.A03.AL6(this.A03, str, str2);
            } else {
                C117585tE r1 = this.A05;
                int i4 = this.A03;
                r1.A03.ALD(str, str2, TimeUnit.MILLISECONDS, i4, j2);
            }
        }
        this.A02 = null;
        this.A01 = null;
        this.A00 = -1;
    }
}
