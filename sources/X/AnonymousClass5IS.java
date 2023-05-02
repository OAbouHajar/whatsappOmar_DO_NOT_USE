package X;

import java.util.Enumeration;

/* renamed from: X.5IS  reason: invalid class name */
public class AnonymousClass5IS extends C32061fa implements C32031fX {
    public C33041hq A00;
    public C107595Iu A01;
    public C107595Iu A02;
    public C107595Iu A03;
    public C107595Iu A04;
    public AnonymousClass5IR A05;

    public AnonymousClass5IS(C32411gJ r5) {
        Enumeration A0B = r5.A0B();
        this.A00 = (C33041hq) A0B.nextElement();
        this.A03 = (C107595Iu) A0B.nextElement();
        Object nextElement = A0B.nextElement();
        this.A05 = nextElement instanceof AnonymousClass5IR ? (AnonymousClass5IR) nextElement : nextElement != null ? new AnonymousClass5IR(C32411gJ.A00(nextElement)) : null;
        while (A0B.hasMoreElements()) {
            C32051fZ r2 = (C32051fZ) A0B.nextElement();
            if (r2 instanceof C107525In) {
                C107525In r22 = (C107525In) r2;
                int i2 = r22.A00;
                if (i2 == 0) {
                    this.A01 = C107595Iu.A01(r22);
                } else if (i2 == 1) {
                    this.A02 = C107595Iu.A01(r22);
                } else {
                    throw AnonymousClass000.A0T(C13680ns.A0c(i2, "unknown tag value "));
                }
            } else {
                this.A04 = (C107595Iu) r2;
            }
        }
    }

    public AnonymousClass5IS(C33041hq r2, C107595Iu r3, C107595Iu r4, C107595Iu r5, AnonymousClass5IR r6) {
        this.A00 = r2;
        this.A03 = r3;
        this.A05 = r6;
        this.A01 = r4;
        this.A02 = null;
        this.A04 = r5;
    }

    public C32051fZ Agm() {
        C32391gH r3 = new C32391gH(6);
        r3.A02(this.A00);
        r3.A02(this.A03);
        r3.A02(this.A05);
        C107595Iu r0 = this.A01;
        if (r0 != null) {
            C107525In.A04(r0, r3, false);
        }
        C107595Iu r1 = this.A02;
        if (r1 != null) {
            C107525In.A03(r1, r3, 1, false);
        }
        r3.A02(this.A04);
        return new C107545Ip(r3);
    }
}
