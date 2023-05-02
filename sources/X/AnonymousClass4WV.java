package X;

/* renamed from: X.4WV  reason: invalid class name */
public final class AnonymousClass4WV {
    public int A00;
    public String A01;
    public final int A02;
    public final int A03;
    public final String A04;

    public AnonymousClass4WV(int i2, int i3, int i4) {
        String str;
        if (i2 != Integer.MIN_VALUE) {
            StringBuilder A0o = AnonymousClass000.A0o();
            A0o.append(i2);
            str = AnonymousClass000.A0h("/", A0o);
        } else {
            str = "";
        }
        this.A04 = str;
        this.A02 = i3;
        this.A03 = i4;
        this.A00 = Integer.MIN_VALUE;
        this.A01 = "";
    }

    public static C32481gS A00(C15060qG r2, AnonymousClass4WV r3) {
        return r2.Ah1(r3.A01(), 1);
    }

    public int A01() {
        int i2 = this.A00;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        throw AnonymousClass000.A0V("generateNewId() must be called before retrieving ids.");
    }

    public String A02() {
        if (this.A00 != Integer.MIN_VALUE) {
            return this.A01;
        }
        throw AnonymousClass000.A0V("generateNewId() must be called before retrieving ids.");
    }

    public void A03() {
        int i2 = this.A00;
        int i3 = i2 == Integer.MIN_VALUE ? this.A02 : i2 + this.A03;
        this.A00 = i3;
        this.A01 = C13680ns.A0i(this.A04, AnonymousClass000.A0o(), i3);
    }
}
