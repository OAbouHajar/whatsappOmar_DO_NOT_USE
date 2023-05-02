package X;

import java.util.UUID;

/* renamed from: X.13a  reason: invalid class name and case insensitive filesystem */
public final class C211613a {
    public Integer A00;
    public Long A01;
    public String A02;
    public String A03;
    public final C16440t3 A04;
    public final C16490t9 A05;

    public C211613a(C16440t3 r2, C16490t9 r3) {
        C18450wi.A0H(r3, 1);
        C18450wi.A0H(r2, 2);
        this.A05 = r3;
        this.A04 = r2;
    }

    public final void A00(int i2) {
        Integer num = this.A00;
        if (num != null && num.intValue() == i2) {
            this.A03 = null;
            this.A00 = null;
        }
    }

    public final void A01(int i2) {
        if (this.A03 == null && this.A00 == null) {
            this.A03 = UUID.randomUUID().toString();
            this.A00 = Integer.valueOf(i2);
        }
    }

    public final void A02(int i2) {
        C37701pa r1 = new C37701pa();
        r1.A03 = this.A03;
        r1.A02 = this.A02;
        r1.A00 = this.A00;
        r1.A01 = Integer.valueOf(i2);
        this.A05.A06(r1);
    }

    public final void A03(Integer num, String str, int i2, boolean z2) {
        C37691pZ r1 = new C37691pZ();
        r1.A02 = Integer.valueOf(i2);
        r1.A06 = this.A03;
        r1.A05 = this.A02;
        r1.A01 = num;
        r1.A04 = str;
        r1.A00 = Boolean.valueOf(z2);
        this.A05.A06(r1);
    }

    public final void A04(Integer num, String str, int i2, boolean z2) {
        Long l2 = null;
        if (i2 != 1) {
            Long l3 = this.A01;
            if (l3 != null) {
                l2 = Long.valueOf(System.currentTimeMillis() - l3.longValue());
            }
        } else {
            this.A01 = Long.valueOf(System.currentTimeMillis());
        }
        C37691pZ r1 = new C37691pZ();
        r1.A02 = Integer.valueOf(i2);
        r1.A06 = this.A03;
        r1.A05 = this.A02;
        r1.A01 = num;
        r1.A04 = str;
        r1.A03 = l2;
        r1.A00 = Boolean.valueOf(z2);
        this.A05.A06(r1);
    }
}
