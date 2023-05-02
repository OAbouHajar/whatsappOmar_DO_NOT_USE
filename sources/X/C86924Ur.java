package X;

/* renamed from: X.4Ur  reason: invalid class name and case insensitive filesystem */
public final class C86924Ur {
    public final AnonymousClass4SN A00;
    public final AnonymousClass4SO A01;
    public final C86804Uf A02;
    public final AnonymousClass4SP A03;
    public final String A04;

    public C86924Ur(AnonymousClass4SN r1, AnonymousClass4SO r2, C86804Uf r3, AnonymousClass4SP r4, String str) {
        this.A04 = str;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C86924Ur)) {
            return false;
        }
        C86924Ur r4 = (C86924Ur) obj;
        return AnonymousClass3C1.A0F(this.A04, r4.A04) && this.A00.equals(r4.A00) && AnonymousClass3C1.A0F(this.A02, r4.A02) && AnonymousClass3C1.A0F(this.A01, r4.A01) && AnonymousClass3C1.A0F(this.A03, r4.A03);
    }

    public int hashCode() {
        int A07 = AnonymousClass3K4.A07(this.A04);
        C86804Uf r0 = this.A02;
        return AnonymousClass3K2.A06(this.A03, AnonymousClass000.A0E(this.A00, AnonymousClass000.A0E(this.A01, (A07 + (r0 != null ? r0.hashCode() : 0)) * 31)));
    }
}
