package X;

/* renamed from: X.1iv  reason: invalid class name and case insensitive filesystem */
public class C33651iv extends C20380zx {
    public final AnonymousClass19D A00;
    public final AnonymousClass10Y A01;
    public final C16440t3 A02;
    public final C15810rt A03;

    public C33651iv(AnonymousClass19D r1, AnonymousClass10Y r2, C16440t3 r3, C15810rt r4, C20360zv r5) {
        super(r5);
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void A0A(C37011oT r6) {
        C15840rx A06;
        C15830rv r3 = r6.A01;
        C15810rt r2 = this.A03;
        if (r2.A06(r3) != null) {
            int A002 = C36801o8.A00(this.A00.A04(r3, false), r6.A00);
            if (A002 == 0 || !(A002 == 1 || A002 == 2)) {
                if (r6.A02 && (A06 = r2.A06(r3)) != null && ((long) A06.A06) == -1) {
                    A0B(r6);
                }
                A06(r6);
                return;
            }
            A0B(r6);
        }
        A07(r6);
    }

    public final void A0B(C37011oT r5) {
        boolean z2 = r5.A02;
        AnonymousClass10Y r2 = this.A01;
        C15830rv r1 = r5.A01;
        if (z2) {
            r2.A00(r1, 0, false, true);
        } else {
            r2.A02(r1, false);
        }
    }
}
