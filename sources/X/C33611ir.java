package X;

/* renamed from: X.1ir  reason: invalid class name and case insensitive filesystem */
public class C33611ir extends C20380zx {
    public final C16440t3 A00;
    public final C15810rt A01;
    public final C16220sf A02;

    public C33611ir(C16440t3 r1, C15810rt r2, C20360zv r3, C16220sf r4) {
        super(r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r4;
    }

    public final void A0A(C37121oe r7) {
        if (r7.A02) {
            long j2 = r7.A00;
            if (j2 != -1) {
                j2 = this.A00.A02(j2);
            }
            this.A02.A0S(r7.A01, j2, false);
            return;
        }
        C16220sf r2 = this.A02;
        C15830rv r1 = r7.A01;
        if (r2.A0Q(r1)) {
            r2.A0P(r1);
        }
    }
}
