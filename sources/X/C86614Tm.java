package X;

/* renamed from: X.4Tm  reason: invalid class name and case insensitive filesystem */
public final class C86614Tm {
    public final C28371Vv A00;
    public final C86634To A01;

    public C86614Tm(C16300so r2, C28371Vv r3) {
        C28371Vv.A06(r3, "screen_data");
        this.A01 = (C86634To) AnonymousClass3K2.A0c(r2, r3, 36);
        this.A00 = r3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C86614Tm.class != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C86614Tm) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
