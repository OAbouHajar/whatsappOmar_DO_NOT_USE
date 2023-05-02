package X;

/* renamed from: X.4Tz  reason: invalid class name and case insensitive filesystem */
public final class C86744Tz {
    public final C28371Vv A00;
    public final AnonymousClass5NE A01;

    public C86744Tz(C16300so r6, C28371Vv r7) {
        C32261fw[] r2 = new C32261fw[3];
        r2[0] = AnonymousClass3K3.A0X(r6, 94);
        r2[1] = AnonymousClass3K3.A0X(r6, 96);
        this.A01 = (AnonymousClass5NE) C32271fx.A04(r7, "AdminAddMode|AllMembersAddMode|UnknownAddMode", AnonymousClass3K2.A0q(AnonymousClass3K3.A0X(r6, 95), r2, 2), new String[]{"member_add_mode"});
        this.A00 = r7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C86744Tz.class != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C86744Tz) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
