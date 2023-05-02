package X;

/* renamed from: X.2j2  reason: invalid class name and case insensitive filesystem */
public abstract class C55202j2 {
    public final int A00;
    public final boolean A01;
    public final AnonymousClass3Y2[] A02;

    @Deprecated
    public C55202j2() {
        this.A02 = null;
        this.A01 = false;
        this.A00 = 0;
    }

    public C55202j2(AnonymousClass3Y2[] r2, int i2, boolean z2) {
        this.A02 = r2;
        boolean z3 = false;
        if (r2 != null && z2) {
            z3 = true;
        }
        this.A01 = z3;
        this.A00 = i2;
    }

    public void A00(C15760ro r3, C14370p3 r4) {
        C55192j1 r1 = (C55192j1) this;
        r1.A00 = r4;
        r1.A01((C109835Tv) ((C15770rp) r3).A01());
    }
}
