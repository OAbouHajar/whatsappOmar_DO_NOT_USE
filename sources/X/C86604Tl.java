package X;

/* renamed from: X.4Tl  reason: invalid class name and case insensitive filesystem */
public final class C86604Tl {
    public final C28371Vv A00;
    public final C86574Ti A01;

    public C86604Tl(C16300so r2, C28371Vv r3) {
        C28371Vv.A06(r3, "persist_data");
        this.A01 = (C86574Ti) AnonymousClass3K2.A0c(r2, r3, 35);
        this.A00 = r3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C86604Tl.class != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C86604Tl) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
