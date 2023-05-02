package X;

import java.util.Enumeration;

/* renamed from: X.5Hk  reason: invalid class name */
public class AnonymousClass5Hk extends C32061fa {
    public C107515Im A00;
    public C33041hq A01;
    public C107405Ib A02;
    public C107595Iu A03;
    public AnonymousClass5II A04;

    public AnonymousClass5Hk(C32411gJ r7) {
        String str;
        Enumeration A0B = r7.A0B();
        C33041hq A002 = C33041hq.A00(A0B.nextElement());
        this.A01 = A002;
        int A0A = A002.A0A();
        if (A0A < 0 || A0A > 1) {
            str = "invalid version for private key info";
        } else {
            this.A04 = AnonymousClass5II.A00(A0B.nextElement());
            this.A02 = C107405Ib.A01(A0B.nextElement());
            int i2 = -1;
            while (A0B.hasMoreElements()) {
                C107525In r2 = (C107525In) A0B.nextElement();
                int i3 = r2.A00;
                if (i3 > i2) {
                    if (i3 == 0) {
                        this.A03 = C107595Iu.A01(r2);
                    } else if (i3 != 1) {
                        str = "unknown optional field in private key info";
                    } else if (A0A >= 1) {
                        this.A00 = AnonymousClass5HY.A01(r2);
                    } else {
                        str = "'publicKey' requires version v2(1) or later";
                    }
                    i2 = i3;
                } else {
                    str = "invalid optional field in private key info";
                }
            }
            return;
        }
        throw AnonymousClass000.A0T(str);
    }

    public C32051fZ Agm() {
        C32391gH r3 = new C32391gH(5);
        r3.A02(this.A01);
        r3.A02(this.A04);
        r3.A02(this.A02);
        C107595Iu r0 = this.A03;
        if (r0 != null) {
            C107525In.A04(r0, r3, false);
        }
        C107515Im r1 = this.A00;
        if (r1 != null) {
            C107525In.A03(r1, r3, 1, false);
        }
        return new C32401gI(r3);
    }
}
