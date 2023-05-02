package X;

/* renamed from: X.53b  reason: invalid class name and case insensitive filesystem */
public final class C1038753b implements AnonymousClass5NA {
    public final C28371Vv A00;
    public final AnonymousClass4V4 A01;
    public final String A02;

    public C1038753b(C16300so r9, C28371Vv r10) {
        C28371Vv.A06(r10, "state");
        String[] strArr = new String[1];
        boolean A1C = AnonymousClass3K4.A1C(strArr);
        C32271fx.A01((C16300so) null, r10, String.class, AnonymousClass3K2.A0X(), AnonymousClass3K2.A0Y(), "pass", strArr, A1C);
        this.A02 = AnonymousClass3K2.A0j(r10, A1C);
        this.A01 = (AnonymousClass4V4) AnonymousClass3K2.A0d(r9, r10, 22, A1C ? 1 : 0);
        this.A00 = r10;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C1038753b.class != obj.getClass()) {
                return false;
            }
            C1038753b r5 = (C1038753b) obj;
            if (!C34901l3.A00(this.A02, r5.A02) || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = this.A02;
        return AnonymousClass3K2.A08(this.A01, A1Z);
    }
}
