package X;

/* renamed from: X.4qW  reason: invalid class name and case insensitive filesystem */
public final class C97764qW implements AnonymousClass5SP {
    public AnonymousClass5UO A00;
    public AnonymousClass5SP A01;
    public boolean A02 = true;
    public boolean A03;
    public final AnonymousClass5L4 A04;
    public final C97774qX A05;

    public C97764qW(AnonymousClass5L4 r2, AnonymousClass5TU r3) {
        this.A04 = r2;
        this.A05 = new C97774qX(r3);
    }

    public C89214bm AF4() {
        AnonymousClass5SP r0 = this.A01;
        return r0 != null ? r0.AF4() : this.A05.A02;
    }

    public long AFA() {
        return this.A02 ? this.A05.AFA() : this.A01.AFA();
    }

    public void AeL(C89214bm r2) {
        AnonymousClass5SP r0 = this.A01;
        if (r0 != null) {
            r0.AeL(r2);
            r2 = this.A01.AF4();
        }
        this.A05.AeL(r2);
    }
}
