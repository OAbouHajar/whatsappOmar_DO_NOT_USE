package X;

/* renamed from: X.5Hl  reason: invalid class name */
public class AnonymousClass5Hl extends C32061fa {
    public C33041hq A00;
    public C32411gJ A01;
    public AnonymousClass5IQ A02;
    public AnonymousClass5II A03;
    public C107335Hu A04;
    public AnonymousClass5IO A05;
    public AnonymousClass5IO A06;

    public AnonymousClass5Hl(C32411gJ r5) {
        if (r5.A0A() < 3 || r5.A0A() > 7) {
            throw AnonymousClass000.A0T(AnonymousClass000.A0l(AnonymousClass000.A0r("Bad sequence size: "), r5.A0A()));
        }
        int i2 = 0;
        if (r5.A0C(0) instanceof C33041hq) {
            this.A00 = C33041hq.A00(r5.A0C(0));
            i2 = 1;
        }
        int i3 = i2 + 1;
        this.A03 = AnonymousClass5II.A00(r5.A0C(i2));
        int i4 = i3 + 1;
        this.A02 = AnonymousClass5IQ.A01(r5.A0C(i3));
        int i5 = i4 + 1;
        this.A06 = AnonymousClass5IO.A00(r5.A0C(i4));
        if (i5 < r5.A0A() && ((r5.A0C(i5) instanceof AnonymousClass5IX) || (r5.A0C(i5) instanceof C107395Ia) || (r5.A0C(i5) instanceof AnonymousClass5IO))) {
            this.A05 = AnonymousClass5IO.A00(r5.A0C(i5));
            i5++;
        }
        if (i5 < r5.A0A() && !(r5.A0C(i5) instanceof C107525In)) {
            this.A01 = C32411gJ.A00(r5.A0C(i5));
            i5++;
        }
        if (i5 < r5.A0A() && (r5.A0C(i5) instanceof C107525In)) {
            this.A04 = C107335Hu.A01(C32411gJ.A01((C107525In) r5.A0C(i5), true));
        }
    }

    public C32051fZ Agm() {
        C32391gH r2 = new C32391gH(7);
        C33041hq r0 = this.A00;
        if (r0 != null) {
            r2.A02(r0);
        }
        r2.A02(this.A03);
        r2.A02(this.A02);
        r2.A02(this.A06);
        AnonymousClass5IO r02 = this.A05;
        if (r02 != null) {
            r2.A02(r02);
        }
        C32411gJ r03 = this.A01;
        if (r03 != null) {
            r2.A02(r03);
        }
        C107335Hu r1 = this.A04;
        if (r1 != null) {
            r2.A02(new C107625Ix(r1));
        }
        return new C32401gI(r2);
    }
}
