package X;

/* renamed from: X.5IB  reason: invalid class name */
public class AnonymousClass5IB extends C32061fa {
    public static final C33041hq A04 = new C33041hq(20);
    public static final C33041hq A05 = new C33041hq(1);
    public static final AnonymousClass5II A06;
    public static final AnonymousClass5II A07;
    public C33041hq A00 = A04;
    public C33041hq A01 = A05;
    public AnonymousClass5II A02 = A06;
    public AnonymousClass5II A03 = A07;

    static {
        AnonymousClass5II r2 = new AnonymousClass5II(C107275Hc.A00, C32341gA.A07);
        A06 = r2;
        A07 = new AnonymousClass5II(r2, C32031fX.A1J);
    }

    public AnonymousClass5IB() {
    }

    public AnonymousClass5IB(C32411gJ r6) {
        for (int i2 = 0; i2 != r6.A0A(); i2++) {
            C107525In r3 = (C107525In) r6.A0C(i2);
            int i3 = r3.A00;
            if (i3 == 0) {
                this.A02 = AnonymousClass5II.A00(C32411gJ.A01(r3, true));
            } else if (i3 == 1) {
                this.A03 = AnonymousClass5II.A00(C32411gJ.A01(r3, true));
            } else if (i3 == 2) {
                this.A00 = C33041hq.A01(r3, true);
            } else if (i3 == 3) {
                this.A01 = C33041hq.A01(r3, true);
            } else {
                throw AnonymousClass000.A0T("unknown tag");
            }
        }
    }

    public C32051fZ Agm() {
        C32391gH r3 = new C32391gH(4);
        AnonymousClass5II r1 = this.A02;
        if (!r1.equals(A06)) {
            C107525In.A03(r1, r3, 0, true);
        }
        AnonymousClass5II r12 = this.A03;
        if (!r12.equals(A07)) {
            C107525In.A04(r12, r3, true);
        }
        C33041hq r13 = this.A00;
        if (!r13.A04(A04)) {
            C107525In.A03(r13, r3, 2, true);
        }
        C33041hq r14 = this.A01;
        if (!r14.A04(A05)) {
            C107525In.A03(r14, r3, 3, true);
        }
        return new C32401gI(r3);
    }
}
