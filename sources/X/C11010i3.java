package X;

/* renamed from: X.0i3  reason: invalid class name and case insensitive filesystem */
public final class C11010i3 implements C15220qW {
    public C003401n A00;
    public final AnonymousClass1DU A01;
    public final AnonymousClass1DU A02;
    public final AnonymousClass1DU A03;
    public final AnonymousClass2BR A04;

    public C11010i3(AnonymousClass1DU r1, AnonymousClass1DU r2, AnonymousClass1DU r3, AnonymousClass2BR r4) {
        this.A04 = r4;
        this.A03 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }

    /* renamed from: A00 */
    public C003401n getValue() {
        C003401n r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C003401n A012 = new C006602z((AnonymousClass04o) this.A02.AIT(), (C010505a) this.A03.AIT(), C014006s.A00).A01(C04360Mg.A00(this.A04));
        this.A00 = A012;
        return A012;
    }
}
