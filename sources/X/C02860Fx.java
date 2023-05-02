package X;

/* renamed from: X.0Fx  reason: invalid class name and case insensitive filesystem */
public abstract class C02860Fx extends C05450Rm {
    public C02860Fx(AnonymousClass0SM r1) {
        super(r1);
    }

    public abstract void A04(C13500mT r1, Object obj);

    public final void A05(Object obj) {
        C13500mT A00 = A00();
        try {
            A04(A00, obj);
            ((AnonymousClass0GC) A00).A00.executeInsert();
        } finally {
            A03(A00);
        }
    }
}
