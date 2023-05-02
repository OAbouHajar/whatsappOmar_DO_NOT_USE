package X;

import java.math.BigInteger;

/* renamed from: X.5Hz  reason: invalid class name and case insensitive filesystem */
public class C107385Hz extends C32061fa {
    public static final BigInteger A03 = BigInteger.valueOf(0);
    public C33041hq A00;
    public C33041hq A01;
    public AnonymousClass5IP A02;

    public C107385Hz(C32411gJ r6) {
        C107525In r0;
        int i2;
        String str;
        String str2;
        this.A02 = AnonymousClass5IP.A00(r6.A0C(0));
        int A0A = r6.A0A();
        if (A0A != 1) {
            if (A0A == 2) {
                r0 = C107525In.A01(r6.A0C(1));
                i2 = r0.A00;
                if (i2 != 0) {
                    if (i2 != 1) {
                        str = "Bad tag number: ";
                    }
                    this.A00 = C33041hq.A01(r0, false);
                    return;
                }
                this.A01 = C33041hq.A01(r0, false);
                return;
            } else if (A0A == 3) {
                C107525In A012 = C107525In.A01(r6.A0C(1));
                i2 = A012.A00;
                if (i2 == 0) {
                    this.A01 = C33041hq.A01(A012, false);
                    r0 = C107525In.A01(r6.A0C(2));
                    i2 = r0.A00;
                    if (i2 != 1) {
                        str = "Bad tag number for 'maximum': ";
                    }
                    this.A00 = C33041hq.A01(r0, false);
                    return;
                }
                str = "Bad tag number for 'minimum': ";
            } else {
                str2 = AnonymousClass000.A0l(AnonymousClass000.A0r("Bad sequence size: "), r6.A0A());
                throw AnonymousClass000.A0T(str2);
            }
            str2 = C13680ns.A0c(i2, str);
            throw AnonymousClass000.A0T(str2);
        }
    }

    public C32051fZ Agm() {
        C32391gH r3 = new C32391gH(3);
        r3.A02(this.A02);
        C33041hq r1 = this.A01;
        if (r1 != null && !r1.A0B(A03)) {
            C107525In.A04(r1, r3, false);
        }
        C33041hq r12 = this.A00;
        if (r12 != null) {
            C107525In.A03(r12, r3, 1, false);
        }
        return new C32401gI(r3);
    }
}
