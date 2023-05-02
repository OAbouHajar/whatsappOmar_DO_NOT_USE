package X;

/* renamed from: X.53v  reason: invalid class name and case insensitive filesystem */
public final class C1040753v implements AnonymousClass5NE {
    public final C28371Vv A00;
    public final String A01;

    public C1040753v(C28371Vv r10) {
        String[] A1b = AnonymousClass3K3.A1b(r10, "member_add_mode");
        A1b[0] = "#elementValue";
        this.A01 = (String) C32271fx.A01((C16300so) null, r10, String.class, AnonymousClass3K2.A0a(), 100L, (Object) null, A1b, false);
        this.A00 = r10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1040753v.class != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C1040753v) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
