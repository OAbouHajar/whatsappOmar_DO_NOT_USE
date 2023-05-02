package X;

/* renamed from: X.4Tp  reason: invalid class name and case insensitive filesystem */
public final class C86644Tp {
    public final C28371Vv A00;
    public final AnonymousClass5NA A01;

    public C86644Tp(C16300so r5, C28371Vv r6) {
        C28371Vv.A06(r6, "state");
        C32261fw[] r2 = new C32261fw[4];
        r2[0] = AnonymousClass3K3.A0X(r5, 42);
        r2[1] = AnonymousClass3K3.A0X(r5, 41);
        r2[2] = AnonymousClass3K3.A0X(r5, 40);
        this.A01 = (AnonymousClass5NA) C32271fx.A04(r6, "FDSResourceState|FDSChoiceState|FDSSucceedState|FDSPassState", AnonymousClass3K2.A0q(AnonymousClass3K3.A0X(r5, 43), r2, 3), new String[0]);
        this.A00 = r6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C86644Tp.class != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C86644Tp) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
