package X;

/* renamed from: X.4Tr  reason: invalid class name and case insensitive filesystem */
public final class C86664Tr {
    public final C28371Vv A00;
    public final C1040053o A01;

    public C86664Tr(C16300so r2, C28371Vv r3) {
        C28371Vv.A06(r3, "participant");
        this.A01 = (C1040053o) AnonymousClass3K2.A0c(r2, r3, 61);
        this.A00 = r3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C86664Tr.class != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C86664Tr) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
