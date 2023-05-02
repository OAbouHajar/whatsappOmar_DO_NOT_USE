package X;

/* renamed from: X.4dJ  reason: invalid class name and case insensitive filesystem */
public class C89984dJ {
    public static final C89984dJ A04 = new C89984dJ(2);
    public static final C89984dJ A05 = new C89984dJ(-1);
    public static final C89984dJ A06 = new C89984dJ(0);
    public C109165Qy A00;
    public C109165Qy A01;
    public C109175Qz A02;
    public boolean A03;

    public C89984dJ() {
        this(0);
    }

    public C89984dJ(int i2) {
        boolean z2 = false;
        boolean A1P = AnonymousClass000.A1P(i2 & 1);
        boolean A1P2 = AnonymousClass000.A1P(i2 & 4);
        boolean A1P3 = AnonymousClass000.A1P(i2 & 2);
        this.A03 = (i2 & 16) > 0 ? true : z2;
        C109165Qy r1 = (i2 & 8) > 0 ? C90424e7.A02 : C90424e7.A03;
        if (A1P2) {
            this.A01 = C90424e7.A04;
        } else {
            this.A01 = r1;
        }
        this.A00 = A1P ? C90424e7.A04 : r1;
        if (A1P3) {
            this.A02 = C90424e7.A00;
        } else {
            this.A02 = C90424e7.A01;
        }
    }

    public void A00(Appendable appendable, String str) {
        if (!this.A01.ALc(str)) {
            appendable.append(str);
            return;
        }
        appendable.append('\"');
        if (str != null) {
            this.A02.A8h(appendable, str);
        }
        appendable.append('\"');
    }
}
