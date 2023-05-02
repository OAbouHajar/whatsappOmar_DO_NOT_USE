package X;

/* renamed from: X.5IC  reason: invalid class name */
public class AnonymousClass5IC extends C32061fa {
    public static final C33041hq A06 = new C33041hq(0);
    public C107395Ia A00;
    public C33041hq A01;
    public C32411gJ A02;
    public AnonymousClass5IL A03;
    public C107335Hu A04;
    public boolean A05;

    public AnonymousClass5IC(C32411gJ r6) {
        AnonymousClass5IQ A012;
        AnonymousClass5IL r1;
        C107405Ib A032;
        AnonymousClass5IL r3;
        int i2 = 0;
        if (!(r6.A0C(0) instanceof C107525In) || ((C107525In) r6.A0C(0)).A00 != 0) {
            this.A01 = A06;
        } else {
            this.A05 = true;
            this.A01 = C33041hq.A01((C107525In) r6.A0C(0), true);
            i2 = 1;
        }
        int i3 = i2 + 1;
        C32071fb A0C = r6.A0C(i2);
        if (A0C instanceof AnonymousClass5IL) {
            r3 = (AnonymousClass5IL) A0C;
        } else {
            if (A0C instanceof AnonymousClass5IT) {
                A032 = (C107405Ib) A0C;
            } else {
                if (A0C instanceof C107525In) {
                    C107525In r32 = (C107525In) A0C;
                    if (r32.A00 == 1) {
                        A012 = AnonymousClass5IQ.A01(C32411gJ.A01(r32, true));
                    } else {
                        A032 = C107405Ib.A03(r32, true);
                    }
                } else {
                    A012 = AnonymousClass5IQ.A01(A0C);
                }
                r1 = new AnonymousClass5IL(A012);
                r3 = r1;
            }
            r1 = new AnonymousClass5IL(A032);
            r3 = r1;
        }
        this.A03 = r3;
        int i4 = i3 + 1;
        this.A00 = C107395Ia.A01(r6.A0C(i3));
        int i5 = i4 + 1;
        this.A02 = (C32411gJ) r6.A0C(i4);
        if (r6.A0A() > i5) {
            this.A04 = C107335Hu.A01(C32411gJ.A01((C107525In) r6.A0C(i5), true));
        }
    }

    public C32051fZ Agm() {
        C32391gH r3 = new C32391gH(5);
        if (this.A05 || !this.A01.A04(A06)) {
            C107525In.A03(this.A01, r3, 0, true);
        }
        r3.A02(this.A03);
        r3.A02(this.A00);
        r3.A02(this.A02);
        C107335Hu r0 = this.A04;
        if (r0 != null) {
            C107525In.A04(r0, r3, true);
        }
        return new C32401gI(r3);
    }
}
